package com.upgovt.ashadiary.utils.biometric;

/**
 * MantraRDServiceConstants - Constants for Mantra MFS100 RD Service integration
 *
 * Mantra RD Service is used by government of India for biometric authentication
 * across Aadhaar, NPCI, and other public services
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/upgovt/ashadiary/utils/biometric/MantraRDServiceConstants;", "", "()V", "ACTION_CAPTURE", "", "ACTION_DEVICE_INFO", "CAPTURE_TIMEOUT_MS", "", "EXTRA_BIOMETRIC_DATA", "EXTRA_PID_OPTIONS", "MANTRA_PACKAGE", "MIN_QUALITY_SCORE", "RECOMMENDED_QUALITY_SCORE", "REQUEST_CODE_CAPTURE_FINGERPRINT", "REQUEST_CODE_DEVICE_INFO", "getPIDOptionsXml", "timeout", "FingerPosition", "app_release"})
public final class MantraRDServiceConstants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CAPTURE = "in.gov.uidai.rdservice.fp.CAPTURE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DEVICE_INFO = "in.gov.uidai.rdservice.fp.INFO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MANTRA_PACKAGE = "com.mantra.rdservice";
    public static final int REQUEST_CODE_CAPTURE_FINGERPRINT = 1001;
    public static final int REQUEST_CODE_DEVICE_INFO = 1002;
    public static final int MIN_QUALITY_SCORE = 60;
    public static final int RECOMMENDED_QUALITY_SCORE = 70;
    public static final int CAPTURE_TIMEOUT_MS = 10000;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PID_OPTIONS = "PID_OPTIONS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_BIOMETRIC_DATA = "BIOMETRIC_DATA";
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.utils.biometric.MantraRDServiceConstants INSTANCE = null;
    
    private MantraRDServiceConstants() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPIDOptionsXml(int timeout) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/upgovt/ashadiary/utils/biometric/MantraRDServiceConstants$FingerPosition;", "", "()V", "LEFT_INDEX", "", "LEFT_LITTLE", "LEFT_MIDDLE", "LEFT_RING", "LEFT_THUMB", "RIGHT_INDEX", "RIGHT_LITTLE", "RIGHT_MIDDLE", "RIGHT_RING", "RIGHT_THUMB", "getAllPositions", "", "app_release"})
    public static final class FingerPosition {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RIGHT_THUMB = "RIGHT_THUMB";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RIGHT_INDEX = "RIGHT_INDEX";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RIGHT_MIDDLE = "RIGHT_MIDDLE";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RIGHT_RING = "RIGHT_RING";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RIGHT_LITTLE = "RIGHT_LITTLE";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LEFT_THUMB = "LEFT_THUMB";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LEFT_INDEX = "LEFT_INDEX";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LEFT_MIDDLE = "LEFT_MIDDLE";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LEFT_RING = "LEFT_RING";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LEFT_LITTLE = "LEFT_LITTLE";
        @org.jetbrains.annotations.NotNull()
        public static final com.upgovt.ashadiary.utils.biometric.MantraRDServiceConstants.FingerPosition INSTANCE = null;
        
        private FingerPosition() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAllPositions() {
            return null;
        }
    }
}