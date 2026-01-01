package com.upgovt.ashadiary.data.local.database;

/**
 * ASHADiaryDatabase - Encrypted SQLite database
 * Uses SQLCipher for encryption
 * Government security compliance - biometrics never leave device
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&\u00a8\u0006!"}, d2 = {"Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase;", "Landroidx/room/RoomDatabase;", "()V", "ancVisitDao", "Lcom/upgovt/ashadiary/data/local/dao/ANCVisitDao;", "auditLogDao", "Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;", "beneficiaryDao", "Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;", "biometricLocalDao", "Lcom/upgovt/ashadiary/data/local/dao/BiometricLocalDao;", "bloodSugarVisitDao", "Lcom/upgovt/ashadiary/data/local/dao/BloodSugarVisitDao;", "bpVisitDao", "Lcom/upgovt/ashadiary/data/local/dao/BPVisitDao;", "duplicateFlagDao", "Lcom/upgovt/ashadiary/data/local/dao/DuplicateFlagDao;", "editRequestDao", "Lcom/upgovt/ashadiary/data/local/dao/EditRequestDao;", "roleDao", "Lcom/upgovt/ashadiary/data/local/dao/RoleDao;", "syncQueueDao", "Lcom/upgovt/ashadiary/data/local/dao/SyncQueueDao;", "userAreaMappingDao", "Lcom/upgovt/ashadiary/data/local/dao/UserAreaMappingDao;", "userDao", "Lcom/upgovt/ashadiary/data/local/dao/UserDao;", "vaccinationVisitDao", "Lcom/upgovt/ashadiary/data/local/dao/VaccinationVisitDao;", "villageDao", "Lcom/upgovt/ashadiary/data/local/dao/VillageDao;", "Companion", "DatabaseCallback", "app_release"})
@androidx.room.Database(entities = {com.upgovt.ashadiary.data.local.entities.UserEntity.class, com.upgovt.ashadiary.data.local.entities.RoleEntity.class, com.upgovt.ashadiary.data.local.entities.VillageEntity.class, com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity.class, com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity.class, com.upgovt.ashadiary.data.local.entities.ANCVisitEntity.class, com.upgovt.ashadiary.data.local.entities.BPVisitEntity.class, com.upgovt.ashadiary.data.local.entities.BloodSugarVisitEntity.class, com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity.class, com.upgovt.ashadiary.data.local.entities.EditRequestEntity.class, com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity.class, com.upgovt.ashadiary.data.local.entities.AuditLogEntity.class, com.upgovt.ashadiary.data.local.entities.BiometricLocalEntity.class, com.upgovt.ashadiary.data.local.entities.SyncQueueEntity.class}, version = 1, exportSchema = true)
public abstract class ASHADiaryDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "asha_diary.db";
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase.Companion Companion = null;
    
    public ASHADiaryDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.RoleDao roleDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.VillageDao villageDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.UserAreaMappingDao userAreaMappingDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.ANCVisitDao ancVisitDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.BPVisitDao bpVisitDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.BloodSugarVisitDao bloodSugarVisitDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.VaccinationVisitDao vaccinationVisitDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.EditRequestDao editRequestDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao duplicateFlagDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.BiometricLocalDao biometricLocalDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.data.local.dao.SyncQueueDao syncQueueDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "passphrase", "", "clearInstance", "", "getInstance", "getInstanceForTest", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Get encrypted database instance
         * Passphrase is derived from device-specific secure key
         */
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        char[] passphrase) {
            return null;
        }
        
        /**
         * Build encrypted database with SQLCipher
         */
        private final com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase buildDatabase(android.content.Context context, char[] passphrase) {
            return null;
        }
        
        /**
         * For testing only - unencrypted database
         */
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase getInstanceForTest(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Clear instance (for logout or testing)
         */
        public final void clearInstance() {
        }
    }
    
    /**
     * Database callback for initialization
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase$DatabaseCallback;", "Landroidx/room/RoomDatabase$Callback;", "()V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_release"})
    static final class DatabaseCallback extends androidx.room.RoomDatabase.Callback {
        
        public DatabaseCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
    }
}