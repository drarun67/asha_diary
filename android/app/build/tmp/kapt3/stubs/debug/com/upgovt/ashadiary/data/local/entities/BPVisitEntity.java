package com.upgovt.ashadiary.data.local.entities;

/**
 * BP_VISIT Entity
 * Blood Pressure monitoring visits for beneficiaries
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\bC\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00db\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u00a2\u0006\u0002\u0010\u001eJ\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u0015H\u00c6\u0003J\t\u0010D\u001a\u00020\u0015H\u00c6\u0003J\t\u0010E\u001a\u00020\u0006H\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\t\u0010G\u001a\u00020\rH\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\bH\u00c6\u0003J\t\u0010L\u001a\u00020\bH\u00c6\u0003J\t\u0010M\u001a\u00020\u0006H\u00c6\u0003J\t\u0010N\u001a\u00020\bH\u00c6\u0003J\t\u0010O\u001a\u00020\bH\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00104J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\rH\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0082\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010UJ\t\u0010V\u001a\u00020\bH\u00d6\u0001J\u0013\u0010W\u001a\u00020\r2\b\u0010X\u001a\u0004\u0018\u00010YH\u00d6\u0003J\t\u0010Z\u001a\u00020\bH\u00d6\u0001J\t\u0010[\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010/R\u0011\u0010\u0019\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010/R\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b1\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\'R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0011\u0010\u001d\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\'R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\'\u00a8\u0006a"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/BPVisitEntity;", "Landroid/os/Parcelable;", "id", "", "beneficiary_id", "visit_date", "", "bp_systolic", "", "bp_diastolic", "pulse_rate", "bp_category", "is_referred", "", "referral_facility_hindi", "follow_up_date", "medications_prescribed_hindi", "advice_notes_hindi", "recorded_by_user_id", "recorded_at", "gps_lat", "", "gps_lng", "created_at", "updated_at", "is_synced", "last_synced_at", "server_id", "last_modified_by_role_id", "sync_version", "(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDJJZLjava/lang/Long;Ljava/lang/String;II)V", "getAdvice_notes_hindi", "()Ljava/lang/String;", "getBeneficiary_id", "getBp_category", "getBp_diastolic", "()I", "getBp_systolic", "getCreated_at", "()J", "getFollow_up_date", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGps_lat", "()D", "getGps_lng", "getId", "()Z", "getLast_modified_by_role_id", "getLast_synced_at", "getMedications_prescribed_hindi", "getPulse_rate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecorded_at", "getRecorded_by_user_id", "getReferral_facility_hindi", "getServer_id", "getSync_version", "getUpdated_at", "getVisit_date", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDJJZLjava/lang/Long;Ljava/lang/String;II)Lcom/upgovt/ashadiary/data/local/entities/BPVisitEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@androidx.room.Entity(tableName = "bp_visits", foreignKeys = {@androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity.class, parentColumns = {"id"}, childColumns = {"beneficiary_id"}, onDelete = 5), @androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.UserEntity.class, parentColumns = {"id"}, childColumns = {"recorded_by_user_id"}, onDelete = 2)}, indices = {@androidx.room.Index(value = {"beneficiary_id"}), @androidx.room.Index(value = {"visit_date"}), @androidx.room.Index(value = {"recorded_by_user_id"})})
@kotlinx.parcelize.Parcelize()
public final class BPVisitEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String beneficiary_id = null;
    private final long visit_date = 0L;
    private final int bp_systolic = 0;
    private final int bp_diastolic = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer pulse_rate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String bp_category = null;
    private final boolean is_referred = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String referral_facility_hindi = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long follow_up_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String medications_prescribed_hindi = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String advice_notes_hindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String recorded_by_user_id = null;
    private final long recorded_at = 0L;
    private final double gps_lat = 0.0;
    private final double gps_lng = 0.0;
    private final long created_at = 0L;
    private final long updated_at = 0L;
    private final boolean is_synced = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long last_synced_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String server_id = null;
    private final int last_modified_by_role_id = 0;
    private final int sync_version = 0;
    
    public BPVisitEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, long visit_date, int bp_systolic, int bp_diastolic, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pulse_rate, @org.jetbrains.annotations.NotNull()
    java.lang.String bp_category, boolean is_referred, @org.jetbrains.annotations.Nullable()
    java.lang.String referral_facility_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.Long follow_up_date, @org.jetbrains.annotations.Nullable()
    java.lang.String medications_prescribed_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.String advice_notes_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String recorded_by_user_id, long recorded_at, double gps_lat, double gps_lng, long created_at, long updated_at, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at, @org.jetbrains.annotations.Nullable()
    java.lang.String server_id, int last_modified_by_role_id, int sync_version) {
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
    
    public final long getVisit_date() {
        return 0L;
    }
    
    public final int getBp_systolic() {
        return 0;
    }
    
    public final int getBp_diastolic() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPulse_rate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBp_category() {
        return null;
    }
    
    public final boolean is_referred() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReferral_facility_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFollow_up_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMedications_prescribed_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdvice_notes_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRecorded_by_user_id() {
        return null;
    }
    
    public final long getRecorded_at() {
        return 0L;
    }
    
    public final double getGps_lat() {
        return 0.0;
    }
    
    public final double getGps_lng() {
        return 0.0;
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
    
    public final int getLast_modified_by_role_id() {
        return 0;
    }
    
    public final int getSync_version() {
        return 0;
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
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    public final long component14() {
        return 0L;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final long component17() {
        return 0L;
    }
    
    public final long component18() {
        return 0L;
    }
    
    public final boolean component19() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.BPVisitEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, long visit_date, int bp_systolic, int bp_diastolic, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pulse_rate, @org.jetbrains.annotations.NotNull()
    java.lang.String bp_category, boolean is_referred, @org.jetbrains.annotations.Nullable()
    java.lang.String referral_facility_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.Long follow_up_date, @org.jetbrains.annotations.Nullable()
    java.lang.String medications_prescribed_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.String advice_notes_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String recorded_by_user_id, long recorded_at, double gps_lat, double gps_lng, long created_at, long updated_at, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at, @org.jetbrains.annotations.Nullable()
    java.lang.String server_id, int last_modified_by_role_id, int sync_version) {
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