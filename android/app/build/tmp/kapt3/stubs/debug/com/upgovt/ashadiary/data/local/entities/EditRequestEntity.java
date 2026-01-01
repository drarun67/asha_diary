package com.upgovt.ashadiary.data.local.entities;

/**
 * EDIT_REQUEST Entity
 * Field staff submit edit requests for beneficiary critical fields (name/age/gender)
 * Workflow: Field Staff → Supervisor → Block Nodal (final authority)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00b9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u000eH\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\fH\u00c6\u0003J\t\u00109\u001a\u00020\fH\u00c6\u0003J\t\u0010:\u001a\u00020\u0016H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\fH\u00c6\u0003J\u00d6\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010FJ\t\u0010G\u001a\u00020HH\u00d6\u0001J\u0013\u0010I\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010KH\u00d6\u0003J\t\u0010L\u001a\u00020HH\u00d6\u0001J\t\u0010M\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020HH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010!R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b-\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001d\u00a8\u0006S"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/EditRequestEntity;", "Landroid/os/Parcelable;", "id", "", "beneficiary_id", "field_name", "current_value", "requested_value", "reason_hindi", "status", "requested_by_user_id", "requested_at", "", "request_gps_lat", "", "request_gps_lng", "reviewed_by_user_id", "reviewed_at", "review_notes_hindi", "created_at", "updated_at", "is_synced", "", "last_synced_at", "server_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;JJZLjava/lang/Long;Ljava/lang/String;)V", "getBeneficiary_id", "()Ljava/lang/String;", "getCreated_at", "()J", "getCurrent_value", "getField_name", "getId", "()Z", "getLast_synced_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReason_hindi", "getRequest_gps_lat", "()D", "getRequest_gps_lng", "getRequested_at", "getRequested_by_user_id", "getRequested_value", "getReview_notes_hindi", "getReviewed_at", "getReviewed_by_user_id", "getServer_id", "getStatus", "getUpdated_at", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;JJZLjava/lang/Long;Ljava/lang/String;)Lcom/upgovt/ashadiary/data/local/entities/EditRequestEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@androidx.room.Entity(tableName = "edit_requests", foreignKeys = {@androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity.class, parentColumns = {"id"}, childColumns = {"beneficiary_id"}, onDelete = 5), @androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.UserEntity.class, parentColumns = {"id"}, childColumns = {"requested_by_user_id"}, onDelete = 2), @androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.UserEntity.class, parentColumns = {"id"}, childColumns = {"reviewed_by_user_id"}, onDelete = 2)}, indices = {@androidx.room.Index(value = {"beneficiary_id"}), @androidx.room.Index(value = {"requested_by_user_id"}), @androidx.room.Index(value = {"status"}), @androidx.room.Index(value = {"requested_at"})})
@kotlinx.parcelize.Parcelize()
public final class EditRequestEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String beneficiary_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String field_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String current_value = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String requested_value = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reason_hindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String requested_by_user_id = null;
    private final long requested_at = 0L;
    private final double request_gps_lat = 0.0;
    private final double request_gps_lng = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String reviewed_by_user_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long reviewed_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String review_notes_hindi = null;
    private final long created_at = 0L;
    private final long updated_at = 0L;
    private final boolean is_synced = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long last_synced_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String server_id = null;
    
    public EditRequestEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, @org.jetbrains.annotations.NotNull()
    java.lang.String field_name, @org.jetbrains.annotations.NotNull()
    java.lang.String current_value, @org.jetbrains.annotations.NotNull()
    java.lang.String requested_value, @org.jetbrains.annotations.NotNull()
    java.lang.String reason_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String requested_by_user_id, long requested_at, double request_gps_lat, double request_gps_lng, @org.jetbrains.annotations.Nullable()
    java.lang.String reviewed_by_user_id, @org.jetbrains.annotations.Nullable()
    java.lang.Long reviewed_at, @org.jetbrains.annotations.Nullable()
    java.lang.String review_notes_hindi, long created_at, long updated_at, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at, @org.jetbrains.annotations.Nullable()
    java.lang.String server_id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBeneficiary_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getField_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrent_value() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequested_value() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReason_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequested_by_user_id() {
        return null;
    }
    
    public final long getRequested_at() {
        return 0L;
    }
    
    public final double getRequest_gps_lat() {
        return 0.0;
    }
    
    public final double getRequest_gps_lng() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReviewed_by_user_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getReviewed_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReview_notes_hindi() {
        return null;
    }
    
    public final long getCreated_at() {
        return 0L;
    }
    
    public final long getUpdated_at() {
        return 0L;
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
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    public final long component15() {
        return 0L;
    }
    
    public final long component16() {
        return 0L;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.EditRequestEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, @org.jetbrains.annotations.NotNull()
    java.lang.String field_name, @org.jetbrains.annotations.NotNull()
    java.lang.String current_value, @org.jetbrains.annotations.NotNull()
    java.lang.String requested_value, @org.jetbrains.annotations.NotNull()
    java.lang.String reason_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String requested_by_user_id, long requested_at, double request_gps_lat, double request_gps_lng, @org.jetbrains.annotations.Nullable()
    java.lang.String reviewed_by_user_id, @org.jetbrains.annotations.Nullable()
    java.lang.Long reviewed_at, @org.jetbrains.annotations.Nullable()
    java.lang.String review_notes_hindi, long created_at, long updated_at, boolean is_synced, @org.jetbrains.annotations.Nullable()
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