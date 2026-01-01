package com.upgovt.ashadiary.data.local.dao;

/**
 * EditRequestDao - Handles edit request workflow
 * Field Staff → Supervisor → Block Nodal
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0!2\u0006\u0010\u0010\u001a\u00020\u0005H\'J\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0!2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0!2\u0006\u0010\u0013\u001a\u00020\u0005H\'J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0!2\u0006\u0010\u0015\u001a\u00020\u0005H\'J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030!H\'J\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0!H\'J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00030!H\'J4\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010)\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/EditRequestDao;", "", "approveRequest", "", "requestId", "", "reviewedByUserId", "reviewedAt", "", "reviewNotes", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByBeneficiary", "", "Lcom/upgovt/ashadiary/data/local/entities/EditRequestEntity;", "beneficiaryId", "getById", "getByRequestedUser", "userId", "getByStatus", "status", "getPendingCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPendingRequests", "getUnsynced", "insert", "request", "(Lcom/upgovt/ashadiary/data/local/entities/EditRequestEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "requests", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeByBeneficiary", "Lkotlinx/coroutines/flow/Flow;", "observeById", "observeByRequestedUser", "observeByStatus", "observePendingCount", "observePendingRequests", "observeUnsyncedCount", "rejectRequest", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface EditRequestDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.EditRequestEntity request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity> requests, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE id = :requestId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(@org.jetbrains.annotations.NotNull()
    java.lang.String requestId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.EditRequestEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE id = :requestId LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.upgovt.ashadiary.data.local.entities.EditRequestEntity> observeById(@org.jetbrains.annotations.NotNull()
    java.lang.String requestId);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE beneficiary_id = :beneficiaryId ORDER BY requested_at DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE beneficiary_id = :beneficiaryId ORDER BY requested_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> observeByBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE status = :status ORDER BY requested_at DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE status = :status ORDER BY requested_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> observeByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE status = \'PENDING\' ORDER BY requested_at ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPendingRequests(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE status = \'PENDING\' ORDER BY requested_at ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> observePendingRequests();
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE requested_by_user_id = :userId ORDER BY requested_at DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByRequestedUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE requested_by_user_id = :userId ORDER BY requested_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> observeByRequestedUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Query(value = "\n        UPDATE edit_requests \n        SET status = \'APPROVED\',\n            reviewed_by_user_id = :reviewedByUserId,\n            reviewed_at = :reviewedAt,\n            review_notes_hindi = :reviewNotes,\n            updated_at = :reviewedAt\n        WHERE id = :requestId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object approveRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String requestId, @org.jetbrains.annotations.NotNull()
    java.lang.String reviewedByUserId, long reviewedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String reviewNotes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE edit_requests \n        SET status = \'REJECTED\',\n            reviewed_by_user_id = :reviewedByUserId,\n            reviewed_at = :reviewedAt,\n            review_notes_hindi = :reviewNotes,\n            updated_at = :reviewedAt\n        WHERE id = :requestId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object rejectRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String requestId, @org.jetbrains.annotations.NotNull()
    java.lang.String reviewedByUserId, long reviewedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String reviewNotes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.EditRequestEntity request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM edit_requests WHERE id = :requestId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.String requestId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM edit_requests WHERE is_synced = 0 ORDER BY requested_at ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsynced(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM edit_requests WHERE status = \'PENDING\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPendingCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM edit_requests WHERE status = \'PENDING\'")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observePendingCount();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM edit_requests WHERE is_synced = 0")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observeUnsyncedCount();
    
    /**
     * EditRequestDao - Handles edit request workflow
     * Field Staff → Supervisor → Block Nodal
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}