package com.upgovt.ashadiary.presentation.ui.registration;

/**
 * BeneficiaryRegistrationFragment - Registration screen with voice input
 * Integrates: Voice, Biometric, Duplicate Detection, Offline-first
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020\u001aH\u0002J\b\u0010,\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u000201H\u0002J\u0012\u00102\u001a\u00020\u001a2\b\u00103\u001a\u0004\u0018\u000104H\u0016J&\u00105\u001a\u0004\u0018\u0001012\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u001a\u0010:\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010;\u001a\u00020\u001aH\u0002J\b\u0010<\u001a\u00020\u001aH\u0002J\u0018\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0002J\u0010\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u0019H\u0002J\b\u0010B\u001a\u00020\u001aH\u0002J\u0010\u0010C\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u0019H\u0002J\u001c\u0010D\u001a\u00020\u001a2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0002J\b\u0010F\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u00190\u00190#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/upgovt/ashadiary/presentation/ui/registration/BeneficiaryRegistrationFragment;", "Landroidx/fragment/app/Fragment;", "()V", "biometricQuality", "", "biometricViewModel", "Lcom/upgovt/ashadiary/presentation/viewmodel/BiometricViewModel;", "getBiometricViewModel", "()Lcom/upgovt/ashadiary/presentation/viewmodel/BiometricViewModel;", "biometricViewModel$delegate", "Lkotlin/Lazy;", "btnCaptureFingerprint", "Landroid/widget/Button;", "btnRegister", "capturedBiometricTemplate", "", "chipGroupGender", "Lcom/google/android/material/chip/ChipGroup;", "etAddress", "Landroid/widget/EditText;", "etFatherHusbandName", "etMobile", "etName", "onVoiceResult", "Lkotlin/Function1;", "", "", "pickerAge", "Landroid/widget/NumberPicker;", "registrationViewModel", "Lcom/upgovt/ashadiary/presentation/viewmodel/BeneficiaryRegistrationViewModel;", "getRegistrationViewModel", "()Lcom/upgovt/ashadiary/presentation/viewmodel/BeneficiaryRegistrationViewModel;", "registrationViewModel$delegate", "requestMicPermission", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "spinnerVillage", "Landroid/widget/Spinner;", "tvFingerprintStatus", "Landroid/widget/TextView;", "voiceHelper", "Lcom/upgovt/ashadiary/utils/voice/VoiceInputHelper;", "captureFingerprint", "checkMicPermission", "clearForm", "hideLoading", "initViews", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "setupAgePicker", "setupObservers", "showDuplicateWarning", "count", "highestScore", "showError", "message", "showLoading", "showSuccess", "startVoiceInput", "onResult", "submitRegistration", "app_release"})
public final class BeneficiaryRegistrationFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy registrationViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy biometricViewModel$delegate = null;
    private com.upgovt.ashadiary.utils.voice.VoiceInputHelper voiceHelper;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onVoiceResult;
    private android.widget.EditText etName;
    private android.widget.EditText etFatherHusbandName;
    private android.widget.EditText etAddress;
    private android.widget.EditText etMobile;
    private com.google.android.material.chip.ChipGroup chipGroupGender;
    private android.widget.NumberPicker pickerAge;
    private android.widget.Spinner spinnerVillage;
    private android.widget.TextView tvFingerprintStatus;
    private android.widget.Button btnCaptureFingerprint;
    private android.widget.Button btnRegister;
    @org.jetbrains.annotations.Nullable()
    private byte[] capturedBiometricTemplate;
    private int biometricQuality = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestMicPermission = null;
    
    public BeneficiaryRegistrationFragment() {
        super();
    }
    
    private final com.upgovt.ashadiary.presentation.viewmodel.BeneficiaryRegistrationViewModel getRegistrationViewModel() {
        return null;
    }
    
    private final com.upgovt.ashadiary.presentation.viewmodel.BiometricViewModel getBiometricViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews(android.view.View view) {
    }
    
    private final void setupAgePicker() {
    }
    
    private final void setupObservers() {
    }
    
    private final void checkMicPermission() {
    }
    
    private final void startVoiceInput(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onResult) {
    }
    
    private final void captureFingerprint() {
    }
    
    private final void submitRegistration() {
    }
    
    private final void showDuplicateWarning(int count, int highestScore) {
    }
    
    private final void showSuccess(java.lang.String message) {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    private final void clearForm() {
    }
}