package com.upgovt.ashadiary.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00192\u0006\u0010\n\u001a\u00020\u0005H\'J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00192\u0006\u0010\n\u001a\u00020\u0005H\'J\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/UserAreaMappingDao;", "", "deactivate", "", "mappingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAssignedVillagesForUser", "", "Lcom/upgovt/ashadiary/data/local/entities/VillageEntity;", "userId", "getByUser", "Lcom/upgovt/ashadiary/data/local/entities/UserAreaMappingEntity;", "getByVillage", "villageId", "getUnsynced", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "mapping", "(Lcom/upgovt/ashadiary/data/local/entities/UserAreaMappingEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "mappings", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeAssignedVillagesForUser", "Lkotlinx/coroutines/flow/Flow;", "observeByUser", "update", "app_release"})
@androidx.room.Dao()
public abstract interface UserAreaMappingDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity mapping, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity> mappings, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM user_area_mappings WHERE user_id = :userId AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM user_area_mappings WHERE user_id = :userId AND is_active = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity>> observeByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM user_area_mappings WHERE village_id = :villageId AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByVillage(@org.jetbrains.annotations.NotNull()
    java.lang.String villageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity>> $completion);
    
    @androidx.room.Query(value = "\n        SELECT v.* FROM villages v\n        INNER JOIN user_area_mappings uam ON v.id = uam.village_id\n        WHERE uam.user_id = :userId AND uam.is_active = 1 AND v.is_active = 1\n        ORDER BY v.village_name_hindi ASC\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAssignedVillagesForUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity>> $completion);
    
    @androidx.room.Query(value = "\n        SELECT v.* FROM villages v\n        INNER JOIN user_area_mappings uam ON v.id = uam.village_id\n        WHERE uam.user_id = :userId AND uam.is_active = 1 AND v.is_active = 1\n        ORDER BY v.village_name_hindi ASC\n    ")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity>> observeAssignedVillagesForUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity mapping, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "UPDATE user_area_mappings SET is_active = 0 WHERE id = :mappingId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deactivate(@org.jetbrains.annotations.NotNull()
    java.lang.String mappingId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM user_area_mappings WHERE is_synced = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsynced(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity>> $completion);
}