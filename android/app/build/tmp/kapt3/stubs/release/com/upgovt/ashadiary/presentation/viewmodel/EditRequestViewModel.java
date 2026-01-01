package com.upgovt.ashadiary.presentation.viewmodel;

/**
 * EditRequestViewModel - Manages edit request workflow
 * Used by Field Staff, Supervisors, and Block Nodal
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001cJ\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b2\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b2\u0006\u0010\"\u001a\u00020\u001cJ&\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\u001aJN\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/upgovt/ashadiary/presentation/viewmodel/EditRequestViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_requestState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/upgovt/ashadiary/presentation/viewmodel/EditRequestState;", "database", "Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase;", "pendingCount", "Lkotlinx/coroutines/flow/Flow;", "", "getPendingCount", "()Lkotlinx/coroutines/flow/Flow;", "pendingRequests", "", "Lcom/upgovt/ashadiary/data/local/entities/EditRequestEntity;", "getPendingRequests", "requestState", "Landroidx/lifecycle/LiveData;", "getRequestState", "()Landroidx/lifecycle/LiveData;", "workflowManager", "Lcom/upgovt/ashadiary/domain/editrequest/EditRequestWorkflowManager;", "approveRequest", "", "requestId", "", "userId", "userRoleId", "reviewNotes", "getMyRequests", "getRequestsForBeneficiary", "beneficiaryId", "rejectRequest", "resetState", "submitEditRequest", "fieldName", "currentValue", "requestedValue", "reason", "gpsLat", "", "gpsLng", "app_release"})
public final class EditRequestViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.domain.editrequest.EditRequestWorkflowManager workflowManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> pendingRequests = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> pendingCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.upgovt.ashadiary.presentation.viewmodel.EditRequestState> _requestState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.upgovt.ashadiary.presentation.viewmodel.EditRequestState> requestState = null;
    
    public EditRequestViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> getPendingRequests() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getPendingCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.upgovt.ashadiary.presentation.viewmodel.EditRequestState> getRequestState() {
        return null;
    }
    
    /**
     * Submit edit request (Field Staff)
     */
    public final void submitEditRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String fieldName, @org.jetbrains.annotations.NotNull()
    java.lang.String currentValue, @org.jetbrains.annotations.NotNull()
    java.lang.String requestedValue, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, int userRoleId, double gpsLat, double gpsLng) {
    }
    
    /**
     * Approve edit request (Supervisor/Block Nodal)
     */
    public final void approveRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String requestId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, int userRoleId, @org.jetbrains.annotations.Nullable()
    java.lang.String reviewNotes) {
    }
    
    /**
     * Reject edit request (Supervisor/Block Nodal)
     */
    public final void rejectRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String requestId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, int userRoleId, @org.jetbrains.annotations.NotNull()
    java.lang.String reviewNotes) {
    }
    
    /**
     * Get user's submitted requests (Field Staff tracking)
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> getMyRequests(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    /**
     * Get requests for a beneficiary
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.EditRequestEntity>> getRequestsForBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId) {
        return null;
    }
    
    /**
     * Reset state
     */
    public final void resetState() {
    }
}