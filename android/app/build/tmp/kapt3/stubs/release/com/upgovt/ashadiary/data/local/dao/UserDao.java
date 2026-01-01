package com.upgovt.ashadiary.data.local.dao;

/**
 * UserDao - Data Access Object for USER entity
 * All operations return Flow for reactive UI updates
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u001c\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010 J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00a7@\u00a2\u0006\u0002\u0010#J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110%H\'J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0%H\'J\u0018\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030%2\u0006\u0010\n\u001a\u00020\u0005H\'J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110%2\u0006\u0010\u001c\u001a\u00020\tH\'J0\u0010)\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010 \u00a8\u00060"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/UserDao;", "", "authenticateUser", "Lcom/upgovt/ashadiary/data/local/entities/UserEntity;", "username", "", "passwordHash", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateUser", "", "userId", "timestamp", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUser", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllActiveUsers", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnsyncedCount", "getUnsyncedUsers", "getUserById", "getUserByOfflineToken", "token", "getUserByPhone", "phoneNumber", "getUserByUsername", "getUsersByRole", "roleId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUser", "user", "(Lcom/upgovt/ashadiary/data/local/entities/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUsers", "users", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeAllActiveUsers", "Lkotlinx/coroutines/flow/Flow;", "observeUnsyncedCount", "observeUserById", "observeUsersByRole", "updateSyncStatus", "isSynced", "", "syncedAt", "serverId", "(Ljava/lang/String;ZJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "app_release"})
@androidx.room.Dao()
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertUser(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.UserEntity> users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE id = :userId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.UserEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE id = :userId LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.upgovt.ashadiary.data.local.entities.UserEntity> observeUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE username = :username AND is_active = 1 LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.UserEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE phone_number = :phoneNumber AND is_active = 1 LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.UserEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE role_id = :roleId AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUsersByRole(int roleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.UserEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE role_id = :roleId AND is_active = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.UserEntity>> observeUsersByRole(int roleId);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE is_active = 1 ORDER BY full_name ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllActiveUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.UserEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE is_active = 1 ORDER BY full_name ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.UserEntity>> observeAllActiveUsers();
    
    @androidx.room.Query(value = "\n        SELECT * FROM users \n        WHERE username = :username \n        AND password_hash = :passwordHash \n        AND is_active = 1 \n        LIMIT 1\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object authenticateUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String passwordHash, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.UserEntity> $completion);
    
    @androidx.room.Query(value = "\n        SELECT * FROM users \n        WHERE offline_token = :token \n        AND is_active = 1 \n        LIMIT 1\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByOfflineToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.UserEntity> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET is_active = 0, updated_at = :timestamp WHERE id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deactivateUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, long timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE users \n        SET is_synced = :isSynced, \n            last_synced_at = :syncedAt, \n            server_id = :serverId \n        WHERE id = :userId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSyncStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, boolean isSynced, long syncedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String serverId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM users WHERE id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE is_synced = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsyncedUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.UserEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM users WHERE is_synced = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsyncedCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM users WHERE is_synced = 0")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observeUnsyncedCount();
    
    /**
     * UserDao - Data Access Object for USER entity
     * All operations return Flow for reactive UI updates
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}