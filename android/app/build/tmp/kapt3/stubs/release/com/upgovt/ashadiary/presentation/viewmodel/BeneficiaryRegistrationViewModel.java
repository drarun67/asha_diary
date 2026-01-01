package com.upgovt.ashadiary.presentation.viewmodel;

/**
 * BeneficiaryRegistrationViewModel - Handles beneficiary registration flow
 * Integrates duplicate detection and biometric capture
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0016J\u0006\u0010 \u001a\u00020\u001cR&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/upgovt/ashadiary/presentation/viewmodel/BeneficiaryRegistrationViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_duplicateMatches", "Landroidx/lifecycle/MutableLiveData;", "", "Lkotlin/Pair;", "Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "Lcom/upgovt/ashadiary/domain/duplicate/DuplicateScore;", "_registrationState", "Lcom/upgovt/ashadiary/presentation/viewmodel/RegistrationState;", "biometricRepository", "Lcom/upgovt/ashadiary/data/repository/BiometricRepository;", "database", "Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase;", "duplicateMatches", "Landroidx/lifecycle/LiveData;", "getDuplicateMatches", "()Landroidx/lifecycle/LiveData;", "pendingRequest", "Lcom/upgovt/ashadiary/domain/usecases/BeneficiaryRegistrationRequest;", "registerBeneficiaryUseCase", "Lcom/upgovt/ashadiary/domain/usecases/RegisterBeneficiaryUseCase;", "registrationState", "getRegistrationState", "cancelRegistration", "", "confirmRegistrationWithDuplicates", "registerBeneficiary", "request", "resetState", "app_release"})
public final class BeneficiaryRegistrationViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.repository.BiometricRepository biometricRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.domain.usecases.RegisterBeneficiaryUseCase registerBeneficiaryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.upgovt.ashadiary.presentation.viewmodel.RegistrationState> _registrationState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.upgovt.ashadiary.presentation.viewmodel.RegistrationState> registrationState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>>> _duplicateMatches = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>>> duplicateMatches = null;
    @org.jetbrains.annotations.Nullable()
    private com.upgovt.ashadiary.domain.usecases.BeneficiaryRegistrationRequest pendingRequest;
    
    public BeneficiaryRegistrationViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.upgovt.ashadiary.presentation.viewmodel.RegistrationState> getRegistrationState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>>> getDuplicateMatches() {
        return null;
    }
    
    /**
     * Register beneficiary
     */
    public final void registerBeneficiary(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.domain.usecases.BeneficiaryRegistrationRequest request) {
    }
    
    /**
     * Confirm registration despite duplicates
     */
    public final void confirmRegistrationWithDuplicates() {
    }
    
    /**
     * Cancel registration
     */
    public final void cancelRegistration() {
    }
    
    /**
     * Reset state
     */
    public final void resetState() {
    }
}