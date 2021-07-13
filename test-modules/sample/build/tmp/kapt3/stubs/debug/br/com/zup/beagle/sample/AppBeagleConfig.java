package br.com.zup.beagle.sample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/beagle/sample/AppBeagleConfig;", "Lbr/com/zup/beagle/android/setup/BeagleConfig;", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "cache", "Lbr/com/zup/beagle/android/setup/Cache;", "getCache", "()Lbr/com/zup/beagle/android/setup/Cache;", "environment", "Lbr/com/zup/beagle/android/setup/Environment;", "getEnvironment", "()Lbr/com/zup/beagle/android/setup/Environment;", "isLoggingEnabled", "", "()Z", "sample_debug"})
public final class AppBeagleConfig implements br.com.zup.beagle.android.setup.BeagleConfig {
    private final boolean isLoggingEnabled = true;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.beagle.android.setup.Cache cache = null;
    
    public AppBeagleConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.beagle.android.setup.Environment getEnvironment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBaseUrl() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isLoggingEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.beagle.android.setup.Cache getCache() {
        return null;
    }
}