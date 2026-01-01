package com.upgovt.ashadiary.utils.biometric;

/**
 * Production-grade matcher interface
 * Implement this with a proper ISO 19794-2 matcher library
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/upgovt/ashadiary/utils/biometric/ISOFingerprintMatcher;", "", "extractMinutiae", "Lcom/upgovt/ashadiary/utils/biometric/MinutiaeData;", "isoTemplate", "", "matchMinutiae", "Lcom/upgovt/ashadiary/utils/biometric/MatchResult;", "minutiae1", "minutiae2", "app_release"})
public abstract interface ISOFingerprintMatcher {
    
    /**
     * Extract minutiae from ISO template
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.utils.biometric.MinutiaeData extractMinutiae(@org.jetbrains.annotations.NotNull()
    byte[] isoTemplate);
    
    /**
     * Match two minutiae sets
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.upgovt.ashadiary.utils.biometric.MatchResult matchMinutiae(@org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.utils.biometric.MinutiaeData minutiae1, @org.jetbrains.annotations.NotNull()
    com.upgovt.ashadiary.utils.biometric.MinutiaeData minutiae2);
}