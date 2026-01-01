package com.upgovt.ashadiary.data.repository;

/**
 * BeneficiaryRepository - Repository pattern for beneficiary data
 * Handles offline-first logic, duplicate detection, and sync queueing
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0010J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00162\u0006\u0010\u001e\u001a\u00020\u0010J\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u0016J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u0016JN\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0082@\u00a2\u0006\u0002\u0010*J<\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0,2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b/\u00100J8\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0017022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013J$\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u00162\u0006\u00105\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u0012J4\u00106\u001a\b\u0012\u0004\u0012\u00020\f0,2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b7\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00068"}, d2 = {"Lcom/upgovt/ashadiary/data/repository/BeneficiaryRepository;", "", "beneficiaryDao", "Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;", "duplicateFlagDao", "Lcom/upgovt/ashadiary/data/local/dao/DuplicateFlagDao;", "syncQueueDao", "Lcom/upgovt/ashadiary/data/local/dao/SyncQueueDao;", "auditLogDao", "Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;", "(Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;Lcom/upgovt/ashadiary/data/local/dao/DuplicateFlagDao;Lcom/upgovt/ashadiary/data/local/dao/SyncQueueDao;Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;)V", "addToSyncQueue", "", "beneficiary", "Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "operation", "", "userRoleId", "", "(Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beneficiaryToJson", "getBeneficiariesByVillage", "Lkotlinx/coroutines/flow/Flow;", "", "villageId", "getBeneficiariesPaginated", "limit", "offset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBeneficiaryById", "beneficiaryId", "getDuplicateFlaggedBeneficiaries", "getTotalActiveBeneficiaries", "logAudit", "userId", "actionType", "entityType", "entityId", "description", "gpsLat", "", "gpsLng", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeBeneficiaryInto", "Lkotlin/Result;", "duplicateBeneficiaryId", "masterBeneficiaryId", "mergeBeneficiaryInto-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerBeneficiary", "Lkotlin/Pair;", "Lcom/upgovt/ashadiary/data/local/entities/DuplicateFlagEntity;", "searchBeneficiaries", "query", "updateBeneficiary", "updateBeneficiary-BWLJW6A", "app_debug"})
public final class BeneficiaryRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao duplicateFlagDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.SyncQueueDao syncQueueDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao = null;
    
    public BeneficiaryRepository(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao duplicateFlagDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.SyncQueueDao syncQueueDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao) {
        super();
    }
    
    /**
     * Register new beneficiary with duplicate detection
     * Returns Pair<BeneficiaryEntity, List<DuplicateFlagEntity>>
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerBeneficiary(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, int userRoleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, ? extends java.util.List<com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity> getBeneficiaryById(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> getBeneficiariesByVillage(@org.jetbrains.annotations.NotNull()
    java.lang.String villageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> searchBeneficiaries(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBeneficiariesPaginated(int limit, int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getTotalActiveBeneficiaries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> getDuplicateFlaggedBeneficiaries() {
        return null;
    }
    
    private final java.lang.Object addToSyncQueue(com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, java.lang.String operation, int userRoleId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object logAudit(java.lang.String userId, int userRoleId, java.lang.String actionType, java.lang.String entityType, java.lang.String entityId, java.lang.String description, double gpsLat, double gpsLng, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.String beneficiaryToJson(com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary) {
        return null;
    }
}