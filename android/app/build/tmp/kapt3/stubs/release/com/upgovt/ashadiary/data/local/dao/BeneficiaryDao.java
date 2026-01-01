package com.upgovt.ashadiary.data.local.dao;

/**
 * BeneficiaryDao - Core DAO for beneficiary management
 * Includes duplicate detection queries
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0014J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0019\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010#\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00a2\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010%J\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00a2\u0006\u0002\u0010%J\u000e\u0010(\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010%J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00a2\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010.J8\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u00101J\u001c\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e032\u0006\u0010\u0019\u001a\u00020\u0005H\'J\u001c\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e032\u0006\u0010\u0011\u001a\u00020\u0005H\'J\u0018\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e03H\'J&\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e032\u0006\u00108\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\'J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u000303H\'J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000303H\'J&\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00108\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010<J(\u0010=\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010>\u001a\u00020?2\b\b\u0002\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010@J\u0016\u0010A\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010.J0\u0010B\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020\t2\b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010F\u00a8\u0006G"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;", "", "deactivateBeneficiary", "", "beneficiaryId", "", "modifiedByUserId", "modifiedByRoleId", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBeneficiary", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findExactNameMatch", "", "Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "nameHindi", "villageId", "gender", "excludeId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findPotentialDuplicates", "ageYears", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBeneficiariesByUser", "userId", "getBeneficiariesByVillage", "getBeneficiariesPaginated", "limit", "offset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBeneficiaryById", "getBeneficiaryByUniqueId", "getCountByType", "type", "getCountByVillage", "getDuplicateFlaggedBeneficiaries", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalActiveBeneficiaries", "getUnsyncedBeneficiaries", "getUnsyncedCount", "insertBeneficiaries", "beneficiaries", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBeneficiary", "beneficiary", "(Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeBeneficiaryInto", "masterBeneficiaryId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeBeneficiariesByUser", "Lkotlinx/coroutines/flow/Flow;", "observeBeneficiariesByVillage", "observeBeneficiaryById", "observeDuplicateFlaggedBeneficiaries", "observeSearchBeneficiaries", "query", "observeTotalActiveBeneficiaries", "observeUnsyncedCount", "searchBeneficiaries", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDuplicateFlagged", "isFlagged", "", "(Ljava/lang/String;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBeneficiary", "updateSyncStatus", "isSynced", "syncedAt", "serverId", "(Ljava/lang/String;ZJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
@androidx.room.Dao()
public abstract interface BeneficiaryDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertBeneficiary(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertBeneficiaries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity> beneficiaries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE id = :beneficiaryId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBeneficiaryById(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE id = :beneficiaryId LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity> observeBeneficiaryById(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE beneficiary_id = :beneficiaryId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBeneficiaryByUniqueId(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE village_id = :villageId AND is_active = 1 ORDER BY name_hindi ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBeneficiariesByVillage(@org.jetbrains.annotations.NotNull()
    java.lang.String villageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE village_id = :villageId AND is_active = 1 ORDER BY name_hindi ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> observeBeneficiariesByVillage(@org.jetbrains.annotations.NotNull()
    java.lang.String villageId);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE registered_by_user_id = :userId AND is_active = 1 ORDER BY registration_date DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBeneficiariesByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE registered_by_user_id = :userId AND is_active = 1 ORDER BY registration_date DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> observeBeneficiariesByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE is_active = 1 ORDER BY name_hindi ASC LIMIT :limit OFFSET :offset")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBeneficiariesPaginated(int limit, int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion);
    
    @androidx.room.Query(value = "\n        SELECT * FROM beneficiaries \n        WHERE is_active = 1 \n        AND (\n            name_hindi LIKE \'%\' || :query || \'%\' \n            OR beneficiary_id LIKE \'%\' || :query || \'%\'\n            OR mobile_number LIKE \'%\' || :query || \'%\'\n        )\n        ORDER BY name_hindi ASC\n        LIMIT :limit\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchBeneficiaries(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion);
    
    @androidx.room.Query(value = "\n        SELECT * FROM beneficiaries \n        WHERE is_active = 1 \n        AND (\n            name_hindi LIKE \'%\' || :query || \'%\' \n            OR beneficiary_id LIKE \'%\' || :query || \'%\'\n            OR mobile_number LIKE \'%\' || :query || \'%\'\n        )\n        ORDER BY name_hindi ASC\n        LIMIT :limit\n    ")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> observeSearchBeneficiaries(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int limit);
    
    @androidx.room.Query(value = "\n        SELECT * FROM beneficiaries \n        WHERE village_id = :villageId \n        AND gender = :gender \n        AND is_active = 1\n        AND ABS(age_years - :ageYears) <= 2\n        AND id != :excludeId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findPotentialDuplicates(@org.jetbrains.annotations.NotNull()
    java.lang.String villageId, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, int ageYears, @org.jetbrains.annotations.NotNull()
    java.lang.String excludeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion);
    
    @androidx.room.Query(value = "\n        SELECT * FROM beneficiaries \n        WHERE name_hindi = :nameHindi \n        AND village_id = :villageId \n        AND gender = :gender \n        AND is_active = 1\n        AND id != :excludeId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findExactNameMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String nameHindi, @org.jetbrains.annotations.NotNull()
    java.lang.String villageId, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    java.lang.String excludeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE is_duplicate_flagged = 1 AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDuplicateFlaggedBeneficiaries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE is_duplicate_flagged = 1 AND is_active = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> observeDuplicateFlaggedBeneficiaries();
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateBeneficiary(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE beneficiaries \n        SET is_active = 0, \n            updated_at = :timestamp,\n            last_modified_by_user_id = :modifiedByUserId,\n            last_modified_by_role_id = :modifiedByRoleId,\n            sync_version = sync_version + 1\n        WHERE id = :beneficiaryId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deactivateBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String modifiedByUserId, int modifiedByRoleId, long timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE beneficiaries \n        SET is_duplicate_flagged = :isFlagged,\n            updated_at = :timestamp,\n            sync_version = sync_version + 1\n        WHERE id = :beneficiaryId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setDuplicateFlagged(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, boolean isFlagged, long timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE beneficiaries \n        SET is_active = 0,\n            duplicate_of_beneficiary_id = :masterBeneficiaryId,\n            updated_at = :timestamp,\n            last_modified_by_user_id = :modifiedByUserId,\n            last_modified_by_role_id = :modifiedByRoleId,\n            sync_version = sync_version + 1\n        WHERE id = :beneficiaryId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object mergeBeneficiaryInto(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String masterBeneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String modifiedByUserId, int modifiedByRoleId, long timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE beneficiaries \n        SET is_synced = :isSynced, \n            last_synced_at = :syncedAt, \n            server_id = :serverId \n        WHERE id = :beneficiaryId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSyncStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, boolean isSynced, long syncedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String serverId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM beneficiaries WHERE id = :beneficiaryId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM beneficiaries WHERE is_synced = 0 ORDER BY created_at ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsyncedBeneficiaries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM beneficiaries WHERE is_synced = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsyncedCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM beneficiaries WHERE is_synced = 0")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observeUnsyncedCount();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM beneficiaries WHERE is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalActiveBeneficiaries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM beneficiaries WHERE is_active = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observeTotalActiveBeneficiaries();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM beneficiaries WHERE village_id = :villageId AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCountByVillage(@org.jetbrains.annotations.NotNull()
    java.lang.String villageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM beneficiaries WHERE beneficiary_type = :type AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCountByType(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    /**
     * BeneficiaryDao - Core DAO for beneficiary management
     * Includes duplicate detection queries
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}