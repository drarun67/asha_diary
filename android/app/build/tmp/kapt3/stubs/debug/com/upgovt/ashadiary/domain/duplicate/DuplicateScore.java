package com.upgovt.ashadiary.domain.duplicate;

/**
 * Duplicate score result
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\"\u001a\u00020\rH\u00c6\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015\u00a8\u0006("}, d2 = {"Lcom/upgovt/ashadiary/domain/duplicate/DuplicateScore;", "", "totalScore", "", "nameScore", "villageMatch", "", "genderMatch", "ageScore", "biometricScore", "confidence", "Lcom/upgovt/ashadiary/domain/duplicate/DuplicateConfidence;", "recommendation", "", "(IIZZIILcom/upgovt/ashadiary/domain/duplicate/DuplicateConfidence;Ljava/lang/String;)V", "getAgeScore", "()I", "getBiometricScore", "getConfidence", "()Lcom/upgovt/ashadiary/domain/duplicate/DuplicateConfidence;", "getGenderMatch", "()Z", "getNameScore", "getRecommendation", "()Ljava/lang/String;", "getTotalScore", "getVillageMatch", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class DuplicateScore {
    private final int totalScore = 0;
    private final int nameScore = 0;
    private final boolean villageMatch = false;
    private final boolean genderMatch = false;
    private final int ageScore = 0;
    private final int biometricScore = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.upgovt.ashadiary.domain.duplicate.DuplicateConfidence confidence = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String recommendation = null;
    
    public DuplicateScore(int totalScore, int nameScore, boolean villageMatch, boolean genderMatch, int ageScore, int biometricScore, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.domain.duplicate.DuplicateConfidence confidence, @org.jetbrains.annotations.NotNull()
    java.lang.String recommendation) {
        super();
    }
    
    public final int getTotalScore() {
        return 0;
    }
    
    public final int getNameScore() {
        return 0;
    }
    
    public final boolean getVillageMatch() {
        return false;
    }
    
    public final boolean getGenderMatch() {
        return false;
    }
    
    public final int getAgeScore() {
        return 0;
    }
    
    public final int getBiometricScore() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.domain.duplicate.DuplicateConfidence getConfidence() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRecommendation() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.domain.duplicate.DuplicateConfidence component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.domain.duplicate.DuplicateScore copy(int totalScore, int nameScore, boolean villageMatch, boolean genderMatch, int ageScore, int biometricScore, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.domain.duplicate.DuplicateConfidence confidence, @org.jetbrains.annotations.NotNull()
    java.lang.String recommendation) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}