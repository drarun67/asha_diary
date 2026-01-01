package com.upgovt.ashadiary.utils.biometric;

/**
 * MantraRDServiceHelper - Helper class for Mantra MFS100 biometric device integration
 *
 * Handles:
 * - Device availability check
 * - Fingerprint capture via Intent
 * - PID data parsing
 * - ISO template extraction
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/upgovt/ashadiary/utils/biometric/MantraRDServiceHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "captureFingerprint", "", "activity", "Landroid/app/Activity;", "requestCode", "", "getDeviceInfo", "handleActivityResult", "Lcom/upgovt/ashadiary/utils/biometric/BiometricCaptureResult;", "resultCode", "data", "Landroid/content/Intent;", "isMantraServiceInstalled", "", "parsePIDData", "pidDataXml", "", "Companion", "app_release"})
public final class MantraRDServiceHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MantraRDService";
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.utils.biometric.MantraRDServiceHelper.Companion Companion = null;
    
    public MantraRDServiceHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * Check if Mantra RD Service is installed
     */
    public final boolean isMantraServiceInstalled() {
        return false;
    }
    
    /**
     * Launch Mantra RD Service to capture fingerprint
     *
     * @param activity Activity to launch intent from
     * @param requestCode Request code for result callback
     */
    public final void captureFingerprint(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode) {
    }
    
    /**
     * Get device information
     */
    public final void getDeviceInfo(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode) {
    }
    
    /**
     * Parse PID data from Mantra RD Service response
     * Extracts ISO template, quality score, and device info
     */
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.utils.biometric.BiometricCaptureResult parsePIDData(@org.jetbrains.annotations.NotNull()
    java.lang.String pidDataXml) {
        return null;
    }
    
    /**
     * Handle activity result from Mantra RD Service
     * Call this from Activity.onActivityResult()
     */
    @org.jetbrains.annotations.Nullable()
    public final com.upgovt.ashadiary.utils.biometric.BiometricCaptureResult handleActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/upgovt/ashadiary/utils/biometric/MantraRDServiceHelper$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}