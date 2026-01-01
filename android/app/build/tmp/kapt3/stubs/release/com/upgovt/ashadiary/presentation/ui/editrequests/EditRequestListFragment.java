package com.upgovt.ashadiary.presentation.ui.editrequests;

/**
 * EditRequestListFragment - Supervisors review pending edit requests
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010%\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006-"}, d2 = {"Lcom/upgovt/ashadiary/presentation/ui/editrequests/EditRequestListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "chipApproved", "Lcom/google/android/material/chip/Chip;", "chipGroup", "Lcom/google/android/material/chip/ChipGroup;", "chipPending", "chipRejected", "progressBar", "Landroid/widget/ProgressBar;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "tvNoRequests", "Landroid/widget/TextView;", "viewModel", "Lcom/upgovt/ashadiary/presentation/viewmodel/EditRequestViewModel;", "getViewModel", "()Lcom/upgovt/ashadiary/presentation/viewmodel/EditRequestViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "hideLoading", "", "initViews", "view", "Landroid/view/View;", "loadEditRequests", "status", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setupChipFilters", "setupObservers", "setupRecyclerView", "showLoading", "showNoRequests", "showRequests", "count", "", "app_release"})
public final class EditRequestListFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.google.android.material.chip.ChipGroup chipGroup;
    private com.google.android.material.chip.Chip chipPending;
    private com.google.android.material.chip.Chip chipApproved;
    private com.google.android.material.chip.Chip chipRejected;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.TextView tvNoRequests;
    private android.widget.ProgressBar progressBar;
    
    public EditRequestListFragment() {
        super();
    }
    
    private final com.upgovt.ashadiary.presentation.viewmodel.EditRequestViewModel getViewModel() {
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
    
    private final void setupChipFilters() {
    }
    
    private final void setupObservers() {
    }
    
    private final void loadEditRequests(java.lang.String status) {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    private final void showRequests(int count) {
    }
    
    private final void showNoRequests() {
    }
}