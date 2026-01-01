package com.upgovt.ashadiary.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0015H\'JN\u0010\u0018\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/DuplicateFlagDao;", "", "getByBeneficiary", "", "Lcom/upgovt/ashadiary/data/local/entities/DuplicateFlagEntity;", "beneficiaryId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getById", "flagId", "getPendingFlags", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnsynced", "insert", "", "flag", "(Lcom/upgovt/ashadiary/data/local/entities/DuplicateFlagEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "flags", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observePendingCount", "Lkotlinx/coroutines/flow/Flow;", "", "observePendingFlags", "resolveFlag", "status", "action", "notes", "resolvedByUserId", "resolvedAt", "masterBeneficiaryId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_release"})
@androidx.room.Dao()
public abstract interface DuplicateFlagDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity flag, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity> flags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM duplicate_flags WHERE id = :flagId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(@org.jetbrains.annotations.NotNull()
    java.lang.String flagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM duplicate_flags WHERE status = \'PENDING\' ORDER BY similarity_score DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPendingFlags(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM duplicate_flags WHERE status = \'PENDING\' ORDER BY similarity_score DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity>> observePendingFlags();
    
    @androidx.room.Query(value = "\n        SELECT * FROM duplicate_flags \n        WHERE (beneficiary_id_1 = :beneficiaryId OR beneficiary_id_2 = :beneficiaryId)\n        ORDER BY flagged_at DESC\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity>> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE duplicate_flags \n        SET status = :status,\n            resolution_action = :action,\n            resolution_notes_hindi = :notes,\n            resolved_by_user_id = :resolvedByUserId,\n            resolved_at = :resolvedAt,\n            master_beneficiary_id = :masterBeneficiaryId,\n            updated_at = :resolvedAt\n        WHERE id = :flagId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resolveFlag(@org.jetbrains.annotations.NotNull()
    java.lang.String flagId, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    java.lang.String resolvedByUserId, long resolvedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String masterBeneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity flag, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM duplicate_flags WHERE is_synced = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsynced(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM duplicate_flags WHERE status = \'PENDING\'")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observePendingCount();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}