-- ASHA Diary Database Schema
-- MySQL 8.0+
-- Production-ready for Government of Uttar Pradesh

-- Create database
CREATE DATABASE IF NOT EXISTS asha_diary 
CHARACTER SET utf8mb4 
COLLATE utf8mb4_unicode_ci;

USE asha_diary;

-- ==================== USERS & ROLES ====================

CREATE TABLE roles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name_hindi VARCHAR(100) NOT NULL,
    name_english VARCHAR(100) NOT NULL,
    authority_level INT NOT NULL,  -- 1-5, higher = more authority
    can_edit_beneficiary BOOLEAN DEFAULT FALSE,
    can_approve_edits BOOLEAN DEFAULT FALSE,
    can_merge_duplicates BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    INDEX idx_authority (authority_level)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Pre-populate roles
INSERT INTO roles (id, name_hindi, name_english, authority_level, can_edit_beneficiary, can_approve_edits, can_merge_duplicates) VALUES
(1, 'फील्ड स्टाफ', 'Field Staff', 1, FALSE, FALSE, FALSE),
(2, 'सुपरवाइजर', 'Supervisor', 2, TRUE, TRUE, FALSE),
(3, 'ब्लॉक नोडल', 'Block Nodal', 3, TRUE, TRUE, TRUE),
(4, 'जिला नोडल', 'District Nodal', 4, TRUE, TRUE, TRUE),
(5, 'राज्य प्रशासक', 'State Admin', 5, TRUE, TRUE, TRUE);

CREATE TABLE users (
    id CHAR(36) PRIMARY KEY,  -- UUID from Android
    server_id INT AUTO_INCREMENT UNIQUE,
    username VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,  -- SHA-256 or bcrypt
    full_name VARCHAR(200) NOT NULL,
    phone_number VARCHAR(15) NOT NULL UNIQUE,
    role_id INT NOT NULL,
    worker_code VARCHAR(10),  -- A, B, C, etc. for Field Staff
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    last_login_at TIMESTAMP NULL,
    FOREIGN KEY (role_id) REFERENCES roles(id),
    INDEX idx_username (username),
    INDEX idx_phone (phone_number),
    INDEX idx_role (role_id),
    INDEX idx_active (is_active)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ==================== LOCATION HIERARCHY ====================

CREATE TABLE villages (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    state_code VARCHAR(10) NOT NULL,  -- 09 for UP
    district_code VARCHAR(10) NOT NULL,  -- 146 for Agra
    block_code VARCHAR(10) NOT NULL,
    village_code VARCHAR(10) NOT NULL,
    village_name_hindi VARCHAR(200) NOT NULL,
    block_name_hindi VARCHAR(200) NOT NULL,
    district_name_hindi VARCHAR(200) NOT NULL,
    state_name_hindi VARCHAR(200) NOT NULL,
    village_name_english VARCHAR(200),
    block_name_english VARCHAR(200),
    district_name_english VARCHAR(200),
    state_name_english VARCHAR(200),
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    UNIQUE KEY unique_village (state_code, district_code, block_code, village_code),
    INDEX idx_block (block_code),
    INDEX idx_district (district_code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE user_area_mappings (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    user_id CHAR(36) NOT NULL,
    village_id CHAR(36) NOT NULL,
    assigned_by_user_id CHAR(36) NOT NULL,
    is_active BOOLEAN DEFAULT TRUE,
    assigned_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (village_id) REFERENCES villages(id) ON DELETE CASCADE,
    UNIQUE KEY unique_assignment (user_id, village_id),
    INDEX idx_user (user_id),
    INDEX idx_village (village_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ==================== BENEFICIARIES ====================

CREATE TABLE beneficiaries (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    beneficiary_id VARCHAR(50) NOT NULL UNIQUE,  -- SS-DDD-BBB-VVVV-W-NNNN
    name_hindi VARCHAR(200) NOT NULL,
    father_husband_name_hindi VARCHAR(200) NOT NULL,
    gender ENUM('M', 'F', 'O') NOT NULL,
    date_of_birth DATE NOT NULL,
    age_years INT NOT NULL,
    beneficiary_type ENUM('PREGNANT_WOMAN', 'CHILD', 'BOTH') NOT NULL,
    village_id CHAR(36) NOT NULL,
    address_hindi TEXT NOT NULL,
    mobile_number VARCHAR(15),
    registered_by_user_id CHAR(36) NOT NULL,
    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    registration_gps_lat DECIMAL(10, 8) NOT NULL,
    registration_gps_lng DECIMAL(11, 8) NOT NULL,
    is_active BOOLEAN DEFAULT TRUE,
    is_duplicate_flagged BOOLEAN DEFAULT FALSE,
    duplicate_of_beneficiary_id VARCHAR(50),  -- Points to master if merged
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    last_modified_by_user_id CHAR(36) NOT NULL,
    last_modified_by_role_id INT NOT NULL,
    sync_version INT DEFAULT 1,
    FOREIGN KEY (village_id) REFERENCES villages(id),
    FOREIGN KEY (registered_by_user_id) REFERENCES users(id),
    FOREIGN KEY (last_modified_by_user_id) REFERENCES users(id),
    FOREIGN KEY (last_modified_by_role_id) REFERENCES roles(id),
    INDEX idx_beneficiary_id (beneficiary_id),
    INDEX idx_village (village_id),
    INDEX idx_name_village (name_hindi(50), village_id),
    INDEX idx_active (is_active),
    INDEX idx_duplicate_flagged (is_duplicate_flagged),
    FULLTEXT idx_name_search (name_hindi, father_husband_name_hindi)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ==================== HEALTH VISITS ====================

CREATE TABLE anc_visits (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    beneficiary_id CHAR(36) NOT NULL,
    visit_number INT NOT NULL,
    visit_date DATE NOT NULL,
    weight_kg DECIMAL(5, 2),
    bp_systolic INT,
    bp_diastolic INT,
    hemoglobin_gm_dl DECIMAL(4, 2),
    risk_factors_hindi TEXT,
    complications_hindi TEXT,
    ifa_tablets_given INT,
    calcium_tablets_given INT,
    other_medicines_hindi TEXT,
    advice_notes_hindi TEXT,
    recorded_by_user_id CHAR(36) NOT NULL,
    recorded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    gps_lat DECIMAL(10, 8) NOT NULL,
    gps_lng DECIMAL(11, 8) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    last_modified_by_role_id INT NOT NULL,
    sync_version INT DEFAULT 1,
    FOREIGN KEY (beneficiary_id) REFERENCES beneficiaries(id) ON DELETE CASCADE,
    FOREIGN KEY (recorded_by_user_id) REFERENCES users(id),
    INDEX idx_beneficiary (beneficiary_id),
    INDEX idx_visit_date (visit_date)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE bp_visits (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    beneficiary_id CHAR(36) NOT NULL,
    visit_date DATE NOT NULL,
    bp_systolic INT NOT NULL,
    bp_diastolic INT NOT NULL,
    pulse_rate INT,
    bp_category ENUM('NORMAL', 'ELEVATED', 'HIGH_STAGE_1', 'HIGH_STAGE_2', 'HYPERTENSIVE_CRISIS') NOT NULL,
    is_referred BOOLEAN DEFAULT FALSE,
    referral_facility_hindi VARCHAR(200),
    follow_up_date DATE,
    medications_prescribed_hindi TEXT,
    advice_notes_hindi TEXT,
    recorded_by_user_id CHAR(36) NOT NULL,
    recorded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    gps_lat DECIMAL(10, 8) NOT NULL,
    gps_lng DECIMAL(11, 8) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    last_modified_by_role_id INT NOT NULL,
    sync_version INT DEFAULT 1,
    FOREIGN KEY (beneficiary_id) REFERENCES beneficiaries(id) ON DELETE CASCADE,
    FOREIGN KEY (recorded_by_user_id) REFERENCES users(id),
    INDEX idx_beneficiary (beneficiary_id),
    INDEX idx_visit_date (visit_date),
    INDEX idx_bp_category (bp_category)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE blood_sugar_visits (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    beneficiary_id CHAR(36) NOT NULL,
    visit_date DATE NOT NULL,
    test_type ENUM('FASTING', 'RANDOM', 'POST_PRANDIAL') NOT NULL,
    blood_sugar_mg_dl INT NOT NULL,
    diabetes_risk ENUM('NORMAL', 'PRE_DIABETIC', 'DIABETIC') NOT NULL,
    is_referred BOOLEAN DEFAULT FALSE,
    referral_facility_hindi VARCHAR(200),
    follow_up_date DATE,
    medications_prescribed_hindi TEXT,
    diet_advice_hindi TEXT,
    exercise_advice_hindi TEXT,
    recorded_by_user_id CHAR(36) NOT NULL,
    recorded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    gps_lat DECIMAL(10, 8) NOT NULL,
    gps_lng DECIMAL(11, 8) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    last_modified_by_role_id INT NOT NULL,
    sync_version INT DEFAULT 1,
    FOREIGN KEY (beneficiary_id) REFERENCES beneficiaries(id) ON DELETE CASCADE,
    FOREIGN KEY (recorded_by_user_id) REFERENCES users(id),
    INDEX idx_beneficiary (beneficiary_id),
    INDEX idx_visit_date (visit_date),
    INDEX idx_risk (diabetes_risk)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE vaccination_visits (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    beneficiary_id CHAR(36) NOT NULL,
    visit_date DATE NOT NULL,
    vaccine_type VARCHAR(50) NOT NULL,
    vaccine_name_hindi VARCHAR(200) NOT NULL,
    dose_number INT NOT NULL,
    vaccine_batch_number VARCHAR(50),
    vaccine_expiry_date DATE,
    has_adverse_reaction BOOLEAN DEFAULT FALSE,
    adverse_reaction_notes_hindi TEXT,
    next_dose_due_date DATE,
    recorded_by_user_id CHAR(36) NOT NULL,
    recorded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    gps_lat DECIMAL(10, 8) NOT NULL,
    gps_lng DECIMAL(11, 8) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    last_modified_by_role_id INT NOT NULL,
    sync_version INT DEFAULT 1,
    FOREIGN KEY (beneficiary_id) REFERENCES beneficiaries(id) ON DELETE CASCADE,
    FOREIGN KEY (recorded_by_user_id) REFERENCES users(id),
    INDEX idx_beneficiary (beneficiary_id),
    INDEX idx_visit_date (visit_date),
    INDEX idx_vaccine_type (vaccine_type)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ==================== WORKFLOWS ====================

CREATE TABLE edit_requests (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    beneficiary_id CHAR(36) NOT NULL,
    field_name VARCHAR(100) NOT NULL,
    current_value TEXT NOT NULL,
    requested_value TEXT NOT NULL,
    reason_hindi TEXT NOT NULL,
    status ENUM('PENDING', 'APPROVED', 'REJECTED') DEFAULT 'PENDING',
    requested_by_user_id CHAR(36) NOT NULL,
    requested_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    request_gps_lat DECIMAL(10, 8) NOT NULL,
    request_gps_lng DECIMAL(11, 8) NOT NULL,
    reviewed_by_user_id CHAR(36),
    reviewed_at TIMESTAMP NULL,
    review_notes_hindi TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (beneficiary_id) REFERENCES beneficiaries(id) ON DELETE CASCADE,
    FOREIGN KEY (requested_by_user_id) REFERENCES users(id),
    FOREIGN KEY (reviewed_by_user_id) REFERENCES users(id),
    INDEX idx_beneficiary (beneficiary_id),
    INDEX idx_status (status),
    INDEX idx_requested_at (requested_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE duplicate_flags (
    id CHAR(36) PRIMARY KEY,
    server_id INT AUTO_INCREMENT UNIQUE,
    beneficiary_id_1 CHAR(36) NOT NULL,
    beneficiary_id_2 CHAR(36) NOT NULL,
    similarity_score INT NOT NULL,
    name_match BOOLEAN DEFAULT FALSE,
    village_match BOOLEAN DEFAULT FALSE,
    gender_match BOOLEAN DEFAULT FALSE,
    age_within_range BOOLEAN DEFAULT FALSE,
    status ENUM('PENDING', 'MERGED', 'INACTIVATED', 'KEPT_BOTH') DEFAULT 'PENDING',
    flagged_by_user_id CHAR(36) NOT NULL,
    flagged_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    flag_source ENUM('AUTO_DETECTION', 'USER_REPORT') NOT NULL,
    resolved_by_user_id CHAR(36),
    resolved_at TIMESTAMP NULL,
    resolution_action VARCHAR(50),
    resolution_notes_hindi TEXT,
    master_beneficiary_id VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (beneficiary_id_1) REFERENCES beneficiaries(id) ON DELETE CASCADE,
    FOREIGN KEY (beneficiary_id_2) REFERENCES beneficiaries(id) ON DELETE CASCADE,
    FOREIGN KEY (flagged_by_user_id) REFERENCES users(id),
    FOREIGN KEY (resolved_by_user_id) REFERENCES users(id),
    UNIQUE KEY unique_flag (beneficiary_id_1, beneficiary_id_2),
    INDEX idx_status (status),
    INDEX idx_flagged_at (flagged_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ==================== AUDIT ====================

CREATE TABLE audit_logs (
    id CHAR(36) PRIMARY KEY,
    server_id BIGINT AUTO_INCREMENT UNIQUE,
    user_id CHAR(36) NOT NULL,
    user_role_id INT NOT NULL,
    action_type ENUM('CREATE', 'UPDATE', 'DELETE', 'MERGE', 'APPROVE', 'REJECT') NOT NULL,
    entity_type VARCHAR(50) NOT NULL,
    entity_id VARCHAR(50) NOT NULL,
    field_name VARCHAR(100),
    old_value TEXT,
    new_value TEXT,
    action_description_hindi TEXT NOT NULL,
    action_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    gps_lat DECIMAL(10, 8) NOT NULL,
    gps_lng DECIMAL(11, 8) NOT NULL,
    gps_accuracy_meters FLOAT,
    device_id VARCHAR(100),
    app_version VARCHAR(20),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (user_role_id) REFERENCES roles(id),
    INDEX idx_user (user_id),
    INDEX idx_timestamp (action_timestamp),
    INDEX idx_entity (entity_type, entity_id),
    INDEX idx_action_type (action_type)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
