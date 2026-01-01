package com.upgovt.ashadiary.domain.editrequest;

/**
 * EditRequestWorkflowManager - Manages edit request workflow
 *
 * Workflow: Field Staff → Supervisor → Block Nodal
 *
 * Rules:
 * - Field Staff: Can only submit requests, cannot edit directly
 * - Supervisor: Can approve/reject requests
 * - Block Nodal: Final authority, can approve/reject
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0$0#J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0$0#2\u0006\u0010\u001c\u001a\u00020\u000fJ\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0$0#2\u0006\u0010\u001f\u001a\u00020\u000fJ<\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b(\u0010\u0019Jd\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b3\u00104R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00065"}, d2 = {"Lcom/upgovt/ashadiary/domain/editrequest/EditRequestWorkflowManager;", "", "editRequestDao", "Lcom/upgovt/ashadiary/data/local/dao/EditRequestDao;", "beneficiaryDao", "Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;", "auditLogDao", "Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;", "(Lcom/upgovt/ashadiary/data/local/dao/EditRequestDao;Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;)V", "applyEdit", "Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "beneficiary", "editRequest", "Lcom/upgovt/ashadiary/data/local/entities/EditRequestEntity;", "modifiedByUserId", "", "modifiedByRoleId", "", "approveEditRequest", "Lkotlin/Result;", "requestId", "reviewedByUserId", "reviewedByRoleId", "reviewNotes", "approveEditRequest-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAuditLog", "", "userId", "userRoleId", "action", "beneficiaryId", "description", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPendingRequests", "Lkotlinx/coroutines/flow/Flow;", "", "getRequestsByUser", "getRequestsForBeneficiary", "rejectEditRequest", "rejectEditRequest-yxL6bBk", "submitEditRequest", "fieldName", "currentValue", "requestedValue", "reason", "requestedByUserId", "requestedByRoleId", "gpsLat", "", "gpsLng", "submitEditRequest-LiYkppA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class EditRequestWorkflowManager {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.EditRequestDao editRequestDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao = null;
    
    public EditRequestWorkflowManager(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.EditRequestDao editRequestDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.AuditLogDao auditLogDao) {
        super();
    }
    
    /**
     * Get pending requests for review (for Supervisor/Block Nodal)
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> getPendingRequests() {
        return null;
    }
    
    /**
     * Get requests submitted by user (for Field Staff to track their requests)
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> getRequestsByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    /**
     * Get requests for a specific beneficiary
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> getRequestsForBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId) {
        return null;
    }
    
    /**
     * Apply edit to beneficiary
     */
    private final com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity applyEdit(com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, com.upgovt.ashadiary.data.local.entities.EditRequestEntity editRequest, java.lang.String modifiedByUserId, int modifiedByRoleId) {
        return null;
    }
    
    /**
     * Create audit log
     */
    private final java.lang.Object createAuditLog(java.lang.String userId, int userRoleId, java.lang.String action, java.lang.String beneficiaryId, java.lang.String description, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}