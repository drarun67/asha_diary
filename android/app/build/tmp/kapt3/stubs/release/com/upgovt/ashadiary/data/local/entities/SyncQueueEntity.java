package com.upgovt.ashadiary.data.local.entities;

/**
 * SYNC_QUEUE Entity
 * Manages offline sync queue with retry logic
 * WorkManager polls this queue every 2 hours
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b8\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0017J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u00103\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u00106\u001a\u00020\tH\u00c6\u0003J\t\u00107\u001a\u00020\tH\u00c6\u0003J\t\u00108\u001a\u00020\u000eH\u00c6\u0003J\t\u00109\u001a\u00020\u000eH\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\tH\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\tH\u00c6\u0003J\t\u0010B\u001a\u00020\tH\u00c6\u0003J\u00cc\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010DJ\t\u0010E\u001a\u00020\tH\u00d6\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u00d6\u0003J\t\u0010J\u001a\u00020\tH\u00d6\u0001J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0014\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\'\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b.\u0010#R\u0011\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010&\u00a8\u0006Q"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/SyncQueueEntity;", "Landroid/os/Parcelable;", "id", "", "entity_type", "entity_id", "operation", "payload_json", "priority", "", "sync_status", "retry_count", "max_retries", "last_retry_at", "", "next_retry_at", "last_error_message", "last_error_code", "user_role_id", "sync_version", "created_at", "updated_at", "synced_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;IIJJLjava/lang/Long;)V", "getCreated_at", "()J", "getEntity_id", "()Ljava/lang/String;", "getEntity_type", "getId", "getLast_error_code", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLast_error_message", "getLast_retry_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMax_retries", "()I", "getNext_retry_at", "getOperation", "getPayload_json", "getPriority", "getRetry_count", "getSync_status", "getSync_version", "getSynced_at", "getUpdated_at", "getUser_role_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;IIJJLjava/lang/Long;)Lcom/upgovt/ashadiary/data/local/entities/SyncQueueEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
@androidx.room.Entity(tableName = "sync_queue", indices = {@androidx.room.Index(value = {"entity_type"}), @androidx.room.Index(value = {"sync_status"}), @androidx.room.Index(value = {"priority"}), @androidx.room.Index(value = {"created_at"}), @androidx.room.Index(value = {"retry_count"})})
@kotlinx.parcelize.Parcelize()
public final class SyncQueueEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String entity_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String entity_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String operation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payload_json = null;
    private final int priority = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sync_status = null;
    private final int retry_count = 0;
    private final int max_retries = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long last_retry_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long next_retry_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last_error_message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer last_error_code = null;
    private final int user_role_id = 0;
    private final int sync_version = 0;
    private final long created_at = 0L;
    private final long updated_at = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long synced_at = null;
    
    public SyncQueueEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_type, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_id, @org.jetbrains.annotations.NotNull()
    java.lang.String operation, @org.jetbrains.annotations.NotNull()
    java.lang.String payload_json, int priority, @org.jetbrains.annotations.NotNull()
    java.lang.String sync_status, int retry_count, int max_retries, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_retry_at, @org.jetbrains.annotations.Nullable()
    java.lang.Long next_retry_at, @org.jetbrains.annotations.Nullable()
    java.lang.String last_error_message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer last_error_code, int user_role_id, int sync_version, long created_at, long updated_at, @org.jetbrains.annotations.Nullable()
    java.lang.Long synced_at) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntity_type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntity_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOperation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayload_json() {
        return null;
    }
    
    public final int getPriority() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSync_status() {
        return null;
    }
    
    public final int getRetry_count() {
        return 0;
    }
    
    public final int getMax_retries() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLast_retry_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getNext_retry_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast_error_message() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLast_error_code() {
        return null;
    }
    
    public final int getUser_role_id() {
        return 0;
    }
    
    public final int getSync_version() {
        return 0;
    }
    
    public final long getCreated_at() {
        return 0L;
    }
    
    public final long getUpdated_at() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getSynced_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final long component16() {
        return 0L;
    }
    
    public final long component17() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.SyncQueueEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_type, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_id, @org.jetbrains.annotations.NotNull()
    java.lang.String operation, @org.jetbrains.annotations.NotNull()
    java.lang.String payload_json, int priority, @org.jetbrains.annotations.NotNull()
    java.lang.String sync_status, int retry_count, int max_retries, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_retry_at, @org.jetbrains.annotations.Nullable()
    java.lang.Long next_retry_at, @org.jetbrains.annotations.Nullable()
    java.lang.String last_error_message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer last_error_code, int user_role_id, int sync_version, long created_at, long updated_at, @org.jetbrains.annotations.Nullable()
    java.lang.Long synced_at) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
}