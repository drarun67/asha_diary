package com.upgovt.ashadiary.domain.usecases;

/**
 * Beneficiary registration request
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0012H\u00c6\u0003J\t\u0010<\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u001aH\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0007H\u00c6\u0003J\t\u0010E\u001a\u00020\tH\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d6\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u00c6\u0001\u00a2\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u001a2\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010N\u001a\u00020\tH\u00d6\u0001J\t\u0010O\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001d\u00a8\u0006P"}, d2 = {"Lcom/upgovt/ashadiary/domain/usecases/BeneficiaryRegistrationRequest;", "", "nameHindi", "", "fatherHusbandNameHindi", "gender", "dateOfBirth", "", "ageYears", "", "beneficiaryType", "villageId", "addressHindi", "mobileNumber", "registeredByUserId", "registeredByRoleId", "workerCode", "gpsLat", "", "gpsLng", "biometricTemplate", "", "biometricQuality", "fingerPosition", "deviceSerial", "confirmDuplicateOverride", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DD[BLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "getAddressHindi", "()Ljava/lang/String;", "getAgeYears", "()I", "getBeneficiaryType", "getBiometricQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBiometricTemplate", "()[B", "getConfirmDuplicateOverride", "()Z", "getDateOfBirth", "()J", "getDeviceSerial", "getFatherHusbandNameHindi", "getFingerPosition", "getGender", "getGpsLat", "()D", "getGpsLng", "getMobileNumber", "getNameHindi", "getRegisteredByRoleId", "getRegisteredByUserId", "getVillageId", "getWorkerCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DD[BLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)Lcom/upgovt/ashadiary/domain/usecases/BeneficiaryRegistrationRequest;", "equals", "other", "hashCode", "toString", "app_release"})
public final class BeneficiaryRegistrationRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameHindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fatherHusbandNameHindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gender = null;
    private final long dateOfBirth = 0L;
    private final int ageYears = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String beneficiaryType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String villageId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String addressHindi = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mobileNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String registeredByUserId = null;
    private final int registeredByRoleId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String workerCode = null;
    private final double gpsLat = 0.0;
    private final double gpsLng = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final byte[] biometricTemplate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer biometricQuality = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fingerPosition = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deviceSerial = null;
    private final boolean confirmDuplicateOverride = false;
    
    public BeneficiaryRegistrationRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String nameHindi, @org.jetbrains.annotations.NotNull()
    java.lang.String fatherHusbandNameHindi, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, long dateOfBirth, int ageYears, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryType, @org.jetbrains.annotations.NotNull()
    java.lang.String villageId, @org.jetbrains.annotations.NotNull()
    java.lang.String addressHindi, @org.jetbrains.annotations.Nullable()
    java.lang.String mobileNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String registeredByUserId, int registeredByRoleId, @org.jetbrains.annotations.NotNull()
    java.lang.String workerCode, double gpsLat, double gpsLng, @org.jetbrains.annotations.Nullable()
    byte[] biometricTemplate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer biometricQuality, @org.jetbrains.annotations.Nullable()
    java.lang.String fingerPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceSerial, boolean confirmDuplicateOverride) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameHindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFatherHusbandNameHindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final long getDateOfBirth() {
        return 0L;
    }
    
    public final int getAgeYears() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBeneficiaryType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVillageId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressHindi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobileNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegisteredByUserId() {
        return null;
    }
    
    public final int getRegisteredByRoleId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWorkerCode() {
        return null;
    }
    
    public final double getGpsLat() {
        return 0.0;
    }
    
    public final double getGpsLng() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getBiometricTemplate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBiometricQuality() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFingerPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceSerial() {
        return null;
    }
    
    public final boolean getConfirmDuplicateOverride() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final int component5() {
        return 0;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.domain.usecases.BeneficiaryRegistrationRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String nameHindi, @org.jetbrains.annotations.NotNull()
    java.lang.String fatherHusbandNameHindi, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, long dateOfBirth, int ageYears, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryType, @org.jetbrains.annotations.NotNull()
    java.lang.String villageId, @org.jetbrains.annotations.NotNull()
    java.lang.String addressHindi, @org.jetbrains.annotations.Nullable()
    java.lang.String mobileNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String registeredByUserId, int registeredByRoleId, @org.jetbrains.annotations.NotNull()
    java.lang.String workerCode, double gpsLat, double gpsLng, @org.jetbrains.annotations.Nullable()
    byte[] biometricTemplate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer biometricQuality, @org.jetbrains.annotations.Nullable()
    java.lang.String fingerPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceSerial, boolean confirmDuplicateOverride) {
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}