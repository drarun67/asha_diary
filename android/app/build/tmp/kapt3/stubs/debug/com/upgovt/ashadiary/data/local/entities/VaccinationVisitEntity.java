package com.upgovt.ashadiary.data.local.entities;

/**
 * VACCINATION_VISIT Entity
 * Child immunization tracking
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b@\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00d1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u00a2\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0014H\u00c6\u0003J\t\u0010@\u001a\u00020\u0014H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u000eH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\nH\u00c6\u0003J\t\u0010H\u001a\u00020\nH\u00c6\u0003J\t\u0010I\u001a\u00020\u0006H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\nH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\t\u0010O\u001a\u00020\u000eH\u00c6\u0003J\u00f6\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\t\u0010R\u001a\u00020\nH\u00d6\u0001J\u0013\u0010S\u001a\u00020\u000e2\b\u0010T\u001a\u0004\u0018\u00010UH\u00d6\u0003J\t\u0010V\u001a\u00020\nH\u00d6\u0001J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010)R\u0011\u0010\u001b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b/\u0010-R\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u001c\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b6\u0010-R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\"\u00a8\u0006]"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/VaccinationVisitEntity;", "Landroid/os/Parcelable;", "id", "", "beneficiary_id", "visit_date", "", "vaccine_type", "vaccine_name_hindi", "dose_number", "", "vaccine_batch_number", "vaccine_expiry_date", "has_adverse_reaction", "", "adverse_reaction_notes_hindi", "next_dose_due_date", "recorded_by_user_id", "recorded_at", "gps_lat", "", "gps_lng", "created_at", "updated_at", "is_synced", "last_synced_at", "server_id", "last_modified_by_role_id", "sync_version", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;JDDJJZLjava/lang/Long;Ljava/lang/String;II)V", "getAdverse_reaction_notes_hindi", "()Ljava/lang/String;", "getBeneficiary_id", "getCreated_at", "()J", "getDose_number", "()I", "getGps_lat", "()D", "getGps_lng", "getHas_adverse_reaction", "()Z", "getId", "getLast_modified_by_role_id", "getLast_synced_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNext_dose_due_date", "getRecorded_at", "getRecorded_by_user_id", "getServer_id", "getSync_version", "getUpdated_at", "getVaccine_batch_number", "getVaccine_expiry_date", "getVaccine_name_hindi", "getVaccine_type", "getVisit_date", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;JDDJJZLjava/lang/Long;Ljava/lang/String;II)Lcom/upgovt/ashadiary/data/local/entities/VaccinationVisitEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@androidx.room.Entity(tableName = "vaccination_visits", foreignKeys = {@androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity.class, parentColumns = {"id"}, childColumns = {"beneficiary_id"}, onDelete = 5), @androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.UserEntity.class, parentColumns = {"id"}, childColumns = {"recorded_by_user_id"}, onDelete = 2)}, indices = {@androidx.room.Index(value = {"beneficiary_id"}), @androidx.room.Index(value = {"visit_date"}), @androidx.room.Index(value = {"recorded_by_user_id"}), @androidx.room.Index(value = {"vaccine_type"})})
@kotlinx.parcelize.Parcelize()
public final class VaccinationVisitEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String beneficiary_id = null;
    private final long visit_date = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String vaccine_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String vaccine_name_hindi = null;
    private final int dose_number = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String vaccine_batch_number = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long vaccine_expiry_date = null;
    private final boolean has_adverse_reaction = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adverse_reaction_notes_hindi = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long next_dose_due_date = null;
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
    
    public VaccinationVisitEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, long visit_date, @org.jetbrains.annotations.NotNull()
    java.lang.String vaccine_type, @org.jetbrains.annotations.NotNull()
    java.lang.String vaccine_name_hindi, int dose_number, @org.jetbrains.annotations.Nullable()
    java.lang.String vaccine_batch_number, @org.jetbrains.annotations.Nullable()
    java.lang.Long vaccine_expiry_date, boolean has_adverse_reaction, @org.jetbrains.annotations.Nullable()
    java.lang.String adverse_reaction_notes_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.Long next_dose_due_date, @org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVaccine_type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVaccine_name_hindi() {
        return null;
    }
    
    public final int getDose_number() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVaccine_batch_number() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getVaccine_expiry_date() {
        return null;
    }
    
    public final boolean getHas_adverse_reaction() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdverse_reaction_notes_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getNext_dose_due_date() {
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
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final long component13() {
        return 0L;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final long component16() {
        return 0L;
    }
    
    public final long component17() {
        return 0L;
    }
    
    public final boolean component18() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final long component3() {
        return 0L;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, long visit_date, @org.jetbrains.annotations.NotNull()
    java.lang.String vaccine_type, @org.jetbrains.annotations.NotNull()
    java.lang.String vaccine_name_hindi, int dose_number, @org.jetbrains.annotations.Nullable()
    java.lang.String vaccine_batch_number, @org.jetbrains.annotations.Nullable()
    java.lang.Long vaccine_expiry_date, boolean has_adverse_reaction, @org.jetbrains.annotations.Nullable()
    java.lang.String adverse_reaction_notes_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.Long next_dose_due_date, @org.jetbrains.annotations.NotNull()
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