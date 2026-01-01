package com.upgovt.ashadiary.data.repository;

/**
 * BiometricRepository - Manages local biometric data
 *
 * CRITICAL RULES:
 * 1. ALL fingerprint data stays LOCAL ONLY
 * 2. NEVER sync to server
 * 3. Encrypted at database level (SQLCipher)
 * 4. Used for duplicate detection only
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000fJ<\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010\u001eJL\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b%\u0010&J4\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006*"}, d2 = {"Lcom/upgovt/ashadiary/data/repository/BiometricRepository;", "", "biometricDao", "Lcom/upgovt/ashadiary/data/local/dao/BiometricLocalDao;", "beneficiaryDao", "Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;", "matcher", "Lcom/upgovt/ashadiary/utils/biometric/BiometricMatcher;", "(Lcom/upgovt/ashadiary/data/local/dao/BiometricLocalDao;Lcom/upgovt/ashadiary/data/local/dao/BeneficiaryDao;Lcom/upgovt/ashadiary/utils/biometric/BiometricMatcher;)V", "deleteBiometricsForBeneficiary", "Lkotlin/Result;", "", "beneficiaryId", "", "deleteBiometricsForBeneficiary-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBiometricStats", "Lcom/upgovt/ashadiary/data/repository/BiometricStats;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBiometricsForBeneficiary", "", "Lcom/upgovt/ashadiary/data/local/entities/BiometricLocalEntity;", "searchMatchingFingerprints", "Lkotlin/Pair;", "Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "", "queryTemplate", "", "matchThreshold", "maxResults", "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeFingerprintTemplate", "fingerPosition", "isoTemplate", "qualityScore", "capturedByUserId", "deviceSerialNumber", "storeFingerprintTemplate-bMdYcbs", "(Ljava/lang/String;Ljava/lang/String;[BILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyFingerprint", "", "(Ljava/lang/String;[BILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class BiometricRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BiometricLocalDao biometricDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.utils.biometric.BiometricMatcher matcher = null;
    
    public BiometricRepository(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BiometricLocalDao biometricDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.data.local.dao.BeneficiaryDao beneficiaryDao, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.utils.biometric.BiometricMatcher matcher) {
        super();
    }
    
    /**
     * Search for matching fingerprint across ALL beneficiaries
     * Used for duplicate detection during registration
     *
     * @return List of Pair<BeneficiaryEntity, matchScore> sorted by score descending
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchMatchingFingerprints(@org.jetbrains.annotations.NotNull()
    byte[] queryTemplate, int matchThreshold, int maxResults, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, java.lang.Integer>>> $completion) {
        return null;
    }
    
    /**
     * Verify fingerprint against stored templates for a specific beneficiary
     * Used for beneficiary verification/authentication
     *
     * @return Pair<isMatch, matchScore>
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object verifyFingerprint(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    byte[] queryTemplate, int matchThreshold, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.Integer>> $completion) {
        return null;
    }
    
    /**
     * Get all fingerprints for a beneficiary
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBiometricsForBeneficiary(@org.jetbrains.annotations.NotNull()
    java.lang.String beneficiaryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.upgovt.ashadiary.data.local.entities.BiometricLocalEntity>> $completion) {
        return null;
    }
    
    /**
     * Get statistics
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBiometricStats(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.upgovt.ashadiary.data.repository.BiometricStats> $completion) {
        return null;
    }
}