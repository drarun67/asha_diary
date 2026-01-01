package com.upgovt.ashadiary.data.local.entities;

/**
 * Priority levels for sync queue
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/SyncPriority;", "", "()V", "AUDIT_LOG", "", "BENEFICIARY", "DEFAULT", "DUPLICATE_FLAG", "EDIT_REQUEST", "HEALTH_VISIT", "USER_DATA", "VILLAGE_DATA", "app_release"})
public final class SyncPriority {
    public static final int AUDIT_LOG = 10;
    public static final int BENEFICIARY = 8;
    public static final int HEALTH_VISIT = 7;
    public static final int EDIT_REQUEST = 6;
    public static final int DUPLICATE_FLAG = 5;
    public static final int USER_DATA = 4;
    public static final int VILLAGE_DATA = 3;
    public static final int DEFAULT = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.upgovt.ashadiary.data.local.entities.SyncPriority INSTANCE = null;
    
    private SyncPriority() {
        super();
    }
}