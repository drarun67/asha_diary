package com.upgovt.ashadiary.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J \u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u001a2\u0006\u0010\n\u001a\u00020\u0005H\'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\'J\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lcom/upgovt/ashadiary/data/local/dao/VaccinationVisitDao;", "", "delete", "", "visitId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByBeneficiary", "", "Lcom/upgovt/ashadiary/data/local/entities/VaccinationVisitEntity;", "beneficiaryId", "getById", "getLatestDoseForVaccine", "vaccineType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnsynced", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVisitsWithAdverseReactions", "insert", "", "visit", "(Lcom/upgovt/ashadiary/data/local/entities/VaccinationVisitEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "visits", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeByBeneficiary", "Lkotlinx/coroutines/flow/Flow;", "observeUnsyncedCount", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface VaccinationVisitDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity visit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity> visits, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM vaccination_visits WHERE id = :visitId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(@org.jetbrains.annotations.NotNull()
    java.lang.String visitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM vaccination_visits WHERE beneficiary_id = :beneficiaryId ORDER BY visit_date DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM vaccination_visits WHERE beneficiary_id = :beneficiaryId ORDER BY visit_date DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity>> observeByBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId);
    
    @androidx.room.Query(value = "SELECT * FROM vaccination_visits WHERE beneficiary_id = :beneficiaryId AND vaccine_type = :vaccineType ORDER BY dose_number DESC LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLatestDoseForVaccine(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    java.lang.String vaccineType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM vaccination_visits WHERE has_adverse_reaction = 1 ORDER BY visit_date DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getVisitsWithAdverseReactions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity>> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity visit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "DELETE FROM vaccination_visits WHERE id = :visitId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.String visitId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM vaccination_visits WHERE is_synced = 0 ORDER BY recorded_at ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnsynced(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM vaccination_visits WHERE is_synced = 0")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> observeUnsyncedCount();
}