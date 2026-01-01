package com.upgovt.ashadiary.data.local.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.upgovt.ashadiary.data.local.dao.ANCVisitDao;
import com.upgovt.ashadiary.data.local.dao.ANCVisitDao_Impl;
import com.upgovt.ashadiary.data.local.dao.AuditLogDao;
import com.upgovt.ashadiary.data.local.dao.AuditLogDao_Impl;
import com.upgovt.ashadiary.data.local.dao.BPVisitDao;
import com.upgovt.ashadiary.data.local.dao.BPVisitDao_Impl;
import com.upgovt.ashadiary.data.local.dao.BeneficiaryDao;
import com.upgovt.ashadiary.data.local.dao.BeneficiaryDao_Impl;
import com.upgovt.ashadiary.data.local.dao.BiometricLocalDao;
import com.upgovt.ashadiary.data.local.dao.BiometricLocalDao_Impl;
import com.upgovt.ashadiary.data.local.dao.BloodSugarVisitDao;
import com.upgovt.ashadiary.data.local.dao.BloodSugarVisitDao_Impl;
import com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao;
import com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao_Impl;
import com.upgovt.ashadiary.data.local.dao.EditRequestDao;
import com.upgovt.ashadiary.data.local.dao.EditRequestDao_Impl;
import com.upgovt.ashadiary.data.local.dao.RoleDao;
import com.upgovt.ashadiary.data.local.dao.RoleDao_Impl;
import com.upgovt.ashadiary.data.local.dao.SyncQueueDao;
import com.upgovt.ashadiary.data.local.dao.SyncQueueDao_Impl;
import com.upgovt.ashadiary.data.local.dao.UserAreaMappingDao;
import com.upgovt.ashadiary.data.local.dao.UserAreaMappingDao_Impl;
import com.upgovt.ashadiary.data.local.dao.UserDao;
import com.upgovt.ashadiary.data.local.dao.UserDao_Impl;
import com.upgovt.ashadiary.data.local.dao.VaccinationVisitDao;
import com.upgovt.ashadiary.data.local.dao.VaccinationVisitDao_Impl;
import com.upgovt.ashadiary.data.local.dao.VillageDao;
import com.upgovt.ashadiary.data.local.dao.VillageDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ASHADiaryDatabase_Impl extends ASHADiaryDatabase {
  private volatile UserDao _userDao;

  private volatile RoleDao _roleDao;

  private volatile VillageDao _villageDao;

  private volatile UserAreaMappingDao _userAreaMappingDao;

  private volatile BeneficiaryDao _beneficiaryDao;

  private volatile ANCVisitDao _aNCVisitDao;

  private volatile BPVisitDao _bPVisitDao;

  private volatile BloodSugarVisitDao _bloodSugarVisitDao;

  private volatile VaccinationVisitDao _vaccinationVisitDao;

  private volatile EditRequestDao _editRequestDao;

  private volatile DuplicateFlagDao _duplicateFlagDao;

  private volatile AuditLogDao _auditLogDao;

  private volatile BiometricLocalDao _biometricLocalDao;

  private volatile SyncQueueDao _syncQueueDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `users` (`id` TEXT NOT NULL, `username` TEXT NOT NULL, `password_hash` TEXT NOT NULL, `full_name` TEXT NOT NULL, `phone_number` TEXT NOT NULL, `role_id` INTEGER NOT NULL, `offline_token` TEXT NOT NULL, `worker_code` TEXT NOT NULL, `is_active` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, PRIMARY KEY(`id`))");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_users_username` ON `users` (`username`)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_users_phone_number` ON `users` (`phone_number`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_users_role_id` ON `users` (`role_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_users_is_active` ON `users` (`is_active`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `roles` (`id` INTEGER NOT NULL, `name_hindi` TEXT NOT NULL, `name_english` TEXT NOT NULL, `authority_level` INTEGER NOT NULL, `can_edit_beneficiary` INTEGER NOT NULL, `can_approve_edits` INTEGER NOT NULL, `can_merge_duplicates` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `villages` (`id` TEXT NOT NULL, `state_code` TEXT NOT NULL, `district_code` TEXT NOT NULL, `block_code` TEXT NOT NULL, `village_code` TEXT NOT NULL, `village_name_hindi` TEXT NOT NULL, `block_name_hindi` TEXT NOT NULL, `district_name_hindi` TEXT NOT NULL, `state_name_hindi` TEXT NOT NULL, `village_name_english` TEXT NOT NULL, `block_name_english` TEXT NOT NULL, `district_name_english` TEXT NOT NULL, `state_name_english` TEXT NOT NULL, `is_active` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, PRIMARY KEY(`id`))");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_villages_state_code_district_code_block_code_village_code` ON `villages` (`state_code`, `district_code`, `block_code`, `village_code`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_villages_block_code` ON `villages` (`block_code`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `user_area_mappings` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `village_id` TEXT NOT NULL, `assigned_by_user_id` TEXT NOT NULL, `is_active` INTEGER NOT NULL, `assigned_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`village_id`) REFERENCES `villages`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_user_area_mappings_user_id` ON `user_area_mappings` (`user_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_user_area_mappings_village_id` ON `user_area_mappings` (`village_id`)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_user_area_mappings_user_id_village_id` ON `user_area_mappings` (`user_id`, `village_id`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `beneficiaries` (`id` TEXT NOT NULL, `beneficiary_id` TEXT NOT NULL, `name_hindi` TEXT NOT NULL, `father_husband_name_hindi` TEXT NOT NULL, `gender` TEXT NOT NULL, `date_of_birth` INTEGER NOT NULL, `age_years` INTEGER NOT NULL, `beneficiary_type` TEXT NOT NULL, `village_id` TEXT NOT NULL, `address_hindi` TEXT NOT NULL, `mobile_number` TEXT, `registered_by_user_id` TEXT NOT NULL, `registration_date` INTEGER NOT NULL, `registration_gps_lat` REAL NOT NULL, `registration_gps_lng` REAL NOT NULL, `is_active` INTEGER NOT NULL, `is_duplicate_flagged` INTEGER NOT NULL, `duplicate_of_beneficiary_id` TEXT, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `last_modified_by_user_id` TEXT NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, `last_modified_by_role_id` INTEGER NOT NULL, `sync_version` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`village_id`) REFERENCES `villages`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT , FOREIGN KEY(`registered_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_beneficiaries_beneficiary_id` ON `beneficiaries` (`beneficiary_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_beneficiaries_village_id` ON `beneficiaries` (`village_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_beneficiaries_registered_by_user_id` ON `beneficiaries` (`registered_by_user_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_beneficiaries_name_hindi_village_id` ON `beneficiaries` (`name_hindi`, `village_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_beneficiaries_is_active` ON `beneficiaries` (`is_active`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_beneficiaries_is_duplicate_flagged` ON `beneficiaries` (`is_duplicate_flagged`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `anc_visits` (`id` TEXT NOT NULL, `beneficiary_id` TEXT NOT NULL, `visit_number` INTEGER NOT NULL, `visit_date` INTEGER NOT NULL, `weight_kg` REAL, `blood_pressure_systolic` INTEGER, `blood_pressure_diastolic` INTEGER, `hemoglobin_gm_dl` REAL, `risk_factors_hindi` TEXT, `complications_hindi` TEXT, `ifa_tablets_given` INTEGER, `calcium_tablets_given` INTEGER, `other_medicines_hindi` TEXT, `advice_notes_hindi` TEXT, `recorded_by_user_id` TEXT NOT NULL, `recorded_at` INTEGER NOT NULL, `gps_lat` REAL NOT NULL, `gps_lng` REAL NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, `last_modified_by_role_id` INTEGER NOT NULL, `sync_version` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`beneficiary_id`) REFERENCES `beneficiaries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`recorded_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_anc_visits_beneficiary_id` ON `anc_visits` (`beneficiary_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_anc_visits_visit_date` ON `anc_visits` (`visit_date`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_anc_visits_recorded_by_user_id` ON `anc_visits` (`recorded_by_user_id`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `bp_visits` (`id` TEXT NOT NULL, `beneficiary_id` TEXT NOT NULL, `visit_date` INTEGER NOT NULL, `bp_systolic` INTEGER NOT NULL, `bp_diastolic` INTEGER NOT NULL, `pulse_rate` INTEGER, `bp_category` TEXT NOT NULL, `is_referred` INTEGER NOT NULL, `referral_facility_hindi` TEXT, `follow_up_date` INTEGER, `medications_prescribed_hindi` TEXT, `advice_notes_hindi` TEXT, `recorded_by_user_id` TEXT NOT NULL, `recorded_at` INTEGER NOT NULL, `gps_lat` REAL NOT NULL, `gps_lng` REAL NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, `last_modified_by_role_id` INTEGER NOT NULL, `sync_version` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`beneficiary_id`) REFERENCES `beneficiaries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`recorded_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_bp_visits_beneficiary_id` ON `bp_visits` (`beneficiary_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_bp_visits_visit_date` ON `bp_visits` (`visit_date`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_bp_visits_recorded_by_user_id` ON `bp_visits` (`recorded_by_user_id`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `blood_sugar_visits` (`id` TEXT NOT NULL, `beneficiary_id` TEXT NOT NULL, `visit_date` INTEGER NOT NULL, `test_type` TEXT NOT NULL, `blood_sugar_mg_dl` INTEGER NOT NULL, `diabetes_risk` TEXT NOT NULL, `is_referred` INTEGER NOT NULL, `referral_facility_hindi` TEXT, `follow_up_date` INTEGER, `medications_prescribed_hindi` TEXT, `diet_advice_hindi` TEXT, `exercise_advice_hindi` TEXT, `recorded_by_user_id` TEXT NOT NULL, `recorded_at` INTEGER NOT NULL, `gps_lat` REAL NOT NULL, `gps_lng` REAL NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, `last_modified_by_role_id` INTEGER NOT NULL, `sync_version` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`beneficiary_id`) REFERENCES `beneficiaries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`recorded_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_blood_sugar_visits_beneficiary_id` ON `blood_sugar_visits` (`beneficiary_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_blood_sugar_visits_visit_date` ON `blood_sugar_visits` (`visit_date`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_blood_sugar_visits_recorded_by_user_id` ON `blood_sugar_visits` (`recorded_by_user_id`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `vaccination_visits` (`id` TEXT NOT NULL, `beneficiary_id` TEXT NOT NULL, `visit_date` INTEGER NOT NULL, `vaccine_type` TEXT NOT NULL, `vaccine_name_hindi` TEXT NOT NULL, `dose_number` INTEGER NOT NULL, `vaccine_batch_number` TEXT, `vaccine_expiry_date` INTEGER, `has_adverse_reaction` INTEGER NOT NULL, `adverse_reaction_notes_hindi` TEXT, `next_dose_due_date` INTEGER, `recorded_by_user_id` TEXT NOT NULL, `recorded_at` INTEGER NOT NULL, `gps_lat` REAL NOT NULL, `gps_lng` REAL NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, `last_modified_by_role_id` INTEGER NOT NULL, `sync_version` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`beneficiary_id`) REFERENCES `beneficiaries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`recorded_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_vaccination_visits_beneficiary_id` ON `vaccination_visits` (`beneficiary_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_vaccination_visits_visit_date` ON `vaccination_visits` (`visit_date`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_vaccination_visits_recorded_by_user_id` ON `vaccination_visits` (`recorded_by_user_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_vaccination_visits_vaccine_type` ON `vaccination_visits` (`vaccine_type`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `edit_requests` (`id` TEXT NOT NULL, `beneficiary_id` TEXT NOT NULL, `field_name` TEXT NOT NULL, `current_value` TEXT NOT NULL, `requested_value` TEXT NOT NULL, `reason_hindi` TEXT NOT NULL, `status` TEXT NOT NULL, `requested_by_user_id` TEXT NOT NULL, `requested_at` INTEGER NOT NULL, `request_gps_lat` REAL NOT NULL, `request_gps_lng` REAL NOT NULL, `reviewed_by_user_id` TEXT, `reviewed_at` INTEGER, `review_notes_hindi` TEXT, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`beneficiary_id`) REFERENCES `beneficiaries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`requested_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT , FOREIGN KEY(`reviewed_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_edit_requests_beneficiary_id` ON `edit_requests` (`beneficiary_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_edit_requests_requested_by_user_id` ON `edit_requests` (`requested_by_user_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_edit_requests_status` ON `edit_requests` (`status`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_edit_requests_requested_at` ON `edit_requests` (`requested_at`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `duplicate_flags` (`id` TEXT NOT NULL, `beneficiary_id_1` TEXT NOT NULL, `beneficiary_id_2` TEXT NOT NULL, `similarity_score` INTEGER NOT NULL, `name_match` INTEGER NOT NULL, `village_match` INTEGER NOT NULL, `gender_match` INTEGER NOT NULL, `age_within_range` INTEGER NOT NULL, `status` TEXT NOT NULL, `flagged_by_user_id` TEXT NOT NULL, `flagged_at` INTEGER NOT NULL, `flag_source` TEXT NOT NULL, `resolved_by_user_id` TEXT, `resolved_at` INTEGER, `resolution_action` TEXT, `resolution_notes_hindi` TEXT, `master_beneficiary_id` TEXT, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`beneficiary_id_1`) REFERENCES `beneficiaries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`beneficiary_id_2`) REFERENCES `beneficiaries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`flagged_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT , FOREIGN KEY(`resolved_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_duplicate_flags_beneficiary_id_1` ON `duplicate_flags` (`beneficiary_id_1`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_duplicate_flags_beneficiary_id_2` ON `duplicate_flags` (`beneficiary_id_2`)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_duplicate_flags_beneficiary_id_1_beneficiary_id_2` ON `duplicate_flags` (`beneficiary_id_1`, `beneficiary_id_2`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_duplicate_flags_status` ON `duplicate_flags` (`status`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_duplicate_flags_flagged_at` ON `duplicate_flags` (`flagged_at`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `audit_logs` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `user_role_id` INTEGER NOT NULL, `action_type` TEXT NOT NULL, `entity_type` TEXT NOT NULL, `entity_id` TEXT NOT NULL, `field_name` TEXT, `old_value` TEXT, `new_value` TEXT, `action_description_hindi` TEXT NOT NULL, `action_timestamp` INTEGER NOT NULL, `gps_lat` REAL NOT NULL, `gps_lng` REAL NOT NULL, `gps_accuracy_meters` REAL NOT NULL, `device_id` TEXT NOT NULL, `app_version` TEXT NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, `server_id` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_audit_logs_user_id` ON `audit_logs` (`user_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_audit_logs_action_timestamp` ON `audit_logs` (`action_timestamp`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_audit_logs_entity_type` ON `audit_logs` (`entity_type`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_audit_logs_entity_id` ON `audit_logs` (`entity_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_audit_logs_action_type` ON `audit_logs` (`action_type`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `biometrics_local` (`id` TEXT NOT NULL, `beneficiary_id` TEXT NOT NULL, `finger_position` TEXT NOT NULL, `quality_score` INTEGER NOT NULL, `iso_template` BLOB NOT NULL, `captured_by_user_id` TEXT NOT NULL, `captured_at` INTEGER NOT NULL, `device_serial_number` TEXT NOT NULL, `is_synced` INTEGER NOT NULL, `last_synced_at` INTEGER, PRIMARY KEY(`id`), FOREIGN KEY(`beneficiary_id`) REFERENCES `beneficiaries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`captured_by_user_id`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE RESTRICT )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_biometrics_local_beneficiary_id` ON `biometrics_local` (`beneficiary_id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_biometrics_local_finger_position` ON `biometrics_local` (`finger_position`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_biometrics_local_captured_at` ON `biometrics_local` (`captured_at`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `sync_queue` (`id` TEXT NOT NULL, `entity_type` TEXT NOT NULL, `entity_id` TEXT NOT NULL, `operation` TEXT NOT NULL, `payload_json` TEXT NOT NULL, `priority` INTEGER NOT NULL, `sync_status` TEXT NOT NULL, `retry_count` INTEGER NOT NULL, `max_retries` INTEGER NOT NULL, `last_retry_at` INTEGER, `next_retry_at` INTEGER, `last_error_message` TEXT, `last_error_code` INTEGER, `user_role_id` INTEGER NOT NULL, `sync_version` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `synced_at` INTEGER, PRIMARY KEY(`id`))");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_sync_queue_entity_type` ON `sync_queue` (`entity_type`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_sync_queue_sync_status` ON `sync_queue` (`sync_status`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_sync_queue_priority` ON `sync_queue` (`priority`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_sync_queue_created_at` ON `sync_queue` (`created_at`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_sync_queue_retry_count` ON `sync_queue` (`retry_count`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '97a4e64fae9fabf9245ab8752e590e9e')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `users`");
        db.execSQL("DROP TABLE IF EXISTS `roles`");
        db.execSQL("DROP TABLE IF EXISTS `villages`");
        db.execSQL("DROP TABLE IF EXISTS `user_area_mappings`");
        db.execSQL("DROP TABLE IF EXISTS `beneficiaries`");
        db.execSQL("DROP TABLE IF EXISTS `anc_visits`");
        db.execSQL("DROP TABLE IF EXISTS `bp_visits`");
        db.execSQL("DROP TABLE IF EXISTS `blood_sugar_visits`");
        db.execSQL("DROP TABLE IF EXISTS `vaccination_visits`");
        db.execSQL("DROP TABLE IF EXISTS `edit_requests`");
        db.execSQL("DROP TABLE IF EXISTS `duplicate_flags`");
        db.execSQL("DROP TABLE IF EXISTS `audit_logs`");
        db.execSQL("DROP TABLE IF EXISTS `biometrics_local`");
        db.execSQL("DROP TABLE IF EXISTS `sync_queue`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsUsers = new HashMap<String, TableInfo.Column>(14);
        _columnsUsers.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("password_hash", new TableInfo.Column("password_hash", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("full_name", new TableInfo.Column("full_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("phone_number", new TableInfo.Column("phone_number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("role_id", new TableInfo.Column("role_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("offline_token", new TableInfo.Column("offline_token", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("worker_code", new TableInfo.Column("worker_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("is_active", new TableInfo.Column("is_active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsers = new HashSet<TableInfo.Index>(4);
        _indicesUsers.add(new TableInfo.Index("index_users_username", true, Arrays.asList("username"), Arrays.asList("ASC")));
        _indicesUsers.add(new TableInfo.Index("index_users_phone_number", true, Arrays.asList("phone_number"), Arrays.asList("ASC")));
        _indicesUsers.add(new TableInfo.Index("index_users_role_id", false, Arrays.asList("role_id"), Arrays.asList("ASC")));
        _indicesUsers.add(new TableInfo.Index("index_users_is_active", false, Arrays.asList("is_active"), Arrays.asList("ASC")));
        final TableInfo _infoUsers = new TableInfo("users", _columnsUsers, _foreignKeysUsers, _indicesUsers);
        final TableInfo _existingUsers = TableInfo.read(db, "users");
        if (!_infoUsers.equals(_existingUsers)) {
          return new RoomOpenHelper.ValidationResult(false, "users(com.upgovt.ashadiary.data.local.entities.UserEntity).\n"
                  + " Expected:\n" + _infoUsers + "\n"
                  + " Found:\n" + _existingUsers);
        }
        final HashMap<String, TableInfo.Column> _columnsRoles = new HashMap<String, TableInfo.Column>(8);
        _columnsRoles.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoles.put("name_hindi", new TableInfo.Column("name_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoles.put("name_english", new TableInfo.Column("name_english", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoles.put("authority_level", new TableInfo.Column("authority_level", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoles.put("can_edit_beneficiary", new TableInfo.Column("can_edit_beneficiary", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoles.put("can_approve_edits", new TableInfo.Column("can_approve_edits", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoles.put("can_merge_duplicates", new TableInfo.Column("can_merge_duplicates", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoles.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoles = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoles = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoles = new TableInfo("roles", _columnsRoles, _foreignKeysRoles, _indicesRoles);
        final TableInfo _existingRoles = TableInfo.read(db, "roles");
        if (!_infoRoles.equals(_existingRoles)) {
          return new RoomOpenHelper.ValidationResult(false, "roles(com.upgovt.ashadiary.data.local.entities.RoleEntity).\n"
                  + " Expected:\n" + _infoRoles + "\n"
                  + " Found:\n" + _existingRoles);
        }
        final HashMap<String, TableInfo.Column> _columnsVillages = new HashMap<String, TableInfo.Column>(19);
        _columnsVillages.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("state_code", new TableInfo.Column("state_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("district_code", new TableInfo.Column("district_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("block_code", new TableInfo.Column("block_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("village_code", new TableInfo.Column("village_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("village_name_hindi", new TableInfo.Column("village_name_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("block_name_hindi", new TableInfo.Column("block_name_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("district_name_hindi", new TableInfo.Column("district_name_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("state_name_hindi", new TableInfo.Column("state_name_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("village_name_english", new TableInfo.Column("village_name_english", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("block_name_english", new TableInfo.Column("block_name_english", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("district_name_english", new TableInfo.Column("district_name_english", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("state_name_english", new TableInfo.Column("state_name_english", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("is_active", new TableInfo.Column("is_active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVillages.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVillages = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVillages = new HashSet<TableInfo.Index>(2);
        _indicesVillages.add(new TableInfo.Index("index_villages_state_code_district_code_block_code_village_code", true, Arrays.asList("state_code", "district_code", "block_code", "village_code"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        _indicesVillages.add(new TableInfo.Index("index_villages_block_code", false, Arrays.asList("block_code"), Arrays.asList("ASC")));
        final TableInfo _infoVillages = new TableInfo("villages", _columnsVillages, _foreignKeysVillages, _indicesVillages);
        final TableInfo _existingVillages = TableInfo.read(db, "villages");
        if (!_infoVillages.equals(_existingVillages)) {
          return new RoomOpenHelper.ValidationResult(false, "villages(com.upgovt.ashadiary.data.local.entities.VillageEntity).\n"
                  + " Expected:\n" + _infoVillages + "\n"
                  + " Found:\n" + _existingVillages);
        }
        final HashMap<String, TableInfo.Column> _columnsUserAreaMappings = new HashMap<String, TableInfo.Column>(10);
        _columnsUserAreaMappings.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("village_id", new TableInfo.Column("village_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("assigned_by_user_id", new TableInfo.Column("assigned_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("is_active", new TableInfo.Column("is_active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("assigned_at", new TableInfo.Column("assigned_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserAreaMappings.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserAreaMappings = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysUserAreaMappings.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("user_id"), Arrays.asList("id")));
        _foreignKeysUserAreaMappings.add(new TableInfo.ForeignKey("villages", "CASCADE", "NO ACTION", Arrays.asList("village_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesUserAreaMappings = new HashSet<TableInfo.Index>(3);
        _indicesUserAreaMappings.add(new TableInfo.Index("index_user_area_mappings_user_id", false, Arrays.asList("user_id"), Arrays.asList("ASC")));
        _indicesUserAreaMappings.add(new TableInfo.Index("index_user_area_mappings_village_id", false, Arrays.asList("village_id"), Arrays.asList("ASC")));
        _indicesUserAreaMappings.add(new TableInfo.Index("index_user_area_mappings_user_id_village_id", true, Arrays.asList("user_id", "village_id"), Arrays.asList("ASC", "ASC")));
        final TableInfo _infoUserAreaMappings = new TableInfo("user_area_mappings", _columnsUserAreaMappings, _foreignKeysUserAreaMappings, _indicesUserAreaMappings);
        final TableInfo _existingUserAreaMappings = TableInfo.read(db, "user_area_mappings");
        if (!_infoUserAreaMappings.equals(_existingUserAreaMappings)) {
          return new RoomOpenHelper.ValidationResult(false, "user_area_mappings(com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity).\n"
                  + " Expected:\n" + _infoUserAreaMappings + "\n"
                  + " Found:\n" + _existingUserAreaMappings);
        }
        final HashMap<String, TableInfo.Column> _columnsBeneficiaries = new HashMap<String, TableInfo.Column>(26);
        _columnsBeneficiaries.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("beneficiary_id", new TableInfo.Column("beneficiary_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("name_hindi", new TableInfo.Column("name_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("father_husband_name_hindi", new TableInfo.Column("father_husband_name_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("gender", new TableInfo.Column("gender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("date_of_birth", new TableInfo.Column("date_of_birth", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("age_years", new TableInfo.Column("age_years", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("beneficiary_type", new TableInfo.Column("beneficiary_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("village_id", new TableInfo.Column("village_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("address_hindi", new TableInfo.Column("address_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("mobile_number", new TableInfo.Column("mobile_number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("registered_by_user_id", new TableInfo.Column("registered_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("registration_date", new TableInfo.Column("registration_date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("registration_gps_lat", new TableInfo.Column("registration_gps_lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("registration_gps_lng", new TableInfo.Column("registration_gps_lng", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("is_active", new TableInfo.Column("is_active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("is_duplicate_flagged", new TableInfo.Column("is_duplicate_flagged", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("duplicate_of_beneficiary_id", new TableInfo.Column("duplicate_of_beneficiary_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("last_modified_by_user_id", new TableInfo.Column("last_modified_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("last_modified_by_role_id", new TableInfo.Column("last_modified_by_role_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeneficiaries.put("sync_version", new TableInfo.Column("sync_version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBeneficiaries = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysBeneficiaries.add(new TableInfo.ForeignKey("villages", "RESTRICT", "NO ACTION", Arrays.asList("village_id"), Arrays.asList("id")));
        _foreignKeysBeneficiaries.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("registered_by_user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesBeneficiaries = new HashSet<TableInfo.Index>(6);
        _indicesBeneficiaries.add(new TableInfo.Index("index_beneficiaries_beneficiary_id", true, Arrays.asList("beneficiary_id"), Arrays.asList("ASC")));
        _indicesBeneficiaries.add(new TableInfo.Index("index_beneficiaries_village_id", false, Arrays.asList("village_id"), Arrays.asList("ASC")));
        _indicesBeneficiaries.add(new TableInfo.Index("index_beneficiaries_registered_by_user_id", false, Arrays.asList("registered_by_user_id"), Arrays.asList("ASC")));
        _indicesBeneficiaries.add(new TableInfo.Index("index_beneficiaries_name_hindi_village_id", false, Arrays.asList("name_hindi", "village_id"), Arrays.asList("ASC", "ASC")));
        _indicesBeneficiaries.add(new TableInfo.Index("index_beneficiaries_is_active", false, Arrays.asList("is_active"), Arrays.asList("ASC")));
        _indicesBeneficiaries.add(new TableInfo.Index("index_beneficiaries_is_duplicate_flagged", false, Arrays.asList("is_duplicate_flagged"), Arrays.asList("ASC")));
        final TableInfo _infoBeneficiaries = new TableInfo("beneficiaries", _columnsBeneficiaries, _foreignKeysBeneficiaries, _indicesBeneficiaries);
        final TableInfo _existingBeneficiaries = TableInfo.read(db, "beneficiaries");
        if (!_infoBeneficiaries.equals(_existingBeneficiaries)) {
          return new RoomOpenHelper.ValidationResult(false, "beneficiaries(com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity).\n"
                  + " Expected:\n" + _infoBeneficiaries + "\n"
                  + " Found:\n" + _existingBeneficiaries);
        }
        final HashMap<String, TableInfo.Column> _columnsAncVisits = new HashMap<String, TableInfo.Column>(25);
        _columnsAncVisits.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("beneficiary_id", new TableInfo.Column("beneficiary_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("visit_number", new TableInfo.Column("visit_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("visit_date", new TableInfo.Column("visit_date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("weight_kg", new TableInfo.Column("weight_kg", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("blood_pressure_systolic", new TableInfo.Column("blood_pressure_systolic", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("blood_pressure_diastolic", new TableInfo.Column("blood_pressure_diastolic", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("hemoglobin_gm_dl", new TableInfo.Column("hemoglobin_gm_dl", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("risk_factors_hindi", new TableInfo.Column("risk_factors_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("complications_hindi", new TableInfo.Column("complications_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("ifa_tablets_given", new TableInfo.Column("ifa_tablets_given", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("calcium_tablets_given", new TableInfo.Column("calcium_tablets_given", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("other_medicines_hindi", new TableInfo.Column("other_medicines_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("advice_notes_hindi", new TableInfo.Column("advice_notes_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("recorded_by_user_id", new TableInfo.Column("recorded_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("recorded_at", new TableInfo.Column("recorded_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("gps_lat", new TableInfo.Column("gps_lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("gps_lng", new TableInfo.Column("gps_lng", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("last_modified_by_role_id", new TableInfo.Column("last_modified_by_role_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAncVisits.put("sync_version", new TableInfo.Column("sync_version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAncVisits = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysAncVisits.add(new TableInfo.ForeignKey("beneficiaries", "CASCADE", "NO ACTION", Arrays.asList("beneficiary_id"), Arrays.asList("id")));
        _foreignKeysAncVisits.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("recorded_by_user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesAncVisits = new HashSet<TableInfo.Index>(3);
        _indicesAncVisits.add(new TableInfo.Index("index_anc_visits_beneficiary_id", false, Arrays.asList("beneficiary_id"), Arrays.asList("ASC")));
        _indicesAncVisits.add(new TableInfo.Index("index_anc_visits_visit_date", false, Arrays.asList("visit_date"), Arrays.asList("ASC")));
        _indicesAncVisits.add(new TableInfo.Index("index_anc_visits_recorded_by_user_id", false, Arrays.asList("recorded_by_user_id"), Arrays.asList("ASC")));
        final TableInfo _infoAncVisits = new TableInfo("anc_visits", _columnsAncVisits, _foreignKeysAncVisits, _indicesAncVisits);
        final TableInfo _existingAncVisits = TableInfo.read(db, "anc_visits");
        if (!_infoAncVisits.equals(_existingAncVisits)) {
          return new RoomOpenHelper.ValidationResult(false, "anc_visits(com.upgovt.ashadiary.data.local.entities.ANCVisitEntity).\n"
                  + " Expected:\n" + _infoAncVisits + "\n"
                  + " Found:\n" + _existingAncVisits);
        }
        final HashMap<String, TableInfo.Column> _columnsBpVisits = new HashMap<String, TableInfo.Column>(23);
        _columnsBpVisits.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("beneficiary_id", new TableInfo.Column("beneficiary_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("visit_date", new TableInfo.Column("visit_date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("bp_systolic", new TableInfo.Column("bp_systolic", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("bp_diastolic", new TableInfo.Column("bp_diastolic", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("pulse_rate", new TableInfo.Column("pulse_rate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("bp_category", new TableInfo.Column("bp_category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("is_referred", new TableInfo.Column("is_referred", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("referral_facility_hindi", new TableInfo.Column("referral_facility_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("follow_up_date", new TableInfo.Column("follow_up_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("medications_prescribed_hindi", new TableInfo.Column("medications_prescribed_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("advice_notes_hindi", new TableInfo.Column("advice_notes_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("recorded_by_user_id", new TableInfo.Column("recorded_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("recorded_at", new TableInfo.Column("recorded_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("gps_lat", new TableInfo.Column("gps_lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("gps_lng", new TableInfo.Column("gps_lng", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("last_modified_by_role_id", new TableInfo.Column("last_modified_by_role_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBpVisits.put("sync_version", new TableInfo.Column("sync_version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBpVisits = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysBpVisits.add(new TableInfo.ForeignKey("beneficiaries", "CASCADE", "NO ACTION", Arrays.asList("beneficiary_id"), Arrays.asList("id")));
        _foreignKeysBpVisits.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("recorded_by_user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesBpVisits = new HashSet<TableInfo.Index>(3);
        _indicesBpVisits.add(new TableInfo.Index("index_bp_visits_beneficiary_id", false, Arrays.asList("beneficiary_id"), Arrays.asList("ASC")));
        _indicesBpVisits.add(new TableInfo.Index("index_bp_visits_visit_date", false, Arrays.asList("visit_date"), Arrays.asList("ASC")));
        _indicesBpVisits.add(new TableInfo.Index("index_bp_visits_recorded_by_user_id", false, Arrays.asList("recorded_by_user_id"), Arrays.asList("ASC")));
        final TableInfo _infoBpVisits = new TableInfo("bp_visits", _columnsBpVisits, _foreignKeysBpVisits, _indicesBpVisits);
        final TableInfo _existingBpVisits = TableInfo.read(db, "bp_visits");
        if (!_infoBpVisits.equals(_existingBpVisits)) {
          return new RoomOpenHelper.ValidationResult(false, "bp_visits(com.upgovt.ashadiary.data.local.entities.BPVisitEntity).\n"
                  + " Expected:\n" + _infoBpVisits + "\n"
                  + " Found:\n" + _existingBpVisits);
        }
        final HashMap<String, TableInfo.Column> _columnsBloodSugarVisits = new HashMap<String, TableInfo.Column>(23);
        _columnsBloodSugarVisits.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("beneficiary_id", new TableInfo.Column("beneficiary_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("visit_date", new TableInfo.Column("visit_date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("test_type", new TableInfo.Column("test_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("blood_sugar_mg_dl", new TableInfo.Column("blood_sugar_mg_dl", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("diabetes_risk", new TableInfo.Column("diabetes_risk", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("is_referred", new TableInfo.Column("is_referred", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("referral_facility_hindi", new TableInfo.Column("referral_facility_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("follow_up_date", new TableInfo.Column("follow_up_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("medications_prescribed_hindi", new TableInfo.Column("medications_prescribed_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("diet_advice_hindi", new TableInfo.Column("diet_advice_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("exercise_advice_hindi", new TableInfo.Column("exercise_advice_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("recorded_by_user_id", new TableInfo.Column("recorded_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("recorded_at", new TableInfo.Column("recorded_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("gps_lat", new TableInfo.Column("gps_lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("gps_lng", new TableInfo.Column("gps_lng", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("last_modified_by_role_id", new TableInfo.Column("last_modified_by_role_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBloodSugarVisits.put("sync_version", new TableInfo.Column("sync_version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBloodSugarVisits = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysBloodSugarVisits.add(new TableInfo.ForeignKey("beneficiaries", "CASCADE", "NO ACTION", Arrays.asList("beneficiary_id"), Arrays.asList("id")));
        _foreignKeysBloodSugarVisits.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("recorded_by_user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesBloodSugarVisits = new HashSet<TableInfo.Index>(3);
        _indicesBloodSugarVisits.add(new TableInfo.Index("index_blood_sugar_visits_beneficiary_id", false, Arrays.asList("beneficiary_id"), Arrays.asList("ASC")));
        _indicesBloodSugarVisits.add(new TableInfo.Index("index_blood_sugar_visits_visit_date", false, Arrays.asList("visit_date"), Arrays.asList("ASC")));
        _indicesBloodSugarVisits.add(new TableInfo.Index("index_blood_sugar_visits_recorded_by_user_id", false, Arrays.asList("recorded_by_user_id"), Arrays.asList("ASC")));
        final TableInfo _infoBloodSugarVisits = new TableInfo("blood_sugar_visits", _columnsBloodSugarVisits, _foreignKeysBloodSugarVisits, _indicesBloodSugarVisits);
        final TableInfo _existingBloodSugarVisits = TableInfo.read(db, "blood_sugar_visits");
        if (!_infoBloodSugarVisits.equals(_existingBloodSugarVisits)) {
          return new RoomOpenHelper.ValidationResult(false, "blood_sugar_visits(com.upgovt.ashadiary.data.local.entities.BloodSugarVisitEntity).\n"
                  + " Expected:\n" + _infoBloodSugarVisits + "\n"
                  + " Found:\n" + _existingBloodSugarVisits);
        }
        final HashMap<String, TableInfo.Column> _columnsVaccinationVisits = new HashMap<String, TableInfo.Column>(22);
        _columnsVaccinationVisits.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("beneficiary_id", new TableInfo.Column("beneficiary_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("visit_date", new TableInfo.Column("visit_date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("vaccine_type", new TableInfo.Column("vaccine_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("vaccine_name_hindi", new TableInfo.Column("vaccine_name_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("dose_number", new TableInfo.Column("dose_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("vaccine_batch_number", new TableInfo.Column("vaccine_batch_number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("vaccine_expiry_date", new TableInfo.Column("vaccine_expiry_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("has_adverse_reaction", new TableInfo.Column("has_adverse_reaction", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("adverse_reaction_notes_hindi", new TableInfo.Column("adverse_reaction_notes_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("next_dose_due_date", new TableInfo.Column("next_dose_due_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("recorded_by_user_id", new TableInfo.Column("recorded_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("recorded_at", new TableInfo.Column("recorded_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("gps_lat", new TableInfo.Column("gps_lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("gps_lng", new TableInfo.Column("gps_lng", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("last_modified_by_role_id", new TableInfo.Column("last_modified_by_role_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVaccinationVisits.put("sync_version", new TableInfo.Column("sync_version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVaccinationVisits = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysVaccinationVisits.add(new TableInfo.ForeignKey("beneficiaries", "CASCADE", "NO ACTION", Arrays.asList("beneficiary_id"), Arrays.asList("id")));
        _foreignKeysVaccinationVisits.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("recorded_by_user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesVaccinationVisits = new HashSet<TableInfo.Index>(4);
        _indicesVaccinationVisits.add(new TableInfo.Index("index_vaccination_visits_beneficiary_id", false, Arrays.asList("beneficiary_id"), Arrays.asList("ASC")));
        _indicesVaccinationVisits.add(new TableInfo.Index("index_vaccination_visits_visit_date", false, Arrays.asList("visit_date"), Arrays.asList("ASC")));
        _indicesVaccinationVisits.add(new TableInfo.Index("index_vaccination_visits_recorded_by_user_id", false, Arrays.asList("recorded_by_user_id"), Arrays.asList("ASC")));
        _indicesVaccinationVisits.add(new TableInfo.Index("index_vaccination_visits_vaccine_type", false, Arrays.asList("vaccine_type"), Arrays.asList("ASC")));
        final TableInfo _infoVaccinationVisits = new TableInfo("vaccination_visits", _columnsVaccinationVisits, _foreignKeysVaccinationVisits, _indicesVaccinationVisits);
        final TableInfo _existingVaccinationVisits = TableInfo.read(db, "vaccination_visits");
        if (!_infoVaccinationVisits.equals(_existingVaccinationVisits)) {
          return new RoomOpenHelper.ValidationResult(false, "vaccination_visits(com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity).\n"
                  + " Expected:\n" + _infoVaccinationVisits + "\n"
                  + " Found:\n" + _existingVaccinationVisits);
        }
        final HashMap<String, TableInfo.Column> _columnsEditRequests = new HashMap<String, TableInfo.Column>(19);
        _columnsEditRequests.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("beneficiary_id", new TableInfo.Column("beneficiary_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("field_name", new TableInfo.Column("field_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("current_value", new TableInfo.Column("current_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("requested_value", new TableInfo.Column("requested_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("reason_hindi", new TableInfo.Column("reason_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("requested_by_user_id", new TableInfo.Column("requested_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("requested_at", new TableInfo.Column("requested_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("request_gps_lat", new TableInfo.Column("request_gps_lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("request_gps_lng", new TableInfo.Column("request_gps_lng", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("reviewed_by_user_id", new TableInfo.Column("reviewed_by_user_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("reviewed_at", new TableInfo.Column("reviewed_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("review_notes_hindi", new TableInfo.Column("review_notes_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditRequests.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEditRequests = new HashSet<TableInfo.ForeignKey>(3);
        _foreignKeysEditRequests.add(new TableInfo.ForeignKey("beneficiaries", "CASCADE", "NO ACTION", Arrays.asList("beneficiary_id"), Arrays.asList("id")));
        _foreignKeysEditRequests.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("requested_by_user_id"), Arrays.asList("id")));
        _foreignKeysEditRequests.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("reviewed_by_user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesEditRequests = new HashSet<TableInfo.Index>(4);
        _indicesEditRequests.add(new TableInfo.Index("index_edit_requests_beneficiary_id", false, Arrays.asList("beneficiary_id"), Arrays.asList("ASC")));
        _indicesEditRequests.add(new TableInfo.Index("index_edit_requests_requested_by_user_id", false, Arrays.asList("requested_by_user_id"), Arrays.asList("ASC")));
        _indicesEditRequests.add(new TableInfo.Index("index_edit_requests_status", false, Arrays.asList("status"), Arrays.asList("ASC")));
        _indicesEditRequests.add(new TableInfo.Index("index_edit_requests_requested_at", false, Arrays.asList("requested_at"), Arrays.asList("ASC")));
        final TableInfo _infoEditRequests = new TableInfo("edit_requests", _columnsEditRequests, _foreignKeysEditRequests, _indicesEditRequests);
        final TableInfo _existingEditRequests = TableInfo.read(db, "edit_requests");
        if (!_infoEditRequests.equals(_existingEditRequests)) {
          return new RoomOpenHelper.ValidationResult(false, "edit_requests(com.upgovt.ashadiary.data.local.entities.EditRequestEntity).\n"
                  + " Expected:\n" + _infoEditRequests + "\n"
                  + " Found:\n" + _existingEditRequests);
        }
        final HashMap<String, TableInfo.Column> _columnsDuplicateFlags = new HashMap<String, TableInfo.Column>(22);
        _columnsDuplicateFlags.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("beneficiary_id_1", new TableInfo.Column("beneficiary_id_1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("beneficiary_id_2", new TableInfo.Column("beneficiary_id_2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("similarity_score", new TableInfo.Column("similarity_score", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("name_match", new TableInfo.Column("name_match", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("village_match", new TableInfo.Column("village_match", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("gender_match", new TableInfo.Column("gender_match", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("age_within_range", new TableInfo.Column("age_within_range", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("flagged_by_user_id", new TableInfo.Column("flagged_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("flagged_at", new TableInfo.Column("flagged_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("flag_source", new TableInfo.Column("flag_source", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("resolved_by_user_id", new TableInfo.Column("resolved_by_user_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("resolved_at", new TableInfo.Column("resolved_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("resolution_action", new TableInfo.Column("resolution_action", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("resolution_notes_hindi", new TableInfo.Column("resolution_notes_hindi", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("master_beneficiary_id", new TableInfo.Column("master_beneficiary_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDuplicateFlags.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDuplicateFlags = new HashSet<TableInfo.ForeignKey>(4);
        _foreignKeysDuplicateFlags.add(new TableInfo.ForeignKey("beneficiaries", "CASCADE", "NO ACTION", Arrays.asList("beneficiary_id_1"), Arrays.asList("id")));
        _foreignKeysDuplicateFlags.add(new TableInfo.ForeignKey("beneficiaries", "CASCADE", "NO ACTION", Arrays.asList("beneficiary_id_2"), Arrays.asList("id")));
        _foreignKeysDuplicateFlags.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("flagged_by_user_id"), Arrays.asList("id")));
        _foreignKeysDuplicateFlags.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("resolved_by_user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesDuplicateFlags = new HashSet<TableInfo.Index>(5);
        _indicesDuplicateFlags.add(new TableInfo.Index("index_duplicate_flags_beneficiary_id_1", false, Arrays.asList("beneficiary_id_1"), Arrays.asList("ASC")));
        _indicesDuplicateFlags.add(new TableInfo.Index("index_duplicate_flags_beneficiary_id_2", false, Arrays.asList("beneficiary_id_2"), Arrays.asList("ASC")));
        _indicesDuplicateFlags.add(new TableInfo.Index("index_duplicate_flags_beneficiary_id_1_beneficiary_id_2", true, Arrays.asList("beneficiary_id_1", "beneficiary_id_2"), Arrays.asList("ASC", "ASC")));
        _indicesDuplicateFlags.add(new TableInfo.Index("index_duplicate_flags_status", false, Arrays.asList("status"), Arrays.asList("ASC")));
        _indicesDuplicateFlags.add(new TableInfo.Index("index_duplicate_flags_flagged_at", false, Arrays.asList("flagged_at"), Arrays.asList("ASC")));
        final TableInfo _infoDuplicateFlags = new TableInfo("duplicate_flags", _columnsDuplicateFlags, _foreignKeysDuplicateFlags, _indicesDuplicateFlags);
        final TableInfo _existingDuplicateFlags = TableInfo.read(db, "duplicate_flags");
        if (!_infoDuplicateFlags.equals(_existingDuplicateFlags)) {
          return new RoomOpenHelper.ValidationResult(false, "duplicate_flags(com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity).\n"
                  + " Expected:\n" + _infoDuplicateFlags + "\n"
                  + " Found:\n" + _existingDuplicateFlags);
        }
        final HashMap<String, TableInfo.Column> _columnsAuditLogs = new HashMap<String, TableInfo.Column>(19);
        _columnsAuditLogs.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("user_role_id", new TableInfo.Column("user_role_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("action_type", new TableInfo.Column("action_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("entity_type", new TableInfo.Column("entity_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("entity_id", new TableInfo.Column("entity_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("field_name", new TableInfo.Column("field_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("old_value", new TableInfo.Column("old_value", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("new_value", new TableInfo.Column("new_value", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("action_description_hindi", new TableInfo.Column("action_description_hindi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("action_timestamp", new TableInfo.Column("action_timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("gps_lat", new TableInfo.Column("gps_lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("gps_lng", new TableInfo.Column("gps_lng", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("gps_accuracy_meters", new TableInfo.Column("gps_accuracy_meters", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("device_id", new TableInfo.Column("device_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("app_version", new TableInfo.Column("app_version", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAuditLogs.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAuditLogs = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysAuditLogs.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesAuditLogs = new HashSet<TableInfo.Index>(5);
        _indicesAuditLogs.add(new TableInfo.Index("index_audit_logs_user_id", false, Arrays.asList("user_id"), Arrays.asList("ASC")));
        _indicesAuditLogs.add(new TableInfo.Index("index_audit_logs_action_timestamp", false, Arrays.asList("action_timestamp"), Arrays.asList("ASC")));
        _indicesAuditLogs.add(new TableInfo.Index("index_audit_logs_entity_type", false, Arrays.asList("entity_type"), Arrays.asList("ASC")));
        _indicesAuditLogs.add(new TableInfo.Index("index_audit_logs_entity_id", false, Arrays.asList("entity_id"), Arrays.asList("ASC")));
        _indicesAuditLogs.add(new TableInfo.Index("index_audit_logs_action_type", false, Arrays.asList("action_type"), Arrays.asList("ASC")));
        final TableInfo _infoAuditLogs = new TableInfo("audit_logs", _columnsAuditLogs, _foreignKeysAuditLogs, _indicesAuditLogs);
        final TableInfo _existingAuditLogs = TableInfo.read(db, "audit_logs");
        if (!_infoAuditLogs.equals(_existingAuditLogs)) {
          return new RoomOpenHelper.ValidationResult(false, "audit_logs(com.upgovt.ashadiary.data.local.entities.AuditLogEntity).\n"
                  + " Expected:\n" + _infoAuditLogs + "\n"
                  + " Found:\n" + _existingAuditLogs);
        }
        final HashMap<String, TableInfo.Column> _columnsBiometricsLocal = new HashMap<String, TableInfo.Column>(10);
        _columnsBiometricsLocal.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("beneficiary_id", new TableInfo.Column("beneficiary_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("finger_position", new TableInfo.Column("finger_position", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("quality_score", new TableInfo.Column("quality_score", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("iso_template", new TableInfo.Column("iso_template", "BLOB", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("captured_by_user_id", new TableInfo.Column("captured_by_user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("captured_at", new TableInfo.Column("captured_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("device_serial_number", new TableInfo.Column("device_serial_number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBiometricsLocal.put("last_synced_at", new TableInfo.Column("last_synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBiometricsLocal = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysBiometricsLocal.add(new TableInfo.ForeignKey("beneficiaries", "CASCADE", "NO ACTION", Arrays.asList("beneficiary_id"), Arrays.asList("id")));
        _foreignKeysBiometricsLocal.add(new TableInfo.ForeignKey("users", "RESTRICT", "NO ACTION", Arrays.asList("captured_by_user_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesBiometricsLocal = new HashSet<TableInfo.Index>(3);
        _indicesBiometricsLocal.add(new TableInfo.Index("index_biometrics_local_beneficiary_id", false, Arrays.asList("beneficiary_id"), Arrays.asList("ASC")));
        _indicesBiometricsLocal.add(new TableInfo.Index("index_biometrics_local_finger_position", false, Arrays.asList("finger_position"), Arrays.asList("ASC")));
        _indicesBiometricsLocal.add(new TableInfo.Index("index_biometrics_local_captured_at", false, Arrays.asList("captured_at"), Arrays.asList("ASC")));
        final TableInfo _infoBiometricsLocal = new TableInfo("biometrics_local", _columnsBiometricsLocal, _foreignKeysBiometricsLocal, _indicesBiometricsLocal);
        final TableInfo _existingBiometricsLocal = TableInfo.read(db, "biometrics_local");
        if (!_infoBiometricsLocal.equals(_existingBiometricsLocal)) {
          return new RoomOpenHelper.ValidationResult(false, "biometrics_local(com.upgovt.ashadiary.data.local.entities.BiometricLocalEntity).\n"
                  + " Expected:\n" + _infoBiometricsLocal + "\n"
                  + " Found:\n" + _existingBiometricsLocal);
        }
        final HashMap<String, TableInfo.Column> _columnsSyncQueue = new HashMap<String, TableInfo.Column>(18);
        _columnsSyncQueue.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("entity_type", new TableInfo.Column("entity_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("entity_id", new TableInfo.Column("entity_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("operation", new TableInfo.Column("operation", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("payload_json", new TableInfo.Column("payload_json", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("sync_status", new TableInfo.Column("sync_status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("retry_count", new TableInfo.Column("retry_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("max_retries", new TableInfo.Column("max_retries", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("last_retry_at", new TableInfo.Column("last_retry_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("next_retry_at", new TableInfo.Column("next_retry_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("last_error_message", new TableInfo.Column("last_error_message", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("last_error_code", new TableInfo.Column("last_error_code", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("user_role_id", new TableInfo.Column("user_role_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("sync_version", new TableInfo.Column("sync_version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncQueue.put("synced_at", new TableInfo.Column("synced_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSyncQueue = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSyncQueue = new HashSet<TableInfo.Index>(5);
        _indicesSyncQueue.add(new TableInfo.Index("index_sync_queue_entity_type", false, Arrays.asList("entity_type"), Arrays.asList("ASC")));
        _indicesSyncQueue.add(new TableInfo.Index("index_sync_queue_sync_status", false, Arrays.asList("sync_status"), Arrays.asList("ASC")));
        _indicesSyncQueue.add(new TableInfo.Index("index_sync_queue_priority", false, Arrays.asList("priority"), Arrays.asList("ASC")));
        _indicesSyncQueue.add(new TableInfo.Index("index_sync_queue_created_at", false, Arrays.asList("created_at"), Arrays.asList("ASC")));
        _indicesSyncQueue.add(new TableInfo.Index("index_sync_queue_retry_count", false, Arrays.asList("retry_count"), Arrays.asList("ASC")));
        final TableInfo _infoSyncQueue = new TableInfo("sync_queue", _columnsSyncQueue, _foreignKeysSyncQueue, _indicesSyncQueue);
        final TableInfo _existingSyncQueue = TableInfo.read(db, "sync_queue");
        if (!_infoSyncQueue.equals(_existingSyncQueue)) {
          return new RoomOpenHelper.ValidationResult(false, "sync_queue(com.upgovt.ashadiary.data.local.entities.SyncQueueEntity).\n"
                  + " Expected:\n" + _infoSyncQueue + "\n"
                  + " Found:\n" + _existingSyncQueue);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "97a4e64fae9fabf9245ab8752e590e9e", "575f9fb3b4f04c0cbe19c87ac02c3e1e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "users","roles","villages","user_area_mappings","beneficiaries","anc_visits","bp_visits","blood_sugar_visits","vaccination_visits","edit_requests","duplicate_flags","audit_logs","biometrics_local","sync_queue");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `users`");
      _db.execSQL("DELETE FROM `roles`");
      _db.execSQL("DELETE FROM `villages`");
      _db.execSQL("DELETE FROM `user_area_mappings`");
      _db.execSQL("DELETE FROM `beneficiaries`");
      _db.execSQL("DELETE FROM `anc_visits`");
      _db.execSQL("DELETE FROM `bp_visits`");
      _db.execSQL("DELETE FROM `blood_sugar_visits`");
      _db.execSQL("DELETE FROM `vaccination_visits`");
      _db.execSQL("DELETE FROM `edit_requests`");
      _db.execSQL("DELETE FROM `duplicate_flags`");
      _db.execSQL("DELETE FROM `audit_logs`");
      _db.execSQL("DELETE FROM `biometrics_local`");
      _db.execSQL("DELETE FROM `sync_queue`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RoleDao.class, RoleDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(VillageDao.class, VillageDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserAreaMappingDao.class, UserAreaMappingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BeneficiaryDao.class, BeneficiaryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ANCVisitDao.class, ANCVisitDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BPVisitDao.class, BPVisitDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BloodSugarVisitDao.class, BloodSugarVisitDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(VaccinationVisitDao.class, VaccinationVisitDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(EditRequestDao.class, EditRequestDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DuplicateFlagDao.class, DuplicateFlagDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AuditLogDao.class, AuditLogDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BiometricLocalDao.class, BiometricLocalDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SyncQueueDao.class, SyncQueueDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public RoleDao roleDao() {
    if (_roleDao != null) {
      return _roleDao;
    } else {
      synchronized(this) {
        if(_roleDao == null) {
          _roleDao = new RoleDao_Impl(this);
        }
        return _roleDao;
      }
    }
  }

  @Override
  public VillageDao villageDao() {
    if (_villageDao != null) {
      return _villageDao;
    } else {
      synchronized(this) {
        if(_villageDao == null) {
          _villageDao = new VillageDao_Impl(this);
        }
        return _villageDao;
      }
    }
  }

  @Override
  public UserAreaMappingDao userAreaMappingDao() {
    if (_userAreaMappingDao != null) {
      return _userAreaMappingDao;
    } else {
      synchronized(this) {
        if(_userAreaMappingDao == null) {
          _userAreaMappingDao = new UserAreaMappingDao_Impl(this);
        }
        return _userAreaMappingDao;
      }
    }
  }

  @Override
  public BeneficiaryDao beneficiaryDao() {
    if (_beneficiaryDao != null) {
      return _beneficiaryDao;
    } else {
      synchronized(this) {
        if(_beneficiaryDao == null) {
          _beneficiaryDao = new BeneficiaryDao_Impl(this);
        }
        return _beneficiaryDao;
      }
    }
  }

  @Override
  public ANCVisitDao ancVisitDao() {
    if (_aNCVisitDao != null) {
      return _aNCVisitDao;
    } else {
      synchronized(this) {
        if(_aNCVisitDao == null) {
          _aNCVisitDao = new ANCVisitDao_Impl(this);
        }
        return _aNCVisitDao;
      }
    }
  }

  @Override
  public BPVisitDao bpVisitDao() {
    if (_bPVisitDao != null) {
      return _bPVisitDao;
    } else {
      synchronized(this) {
        if(_bPVisitDao == null) {
          _bPVisitDao = new BPVisitDao_Impl(this);
        }
        return _bPVisitDao;
      }
    }
  }

  @Override
  public BloodSugarVisitDao bloodSugarVisitDao() {
    if (_bloodSugarVisitDao != null) {
      return _bloodSugarVisitDao;
    } else {
      synchronized(this) {
        if(_bloodSugarVisitDao == null) {
          _bloodSugarVisitDao = new BloodSugarVisitDao_Impl(this);
        }
        return _bloodSugarVisitDao;
      }
    }
  }

  @Override
  public VaccinationVisitDao vaccinationVisitDao() {
    if (_vaccinationVisitDao != null) {
      return _vaccinationVisitDao;
    } else {
      synchronized(this) {
        if(_vaccinationVisitDao == null) {
          _vaccinationVisitDao = new VaccinationVisitDao_Impl(this);
        }
        return _vaccinationVisitDao;
      }
    }
  }

  @Override
  public EditRequestDao editRequestDao() {
    if (_editRequestDao != null) {
      return _editRequestDao;
    } else {
      synchronized(this) {
        if(_editRequestDao == null) {
          _editRequestDao = new EditRequestDao_Impl(this);
        }
        return _editRequestDao;
      }
    }
  }

  @Override
  public DuplicateFlagDao duplicateFlagDao() {
    if (_duplicateFlagDao != null) {
      return _duplicateFlagDao;
    } else {
      synchronized(this) {
        if(_duplicateFlagDao == null) {
          _duplicateFlagDao = new DuplicateFlagDao_Impl(this);
        }
        return _duplicateFlagDao;
      }
    }
  }

  @Override
  public AuditLogDao auditLogDao() {
    if (_auditLogDao != null) {
      return _auditLogDao;
    } else {
      synchronized(this) {
        if(_auditLogDao == null) {
          _auditLogDao = new AuditLogDao_Impl(this);
        }
        return _auditLogDao;
      }
    }
  }

  @Override
  public BiometricLocalDao biometricLocalDao() {
    if (_biometricLocalDao != null) {
      return _biometricLocalDao;
    } else {
      synchronized(this) {
        if(_biometricLocalDao == null) {
          _biometricLocalDao = new BiometricLocalDao_Impl(this);
        }
        return _biometricLocalDao;
      }
    }
  }

  @Override
  public SyncQueueDao syncQueueDao() {
    if (_syncQueueDao != null) {
      return _syncQueueDao;
    } else {
      synchronized(this) {
        if(_syncQueueDao == null) {
          _syncQueueDao = new SyncQueueDao_Impl(this);
        }
        return _syncQueueDao;
      }
    }
  }
}
