package com.upgovt.ashadiary.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001aH\'\u00a8\u0006\u001c"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/AuditLogDao;", "", "getByEntity", "", "Lcom/upgovt/ashadiary/data/local/entities/AuditLogEntity;", "entityType", "", "entityId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByUser", "userId", "limit", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnsynced", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "log", "(Lcom/upgovt/ashadiary/data/local/entities/AuditLogEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "logs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeRecent", "Lkotlinx/coroutines/flow/Flow;", "observeUnsyncedCount", "app_debug"})
@androidx.room.Dao()
public abstract interface AuditLogDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.AuditLogEntity log, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.AuditLogEntity> logs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM audit_logs WHERE entity_type = :entityType AND entity_id = :entityId ORDER BY action_timestamp DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String entityType, @org.jetbrains.annotations.NotNull()
    java.lang.String entityId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.AuditLogEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM audit_logs WHERE user_id = :userId ORDER BY action_timestamp DESC LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.AuditLogEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM audit_logs ORDER BY action_timestamp DESC LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecent(int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.AuditLogEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM audit_logs ORDER BY action_timestamp DESC LIMIT :limit")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.AuditLogEntity>> observeRecent(int limit);
    
    @androidx.room.Query(value = "SELECT * FROM audit_logs WHERE is_synced = 0 ORDER BY action_timestamp ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsynced(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.AuditLogEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM audit_logs WHERE is_synced = 0")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observeUnsyncedCount();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}