package com.upgovt.ashadiary.domain.usecases;

/**
 * RegisterBeneficiaryUseCase - Complete beneficiary registration workflow
 *
 * Steps:
 * 1. Generate unique beneficiary ID
 * 2. Check for duplicates (name/village/age/biometric)
 * 3. If duplicates found: Create flags and warn user
 * 4. If no duplicates or user confirms: Register beneficiary
 * 5. Store fingerprint (if captured)
 * 6. Add to sync queue
 * 7. Create audit log
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010\u0017J(\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010!J8\u0010\"\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00142\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00a2\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0086@\u00a2\u0006\u0002\u0010)R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/upgovt/ashadiary/domain/usecases/RegisterBeneficiaryUseCase;", "", "beneficiaryDao", "Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;", "villageDao", "Lcom/upgovt/ashadiary/data/local/dao/VillageDao;", "duplicateFlagDao", "Lcom/upgovt/ashadiary/data/local/dao/DuplicateFlagDao;", "biometricRepository", "Lcom/upgovt/ashadiary/data/repository/BiometricRepository;", "auditLogDao", "Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;", "syncQueueDao", "Lcom/upgovt/ashadiary/data/local/dao/SyncQueueDao;", "(Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;Lcom/upgovt/ashadiary/data/local/dao/VillageDao;Lcom/upgovt/ashadiary/data/local/dao/DuplicateFlagDao;Lcom/upgovt/ashadiary/data/repository/BiometricRepository;Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;Lcom/upgovt/ashadiary/data/local/dao/SyncQueueDao;)V", "duplicateEngine", "Lcom/upgovt/ashadiary/domain/duplicate/DuplicateDetectionEngine;", "addToSyncQueue", "", "beneficiary", "Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "roleId", "", "(Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkForDuplicates", "", "Lkotlin/Pair;", "Lcom/upgovt/ashadiary/domain/duplicate/DuplicateScore;", "newBeneficiary", "(Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAuditLog", "userId", "", "(Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDuplicateFlags", "matches", "(Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult;", "request", "Lcom/upgovt/ashadiary/domain/usecases/BeneficiaryRegistrationRequest;", "(Lcom/upgovt/ashadiary/domain/usecases/BeneficiaryRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class RegisterBeneficiaryUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.VillageDao villageDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao duplicateFlagDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.repository.BiometricRepository biometricRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.SyncQueueDao syncQueueDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.domain.duplicate.DuplicateDetectionEngine duplicateEngine = null;
    
    public RegisterBeneficiaryUseCase(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.VillageDao villageDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao duplicateFlagDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.repository.BiometricRepository biometricRepository, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.SyncQueueDao syncQueueDao) {
        super();
    }
    
    /**
     * Execute registration with duplicate detection
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.domain.usecases.BeneficiaryRegistrationRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.domain.usecases.RegistrationResult> $completion) {
        return null;
    }
    
    /**
     * Check for duplicate beneficiaries
     */
    private final java.lang.Object checkForDuplicates(com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity newBeneficiary, kotlin.coroutines.Continuation<? super java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>>> $completion) {
        return null;
    }
    
    /**
     * Create duplicate flags for matches
     */
    private final java.lang.Object createDuplicateFlags(com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity newBeneficiary, java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>> matches, java.lang.String userId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Add to sync queue
     */
    private final java.lang.Object addToSyncQueue(com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, int roleId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Create audit log
     */
    private final java.lang.Object createAuditLog(com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, java.lang.String userId, int roleId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}