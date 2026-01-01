package com.upgovt.ashadiary.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0019J<\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010 J \u0010!\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010#J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030%H\'J\u0016\u0010&\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/SyncQueueDao;", "", "deleteOldSuccessful", "", "olderThan", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByEntity", "Lcom/upgovt/ashadiary/data/local/entities/SyncQueueEntity;", "entityType", "", "entityId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPendingCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPendingItems", "", "limit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetryableItems", "insert", "item", "(Lcom/upgovt/ashadiary/data/local/entities/SyncQueueEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "items", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsFailed", "queueId", "errorMessage", "errorCode", "attemptedAt", "nextRetryAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsSuccess", "syncedAt", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observePendingCount", "Lkotlinx/coroutines/flow/Flow;", "update", "app_release"})
@androidx.room.Dao()
public abstract interface SyncQueueDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.SyncQueueEntity item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.SyncQueueEntity> items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM sync_queue WHERE sync_status = \'PENDING\' ORDER BY priority DESC, created_at ASC LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPendingItems(int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.SyncQueueEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM sync_queue WHERE sync_status = \'FAILED\' AND retry_count < max_retries ORDER BY next_retry_at ASC LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRetryableItems(int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.SyncQueueEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM sync_queue WHERE entity_type = :entityType AND entity_id = :entityId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String entityType, @org.jetbrains.annotations.NotNull()
    java.lang.String entityId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.SyncQueueEntity> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE sync_queue \n        SET sync_status = \'SUCCESS\',\n            synced_at = :syncedAt,\n            updated_at = :syncedAt\n        WHERE id = :queueId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markAsSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String queueId, long syncedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE sync_queue \n        SET sync_status = \'FAILED\',\n            retry_count = retry_count + 1,\n            last_retry_at = :attemptedAt,\n            next_retry_at = :nextRetryAt,\n            last_error_message = :errorMessage,\n            last_error_code = :errorCode,\n            updated_at = :attemptedAt\n        WHERE id = :queueId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markAsFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String queueId, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer errorCode, long attemptedAt, long nextRetryAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.SyncQueueEntity item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM sync_queue WHERE sync_status = \'SUCCESS\' AND synced_at < :olderThan")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteOldSuccessful(long olderThan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM sync_queue WHERE sync_status = \'PENDING\' OR sync_status = \'FAILED\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPendingCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM sync_queue WHERE sync_status = \'PENDING\' OR sync_status = \'FAILED\'")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observePendingCount();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}