package com.upgovt.ashadiary.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00182\u0006\u0010\n\u001a\u00020\u0005H\'J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\'J\u0016\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/BPVisitDao;", "", "delete", "", "visitId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByBeneficiary", "", "Lcom/upgovt/ashadiary/data/local/entities/BPVisitEntity;", "beneficiaryId", "getById", "getHighRiskVisits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestVisit", "getUnsynced", "insert", "", "visit", "(Lcom/upgovt/ashadiary/data/local/entities/BPVisitEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "visits", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeByBeneficiary", "Lkotlinx/coroutines/flow/Flow;", "observeUnsyncedCount", "update", "app_release"})
@androidx.room.Dao()
public abstract interface BPVisitDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.BPVisitEntity visit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.BPVisitEntity> visits, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM bp_visits WHERE id = :visitId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(@org.jetbrains.annotations.NotNull()
    java.lang.String visitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.BPVisitEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM bp_visits WHERE beneficiary_id = :beneficiaryId ORDER BY visit_date DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BPVisitEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM bp_visits WHERE beneficiary_id = :beneficiaryId ORDER BY visit_date DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.BPVisitEntity>> observeByBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId);
    
    @androidx.room.Query(value = "SELECT * FROM bp_visits WHERE beneficiary_id = :beneficiaryId ORDER BY visit_date DESC LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLatestVisit(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.BPVisitEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM bp_visits WHERE bp_category IN (\'HIGH_STAGE_2\', \'HYPERTENSIVE_CRISIS\') ORDER BY visit_date DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHighRiskVisits(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BPVisitEntity>> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.BPVisitEntity visit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM bp_visits WHERE id = :visitId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.String visitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM bp_visits WHERE is_synced = 0 ORDER BY recorded_at ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsynced(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BPVisitEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM bp_visits WHERE is_synced = 0")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observeUnsyncedCount();
}