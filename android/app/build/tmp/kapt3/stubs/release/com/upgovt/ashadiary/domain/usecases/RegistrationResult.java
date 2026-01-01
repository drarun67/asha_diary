package com.upgovt.ashadiary.domain.usecases;

/**
 * Registration result
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult;", "", "()V", "DuplicatesFound", "Error", "Success", "Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult$DuplicatesFound;", "Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult$Error;", "Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult$Success;", "app_release"})
public abstract class RegistrationResult {
    
    private RegistrationResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0003J/\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult$DuplicatesFound;", "Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult;", "beneficiary", "Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "duplicates", "", "Lkotlin/Pair;", "Lcom/upgovt/ashadiary/domain/duplicate/DuplicateScore;", "(Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;Ljava/util/List;)V", "getBeneficiary", "()Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "getDuplicates", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
    public static final class DuplicatesFound extends com.upgovt.ashadiary.domain.usecases.RegistrationResult {
        @org.jetbrains.annotations.NotNull()
        private final com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>> duplicates = null;
        
        public DuplicatesFound(@org.jetbrains.annotations.NotNull()
        com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, @org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>> duplicates) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity getBeneficiary() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>> getDuplicates() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.domain.usecases.RegistrationResult.DuplicatesFound copy(@org.jetbrains.annotations.NotNull()
        com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary, @org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Pair<com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity, com.upgovt.ashadiary.domain.duplicate.DuplicateScore>> duplicates) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult$Error;", "Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
    public static final class Error extends com.upgovt.ashadiary.domain.usecases.RegistrationResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.domain.usecases.RegistrationResult.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult$Success;", "Lcom/upgovt/ashadiary/domain/usecases/RegistrationResult;", "beneficiary", "Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "(Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;)V", "getBeneficiary", "()Lcom/upgovt/ashadiary/data/local/entities/BeneficiaryEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
    public static final class Success extends com.upgovt.ashadiary.domain.usecases.RegistrationResult {
        @org.jetbrains.annotations.NotNull()
        private final com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity getBeneficiary() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.upgovt.ashadiary.domain.usecases.RegistrationResult.Success copy(@org.jetbrains.annotations.NotNull()
        com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity beneficiary) {
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
}