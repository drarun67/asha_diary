package com.upgovt.ashadiary.data.local.entities;

/**
 * VILLAGE Entity
 * Geographic hierarchy for Uttar Pradesh - Agra District
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0011H\u00c6\u0003J\t\u00105\u001a\u00020\u0013H\u00c6\u0003J\t\u00106\u001a\u00020\u0013H\u00c6\u0003J\t\u00107\u001a\u00020\u0011H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u00d0\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\t\u0010D\u001a\u00020EH\u00d6\u0001J\u0013\u0010F\u001a\u00020\u00112\b\u0010G\u001a\u0004\u0018\u00010HH\u00d6\u0003J\t\u0010I\u001a\u00020EH\u00d6\u0001J\t\u0010J\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020EH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010#R\u0011\u0010\u0015\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010#R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a\u00a8\u0006P"}, d2 = {"Lcom/upgovt/ashadiary/data/local/entities/VillageEntity;", "Landroid/os/Parcelable;", "id", "", "state_code", "district_code", "block_code", "village_code", "village_name_hindi", "block_name_hindi", "district_name_hindi", "state_name_hindi", "village_name_english", "block_name_english", "district_name_english", "state_name_english", "is_active", "", "created_at", "", "updated_at", "is_synced", "last_synced_at", "server_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJZLjava/lang/Long;Ljava/lang/String;)V", "getBlock_code", "()Ljava/lang/String;", "getBlock_name_english", "getBlock_name_hindi", "getCreated_at", "()J", "getDistrict_code", "getDistrict_name_english", "getDistrict_name_hindi", "getId", "()Z", "getLast_synced_at", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getServer_id", "getState_code", "getState_name_english", "getState_name_hindi", "getUpdated_at", "getVillage_code", "getVillage_name_english", "getVillage_name_hindi", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJZLjava/lang/Long;Ljava/lang/String;)Lcom/upgovt/ashadiary/data/local/entities/VillageEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
@androidx.room.Entity(tableName = "villages", indices = {@androidx.room.Index(value = {"state_code", "district_code", "block_code", "village_code"}, unique = true), @androidx.room.Index(value = {"block_code"})})
@kotlinx.parcelize.Parcelize()
public final class VillageEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String state_code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String district_code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String block_code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String village_code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String village_name_hindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String block_name_hindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String district_name_hindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String state_name_hindi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String village_name_english = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String block_name_english = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String district_name_english = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String state_name_english = null;
    private final boolean is_active = false;
    private final long created_at = 0L;
    private final long updated_at = 0L;
    private final boolean is_synced = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long last_synced_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String server_id = null;
    
    public VillageEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String state_code, @org.jetbrains.annotations.NotNull()
    java.lang.String district_code, @org.jetbrains.annotations.NotNull()
    java.lang.String block_code, @org.jetbrains.annotations.NotNull()
    java.lang.String village_code, @org.jetbrains.annotations.NotNull()
    java.lang.String village_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String block_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String district_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String state_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String village_name_english, @org.jetbrains.annotations.NotNull()
    java.lang.String block_name_english, @org.jetbrains.annotations.NotNull()
    java.lang.String district_name_english, @org.jetbrains.annotations.NotNull()
    java.lang.String state_name_english, boolean is_active, long created_at, long updated_at, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at, @org.jetbrains.annotations.Nullable()
    java.lang.String server_id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState_code() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrict_code() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlock_code() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVillage_code() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVillage_name_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlock_name_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrict_name_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState_name_hindi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVillage_name_english() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlock_name_english() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrict_name_english() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState_name_english() {
        return null;
    }
    
    public final boolean is_active() {
        return false;
    }
    
    public final long getCreated_at() {
        return 0L;
    }
    
    public final long getUpdated_at() {
        return 0L;
    }
    
    public final boolean is_synced() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLast_synced_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getServer_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final long component15() {
        return 0L;
    }
    
    public final long component16() {
        return 0L;
    }
    
    public final boolean component17() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upgovt.ashadiary.data.local.entities.VillageEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String state_code, @org.jetbrains.annotations.NotNull()
    java.lang.String district_code, @org.jetbrains.annotations.NotNull()
    java.lang.String block_code, @org.jetbrains.annotations.NotNull()
    java.lang.String village_code, @org.jetbrains.annotations.NotNull()
    java.lang.String village_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String block_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String district_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String state_name_hindi, @org.jetbrains.annotations.NotNull()
    java.lang.String village_name_english, @org.jetbrains.annotations.NotNull()
    java.lang.String block_name_english, @org.jetbrains.annotations.NotNull()
    java.lang.String district_name_english, @org.jetbrains.annotations.NotNull()
    java.lang.String state_name_english, boolean is_active, long created_at, long updated_at, boolean is_synced, @org.jetbrains.annotations.Nullable()
    java.lang.Long last_synced_at, @org.jetbrains.annotations.Nullable()
    java.lang.String server_id) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
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
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
}