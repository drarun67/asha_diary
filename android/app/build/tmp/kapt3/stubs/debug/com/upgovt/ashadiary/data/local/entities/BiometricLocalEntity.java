package com.upgovt.ashadiary.data.local.entities;

/**
 * BIOMETRIC_LOCAL Entity
 * CRITICAL: Stores fingerprint templates LOCALLY ONLY
 * NEVER synced to server
 * Encrypted at rest using SQLCipher
 * Used for duplicate beneficiary detection via ISO template matching
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\tH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u000fH\u00c6\u0003Jt\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010-J\t\u0010.\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u00020\u0007H\u0016J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00069"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/BiometricLocalEntity;", "Landroid/os/Parcelable;", "id", "", "beneficiary_id", "finger_position", "quality_score", "", "iso_template", "", "captured_by_user_id", "captured_at", "", "device_serial_number", "is_synced", "", "last_synced_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[BLjava/lang/String;JLjava/lang/String;ZLjava/lang/Long;)V", "getBeneficiary_id", "()Ljava/lang/String;", "getCaptured_at", "()J", "getCaptured_by_user_id", "getDevice_serial_number", "getFinger_position", "getId", "()Z", "getIso_template", "()[B", "getLast_synced_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQuality_score", "()I", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[BLjava/lang/String;JLjava/lang/String;ZLjava/lang/Long;)Lcom/upgovt/ashadiary/data/local/entities/BiometricLocalEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@androidx.room.Entity(tableName = "biometrics_local", foreignKeys = {@androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity.class, parentColumns = {"id"}, childColumns = {"beneficiary_id"}, onDelete = 5), @androidx.room.ForeignKey(entity = com.upgovt.ashadiary.data.local.entities.UserEntity.class, parentColumns = {"id"}, childColumns = {"captured_by_user_id"}, onDelete = 2)}, indices = {@androidx.room.Index(value = {"beneficiary_id"}), @androidx.room.Index(value = {"finger_position"}), @androidx.room.Index(value = {"captured_at"})})
@kotlinx.parcelize.Parcelize()
public final class BiometricLocalEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String beneficiary_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String finger_position = null;
    private final int quality_score = 0;
    @org.jetbrains.annotations.NotNull()
    private final byte[] iso_template = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String captured_by_user_id = null;
    private final long captured_at = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String device_serial_number = null;
    private final boolean is_synced = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long last_synced_at = null;
    
    public BiometricLocalEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, @org.jetbrains.annotations.NotNull()
    java.lang.String finger_position, int quality_score, @org.jetbrains.annotations.NotNull()
    byte[] iso_template, @org.jetbrains.annotations.NotNull()
    java.lang.String captured_by_user_id, long captured_at, @org.jetbrains.annotations.NotNull()
    java.lang.String device_serial_number, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at) {
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
    public final java.lang.String getFinger_position() {
        return null;
    }
    
    public final int getQuality_score() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getIso_template() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCaptured_by_user_id() {
        return null;
    }
    
    public final long getCaptured_at() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDevice_serial_number() {
        return null;
    }
    
    public final boolean is_synced() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLast_synced_at() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component10() {
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
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.BiometricLocalEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiary_id, @org.jetbrains.annotations.NotNull()
    java.lang.String finger_position, int quality_score, @org.jetbrains.annotations.NotNull()
    byte[] iso_template, @org.jetbrains.annotations.NotNull()
    java.lang.String captured_by_user_id, long captured_at, @org.jetbrains.annotations.NotNull()
    java.lang.String device_serial_number, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
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