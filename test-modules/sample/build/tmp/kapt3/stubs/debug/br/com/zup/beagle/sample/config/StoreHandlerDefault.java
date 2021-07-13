package br.com.zup.beagle.sample.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J7\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0011\"\u00020\fH\u0016\u00a2\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lbr/com/zup/beagle/sample/config/StoreHandlerDefault;", "Lbr/com/zup/beagle/android/store/StoreHandler;", "memoryLocalStore", "Lbr/com/zup/beagle/sample/config/MemoryLocalStore;", "databaseLocalStore", "Lbr/com/zup/beagle/sample/config/DatabaseLocalStore;", "(Lbr/com/zup/beagle/sample/config/MemoryLocalStore;Lbr/com/zup/beagle/sample/config/DatabaseLocalStore;)V", "delete", "", "storeType", "Lbr/com/zup/beagle/android/store/StoreType;", "key", "", "getAll", "", "restore", "keys", "", "(Lbr/com/zup/beagle/android/store/StoreType;[Ljava/lang/String;)Ljava/util/Map;", "save", "data", "sample_debug"})
@br.com.zup.beagle.android.annotation.BeagleComponent()
public final class StoreHandlerDefault implements br.com.zup.beagle.android.store.StoreHandler {
    private final br.com.zup.beagle.sample.config.MemoryLocalStore memoryLocalStore = null;
    private final br.com.zup.beagle.sample.config.DatabaseLocalStore databaseLocalStore = null;
    
    public StoreHandlerDefault() {
        super();
    }
    
    public StoreHandlerDefault(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.sample.config.MemoryLocalStore memoryLocalStore, @org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.sample.config.DatabaseLocalStore databaseLocalStore) {
        super();
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.store.StoreType storeType, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> restore(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.store.StoreType storeType, @org.jetbrains.annotations.NotNull()
    java.lang.String... keys) {
        return null;
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.store.StoreType storeType, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getAll(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.store.StoreType storeType) {
        return null;
    }
}