package com.upgovt.ashadiary.data.local.entities;

/**
 * ANC_VISIT Entity
 * Tracks Antenatal Care visits for pregnant women
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bF\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00f3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\u0006\u00a2\u0006\u0002\u0010!J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010H\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\bH\u00c6\u0003J\t\u0010M\u001a\u00020\u0017H\u00c6\u0003J\t\u0010N\u001a\u00020\u0017H\u00c6\u0003J\t\u0010O\u001a\u00020\bH\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\bH\u00c6\u0003J\t\u0010R\u001a\u00020\u001cH\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00109J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0006H\u00c6\u0003J\t\u0010V\u001a\u00020\u0006H\u00c6\u0003J\t\u0010W\u001a\u00020\u0006H\u00c6\u0003J\t\u0010X\u001a\u00020\bH\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010[\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010\\\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00a0\u0002\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010_J\t\u0010`\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010a\u001a\u00020\u001c2\b\u0010b\u001a\u0004\u0018\u00010cH\u00d6\u0003J\t\u0010d\u001a\u00020\u0006H\u00d6\u0001J\t\u0010e\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b(\u0010&R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b)\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u0019\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0015\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b4\u0010&R\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u00105R\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010#R\u0011\u0010 \u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0011\u0010\u001a\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00107R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\bD\u00101\u00a8\u0006k"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/ANCVisitEntity;", "Landroid/os/Parcelable;", "id", "", "beneficiary_id", "visit_number", "", "visit_date", "", "weight_kg", "", "blood_pressure_systolic", "blood_pressure_diastolic", "hemoglobin_gm_dl", "risk_factors_hindi", "complications_hindi", "ifa_tablets_given", "calcium_tablets_given", "other_medicines_hindi", "advice_notes_hindi", "recorded_by_user_id", "recorded_at", "gps_lat", "", "gps_lng", "created_at", "updated_at", "is_synced", "", "last_synced_at", "server_id", "last_modified_by_role_id", "sync_version", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDJJZLjava/lang/Long;Ljava/lang/String;II)V", "getAdvice_notes_hindi", "()Ljava/lang/String;", "getBeneficiary_id", "getBlood_pressure_diastolic", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBlood_pressure_systolic", "getCalcium_tablets_given", "getComplications_hindi", "getCreated_at", "()J", "getGps_lat", "()D", "getGps_lng", "getHemoglobin_gm_dl", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getId", "getIfa_tablets_given", "()Z", "getLast_modified_by_role_id", "()I", "getLast_synced_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOther_medicines_hindi", "getRecorded_at", "getRecorded_by_user_id", "getRisk_factors_hindi", "getServer_id", "getSync_version", "getUpdated_at", "getVisit_date", "getVisit_number", "getWeight_kg", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDJJZLjava/lang/Long;Ljava/lang/String;II)Lcom/upgovt/ashadiary/data/local/entities/ANCVisitEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
@androidx.room.Entity(tableName = "anc_visits", foreignKeys = {@androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity.class, parentColumns = {"id"}, childColumns = {"beneficiary_id"}, onDelete = 5), @androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.UserEntity.class, parentColumns = {"id"}, childColumns = {"recorded_by_user_id"}, onDelete = 2)}, indices = {@androidx.room.Index(value = {"beneficiary_id"}), @androidx.room.Index(value = {"visit_date"}), @androidx.room.Index(value = {"recorded_by_user_id"})})
@kotlinx.parcelize.Parcelize()
public final class ANCVisitEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String beneficiary_id = null;
    private final int visit_number = 0;
    private final long visit_date = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float weight_kg = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer blood_pressure_systolic = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer blood_pressure_diastolic = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float hemoglobin_gm_dl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String risk_factors_hindi = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String complications_hindi = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer ifa_tablets_given = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer calcium_tablets_given = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String other_medicines_hindi = null;
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
    
    public ANCVisitEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, int visit_number, long visit_date, @org.jetbrains.annotations.Nullable()
    java.lang.Float weight_kg, @org.jetbrains.annotations.Nullable()
    java.lang.Integer blood_pressure_systolic, @org.jetbrains.annotations.Nullable()
    java.lang.Integer blood_pressure_diastolic, @org.jetbrains.annotations.Nullable()
    java.lang.Float hemoglobin_gm_dl, @org.jetbrains.annotations.Nullable()
    java.lang.String risk_factors_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.String complications_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ifa_tablets_given, @org.jetbrains.annotations.Nullable()
    java.lang.Integer calcium_tablets_given, @org.jetbrains.annotations.Nullable()
    java.lang.String other_medicines_hindi, @org.jetbrains.annotations.Nullable()
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
    
    public final int getVisit_number() {
        return 0;
    }
    
    public final long getVisit_date() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getWeight_kg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBlood_pressure_systolic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBlood_pressure_diastolic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getHemoglobin_gm_dl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRisk_factors_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComplications_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIfa_tablets_given() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCalcium_tablets_given() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOther_medicines_hindi() {
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
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    public final long component16() {
        return 0L;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final long component19() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component20() {
        return 0L;
    }
    
    public final boolean component21() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    public final int component24() {
        return 0;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.ANCVisitEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, int visit_number, long visit_date, @org.jetbrains.annotations.Nullable()
    java.lang.Float weight_kg, @org.jetbrains.annotations.Nullable()
    java.lang.Integer blood_pressure_systolic, @org.jetbrains.annotations.Nullable()
    java.lang.Integer blood_pressure_diastolic, @org.jetbrains.annotations.Nullable()
    java.lang.Float hemoglobin_gm_dl, @org.jetbrains.annotations.Nullable()
    java.lang.String risk_factors_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.String complications_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ifa_tablets_given, @org.jetbrains.annotations.Nullable()
    java.lang.Integer calcium_tablets_given, @org.jetbrains.annotations.Nullable()
    java.lang.String other_medicines_hindi, @org.jetbrains.annotations.Nullable()
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