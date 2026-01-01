package com.upgovt.ashadiary.presentation.viewmodel;

/**
 * DuplicateReviewViewModel - For Block Nodal to review and resolve duplicates
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001cJ&\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001cJ0\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010&\u001a\u00020\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/upgovt/ashadiary/presentation/viewmodel/DuplicateReviewViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_mergeState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/upgovt/ashadiary/presentation/viewmodel/MergeState;", "database", "Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase;", "mergeManager", "Lcom/upgovt/ashadiary/domain/duplicate/DuplicateMergeManager;", "mergeState", "Landroidx/lifecycle/LiveData;", "getMergeState", "()Landroidx/lifecycle/LiveData;", "pendingCount", "Lkotlinx/coroutines/flow/Flow;", "", "getPendingCount", "()Lkotlinx/coroutines/flow/Flow;", "pendingDuplicates", "", "Lcom/upgovt/ashadiary/data/local/entities/DuplicateFlagEntity;", "getPendingDuplicates", "inactivateDuplicate", "", "beneficiaryId", "", "userId", "userRoleId", "reason", "markAsNotDuplicate", "flagId", "notes", "mergeDuplicate", "duplicateBeneficiaryId", "masterBeneficiaryId", "resetMergeState", "app_debug"})
public final class DuplicateReviewViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.domain.duplicate.DuplicateMergeManager mergeManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity>> pendingDuplicates = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> pendingCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.upgovt.ashadiary.presentation.viewmodel.MergeState> _mergeState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.upgovt.ashadiary.presentation.viewmodel.MergeState> mergeState = null;
    
    public DuplicateReviewViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity>> getPendingDuplicates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getPendingCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.upgovt.ashadiary.presentation.viewmodel.MergeState> getMergeState() {
        return null;
    }
    
    /**
     * Merge duplicate into master
     */
    public final void mergeDuplicate(@org.jetbrains.annotations.NotNull()
    java.lang.String duplicateBeneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String masterBeneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, int userRoleId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes) {
    }
    
    /**
     * Mark as not duplicate (keep both)
     */
    public final void markAsNotDuplicate(@org.jetbrains.annotations.NotNull()
    java.lang.String flagId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, int userRoleId, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
    }
    
    /**
     * Inactivate duplicate
     */
    public final void inactivateDuplicate(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, int userRoleId, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    /**
     * Reset merge state
     */
    public final void resetMergeState() {
    }
}