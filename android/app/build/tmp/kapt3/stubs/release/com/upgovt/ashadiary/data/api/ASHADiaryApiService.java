package com.upgovt.ashadiary.data.api;

/**
 * ASHADiaryApiService - REST API interface for backend communication
 *
 * Base URL: To be configured (e.g., https://ashadiary.up.gov.in/api/)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0018H\u00a7@\u00a2\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0002\u0010\u001fJ>\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010#\u001a\u00020$2\b\b\u0003\u0010%\u001a\u00020$H\u00a7@\u00a2\u0006\u0002\u0010&J(\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010)J*\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010)J*\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010)J*\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010)J\u001e\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\r\u001a\u000204H\u00a7@\u00a2\u0006\u0002\u00105J\u001e\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u00108J(\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020;H\u00a7@\u00a2\u0006\u0002\u0010<J(\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020?H\u00a7@\u00a2\u0006\u0002\u0010@J2\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ2\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020EH\u00a7@\u00a2\u0006\u0002\u0010FJ2\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020HH\u00a7@\u00a2\u0006\u0002\u0010IJ.\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u000e\b\u0001\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MH\u00a7@\u00a2\u0006\u0002\u0010OJ\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u00108\u00a8\u0006R"}, d2 = {"Lcom/upgovt/ashadiary/data/api/ASHADiaryApiService;", "", "approveEditRequest", "Lretrofit2/Response;", "Lcom/upgovt/ashadiary/data/api/EditRequestResponse;", "token", "", "requestId", "notes", "Lcom/upgovt/ashadiary/data/api/EditRequestReviewRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/EditRequestReviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createANCVisit", "Lcom/upgovt/ashadiary/data/api/VisitResponse;", "request", "Lcom/upgovt/ashadiary/data/api/ANCVisitRequest;", "(Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/ANCVisitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBPVisit", "Lcom/upgovt/ashadiary/data/api/BPVisitRequest;", "(Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/BPVisitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBeneficiary", "Lcom/upgovt/ashadiary/data/api/BeneficiaryResponse;", "Lcom/upgovt/ashadiary/data/api/BeneficiaryCreateRequest;", "(Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/BeneficiaryCreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBloodSugarVisit", "Lcom/upgovt/ashadiary/data/api/BloodSugarVisitRequest;", "(Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/BloodSugarVisitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createEditRequest", "Lcom/upgovt/ashadiary/data/api/EditRequestCreateRequest;", "(Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/EditRequestCreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createVaccinationVisit", "Lcom/upgovt/ashadiary/data/api/VaccinationVisitRequest;", "(Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/VaccinationVisitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBeneficiaries", "Lcom/upgovt/ashadiary/data/api/BeneficiaryListResponse;", "villageId", "limit", "", "offset", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBeneficiary", "beneficiaryId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDuplicateFlags", "Lcom/upgovt/ashadiary/data/api/DuplicateFlagListResponse;", "status", "getEditRequests", "Lcom/upgovt/ashadiary/data/api/EditRequestListResponse;", "getVillages", "Lcom/upgovt/ashadiary/data/api/VillageListResponse;", "blockCode", "login", "Lcom/upgovt/ashadiary/data/api/LoginResponse;", "Lcom/upgovt/ashadiary/data/api/LoginRequest;", "(Lcom/upgovt/ashadiary/data/api/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullChanges", "Lcom/upgovt/ashadiary/data/api/SyncPullResponse;", "Lcom/upgovt/ashadiary/data/api/SyncPullRequest;", "(Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/SyncPullRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushChanges", "Lcom/upgovt/ashadiary/data/api/SyncPushResponse;", "Lcom/upgovt/ashadiary/data/api/SyncPushRequest;", "(Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/SyncPushRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectEditRequest", "resolveDuplicate", "Lcom/upgovt/ashadiary/data/api/DuplicateFlagResponse;", "flagId", "Lcom/upgovt/ashadiary/data/api/DuplicateResolveRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/DuplicateResolveRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBeneficiary", "Lcom/upgovt/ashadiary/data/api/BeneficiaryUpdateRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/upgovt/ashadiary/data/api/BeneficiaryUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadAuditLogs", "Lcom/upgovt/ashadiary/data/api/BatchUploadResponse;", "logs", "", "Lcom/upgovt/ashadiary/data/api/AuditLogRequest;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateToken", "Lcom/upgovt/ashadiary/data/api/UserResponse;", "app_release"})
public abstract interface ASHADiaryApiService {
    
    @retrofit2.http.POST(value = "auth/login")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.LoginRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.LoginResponse>> $completion);
    
    @retrofit2.http.POST(value = "auth/logout")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object logout(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.GET(value = "auth/validate")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object validateToken(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.UserResponse>> $completion);
    
    /**
     * Push local changes to server
     */
    @retrofit2.http.POST(value = "sync/push")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pushChanges(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.SyncPushRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.SyncPushResponse>> $completion);
    
    /**
     * Pull server changes
     */
    @retrofit2.http.POST(value = "sync/pull")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pullChanges(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.SyncPullRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.SyncPullResponse>> $completion);
    
    @retrofit2.http.GET(value = "beneficiaries")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBeneficiaries(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "village_id")
    @org.jetbrains.annotations.Nullable()
    java.lang.String villageId, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.BeneficiaryListResponse>> $completion);
    
    @retrofit2.http.GET(value = "beneficiaries/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBeneficiary(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.BeneficiaryResponse>> $completion);
    
    @retrofit2.http.POST(value = "beneficiaries")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createBeneficiary(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.BeneficiaryCreateRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.BeneficiaryResponse>> $completion);
    
    @retrofit2.http.PUT(value = "beneficiaries/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateBeneficiary(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.BeneficiaryUpdateRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.BeneficiaryResponse>> $completion);
    
    @retrofit2.http.POST(value = "visits/anc")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createANCVisit(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.ANCVisitRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.VisitResponse>> $completion);
    
    @retrofit2.http.POST(value = "visits/bp")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createBPVisit(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.BPVisitRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.VisitResponse>> $completion);
    
    @retrofit2.http.POST(value = "visits/blood-sugar")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createBloodSugarVisit(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.BloodSugarVisitRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.VisitResponse>> $completion);
    
    @retrofit2.http.POST(value = "visits/vaccination")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createVaccinationVisit(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.VaccinationVisitRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.VisitResponse>> $completion);
    
    @retrofit2.http.GET(value = "edit-requests")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEditRequests(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "status")
    @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.EditRequestListResponse>> $completion);
    
    @retrofit2.http.POST(value = "edit-requests")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createEditRequest(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.EditRequestCreateRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.EditRequestResponse>> $completion);
    
    @retrofit2.http.PUT(value = "edit-requests/{id}/approve")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object approveEditRequest(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String requestId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.EditRequestReviewRequest notes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.EditRequestResponse>> $completion);
    
    @retrofit2.http.PUT(value = "edit-requests/{id}/reject")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object rejectEditRequest(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String requestId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.EditRequestReviewRequest notes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.EditRequestResponse>> $completion);
    
    @retrofit2.http.GET(value = "duplicates")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDuplicateFlags(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "status")
    @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.DuplicateFlagListResponse>> $completion);
    
    @retrofit2.http.PUT(value = "duplicates/{id}/resolve")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resolveDuplicate(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String flagId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.api.DuplicateResolveRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.DuplicateFlagResponse>> $completion);
    
    @retrofit2.http.POST(value = "audit-logs/batch")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadAuditLogs(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.api.AuditLogRequest> logs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.BatchUploadResponse>> $completion);
    
    @retrofit2.http.GET(value = "villages")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVillages(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "block_code")
    @org.jetbrains.annotations.Nullable()
    java.lang.String blockCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.upgovt.ashadiary.data.api.VillageListResponse>> $completion);
    
    /**
     * ASHADiaryApiService - REST API interface for backend communication
     *
     * Base URL: To be configured (e.g., https://ashadiary.up.gov.in/api/)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}