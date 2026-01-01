package com.upgovt.ashadiary.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0017H\'J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/VillageDao;", "", "getAllActive", "", "Lcom/upgovt/ashadiary/data/local/entities/VillageEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByBlock", "blockCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByDistrict", "districtCode", "getById", "villageId", "getUnsynced", "insert", "", "village", "(Lcom/upgovt/ashadiary/data/local/entities/VillageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "villages", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeAllActive", "Lkotlinx/coroutines/flow/Flow;", "searchVillages", "query", "limit", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_release"})
@androidx.room.Dao()
public abstract interface VillageDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.VillageEntity village, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity> villages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM villages WHERE id = :villageId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(@org.jetbrains.annotations.NotNull()
    java.lang.String villageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.VillageEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM villages WHERE block_code = :blockCode AND is_active = 1 ORDER BY village_name_hindi ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByBlock(@org.jetbrains.annotations.NotNull()
    java.lang.String blockCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM villages WHERE district_code = :districtCode AND is_active = 1 ORDER BY village_name_hindi ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByDistrict(@org.jetbrains.annotations.NotNull()
    java.lang.String districtCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM villages WHERE is_active = 1 ORDER BY village_name_hindi ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllActive(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM villages WHERE is_active = 1 ORDER BY village_name_hindi ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity>> observeAllActive();
    
    @androidx.room.Query(value = "SELECT * FROM villages WHERE village_name_hindi LIKE \'%\' || :query || \'%\' AND is_active = 1 LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchVillages(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity>> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.VillageEntity village, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM villages WHERE is_synced = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsynced(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VillageEntity>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}