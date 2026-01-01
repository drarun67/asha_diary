package com.upgovt.ashadiary.domain.duplicate;

/**
 * DuplicateMergeManager - Handles duplicate beneficiary merge operations
 * Only Block Nodal and above can perform merges
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J@\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@\u00a2\u0006\u0002\u0010\u001eJ<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b#\u0010$JF\u0010%\u001a\b\u0012\u0004\u0012\u00020&0 2\u0006\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b)\u0010*J\u001e\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010.R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006/"}, d2 = {"Lcom/upgovt/ashadiary/domain/duplicate/DuplicateMergeManager;", "", "beneficiaryDao", "Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;", "duplicateFlagDao", "Lcom/upgovt/ashadiary/data/local/dao/DuplicateFlagDao;", "biometricDao", "Lcom/upgovt/ashadiary/data/local/dao/BiometricLocalDao;", "ancVisitDao", "Lcom/upgovt/ashadiary/data/local/dao/ANCVisitDao;", "bpVisitDao", "Lcom/upgovt/ashadiary/data/local/dao/BPVisitDao;", "bloodSugarVisitDao", "Lcom/upgovt/ashadiary/data/local/dao/BloodSugarVisitDao;", "vaccinationVisitDao", "Lcom/upgovt/ashadiary/data/local/dao/VaccinationVisitDao;", "auditLogDao", "Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;", "(Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;Lcom/upgovt/ashadiary/data/local/dao/DuplicateFlagDao;Lcom/upgovt/ashadiary/data/local/dao/BiometricLocalDao;Lcom/upgovt/ashadiary/data/local/dao/ANCVisitDao;Lcom/upgovt/ashadiary/data/local/dao/BPVisitDao;Lcom/upgovt/ashadiary/data/local/dao/BloodSugarVisitDao;Lcom/upgovt/ashadiary/data/local/dao/VaccinationVisitDao;Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;)V", "createMergeAuditLog", "", "duplicateId", "", "masterId", "userId", "userRoleId", "", "notes", "transferredVisits", "Lcom/upgovt/ashadiary/domain/duplicate/VisitTransferReport;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/upgovt/ashadiary/domain/duplicate/VisitTransferReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inactivateDuplicate", "Lkotlin/Result;", "beneficiaryId", "reason", "inactivateDuplicate-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeDuplicateIntoMaster", "Lcom/upgovt/ashadiary/domain/duplicate/MergeResult;", "duplicateBeneficiaryId", "masterBeneficiaryId", "mergeDuplicateIntoMaster-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferVisitRecords", "fromBeneficiaryId", "toBeneficiaryId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class DuplicateMergeManager {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao duplicateFlagDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BiometricLocalDao biometricDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.ANCVisitDao ancVisitDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BPVisitDao bpVisitDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BloodSugarVisitDao bloodSugarVisitDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.VaccinationVisitDao vaccinationVisitDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao = null;
    
    public DuplicateMergeManager(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.DuplicateFlagDao duplicateFlagDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BiometricLocalDao biometricDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.ANCVisitDao ancVisitDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BPVisitDao bpVisitDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BloodSugarVisitDao bloodSugarVisitDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.VaccinationVisitDao vaccinationVisitDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao) {
        super();
    }
    
    /**
     * Transfer all visit records from duplicate to master
     */
    private final java.lang.Object transferVisitRecords(java.lang.String fromBeneficiaryId, java.lang.String toBeneficiaryId, kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.domain.duplicate.VisitTransferReport> $completion) {
        return null;
    }
    
    /**
     * Create audit log for merge operation
     */
    private final java.lang.Object createMergeAuditLog(java.lang.String duplicateId, java.lang.String masterId, java.lang.String userId, int userRoleId, java.lang.String notes, com.upgovt.ashadiary.domain.duplicate.VisitTransferReport transferredVisits, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}