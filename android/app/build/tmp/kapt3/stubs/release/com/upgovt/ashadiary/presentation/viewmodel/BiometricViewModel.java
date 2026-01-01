package com.upgovt.ashadiary.presentation.viewmodel;

/**
 * BiometricViewModel - ViewModel for biometric capture and verification
 * Used in beneficiary registration and verification flows
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u0010\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&J\u0006\u0010\'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"J\u001e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+J\u000e\u0010.\u001a\u00020\"2\u0006\u0010*\u001a\u00020+R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016\u00a8\u0006/"}, d2 = {"Lcom/upgovt/ashadiary/presentation/viewmodel/BiometricViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "biometricRepository", "Lcom/upgovt/ashadiary/data/repository/BiometricRepository;", "(Landroid/app/Application;Lcom/upgovt/ashadiary/data/repository/BiometricRepository;)V", "_captureState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/upgovt/ashadiary/presentation/viewmodel/BiometricCaptureState;", "_searchResults", "Lcom/upgovt/ashadiary/utils/biometric/BiometricSearchResult;", "_stats", "error/NonExistentClass", "Lerror/NonExistentClass;", "_verificationResult", "Lcom/upgovt/ashadiary/utils/biometric/BiometricVerificationResult;", "biometricHelper", "Lcom/upgovt/ashadiary/utils/biometric/BiometricHelper;", "captureState", "Landroidx/lifecycle/LiveData;", "getCaptureState", "()Landroidx/lifecycle/LiveData;", "lastCaptureResult", "Lcom/upgovt/ashadiary/utils/biometric/BiometricCaptureResult;", "searchResults", "getSearchResults", "stats", "getStats", "verificationResult", "getVerificationResult", "checkAvailability", "Lcom/upgovt/ashadiary/utils/biometric/BiometricAvailability;", "clearSearchResults", "", "loadStats", "processCaptureResult", "data", "Landroid/content/Intent;", "resetCaptureState", "searchDuplicates", "storeFingerprint", "beneficiaryId", "", "fingerPosition", "capturedByUserId", "verifyBeneficiary", "app_release"})
public final class BiometricViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.repository.BiometricRepository biometricRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.utils.biometric.BiometricHelper biometricHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.upgovt.ashadiary.presentation.viewmodel.BiometricCaptureState> _captureState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.upgovt.ashadiary.presentation.viewmodel.BiometricCaptureState> captureState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.upgovt.ashadiary.utils.biometric.BiometricSearchResult> _searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.upgovt.ashadiary.utils.biometric.BiometricSearchResult> searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.upgovt.ashadiary.utils.biometric.BiometricVerificationResult> _verificationResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.upgovt.ashadiary.utils.biometric.BiometricVerificationResult> verificationResult = null;
    @org.jetbrains.annotations.NotNull()
    private final error.NonExistentClass _stats = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<error.NonExistentClass> stats = null;
    @org.jetbrains.annotations.Nullable()
    private com.upgovt.ashadiary.utils.biometric.BiometricCaptureResult lastCaptureResult;
    
    public BiometricViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.repository.BiometricRepository biometricRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.upgovt.ashadiary.presentation.viewmodel.BiometricCaptureState> getCaptureState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.upgovt.ashadiary.utils.biometric.BiometricSearchResult> getSearchResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.upgovt.ashadiary.utils.biometric.BiometricVerificationResult> getVerificationResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<error.NonExistentClass> getStats() {
        return null;
    }
    
    /**
     * Check if biometric capture is available
     */
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.utils.biometric.BiometricAvailability checkAvailability() {
        return null;
    }
    
    /**
     * Process capture result from Mantra RD Service
     */
    public final void processCaptureResult(@org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * Store captured fingerprint for beneficiary
     */
    public final void storeFingerprint(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String fingerPosition, @org.jetbrains.annotations.NotNull()
    java.lang.String capturedByUserId) {
    }
    
    /**
     * Search for duplicate beneficiaries using captured fingerprint
     */
    public final void searchDuplicates() {
    }
    
    /**
     * Verify beneficiary identity
     */
    public final void verifyBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId) {
    }
    
    /**
     * Load biometric statistics
     */
    public final void loadStats() {
    }
    
    /**
     * Reset capture state
     */
    public final void resetCaptureState() {
    }
    
    /**
     * Clear search results
     */
    public final void clearSearchResults() {
    }
}