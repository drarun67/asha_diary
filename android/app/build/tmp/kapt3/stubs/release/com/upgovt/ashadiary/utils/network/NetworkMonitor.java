package com.upgovt.ashadiary.utils.network;

/**
 * NetworkMonitor - Monitors network connectivity status
 * Used to determine when sync should occur
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/upgovt/ashadiary/utils/network/NetworkMonitor;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "getNetworkType", "Lcom/upgovt/ashadiary/utils/network/NetworkType;", "isMobileDataConnected", "", "isNetworkAvailable", "isWiFiConnected", "observeNetworkConnectivity", "Lkotlinx/coroutines/flow/Flow;", "Lcom/upgovt/ashadiary/utils/network/NetworkStatus;", "app_release"})
public final class NetworkMonitor {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.net.ConnectivityManager connectivityManager = null;
    
    public NetworkMonitor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * Check if network is currently available
     */
    public final boolean isNetworkAvailable() {
        return false;
    }
    
    /**
     * Check if connected to WiFi
     */
    public final boolean isWiFiConnected() {
        return false;
    }
    
    /**
     * Check if connected to mobile data
     */
    public final boolean isMobileDataConnected() {
        return false;
    }
    
    /**
     * Get current network type
     */
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.utils.network.NetworkType getNetworkType() {
        return null;
    }
    
    /**
     * Observe network connectivity changes as Flow
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.upgovt.ashadiary.utils.network.NetworkStatus> observeNetworkConnectivity() {
        return null;
    }
}