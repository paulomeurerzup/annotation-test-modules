package br.com.zup.beagle.sample.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/beagle/sample/config/DatabaseLocalStore;", "Lbr/com/zup/beagle/android/store/LocalStore;", "contentValuesFactory", "Lbr/com/zup/beagle/sample/config/ContentValuesFactory;", "database", "Landroid/database/sqlite/SQLiteDatabase;", "(Lbr/com/zup/beagle/sample/config/ContentValuesFactory;Landroid/database/sqlite/SQLiteDatabase;)V", "delete", "", "key", "", "executeRestoreQueryForKey", "Landroid/database/Cursor;", "getAll", "", "restore", "save", "value", "sample_debug"})
public final class DatabaseLocalStore implements br.com.zup.beagle.android.store.LocalStore {
    private final br.com.zup.beagle.sample.config.ContentValuesFactory contentValuesFactory = null;
    private final android.database.sqlite.SQLiteDatabase database = null;
    
    public DatabaseLocalStore() {
        super();
    }
    
    public DatabaseLocalStore(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.sample.config.ContentValuesFactory contentValuesFactory, @org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase database) {
        super();
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String restore(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getAll() {
        return null;
    }
    
    private final android.database.Cursor executeRestoreQueryForKey(java.lang.String key) {
        return null;
    }
}