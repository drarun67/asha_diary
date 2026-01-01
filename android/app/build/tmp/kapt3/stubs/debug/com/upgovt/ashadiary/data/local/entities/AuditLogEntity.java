package com.upgovt.ashadiary.data.local.entities;

/**
 * AUDIT_LOG Entity
 * Government audit trail - tracks ALL data modifications
 * GPS stamped, immutable, exportable to PDF
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00b5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u000fH\u00c6\u0003J\t\u00109\u001a\u00020\u0011H\u00c6\u0003J\t\u0010:\u001a\u00020\u0011H\u00c6\u0003J\t\u0010;\u001a\u00020\u0014H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0018H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d6\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010JJ\t\u0010K\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010L\u001a\u00020\u00182\b\u0010M\u001a\u0004\u0018\u00010NH\u00d6\u0003J\t\u0010O\u001a\u00020\u0006H\u00d6\u0001J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010,R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105\u00a8\u0006V"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/AuditLogEntity;", "Landroid/os/Parcelable;", "id", "", "user_id", "user_role_id", "", "action_type", "entity_type", "entity_id", "field_name", "old_value", "new_value", "action_description_hindi", "action_timestamp", "", "gps_lat", "", "gps_lng", "gps_accuracy_meters", "", "device_id", "app_version", "is_synced", "", "last_synced_at", "server_id", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDFLjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;)V", "getAction_description_hindi", "()Ljava/lang/String;", "getAction_timestamp", "()J", "getAction_type", "getApp_version", "getDevice_id", "getEntity_id", "getEntity_type", "getField_name", "getGps_accuracy_meters", "()F", "getGps_lat", "()D", "getGps_lng", "getId", "()Z", "getLast_synced_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNew_value", "getOld_value", "getServer_id", "getUser_id", "getUser_role_id", "()I", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDFLjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;)Lcom/upgovt/ashadiary/data/local/entities/AuditLogEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@androidx.room.Entity(tableName = "audit_logs", foreignKeys = {@androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.UserEntity.class, parentColumns = {"id"}, childColumns = {"user_id"}, onDelete = 2)}, indices = {@androidx.room.Index(value = {"user_id"}), @androidx.room.Index(value = {"action_timestamp"}), @androidx.room.Index(value = {"entity_type"}), @androidx.room.Index(value = {"entity_id"}), @androidx.room.Index(value = {"action_type"})})
@kotlinx.parcelize.Parcelize()
public final class AuditLogEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String user_id = null;
    private final int user_role_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String action_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String entity_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String entity_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String field_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String old_value = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String new_value = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String action_description_hindi = null;
    private final long action_timestamp = 0L;
    private final double gps_lat = 0.0;
    private final double gps_lng = 0.0;
    private final float gps_accuracy_meters = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String device_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String app_version = null;
    private final boolean is_synced = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long last_synced_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String server_id = null;
    
    public AuditLogEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String user_id, int user_role_id, @org.jetbrains.annotations.NotNull()
    java.lang.String action_type, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_type, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_id, @org.jetbrains.annotations.Nullable()
    java.lang.String field_name, @org.jetbrains.annotations.Nullable()
    java.lang.String old_value, @org.jetbrains.annotations.Nullable()
    java.lang.String new_value, @org.jetbrains.annotations.NotNull()
    java.lang.String action_description_hindi, long action_timestamp, double gps_lat, double gps_lng, float gps_accuracy_meters, @org.jetbrains.annotations.NotNull()
    java.lang.String device_id, @org.jetbrains.annotations.NotNull()
    java.lang.String app_version, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at, @org.jetbrains.annotations.Nullable()
    java.lang.String server_id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser_id() {
        return null;
    }
    
    public final int getUser_role_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAction_type() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getField_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOld_value() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNew_value() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAction_description_hindi() {
        return null;
    }
    
    public final long getAction_timestamp() {
        return 0L;
    }
    
    public final double getGps_lat() {
        return 0.0;
    }
    
    public final double getGps_lng() {
        return 0.0;
    }
    
    public final float getGps_accuracy_meters() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDevice_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApp_version() {
        return null;
    }
    
    public final boolean is_synced() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLast_synced_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getServer_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final float component14() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    public final boolean component17() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.AuditLogEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String user_id, int user_role_id, @org.jetbrains.annotations.NotNull()
    java.lang.String action_type, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_type, @org.jetbrains.annotations.NotNull()
    java.lang.String entity_id, @org.jetbrains.annotations.Nullable()
    java.lang.String field_name, @org.jetbrains.annotations.Nullable()
    java.lang.String old_value, @org.jetbrains.annotations.Nullable()
    java.lang.String new_value, @org.jetbrains.annotations.NotNull()
    java.lang.String action_description_hindi, long action_timestamp, double gps_lat, double gps_lng, float gps_accuracy_meters, @org.jetbrains.annotations.NotNull()
    java.lang.String device_id, @org.jetbrains.annotations.NotNull()
    java.lang.String app_version, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at, @org.jetbrains.annotations.Nullable()
    java.lang.String server_id) {
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