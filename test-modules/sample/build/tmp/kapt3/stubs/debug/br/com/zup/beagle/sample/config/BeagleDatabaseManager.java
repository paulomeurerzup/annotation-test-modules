package br.com.zup.beagle.sample.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/beagle/sample/config/BeagleDatabaseManager;", "", "()V", "DATABASE_NAME", "", "DATABASE_VERSION", "", "database", "Landroid/database/sqlite/SQLiteDatabase;", "getDatabase", "context", "Landroid/content/Context;", "sample_debug"})
public final class BeagleDatabaseManager {
    @org.jetbrains.annotations.NotNull()
    public static final br.com.zup.beagle.sample.config.BeagleDatabaseManager INSTANCE = null;
    private static final java.lang.String DATABASE_NAME = "BeagleDefaultStore.db";
    private static final int DATABASE_VERSION = 2;
    private static android.database.sqlite.SQLiteDatabase database;
    
    private BeagleDatabaseManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.database.sqlite.SQLiteDatabase getDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}