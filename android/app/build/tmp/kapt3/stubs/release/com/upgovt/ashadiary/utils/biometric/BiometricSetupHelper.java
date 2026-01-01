package com.upgovt.ashadiary.utils.biometric;

/**
 * BiometricSetupHelper - Helps with Mantra RD Service installation
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/upgovt/ashadiary/utils/biometric/BiometricSetupHelper;", "", "()V", "MANTRA_DOWNLOAD_URL", "", "MANTRA_RD_SERVICE_APK", "checkForUpdates", "Lcom/upgovt/ashadiary/utils/biometric/BiometricUpdateInfo;", "context", "Landroid/content/Context;", "getInstallationInstructions", "", "getTroubleshootingTips", "openDownloadPage", "", "app_release"})
public final class BiometricSetupHelper {
    
    /**
     * Download URLs for Mantra RD Service
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MANTRA_DOWNLOAD_URL = "https://www.mantratec.com/downloads";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MANTRA_RD_SERVICE_APK = "MantraRDService.apk";
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.utils.biometric.BiometricSetupHelper INSTANCE = null;
    
    private BiometricSetupHelper() {
        super();
    }
    
    /**
     * Check if Mantra RD Service needs update
     * Based on version comparison
     */
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.utils.biometric.BiometricUpdateInfo checkForUpdates(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Open Mantra download page in browser
     */
    public final void openDownloadPage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Get installation instructions in Hindi
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getInstallationInstructions() {
        return null;
    }
    
    /**
     * Troubleshooting tips
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTroubleshootingTips() {
        return null;
    }
}