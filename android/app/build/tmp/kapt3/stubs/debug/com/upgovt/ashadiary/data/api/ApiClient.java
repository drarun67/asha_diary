package com.upgovt.ashadiary.data.api;

/**
 * ApiClient - Retrofit client configuration
 * Singleton instance for API calls
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/upgovt/ashadiary/data/api/ApiClient;", "", "()V", "BASE_URL", "", "CONNECT_TIMEOUT", "", "DEV_BASE_URL", "READ_TIMEOUT", "WRITE_TIMEOUT", "apiService", "Lcom/upgovt/ashadiary/data/api/ASHADiaryApiService;", "createApiService", "context", "Landroid/content/Context;", "isDevelopment", "", "createGson", "Lcom/google/gson/Gson;", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "getApiService", "resetApiService", "", "app_debug"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://ashadiary.up.gov.in/api/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DEV_BASE_URL = "http://10.0.2.2:8000/api/";
    private static final long CONNECT_TIMEOUT = 30L;
    private static final long READ_TIMEOUT = 30L;
    private static final long WRITE_TIMEOUT = 30L;
    @org.jetbrains.annotations.Nullable()
    private static com.upgovt.ashadiary.data.api.ASHADiaryApiService apiService;
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.data.api.ApiClient INSTANCE = null;
    
    private ApiClient() {
        super();
    }
    
    /**
     * Get configured API service instance
     */
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.api.ASHADiaryApiService getApiService(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isDevelopment) {
        return null;
    }
    
    /**
     * Create Retrofit API service
     */
    private final com.upgovt.ashadiary.data.api.ASHADiaryApiService createApiService(android.content.Context context, boolean isDevelopment) {
        return null;
    }
    
    /**
     * Create OkHttp client with interceptors
     */
    private final okhttp3.OkHttpClient createOkHttpClient(android.content.Context context, boolean isDevelopment) {
        return null;
    }
    
    /**
     * Create Gson with custom configuration
     */
    private final com.google.gson.Gson createGson() {
        return null;
    }
    
    /**
     * Reset API service (for logout)
     */
    public final void resetApiService() {
    }
}