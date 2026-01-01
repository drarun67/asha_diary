package com.upgovt.ashadiary.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.upgovt.ashadiary.data.local.entities.UserAreaMappingEntity;
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
public final class UserAreaMappingDao_Impl implements UserAreaMappingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserAreaMappingEntity> __insertionAdapterOfUserAreaMappingEntity;

  private final EntityDeletionOrUpdateAdapter<UserAreaMappingEntity> __updateAdapterOfUserAreaMappingEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeactivate;

  public UserAreaMappingDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserAreaMappingEntity = new EntityInsertionAdapter<UserAreaMappingEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `user_area_mappings` (`id`,`user_id`,`village_id`,`assigned_by_user_id`,`is_active`,`assigned_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserAreaMappingEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getUser_id() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUser_id());
        }
        if (entity.getVillage_id() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getVillage_id());
        }
        if (entity.getAssigned_by_user_id() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getAssigned_by_user_id());
        }
        final int _tmp = entity.is_active() ? 1 : 0;
        statement.bindLong(5, _tmp);
        statement.bindLong(6, entity.getAssigned_at());
        statement.bindLong(7, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(8, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getServer_id());
        }
      }
    };
    this.__updateAdapterOfUserAreaMappingEntity = new EntityDeletionOrUpdateAdapter<UserAreaMappingEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `user_area_mappings` SET `id` = ?,`user_id` = ?,`village_id` = ?,`assigned_by_user_id` = ?,`is_active` = ?,`assigned_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserAreaMappingEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getUser_id() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUser_id());
        }
        if (entity.getVillage_id() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getVillage_id());
        }
        if (entity.getAssigned_by_user_id() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getAssigned_by_user_id());
        }
        final int _tmp = entity.is_active() ? 1 : 0;
        statement.bindLong(5, _tmp);
        statement.bindLong(6, entity.getAssigned_at());
        statement.bindLong(7, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(8, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getServer_id());
        }
        if (entity.getId() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDeactivate = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE user_area_mappings SET is_active = 0 WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final UserAreaMappingEntity mapping,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfUserAreaMappingEntity.insertAndReturnId(mapping);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<UserAreaMappingEntity> mappings,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfUserAreaMappingEntity.insertAndReturnIdsList(mappings);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final UserAreaMappingEntity mapping,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfUserAreaMappingEntity.handle(mapping);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deactivate(final String mappingId,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeactivate.acquire();
        int _argIndex = 1;
        if (mappingId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, mappingId);
        }
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeactivate.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getByUser(final String userId,
      final Continuation<? super List<UserAreaMappingEntity>> $completion) {
    final String _sql = "SELECT * FROM user_area_mappings WHERE user_id = ? AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserAreaMappingEntity>>() {
      @Override
      @NonNull
      public List<UserAreaMappingEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAssignedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "assigned_by_user_id");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfAssignedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "assigned_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserAreaMappingEntity> _result = new ArrayList<UserAreaMappingEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserAreaMappingEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUser_id;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUser_id = null;
            } else {
              _tmpUser_id = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAssigned_by_user_id;
            if (_cursor.isNull(_cursorIndexOfAssignedByUserId)) {
              _tmpAssigned_by_user_id = null;
            } else {
              _tmpAssigned_by_user_id = _cursor.getString(_cursorIndexOfAssignedByUserId);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpAssigned_at;
            _tmpAssigned_at = _cursor.getLong(_cursorIndexOfAssignedAt);
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
            _item = new UserAreaMappingEntity(_tmpId,_tmpUser_id,_tmpVillage_id,_tmpAssigned_by_user_id,_tmpIs_active,_tmpAssigned_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<UserAreaMappingEntity>> observeByUser(final String userId) {
    final String _sql = "SELECT * FROM user_area_mappings WHERE user_id = ? AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"user_area_mappings"}, new Callable<List<UserAreaMappingEntity>>() {
      @Override
      @NonNull
      public List<UserAreaMappingEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAssignedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "assigned_by_user_id");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfAssignedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "assigned_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserAreaMappingEntity> _result = new ArrayList<UserAreaMappingEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserAreaMappingEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUser_id;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUser_id = null;
            } else {
              _tmpUser_id = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAssigned_by_user_id;
            if (_cursor.isNull(_cursorIndexOfAssignedByUserId)) {
              _tmpAssigned_by_user_id = null;
            } else {
              _tmpAssigned_by_user_id = _cursor.getString(_cursorIndexOfAssignedByUserId);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpAssigned_at;
            _tmpAssigned_at = _cursor.getLong(_cursorIndexOfAssignedAt);
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
            _item = new UserAreaMappingEntity(_tmpId,_tmpUser_id,_tmpVillage_id,_tmpAssigned_by_user_id,_tmpIs_active,_tmpAssigned_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getByVillage(final String villageId,
      final Continuation<? super List<UserAreaMappingEntity>> $completion) {
    final String _sql = "SELECT * FROM user_area_mappings WHERE village_id = ? AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (villageId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, villageId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserAreaMappingEntity>>() {
      @Override
      @NonNull
      public List<UserAreaMappingEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAssignedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "assigned_by_user_id");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfAssignedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "assigned_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserAreaMappingEntity> _result = new ArrayList<UserAreaMappingEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserAreaMappingEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUser_id;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUser_id = null;
            } else {
              _tmpUser_id = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAssigned_by_user_id;
            if (_cursor.isNull(_cursorIndexOfAssignedByUserId)) {
              _tmpAssigned_by_user_id = null;
            } else {
              _tmpAssigned_by_user_id = _cursor.getString(_cursorIndexOfAssignedByUserId);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpAssigned_at;
            _tmpAssigned_at = _cursor.getLong(_cursorIndexOfAssignedAt);
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
            _item = new UserAreaMappingEntity(_tmpId,_tmpUser_id,_tmpVillage_id,_tmpAssigned_by_user_id,_tmpIs_active,_tmpAssigned_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getAssignedVillagesForUser(final String userId,
      final Continuation<? super List<VillageEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT v.* FROM villages v\n"
            + "        INNER JOIN user_area_mappings uam ON v.id = uam.village_id\n"
            + "        WHERE uam.user_id = ? AND uam.is_active = 1 AND v.is_active = 1\n"
            + "        ORDER BY v.village_name_hindi ASC\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
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
  public Flow<List<VillageEntity>> observeAssignedVillagesForUser(final String userId) {
    final String _sql = "\n"
            + "        SELECT v.* FROM villages v\n"
            + "        INNER JOIN user_area_mappings uam ON v.id = uam.village_id\n"
            + "        WHERE uam.user_id = ? AND uam.is_active = 1 AND v.is_active = 1\n"
            + "        ORDER BY v.village_name_hindi ASC\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"villages",
        "user_area_mappings"}, new Callable<List<VillageEntity>>() {
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
  public Object getUnsynced(final Continuation<? super List<UserAreaMappingEntity>> $completion) {
    final String _sql = "SELECT * FROM user_area_mappings WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserAreaMappingEntity>>() {
      @Override
      @NonNull
      public List<UserAreaMappingEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAssignedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "assigned_by_user_id");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfAssignedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "assigned_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserAreaMappingEntity> _result = new ArrayList<UserAreaMappingEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserAreaMappingEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUser_id;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUser_id = null;
            } else {
              _tmpUser_id = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAssigned_by_user_id;
            if (_cursor.isNull(_cursorIndexOfAssignedByUserId)) {
              _tmpAssigned_by_user_id = null;
            } else {
              _tmpAssigned_by_user_id = _cursor.getString(_cursorIndexOfAssignedByUserId);
            }
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final long _tmpAssigned_at;
            _tmpAssigned_at = _cursor.getLong(_cursorIndexOfAssignedAt);
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
            _item = new UserAreaMappingEntity(_tmpId,_tmpUser_id,_tmpVillage_id,_tmpAssigned_by_user_id,_tmpIs_active,_tmpAssigned_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
