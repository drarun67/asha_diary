package com.upgovt.ashadiary.utils.biometric;

/**
 * BiometricHelper - High-level helper for biometric operations
 * Combines Mantra RD Service integration with local storage and matching
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u001cJ<\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00a2\u0006\u0002\u0010\'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006)"}, d2 = {"Lcom/upgovt/ashadiary/utils/biometric/BiometricHelper;", "", "context", "Landroid/content/Context;", "biometricRepository", "Lcom/upgovt/ashadiary/data/repository/BiometricRepository;", "(Landroid/content/Context;Lcom/upgovt/ashadiary/data/repository/BiometricRepository;)V", "mantraHelper", "Lcom/upgovt/ashadiary/utils/biometric/MantraRDServiceHelper;", "captureFingerprint", "", "activity", "Landroid/app/Activity;", "getBiometricStats", "Lcom/upgovt/ashadiary/data/repository/BiometricStats;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBiometricCaptureAvailable", "Lcom/upgovt/ashadiary/utils/biometric/BiometricAvailability;", "processCaptureResult", "Lcom/upgovt/ashadiary/utils/biometric/BiometricCaptureResult;", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "searchDuplicatesByFingerprint", "Lcom/upgovt/ashadiary/utils/biometric/BiometricSearchResult;", "captureResult", "(Lcom/upgovt/ashadiary/utils/biometric/BiometricCaptureResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeFingerprintForBeneficiary", "Lkotlin/Result;", "beneficiaryId", "", "fingerPosition", "capturedByUserId", "storeFingerprintForBeneficiary-yxL6bBk", "(Lcom/upgovt/ashadiary/utils/biometric/BiometricCaptureResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyBeneficiary", "Lcom/upgovt/ashadiary/utils/biometric/BiometricVerificationResult;", "(Lcom/upgovt/ashadiary/utils/biometric/BiometricCaptureResult;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class BiometricHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.repository.BiometricRepository biometricRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.utils.biometric.MantraRDServiceHelper mantraHelper = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "BiometricHelper";
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.utils.biometric.BiometricHelper.Companion Companion = null;
    
    public BiometricHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.repository.BiometricRepository biometricRepository) {
        super();
    }
    
    /**
     * Check if biometric capture is available
     */
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.utils.biometric.BiometricAvailability isBiometricCaptureAvailable() {
        return null;
    }
    
    /**
     * Capture fingerprint from device
     * Launch Mantra RD Service activity
     */
    public final void captureFingerprint(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * Process captured fingerprint result
     * Call this from Activity.onActivityResult()
     */
    @org.jetbrains.annotations.Nullable()
    public final com.upgovt.ashadiary.utils.biometric.BiometricCaptureResult processCaptureResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return null;
    }
    
    /**
     * Search for duplicate beneficiaries using fingerprint
     * Returns list of potential matches with scores
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchDuplicatesByFingerprint(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.utils.biometric.BiometricCaptureResult captureResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.utils.biometric.BiometricSearchResult> $completion) {
        return null;
    }
    
    /**
     * Verify beneficiary identity using fingerprint
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object verifyBeneficiary(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.utils.biometric.BiometricCaptureResult captureResult, @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.utils.biometric.BiometricVerificationResult> $completion) {
        return null;
    }
    
    /**
     * Get fingerprint statistics
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBiometricStats(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.repository.BiometricStats> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/upgovt/ashadiary/utils/biometric/BiometricHelper$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}