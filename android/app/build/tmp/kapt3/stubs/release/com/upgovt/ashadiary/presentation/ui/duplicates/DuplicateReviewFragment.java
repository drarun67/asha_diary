package com.upgovt.ashadiary.presentation.ui.duplicates;

/**
 * DuplicateReviewFragment - Block Nodal reviews and merges duplicates
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J&\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010\'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006,"}, d2 = {"Lcom/upgovt/ashadiary/presentation/ui/duplicates/DuplicateReviewFragment;", "Landroidx/fragment/app/Fragment;", "()V", "btnMerge", "Lcom/google/android/material/button/MaterialButton;", "btnNotDuplicate", "cardBeneficiary1", "Lcom/google/android/material/card/MaterialCardView;", "cardBeneficiary2", "progressBar", "Landroid/widget/ProgressBar;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "tvMatchScore", "Landroid/widget/TextView;", "tvNoResults", "viewModel", "Lcom/upgovt/ashadiary/presentation/viewmodel/DuplicateReviewViewModel;", "getViewModel", "()Lcom/upgovt/ashadiary/presentation/viewmodel/DuplicateReviewViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "hideLoading", "", "initViews", "view", "Landroid/view/View;", "loadPendingDuplicates", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setupClickListeners", "setupObservers", "setupRecyclerView", "showLoading", "showNoResults", "showResults", "count", "", "app_release"})
public final class DuplicateReviewFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.TextView tvNoResults;
    private android.widget.ProgressBar progressBar;
    private com.google.android.material.card.MaterialCardView cardBeneficiary1;
    private com.google.android.material.card.MaterialCardView cardBeneficiary2;
    private android.widget.TextView tvMatchScore;
    private com.google.android.material.button.MaterialButton btnMerge;
    private com.google.android.material.button.MaterialButton btnNotDuplicate;
    
    public DuplicateReviewFragment() {
        super();
    }
    
    private final com.upgovt.ashadiary.presentation.viewmodel.DuplicateReviewViewModel getViewModel() {
        return null;
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
    
    private final void setupRecyclerView() {
    }
    
    private final void setupObservers() {
    }
    
    private final void setupClickListeners() {
    }
    
    private final void loadPendingDuplicates() {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    private final void showResults(int count) {
    }
    
    private final void showNoResults() {
    }
}