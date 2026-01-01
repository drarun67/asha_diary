package com.upgovt.ashadiary.data.local.dao;

/**
 * Supporting DAOs - Role, Village, UserAreaMapping, DuplicateFlag, AuditLog, BiometricLocal, SyncQueue
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/RoleDao;", "", "getAllRoles", "", "Lcom/upgovt/ashadiary/data/local/entities/RoleEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getById", "roleId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "role", "(Lcom/upgovt/ashadiary/data/local/entities/RoleEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "roles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeAllRoles", "Lkotlinx/coroutines/flow/Flow;", "app_debug"})
@androidx.room.Dao()
public abstract interface RoleDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.RoleEntity role, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.RoleEntity> roles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM roles WHERE id = :roleId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(int roleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.RoleEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM roles ORDER BY authority_level ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllRoles(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.RoleEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM roles ORDER BY authority_level ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.RoleEntity>> observeAllRoles();
}