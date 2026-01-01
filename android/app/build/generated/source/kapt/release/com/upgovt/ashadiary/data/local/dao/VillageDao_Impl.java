package com.upgovt.ashadiary.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.upgovt.ashadiary.data.local.entities.VillageEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class VillageDao_Impl implements VillageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<VillageEntity> __insertionAdapterOfVillageEntity;

  private final EntityDeletionOrUpdateAdapter<VillageEntity> __updateAdapterOfVillageEntity;

  public VillageDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVillageEntity = new EntityInsertionAdapter<VillageEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `villages` (`id`,`state_code`,`district_code`,`block_code`,`village_code`,`village_name_hindi`,`block_name_hindi`,`district_name_hindi`,`state_name_hindi`,`village_name_english`,`block_name_english`,`district_name_english`,`state_name_english`,`is_active`,`created_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final VillageEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getState_code() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getState_code());
        }
        if (entity.getDistrict_code() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDistrict_code());
        }
        if (entity.getBlock_code() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getBlock_code());
        }
        if (entity.getVillage_code() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getVillage_code());
        }
        if (entity.getVillage_name_hindi() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getVillage_name_hindi());
        }
        if (entity.getBlock_name_hindi() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getBlock_name_hindi());
        }
        if (entity.getDistrict_name_hindi() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getDistrict_name_hindi());
        }
        if (entity.getState_name_hindi() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getState_name_hindi());
        }
        if (entity.getVillage_name_english() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getVillage_name_english());
        }
        if (entity.getBlock_name_english() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getBlock_name_english());
        }
        if (entity.getDistrict_name_english() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getDistrict_name_english());
        }
        if (entity.getState_name_english() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getState_name_english());
        }
        final int _tmp = entity.is_active() ? 1 : 0;
        statement.bindLong(14, _tmp);
        statement.bindLong(15, entity.getCreated_at());
        statement.bindLong(16, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(17, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(18);
        } else {
          statement.bindLong(18, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getServer_id());
        }
      }
    };
    this.__updateAdapterOfVillageEntity = new EntityDeletionOrUpdateAdapter<VillageEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `villages` SET `id` = ?,`state_code` = ?,`district_code` = ?,`block_code` = ?,`village_code` = ?,`village_name_hindi` = ?,`block_name_hindi` = ?,`district_name_hindi` = ?,`state_name_hindi` = ?,`village_name_english` = ?,`block_name_english` = ?,`district_name_english` = ?,`state_name_english` = ?,`is_active` = ?,`created_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final VillageEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getState_code() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getState_code());
        }
        if (entity.getDistrict_code() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDistrict_code());
        }
        if (entity.getBlock_code() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getBlock_code());
        }
        if (entity.getVillage_code() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getVillage_code());
        }
        if (entity.getVillage_name_hindi() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getVillage_name_hindi());
        }
        if (entity.getBlock_name_hindi() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getBlock_name_hindi());
        }
        if (entity.getDistrict_name_hindi() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getDistrict_name_hindi());
        }
        if (entity.getState_name_hindi() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getState_name_hindi());
        }
        if (entity.getVillage_name_english() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getVillage_name_english());
        }
        if (entity.getBlock_name_english() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getBlock_name_english());
        }
        if (entity.getDistrict_name_english() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getDistrict_name_english());
        }
        if (entity.getState_name_english() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getState_name_english());
        }
        final int _tmp = entity.is_active() ? 1 : 0;
        statement.bindLong(14, _tmp);
        statement.bindLong(15, entity.getCreated_at());
        statement.bindLong(16, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(17, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(18);
        } else {
          statement.bindLong(18, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getServer_id());
        }
        if (entity.getId() == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final VillageEntity village, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfVillageEntity.insertAndReturnId(village);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<VillageEntity> villages,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfVillageEntity.insertAndReturnIdsList(villages);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final VillageEntity village,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfVillageEntity.handle(village);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getById(final String villageId,
      final Continuation<? super VillageEntity> $completion) {
    final String _sql = "SELECT * FROM villages WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (villageId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, villageId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<VillageEntity>() {
      @Override
      @Nullable
      public VillageEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "district_code");
          final int _cursorIndexOfBlockCode = CursorUtil.getColumnIndexOrThrow(_cursor, "block_code");
          final int _cursorIndexOfVillageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "village_code");
          final int _cursorIndexOfVillageNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_hindi");
          final int _cursorIndexOfBlockNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_hindi");
          final int _cursorIndexOfDistrictNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_hindi");
          final int _cursorIndexOfStateNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_hindi");
          final int _cursorIndexOfVillageNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_english");
          final int _cursorIndexOfBlockNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_english");
          final int _cursorIndexOfDistrictNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_english");
          final int _cursorIndexOfStateNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_english");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final VillageEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpState_code;
            if (_cursor.isNull(_cursorIndexOfStateCode)) {
              _tmpState_code = null;
            } else {
              _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
            }
            final String _tmpDistrict_code;
            if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
              _tmpDistrict_code = null;
            } else {
              _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
            }
            final String _tmpBlock_code;
            if (_cursor.isNull(_cursorIndexOfBlockCode)) {
              _tmpBlock_code = null;
            } else {
              _tmpBlock_code = _cursor.getString(_cursorIndexOfBlockCode);
            }
            final String _tmpVillage_code;
            if (_cursor.isNull(_cursorIndexOfVillageCode)) {
              _tmpVillage_code = null;
            } else {
              _tmpVillage_code = _cursor.getString(_cursorIndexOfVillageCode);
            }
            final String _tmpVillage_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVillageNameHindi)) {
              _tmpVillage_name_hindi = null;
            } else {
              _tmpVillage_name_hindi = _cursor.getString(_cursorIndexOfVillageNameHindi);
            }
            final String _tmpBlock_name_hindi;
            if (_cursor.isNull(_cursorIndexOfBlockNameHindi)) {
              _tmpBlock_name_hindi = null;
            } else {
              _tmpBlock_name_hindi = _cursor.getString(_cursorIndexOfBlockNameHindi);
            }
            final String _tmpDistrict_name_hindi;
            if (_cursor.isNull(_cursorIndexOfDistrictNameHindi)) {
              _tmpDistrict_name_hindi = null;
            } else {
              _tmpDistrict_name_hindi = _cursor.getString(_cursorIndexOfDistrictNameHindi);
            }
            final String _tmpState_name_hindi;
            if (_cursor.isNull(_cursorIndexOfStateNameHindi)) {
              _tmpState_name_hindi = null;
            } else {
              _tmpState_name_hindi = _cursor.getString(_cursorIndexOfStateNameHindi);
            }
            final String _tmpVillage_name_english;
            if (_cursor.isNull(_cursorIndexOfVillageNameEnglish)) {
              _tmpVillage_name_english = null;
            } else {
              _tmpVillage_name_english = _cursor.getString(_cursorIndexOfVillageNameEnglish);
            }
            final String _tmpBlock_name_english;
            if (_cursor.isNull(_cursorIndexOfBlockNameEnglish)) {
              _tmpBlock_name_english = null;
            } else {
              _tmpBlock_name_english = _cursor.getString(_cursorIndexOfBlockNameEnglish);
            }
            final String _tmpDistrict_name_english;
            if (_cursor.isNull(_cursorIndexOfDistrictNameEnglish)) {
              _tmpDistrict_name_english = null;
            } else {
              _tmpDistrict_name_english = _cursor.getString(_cursorIndexOfDistrictNameEnglish);
            }
            final String _tmpState_name_english;
            if (_cursor.isNull(_cursorIndexOfStateNameEnglish)) {
              _tmpState_name_english = null;
            } else {
              _tmpState_name_english = _cursor.getString(_cursorIndexOfStateNameEnglish);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_1 != 0;
            final Long _tmpLast_synced_at;
            if (_cursor.isNull(_cursorIndexOfLastSyncedAt)) {
              _tmpLast_synced_at = null;
            } else {
              _tmpLast_synced_at = _cursor.getLong(_cursorIndexOfLastSyncedAt);
            }
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _result = new VillageEntity(_tmpId,_tmpState_code,_tmpDistrict_code,_tmpBlock_code,_tmpVillage_code,_tmpVillage_name_hindi,_tmpBlock_name_hindi,_tmpDistrict_name_hindi,_tmpState_name_hindi,_tmpVillage_name_english,_tmpBlock_name_english,_tmpDistrict_name_english,_tmpState_name_english,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getByBlock(final String blockCode,
      final Continuation<? super List<VillageEntity>> $completion) {
    final String _sql = "SELECT * FROM villages WHERE block_code = ? AND is_active = 1 ORDER BY village_name_hindi ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (blockCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, blockCode);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VillageEntity>>() {
      @Override
      @NonNull
      public List<VillageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "district_code");
          final int _cursorIndexOfBlockCode = CursorUtil.getColumnIndexOrThrow(_cursor, "block_code");
          final int _cursorIndexOfVillageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "village_code");
          final int _cursorIndexOfVillageNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_hindi");
          final int _cursorIndexOfBlockNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_hindi");
          final int _cursorIndexOfDistrictNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_hindi");
          final int _cursorIndexOfStateNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_hindi");
          final int _cursorIndexOfVillageNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_english");
          final int _cursorIndexOfBlockNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_english");
          final int _cursorIndexOfDistrictNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_english");
          final int _cursorIndexOfStateNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_english");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<VillageEntity> _result = new ArrayList<VillageEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VillageEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpState_code;
            if (_cursor.isNull(_cursorIndexOfStateCode)) {
              _tmpState_code = null;
            } else {
              _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
            }
            final String _tmpDistrict_code;
            if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
              _tmpDistrict_code = null;
            } else {
              _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
            }
            final String _tmpBlock_code;
            if (_cursor.isNull(_cursorIndexOfBlockCode)) {
              _tmpBlock_code = null;
            } else {
              _tmpBlock_code = _cursor.getString(_cursorIndexOfBlockCode);
            }
            final String _tmpVillage_code;
            if (_cursor.isNull(_cursorIndexOfVillageCode)) {
              _tmpVillage_code = null;
            } else {
              _tmpVillage_code = _cursor.getString(_cursorIndexOfVillageCode);
            }
            final String _tmpVillage_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVillageNameHindi)) {
              _tmpVillage_name_hindi = null;
            } else {
              _tmpVillage_name_hindi = _cursor.getString(_cursorIndexOfVillageNameHindi);
            }
            final String _tmpBlock_name_hindi;
            if (_cursor.isNull(_cursorIndexOfBlockNameHindi)) {
              _tmpBlock_name_hindi = null;
            } else {
              _tmpBlock_name_hindi = _cursor.getString(_cursorIndexOfBlockNameHindi);
            }
            final String _tmpDistrict_name_hindi;
            if (_cursor.isNull(_cursorIndexOfDistrictNameHindi)) {
              _tmpDistrict_name_hindi = null;
            } else {
              _tmpDistrict_name_hindi = _cursor.getString(_cursorIndexOfDistrictNameHindi);
            }
            final String _tmpState_name_hindi;
            if (_cursor.isNull(_cursorIndexOfStateNameHindi)) {
              _tmpState_name_hindi = null;
            } else {
              _tmpState_name_hindi = _cursor.getString(_cursorIndexOfStateNameHindi);
            }
            final String _tmpVillage_name_english;
            if (_cursor.isNull(_cursorIndexOfVillageNameEnglish)) {
              _tmpVillage_name_english = null;
            } else {
              _tmpVillage_name_english = _cursor.getString(_cursorIndexOfVillageNameEnglish);
            }
            final String _tmpBlock_name_english;
            if (_cursor.isNull(_cursorIndexOfBlockNameEnglish)) {
              _tmpBlock_name_english = null;
            } else {
              _tmpBlock_name_english = _cursor.getString(_cursorIndexOfBlockNameEnglish);
            }
            final String _tmpDistrict_name_english;
            if (_cursor.isNull(_cursorIndexOfDistrictNameEnglish)) {
              _tmpDistrict_name_english = null;
            } else {
              _tmpDistrict_name_english = _cursor.getString(_cursorIndexOfDistrictNameEnglish);
            }
            final String _tmpState_name_english;
            if (_cursor.isNull(_cursorIndexOfStateNameEnglish)) {
              _tmpState_name_english = null;
            } else {
              _tmpState_name_english = _cursor.getString(_cursorIndexOfStateNameEnglish);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_1 != 0;
            final Long _tmpLast_synced_at;
            if (_cursor.isNull(_cursorIndexOfLastSyncedAt)) {
              _tmpLast_synced_at = null;
            } else {
              _tmpLast_synced_at = _cursor.getLong(_cursorIndexOfLastSyncedAt);
            }
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item = new VillageEntity(_tmpId,_tmpState_code,_tmpDistrict_code,_tmpBlock_code,_tmpVillage_code,_tmpVillage_name_hindi,_tmpBlock_name_hindi,_tmpDistrict_name_hindi,_tmpState_name_hindi,_tmpVillage_name_english,_tmpBlock_name_english,_tmpDistrict_name_english,_tmpState_name_english,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getByDistrict(final String districtCode,
      final Continuation<? super List<VillageEntity>> $completion) {
    final String _sql = "SELECT * FROM villages WHERE district_code = ? AND is_active = 1 ORDER BY village_name_hindi ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (districtCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, districtCode);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VillageEntity>>() {
      @Override
      @NonNull
      public List<VillageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "district_code");
          final int _cursorIndexOfBlockCode = CursorUtil.getColumnIndexOrThrow(_cursor, "block_code");
          final int _cursorIndexOfVillageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "village_code");
          final int _cursorIndexOfVillageNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_hindi");
          final int _cursorIndexOfBlockNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_hindi");
          final int _cursorIndexOfDistrictNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_hindi");
          final int _cursorIndexOfStateNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_hindi");
          final int _cursorIndexOfVillageNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_english");
          final int _cursorIndexOfBlockNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_english");
          final int _cursorIndexOfDistrictNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_english");
          final int _cursorIndexOfStateNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_english");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<VillageEntity> _result = new ArrayList<VillageEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VillageEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpState_code;
            if (_cursor.isNull(_cursorIndexOfStateCode)) {
              _tmpState_code = null;
            } else {
              _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
            }
            final String _tmpDistrict_code;
            if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
              _tmpDistrict_code = null;
            } else {
              _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
            }
            final String _tmpBlock_code;
            if (_cursor.isNull(_cursorIndexOfBlockCode)) {
              _tmpBlock_code = null;
            } else {
              _tmpBlock_code = _cursor.getString(_cursorIndexOfBlockCode);
            }
            final String _tmpVillage_code;
            if (_cursor.isNull(_cursorIndexOfVillageCode)) {
              _tmpVillage_code = null;
            } else {
              _tmpVillage_code = _cursor.getString(_cursorIndexOfVillageCode);
            }
            final String _tmpVillage_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVillageNameHindi)) {
              _tmpVillage_name_hindi = null;
            } else {
              _tmpVillage_name_hindi = _cursor.getString(_cursorIndexOfVillageNameHindi);
            }
            final String _tmpBlock_name_hindi;
            if (_cursor.isNull(_cursorIndexOfBlockNameHindi)) {
              _tmpBlock_name_hindi = null;
            } else {
              _tmpBlock_name_hindi = _cursor.getString(_cursorIndexOfBlockNameHindi);
            }
            final String _tmpDistrict_name_hindi;
            if (_cursor.isNull(_cursorIndexOfDistrictNameHindi)) {
              _tmpDistrict_name_hindi = null;
            } else {
              _tmpDistrict_name_hindi = _cursor.getString(_cursorIndexOfDistrictNameHindi);
            }
            final String _tmpState_name_hindi;
            if (_cursor.isNull(_cursorIndexOfStateNameHindi)) {
              _tmpState_name_hindi = null;
            } else {
              _tmpState_name_hindi = _cursor.getString(_cursorIndexOfStateNameHindi);
            }
            final String _tmpVillage_name_english;
            if (_cursor.isNull(_cursorIndexOfVillageNameEnglish)) {
              _tmpVillage_name_english = null;
            } else {
              _tmpVillage_name_english = _cursor.getString(_cursorIndexOfVillageNameEnglish);
            }
            final String _tmpBlock_name_english;
            if (_cursor.isNull(_cursorIndexOfBlockNameEnglish)) {
              _tmpBlock_name_english = null;
            } else {
              _tmpBlock_name_english = _cursor.getString(_cursorIndexOfBlockNameEnglish);
            }
            final String _tmpDistrict_name_english;
            if (_cursor.isNull(_cursorIndexOfDistrictNameEnglish)) {
              _tmpDistrict_name_english = null;
            } else {
              _tmpDistrict_name_english = _cursor.getString(_cursorIndexOfDistrictNameEnglish);
            }
            final String _tmpState_name_english;
            if (_cursor.isNull(_cursorIndexOfStateNameEnglish)) {
              _tmpState_name_english = null;
            } else {
              _tmpState_name_english = _cursor.getString(_cursorIndexOfStateNameEnglish);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_1 != 0;
            final Long _tmpLast_synced_at;
            if (_cursor.isNull(_cursorIndexOfLastSyncedAt)) {
              _tmpLast_synced_at = null;
            } else {
              _tmpLast_synced_at = _cursor.getLong(_cursorIndexOfLastSyncedAt);
            }
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item = new VillageEntity(_tmpId,_tmpState_code,_tmpDistrict_code,_tmpBlock_code,_tmpVillage_code,_tmpVillage_name_hindi,_tmpBlock_name_hindi,_tmpDistrict_name_hindi,_tmpState_name_hindi,_tmpVillage_name_english,_tmpBlock_name_english,_tmpDistrict_name_english,_tmpState_name_english,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllActive(final Continuation<? super List<VillageEntity>> $completion) {
    final String _sql = "SELECT * FROM villages WHERE is_active = 1 ORDER BY village_name_hindi ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VillageEntity>>() {
      @Override
      @NonNull
      public List<VillageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "district_code");
          final int _cursorIndexOfBlockCode = CursorUtil.getColumnIndexOrThrow(_cursor, "block_code");
          final int _cursorIndexOfVillageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "village_code");
          final int _cursorIndexOfVillageNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_hindi");
          final int _cursorIndexOfBlockNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_hindi");
          final int _cursorIndexOfDistrictNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_hindi");
          final int _cursorIndexOfStateNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_hindi");
          final int _cursorIndexOfVillageNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_english");
          final int _cursorIndexOfBlockNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_english");
          final int _cursorIndexOfDistrictNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_english");
          final int _cursorIndexOfStateNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_english");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<VillageEntity> _result = new ArrayList<VillageEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VillageEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpState_code;
            if (_cursor.isNull(_cursorIndexOfStateCode)) {
              _tmpState_code = null;
            } else {
              _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
            }
            final String _tmpDistrict_code;
            if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
              _tmpDistrict_code = null;
            } else {
              _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
            }
            final String _tmpBlock_code;
            if (_cursor.isNull(_cursorIndexOfBlockCode)) {
              _tmpBlock_code = null;
            } else {
              _tmpBlock_code = _cursor.getString(_cursorIndexOfBlockCode);
            }
            final String _tmpVillage_code;
            if (_cursor.isNull(_cursorIndexOfVillageCode)) {
              _tmpVillage_code = null;
            } else {
              _tmpVillage_code = _cursor.getString(_cursorIndexOfVillageCode);
            }
            final String _tmpVillage_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVillageNameHindi)) {
              _tmpVillage_name_hindi = null;
            } else {
              _tmpVillage_name_hindi = _cursor.getString(_cursorIndexOfVillageNameHindi);
            }
            final String _tmpBlock_name_hindi;
            if (_cursor.isNull(_cursorIndexOfBlockNameHindi)) {
              _tmpBlock_name_hindi = null;
            } else {
              _tmpBlock_name_hindi = _cursor.getString(_cursorIndexOfBlockNameHindi);
            }
            final String _tmpDistrict_name_hindi;
            if (_cursor.isNull(_cursorIndexOfDistrictNameHindi)) {
              _tmpDistrict_name_hindi = null;
            } else {
              _tmpDistrict_name_hindi = _cursor.getString(_cursorIndexOfDistrictNameHindi);
            }
            final String _tmpState_name_hindi;
            if (_cursor.isNull(_cursorIndexOfStateNameHindi)) {
              _tmpState_name_hindi = null;
            } else {
              _tmpState_name_hindi = _cursor.getString(_cursorIndexOfStateNameHindi);
            }
            final String _tmpVillage_name_english;
            if (_cursor.isNull(_cursorIndexOfVillageNameEnglish)) {
              _tmpVillage_name_english = null;
            } else {
              _tmpVillage_name_english = _cursor.getString(_cursorIndexOfVillageNameEnglish);
            }
            final String _tmpBlock_name_english;
            if (_cursor.isNull(_cursorIndexOfBlockNameEnglish)) {
              _tmpBlock_name_english = null;
            } else {
              _tmpBlock_name_english = _cursor.getString(_cursorIndexOfBlockNameEnglish);
            }
            final String _tmpDistrict_name_english;
            if (_cursor.isNull(_cursorIndexOfDistrictNameEnglish)) {
              _tmpDistrict_name_english = null;
            } else {
              _tmpDistrict_name_english = _cursor.getString(_cursorIndexOfDistrictNameEnglish);
            }
            final String _tmpState_name_english;
            if (_cursor.isNull(_cursorIndexOfStateNameEnglish)) {
              _tmpState_name_english = null;
            } else {
              _tmpState_name_english = _cursor.getString(_cursorIndexOfStateNameEnglish);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_1 != 0;
            final Long _tmpLast_synced_at;
            if (_cursor.isNull(_cursorIndexOfLastSyncedAt)) {
              _tmpLast_synced_at = null;
            } else {
              _tmpLast_synced_at = _cursor.getLong(_cursorIndexOfLastSyncedAt);
            }
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item = new VillageEntity(_tmpId,_tmpState_code,_tmpDistrict_code,_tmpBlock_code,_tmpVillage_code,_tmpVillage_name_hindi,_tmpBlock_name_hindi,_tmpDistrict_name_hindi,_tmpState_name_hindi,_tmpVillage_name_english,_tmpBlock_name_english,_tmpDistrict_name_english,_tmpState_name_english,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<VillageEntity>> observeAllActive() {
    final String _sql = "SELECT * FROM villages WHERE is_active = 1 ORDER BY village_name_hindi ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"villages"}, new Callable<List<VillageEntity>>() {
      @Override
      @NonNull
      public List<VillageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "district_code");
          final int _cursorIndexOfBlockCode = CursorUtil.getColumnIndexOrThrow(_cursor, "block_code");
          final int _cursorIndexOfVillageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "village_code");
          final int _cursorIndexOfVillageNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_hindi");
          final int _cursorIndexOfBlockNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_hindi");
          final int _cursorIndexOfDistrictNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_hindi");
          final int _cursorIndexOfStateNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_hindi");
          final int _cursorIndexOfVillageNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_english");
          final int _cursorIndexOfBlockNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_english");
          final int _cursorIndexOfDistrictNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_english");
          final int _cursorIndexOfStateNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_english");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<VillageEntity> _result = new ArrayList<VillageEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VillageEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpState_code;
            if (_cursor.isNull(_cursorIndexOfStateCode)) {
              _tmpState_code = null;
            } else {
              _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
            }
            final String _tmpDistrict_code;
            if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
              _tmpDistrict_code = null;
            } else {
              _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
            }
            final String _tmpBlock_code;
            if (_cursor.isNull(_cursorIndexOfBlockCode)) {
              _tmpBlock_code = null;
            } else {
              _tmpBlock_code = _cursor.getString(_cursorIndexOfBlockCode);
            }
            final String _tmpVillage_code;
            if (_cursor.isNull(_cursorIndexOfVillageCode)) {
              _tmpVillage_code = null;
            } else {
              _tmpVillage_code = _cursor.getString(_cursorIndexOfVillageCode);
            }
            final String _tmpVillage_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVillageNameHindi)) {
              _tmpVillage_name_hindi = null;
            } else {
              _tmpVillage_name_hindi = _cursor.getString(_cursorIndexOfVillageNameHindi);
            }
            final String _tmpBlock_name_hindi;
            if (_cursor.isNull(_cursorIndexOfBlockNameHindi)) {
              _tmpBlock_name_hindi = null;
            } else {
              _tmpBlock_name_hindi = _cursor.getString(_cursorIndexOfBlockNameHindi);
            }
            final String _tmpDistrict_name_hindi;
            if (_cursor.isNull(_cursorIndexOfDistrictNameHindi)) {
              _tmpDistrict_name_hindi = null;
            } else {
              _tmpDistrict_name_hindi = _cursor.getString(_cursorIndexOfDistrictNameHindi);
            }
            final String _tmpState_name_hindi;
            if (_cursor.isNull(_cursorIndexOfStateNameHindi)) {
              _tmpState_name_hindi = null;
            } else {
              _tmpState_name_hindi = _cursor.getString(_cursorIndexOfStateNameHindi);
            }
            final String _tmpVillage_name_english;
            if (_cursor.isNull(_cursorIndexOfVillageNameEnglish)) {
              _tmpVillage_name_english = null;
            } else {
              _tmpVillage_name_english = _cursor.getString(_cursorIndexOfVillageNameEnglish);
            }
            final String _tmpBlock_name_english;
            if (_cursor.isNull(_cursorIndexOfBlockNameEnglish)) {
              _tmpBlock_name_english = null;
            } else {
              _tmpBlock_name_english = _cursor.getString(_cursorIndexOfBlockNameEnglish);
            }
            final String _tmpDistrict_name_english;
            if (_cursor.isNull(_cursorIndexOfDistrictNameEnglish)) {
              _tmpDistrict_name_english = null;
            } else {
              _tmpDistrict_name_english = _cursor.getString(_cursorIndexOfDistrictNameEnglish);
            }
            final String _tmpState_name_english;
            if (_cursor.isNull(_cursorIndexOfStateNameEnglish)) {
              _tmpState_name_english = null;
            } else {
              _tmpState_name_english = _cursor.getString(_cursorIndexOfStateNameEnglish);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_1 != 0;
            final Long _tmpLast_synced_at;
            if (_cursor.isNull(_cursorIndexOfLastSyncedAt)) {
              _tmpLast_synced_at = null;
            } else {
              _tmpLast_synced_at = _cursor.getLong(_cursorIndexOfLastSyncedAt);
            }
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item = new VillageEntity(_tmpId,_tmpState_code,_tmpDistrict_code,_tmpBlock_code,_tmpVillage_code,_tmpVillage_name_hindi,_tmpBlock_name_hindi,_tmpDistrict_name_hindi,_tmpState_name_hindi,_tmpVillage_name_english,_tmpBlock_name_english,_tmpDistrict_name_english,_tmpState_name_english,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object searchVillages(final String query, final int limit,
      final Continuation<? super List<VillageEntity>> $completion) {
    final String _sql = "SELECT * FROM villages WHERE village_name_hindi LIKE '%' || ? || '%' AND is_active = 1 LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VillageEntity>>() {
      @Override
      @NonNull
      public List<VillageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "district_code");
          final int _cursorIndexOfBlockCode = CursorUtil.getColumnIndexOrThrow(_cursor, "block_code");
          final int _cursorIndexOfVillageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "village_code");
          final int _cursorIndexOfVillageNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_hindi");
          final int _cursorIndexOfBlockNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_hindi");
          final int _cursorIndexOfDistrictNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_hindi");
          final int _cursorIndexOfStateNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_hindi");
          final int _cursorIndexOfVillageNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_english");
          final int _cursorIndexOfBlockNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_english");
          final int _cursorIndexOfDistrictNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_english");
          final int _cursorIndexOfStateNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_english");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<VillageEntity> _result = new ArrayList<VillageEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VillageEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpState_code;
            if (_cursor.isNull(_cursorIndexOfStateCode)) {
              _tmpState_code = null;
            } else {
              _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
            }
            final String _tmpDistrict_code;
            if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
              _tmpDistrict_code = null;
            } else {
              _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
            }
            final String _tmpBlock_code;
            if (_cursor.isNull(_cursorIndexOfBlockCode)) {
              _tmpBlock_code = null;
            } else {
              _tmpBlock_code = _cursor.getString(_cursorIndexOfBlockCode);
            }
            final String _tmpVillage_code;
            if (_cursor.isNull(_cursorIndexOfVillageCode)) {
              _tmpVillage_code = null;
            } else {
              _tmpVillage_code = _cursor.getString(_cursorIndexOfVillageCode);
            }
            final String _tmpVillage_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVillageNameHindi)) {
              _tmpVillage_name_hindi = null;
            } else {
              _tmpVillage_name_hindi = _cursor.getString(_cursorIndexOfVillageNameHindi);
            }
            final String _tmpBlock_name_hindi;
            if (_cursor.isNull(_cursorIndexOfBlockNameHindi)) {
              _tmpBlock_name_hindi = null;
            } else {
              _tmpBlock_name_hindi = _cursor.getString(_cursorIndexOfBlockNameHindi);
            }
            final String _tmpDistrict_name_hindi;
            if (_cursor.isNull(_cursorIndexOfDistrictNameHindi)) {
              _tmpDistrict_name_hindi = null;
            } else {
              _tmpDistrict_name_hindi = _cursor.getString(_cursorIndexOfDistrictNameHindi);
            }
            final String _tmpState_name_hindi;
            if (_cursor.isNull(_cursorIndexOfStateNameHindi)) {
              _tmpState_name_hindi = null;
            } else {
              _tmpState_name_hindi = _cursor.getString(_cursorIndexOfStateNameHindi);
            }
            final String _tmpVillage_name_english;
            if (_cursor.isNull(_cursorIndexOfVillageNameEnglish)) {
              _tmpVillage_name_english = null;
            } else {
              _tmpVillage_name_english = _cursor.getString(_cursorIndexOfVillageNameEnglish);
            }
            final String _tmpBlock_name_english;
            if (_cursor.isNull(_cursorIndexOfBlockNameEnglish)) {
              _tmpBlock_name_english = null;
            } else {
              _tmpBlock_name_english = _cursor.getString(_cursorIndexOfBlockNameEnglish);
            }
            final String _tmpDistrict_name_english;
            if (_cursor.isNull(_cursorIndexOfDistrictNameEnglish)) {
              _tmpDistrict_name_english = null;
            } else {
              _tmpDistrict_name_english = _cursor.getString(_cursorIndexOfDistrictNameEnglish);
            }
            final String _tmpState_name_english;
            if (_cursor.isNull(_cursorIndexOfStateNameEnglish)) {
              _tmpState_name_english = null;
            } else {
              _tmpState_name_english = _cursor.getString(_cursorIndexOfStateNameEnglish);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_1 != 0;
            final Long _tmpLast_synced_at;
            if (_cursor.isNull(_cursorIndexOfLastSyncedAt)) {
              _tmpLast_synced_at = null;
            } else {
              _tmpLast_synced_at = _cursor.getLong(_cursorIndexOfLastSyncedAt);
            }
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item = new VillageEntity(_tmpId,_tmpState_code,_tmpDistrict_code,_tmpBlock_code,_tmpVillage_code,_tmpVillage_name_hindi,_tmpBlock_name_hindi,_tmpDistrict_name_hindi,_tmpState_name_hindi,_tmpVillage_name_english,_tmpBlock_name_english,_tmpDistrict_name_english,_tmpState_name_english,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getUnsynced(final Continuation<? super List<VillageEntity>> $completion) {
    final String _sql = "SELECT * FROM villages WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VillageEntity>>() {
      @Override
      @NonNull
      public List<VillageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfDistrictCode = CursorUtil.getColumnIndexOrThrow(_cursor, "district_code");
          final int _cursorIndexOfBlockCode = CursorUtil.getColumnIndexOrThrow(_cursor, "block_code");
          final int _cursorIndexOfVillageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "village_code");
          final int _cursorIndexOfVillageNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_hindi");
          final int _cursorIndexOfBlockNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_hindi");
          final int _cursorIndexOfDistrictNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_hindi");
          final int _cursorIndexOfStateNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_hindi");
          final int _cursorIndexOfVillageNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "village_name_english");
          final int _cursorIndexOfBlockNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "block_name_english");
          final int _cursorIndexOfDistrictNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name_english");
          final int _cursorIndexOfStateNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "state_name_english");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<VillageEntity> _result = new ArrayList<VillageEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VillageEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpState_code;
            if (_cursor.isNull(_cursorIndexOfStateCode)) {
              _tmpState_code = null;
            } else {
              _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
            }
            final String _tmpDistrict_code;
            if (_cursor.isNull(_cursorIndexOfDistrictCode)) {
              _tmpDistrict_code = null;
            } else {
              _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
            }
            final String _tmpBlock_code;
            if (_cursor.isNull(_cursorIndexOfBlockCode)) {
              _tmpBlock_code = null;
            } else {
              _tmpBlock_code = _cursor.getString(_cursorIndexOfBlockCode);
            }
            final String _tmpVillage_code;
            if (_cursor.isNull(_cursorIndexOfVillageCode)) {
              _tmpVillage_code = null;
            } else {
              _tmpVillage_code = _cursor.getString(_cursorIndexOfVillageCode);
            }
            final String _tmpVillage_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVillageNameHindi)) {
              _tmpVillage_name_hindi = null;
            } else {
              _tmpVillage_name_hindi = _cursor.getString(_cursorIndexOfVillageNameHindi);
            }
            final String _tmpBlock_name_hindi;
            if (_cursor.isNull(_cursorIndexOfBlockNameHindi)) {
              _tmpBlock_name_hindi = null;
            } else {
              _tmpBlock_name_hindi = _cursor.getString(_cursorIndexOfBlockNameHindi);
            }
            final String _tmpDistrict_name_hindi;
            if (_cursor.isNull(_cursorIndexOfDistrictNameHindi)) {
              _tmpDistrict_name_hindi = null;
            } else {
              _tmpDistrict_name_hindi = _cursor.getString(_cursorIndexOfDistrictNameHindi);
            }
            final String _tmpState_name_hindi;
            if (_cursor.isNull(_cursorIndexOfStateNameHindi)) {
              _tmpState_name_hindi = null;
            } else {
              _tmpState_name_hindi = _cursor.getString(_cursorIndexOfStateNameHindi);
            }
            final String _tmpVillage_name_english;
            if (_cursor.isNull(_cursorIndexOfVillageNameEnglish)) {
              _tmpVillage_name_english = null;
            } else {
              _tmpVillage_name_english = _cursor.getString(_cursorIndexOfVillageNameEnglish);
            }
            final String _tmpBlock_name_english;
            if (_cursor.isNull(_cursorIndexOfBlockNameEnglish)) {
              _tmpBlock_name_english = null;
            } else {
              _tmpBlock_name_english = _cursor.getString(_cursorIndexOfBlockNameEnglish);
            }
            final String _tmpDistrict_name_english;
            if (_cursor.isNull(_cursorIndexOfDistrictNameEnglish)) {
              _tmpDistrict_name_english = null;
            } else {
              _tmpDistrict_name_english = _cursor.getString(_cursorIndexOfDistrictNameEnglish);
            }
            final String _tmpState_name_english;
            if (_cursor.isNull(_cursorIndexOfStateNameEnglish)) {
              _tmpState_name_english = null;
            } else {
              _tmpState_name_english = _cursor.getString(_cursorIndexOfStateNameEnglish);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_1 != 0;
            final Long _tmpLast_synced_at;
            if (_cursor.isNull(_cursorIndexOfLastSyncedAt)) {
              _tmpLast_synced_at = null;
            } else {
              _tmpLast_synced_at = _cursor.getLong(_cursorIndexOfLastSyncedAt);
            }
            final String _tmpServer_id;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServer_id = null;
            } else {
              _tmpServer_id = _cursor.getString(_cursorIndexOfServerId);
            }
            _item = new VillageEntity(_tmpId,_tmpState_code,_tmpDistrict_code,_tmpBlock_code,_tmpVillage_code,_tmpVillage_name_hindi,_tmpBlock_name_hindi,_tmpDistrict_name_hindi,_tmpState_name_hindi,_tmpVillage_name_english,_tmpBlock_name_english,_tmpDistrict_name_english,_tmpState_name_english,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
