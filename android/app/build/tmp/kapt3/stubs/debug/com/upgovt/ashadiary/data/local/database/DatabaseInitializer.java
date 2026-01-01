package com.upgovt.ashadiary.data.local.database;

/**
 * DatabaseInitializer - Pre-populates database with required data
 * Runs once after database creation
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/upgovt/ashadiary/data/local/database/DatabaseInitializer;", "", "()V", "initialize", "", "context", "Landroid/content/Context;", "database", "Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase;", "(Landroid/content/Context;Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInitialized", "", "(Lcom/upgovt/ashadiary/data/local/database/ASHADiaryDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DatabaseInitializer {
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.data.local.database.DatabaseInitializer INSTANCE = null;
    
    private DatabaseInitializer() {
        super();
    }
    
    /**
     * Initialize database with default data
     * - Pre-populate roles
     * - Set up initial configuration
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase database, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Check if database has been initialized
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isInitialized(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.database.ASHADiaryDatabase database, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}