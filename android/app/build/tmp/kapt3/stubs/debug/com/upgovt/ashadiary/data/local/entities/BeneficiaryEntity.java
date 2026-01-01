package com.upgovt.ashadiary.data.local.entities;

/**
 * BENEFICIARY Entity
 * Core entity for tracking pregnant women and children (25 lakh beneficiaries)
 * Beneficiary ID Format: SS-DDD-BBB-VVVV-W-NNNN
 * Example: 09-146-137-4462-A-0001
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bH\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00f1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u00a2\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\tH\u00c6\u0003J\t\u0010E\u001a\u00020\u0013H\u00c6\u0003J\t\u0010F\u001a\u00020\u0013H\u00c6\u0003J\t\u0010G\u001a\u00020\u0016H\u00c6\u0003J\t\u0010H\u001a\u00020\u0016H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\tH\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\tH\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0016H\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u000bH\u00c6\u0003J\t\u0010R\u001a\u00020\u000bH\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\tH\u00c6\u0003J\t\u0010W\u001a\u00020\u000bH\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\u009a\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010[J\t\u0010\\\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010]\u001a\u00020\u00162\b\u0010^\u001a\u0004\u0018\u00010_H\u00d6\u0003J\t\u0010`\u001a\u00020\u000bH\u00d6\u0001J\t\u0010a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#R\u0011\u0010\u0019\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010/R\u0011\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010/R\u0011\u0010\u001c\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010/R\u0011\u0010\u001f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0011\u0010 \u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0011\u0010\u001a\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010#\u00a8\u0006g"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "Landroid/os/Parcelable;", "id", "", "beneficiary_id", "name_hindi", "father_husband_name_hindi", "gender", "date_of_birth", "", "age_years", "", "beneficiary_type", "village_id", "address_hindi", "mobile_number", "registered_by_user_id", "registration_date", "registration_gps_lat", "", "registration_gps_lng", "is_active", "", "is_duplicate_flagged", "duplicate_of_beneficiary_id", "created_at", "updated_at", "last_modified_by_user_id", "is_synced", "last_synced_at", "server_id", "last_modified_by_role_id", "sync_version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDZZLjava/lang/String;JJLjava/lang/String;ZLjava/lang/Long;Ljava/lang/String;II)V", "getAddress_hindi", "()Ljava/lang/String;", "getAge_years", "()I", "getBeneficiary_id", "getBeneficiary_type", "getCreated_at", "()J", "getDate_of_birth", "getDuplicate_of_beneficiary_id", "getFather_husband_name_hindi", "getGender", "getId", "()Z", "getLast_modified_by_role_id", "getLast_modified_by_user_id", "getLast_synced_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMobile_number", "getName_hindi", "getRegistered_by_user_id", "getRegistration_date", "getRegistration_gps_lat", "()D", "getRegistration_gps_lng", "getServer_id", "getSync_version", "getUpdated_at", "getVillage_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDZZLjava/lang/String;JJLjava/lang/String;ZLjava/lang/Long;Ljava/lang/String;II)Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@androidx.room.Entity(tableName = "beneficiaries", foreignKeys = {@androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.VillageEntity.class, parentColumns = {"id"}, childColumns = {"village_id"}, onDelete = 2), @androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.UserEntity.class, parentColumns = {"id"}, childColumns = {"registered_by_user_id"}, onDelete = 2)}, indices = {@androidx.room.Index(value = {"beneficiary_id"}, unique = true), @androidx.room.Index(value = {"village_id"}), @androidx.room.Index(value = {"registered_by_user_id"}), @androidx.room.Index(value = {"name_hindi", "village_id"}), @androidx.room.Index(value = {"is_active"}), @androidx.room.Index(value = {"is_duplicate_flagged"})})
@kotlinx.parcelize.Parcelize()
public final class BeneficiaryEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String beneficiary_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name_hindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String father_husband_name_hindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gender = null;
    private final long date_of_birth = 0L;
    private final int age_years = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String beneficiary_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String village_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address_hindi = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mobile_number = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String registered_by_user_id = null;
    private final long registration_date = 0L;
    private final double registration_gps_lat = 0.0;
    private final double registration_gps_lng = 0.0;
    private final boolean is_active = false;
    private final boolean is_duplicate_flagged = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String duplicate_of_beneficiary_id = null;
    private final long created_at = 0L;
    private final long updated_at = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String last_modified_by_user_id = null;
    private final boolean is_synced = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long last_synced_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String server_id = null;
    private final int last_modified_by_role_id = 0;
    private final int sync_version = 0;
    
    public BeneficiaryEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, @org.jetbrains.annotations.NotNull()
    java.lang.String name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String father_husband_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, long date_of_birth, int age_years, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_type, @org.jetbrains.annotations.NotNull()
    java.lang.String village_id, @org.jetbrains.annotations.NotNull()
    java.lang.String address_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    java.lang.String registered_by_user_id, long registration_date, double registration_gps_lat, double registration_gps_lng, boolean is_active, boolean is_duplicate_flagged, @org.jetbrains.annotations.Nullable()
    java.lang.String duplicate_of_beneficiary_id, long created_at, long updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String last_modified_by_user_id, boolean is_synced, @org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFather_husband_name_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final long getDate_of_birth() {
        return 0L;
    }
    
    public final int getAge_years() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBeneficiary_type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVillage_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobile_number() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegistered_by_user_id() {
        return null;
    }
    
    public final long getRegistration_date() {
        return 0L;
    }
    
    public final double getRegistration_gps_lat() {
        return 0.0;
    }
    
    public final double getRegistration_gps_lng() {
        return 0.0;
    }
    
    public final boolean is_active() {
        return false;
    }
    
    public final boolean is_duplicate_flagged() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDuplicate_of_beneficiary_id() {
        return null;
    }
    
    public final long getCreated_at() {
        return 0L;
    }
    
    public final long getUpdated_at() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLast_modified_by_user_id() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
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
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean component17() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final boolean component22() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final int component26() {
        return 0;
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
    
    public final long component6() {
        return 0L;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, @org.jetbrains.annotations.NotNull()
    java.lang.String name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String father_husband_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, long date_of_birth, int age_years, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_type, @org.jetbrains.annotations.NotNull()
    java.lang.String village_id, @org.jetbrains.annotations.NotNull()
    java.lang.String address_hindi, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    java.lang.String registered_by_user_id, long registration_date, double registration_gps_lat, double registration_gps_lng, boolean is_active, boolean is_duplicate_flagged, @org.jetbrains.annotations.Nullable()
    java.lang.String duplicate_of_beneficiary_id, long created_at, long updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String last_modified_by_user_id, boolean is_synced, @org.jetbrains.annotations.Nullable()
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