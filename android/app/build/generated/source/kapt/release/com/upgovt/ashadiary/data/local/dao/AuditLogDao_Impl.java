package com.upgovt.ashadiary.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.upgovt.ashadiary.data.local.entities.AuditLogEntity;
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
public final class AuditLogDao_Impl implements AuditLogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AuditLogEntity> __insertionAdapterOfAuditLogEntity;

  public AuditLogDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAuditLogEntity = new EntityInsertionAdapter<AuditLogEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `audit_logs` (`id`,`user_id`,`user_role_id`,`action_type`,`entity_type`,`entity_id`,`field_name`,`old_value`,`new_value`,`action_description_hindi`,`action_timestamp`,`gps_lat`,`gps_lng`,`gps_accuracy_meters`,`device_id`,`app_version`,`is_synced`,`last_synced_at`,`server_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final AuditLogEntity entity) {
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
        statement.bindLong(3, entity.getUser_role_id());
        if (entity.getAction_type() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getAction_type());
        }
        if (entity.getEntity_type() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getEntity_type());
        }
        if (entity.getEntity_id() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getEntity_id());
        }
        if (entity.getField_name() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getField_name());
        }
        if (entity.getOld_value() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getOld_value());
        }
        if (entity.getNew_value() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getNew_value());
        }
        if (entity.getAction_description_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getAction_description_hindi());
        }
        statement.bindLong(11, entity.getAction_timestamp());
        statement.bindDouble(12, entity.getGps_lat());
        statement.bindDouble(13, entity.getGps_lng());
        statement.bindDouble(14, entity.getGps_accuracy_meters());
        if (entity.getDevice_id() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getDevice_id());
        }
        if (entity.getApp_version() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getApp_version());
        }
        final int _tmp = entity.is_synced() ? 1 : 0;
        statement.bindLong(17, _tmp);
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
  }

  @Override
  public Object insert(final AuditLogEntity log, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfAuditLogEntity.insertAndReturnId(log);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<AuditLogEntity> logs,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfAuditLogEntity.insertAndReturnIdsList(logs);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getByEntity(final String entityType, final String entityId,
      final Continuation<? super List<AuditLogEntity>> $completion) {
    final String _sql = "SELECT * FROM audit_logs WHERE entity_type = ? AND entity_id = ? ORDER BY action_timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (entityType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, entityType);
    }
    _argIndex = 2;
    if (entityId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, entityId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<AuditLogEntity>>() {
      @Override
      @NonNull
      public List<AuditLogEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_role_id");
          final int _cursorIndexOfActionType = CursorUtil.getColumnIndexOrThrow(_cursor, "action_type");
          final int _cursorIndexOfEntityType = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_type");
          final int _cursorIndexOfEntityId = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfOldValue = CursorUtil.getColumnIndexOrThrow(_cursor, "old_value");
          final int _cursorIndexOfNewValue = CursorUtil.getColumnIndexOrThrow(_cursor, "new_value");
          final int _cursorIndexOfActionDescriptionHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "action_description_hindi");
          final int _cursorIndexOfActionTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "action_timestamp");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfGpsAccuracyMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_accuracy_meters");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "device_id");
          final int _cursorIndexOfAppVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "app_version");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<AuditLogEntity> _result = new ArrayList<AuditLogEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final AuditLogEntity _item;
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
            final int _tmpUser_role_id;
            _tmpUser_role_id = _cursor.getInt(_cursorIndexOfUserRoleId);
            final String _tmpAction_type;
            if (_cursor.isNull(_cursorIndexOfActionType)) {
              _tmpAction_type = null;
            } else {
              _tmpAction_type = _cursor.getString(_cursorIndexOfActionType);
            }
            final String _tmpEntity_type;
            if (_cursor.isNull(_cursorIndexOfEntityType)) {
              _tmpEntity_type = null;
            } else {
              _tmpEntity_type = _cursor.getString(_cursorIndexOfEntityType);
            }
            final String _tmpEntity_id;
            if (_cursor.isNull(_cursorIndexOfEntityId)) {
              _tmpEntity_id = null;
            } else {
              _tmpEntity_id = _cursor.getString(_cursorIndexOfEntityId);
            }
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpOld_value;
            if (_cursor.isNull(_cursorIndexOfOldValue)) {
              _tmpOld_value = null;
            } else {
              _tmpOld_value = _cursor.getString(_cursorIndexOfOldValue);
            }
            final String _tmpNew_value;
            if (_cursor.isNull(_cursorIndexOfNewValue)) {
              _tmpNew_value = null;
            } else {
              _tmpNew_value = _cursor.getString(_cursorIndexOfNewValue);
            }
            final String _tmpAction_description_hindi;
            if (_cursor.isNull(_cursorIndexOfActionDescriptionHindi)) {
              _tmpAction_description_hindi = null;
            } else {
              _tmpAction_description_hindi = _cursor.getString(_cursorIndexOfActionDescriptionHindi);
            }
            final long _tmpAction_timestamp;
            _tmpAction_timestamp = _cursor.getLong(_cursorIndexOfActionTimestamp);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
            final float _tmpGps_accuracy_meters;
            _tmpGps_accuracy_meters = _cursor.getFloat(_cursorIndexOfGpsAccuracyMeters);
            final String _tmpDevice_id;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDevice_id = null;
            } else {
              _tmpDevice_id = _cursor.getString(_cursorIndexOfDeviceId);
            }
            final String _tmpApp_version;
            if (_cursor.isNull(_cursorIndexOfAppVersion)) {
              _tmpApp_version = null;
            } else {
              _tmpApp_version = _cursor.getString(_cursorIndexOfAppVersion);
            }
            final boolean _tmpIs_synced;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp != 0;
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
            _item = new AuditLogEntity(_tmpId,_tmpUser_id,_tmpUser_role_id,_tmpAction_type,_tmpEntity_type,_tmpEntity_id,_tmpField_name,_tmpOld_value,_tmpNew_value,_tmpAction_description_hindi,_tmpAction_timestamp,_tmpGps_lat,_tmpGps_lng,_tmpGps_accuracy_meters,_tmpDevice_id,_tmpApp_version,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getByUser(final String userId, final int limit,
      final Continuation<? super List<AuditLogEntity>> $completion) {
    final String _sql = "SELECT * FROM audit_logs WHERE user_id = ? ORDER BY action_timestamp DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<AuditLogEntity>>() {
      @Override
      @NonNull
      public List<AuditLogEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_role_id");
          final int _cursorIndexOfActionType = CursorUtil.getColumnIndexOrThrow(_cursor, "action_type");
          final int _cursorIndexOfEntityType = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_type");
          final int _cursorIndexOfEntityId = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfOldValue = CursorUtil.getColumnIndexOrThrow(_cursor, "old_value");
          final int _cursorIndexOfNewValue = CursorUtil.getColumnIndexOrThrow(_cursor, "new_value");
          final int _cursorIndexOfActionDescriptionHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "action_description_hindi");
          final int _cursorIndexOfActionTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "action_timestamp");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfGpsAccuracyMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_accuracy_meters");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "device_id");
          final int _cursorIndexOfAppVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "app_version");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<AuditLogEntity> _result = new ArrayList<AuditLogEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final AuditLogEntity _item;
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
            final int _tmpUser_role_id;
            _tmpUser_role_id = _cursor.getInt(_cursorIndexOfUserRoleId);
            final String _tmpAction_type;
            if (_cursor.isNull(_cursorIndexOfActionType)) {
              _tmpAction_type = null;
            } else {
              _tmpAction_type = _cursor.getString(_cursorIndexOfActionType);
            }
            final String _tmpEntity_type;
            if (_cursor.isNull(_cursorIndexOfEntityType)) {
              _tmpEntity_type = null;
            } else {
              _tmpEntity_type = _cursor.getString(_cursorIndexOfEntityType);
            }
            final String _tmpEntity_id;
            if (_cursor.isNull(_cursorIndexOfEntityId)) {
              _tmpEntity_id = null;
            } else {
              _tmpEntity_id = _cursor.getString(_cursorIndexOfEntityId);
            }
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpOld_value;
            if (_cursor.isNull(_cursorIndexOfOldValue)) {
              _tmpOld_value = null;
            } else {
              _tmpOld_value = _cursor.getString(_cursorIndexOfOldValue);
            }
            final String _tmpNew_value;
            if (_cursor.isNull(_cursorIndexOfNewValue)) {
              _tmpNew_value = null;
            } else {
              _tmpNew_value = _cursor.getString(_cursorIndexOfNewValue);
            }
            final String _tmpAction_description_hindi;
            if (_cursor.isNull(_cursorIndexOfActionDescriptionHindi)) {
              _tmpAction_description_hindi = null;
            } else {
              _tmpAction_description_hindi = _cursor.getString(_cursorIndexOfActionDescriptionHindi);
            }
            final long _tmpAction_timestamp;
            _tmpAction_timestamp = _cursor.getLong(_cursorIndexOfActionTimestamp);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
            final float _tmpGps_accuracy_meters;
            _tmpGps_accuracy_meters = _cursor.getFloat(_cursorIndexOfGpsAccuracyMeters);
            final String _tmpDevice_id;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDevice_id = null;
            } else {
              _tmpDevice_id = _cursor.getString(_cursorIndexOfDeviceId);
            }
            final String _tmpApp_version;
            if (_cursor.isNull(_cursorIndexOfAppVersion)) {
              _tmpApp_version = null;
            } else {
              _tmpApp_version = _cursor.getString(_cursorIndexOfAppVersion);
            }
            final boolean _tmpIs_synced;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp != 0;
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
            _item = new AuditLogEntity(_tmpId,_tmpUser_id,_tmpUser_role_id,_tmpAction_type,_tmpEntity_type,_tmpEntity_id,_tmpField_name,_tmpOld_value,_tmpNew_value,_tmpAction_description_hindi,_tmpAction_timestamp,_tmpGps_lat,_tmpGps_lng,_tmpGps_accuracy_meters,_tmpDevice_id,_tmpApp_version,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getRecent(final int limit,
      final Continuation<? super List<AuditLogEntity>> $completion) {
    final String _sql = "SELECT * FROM audit_logs ORDER BY action_timestamp DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<AuditLogEntity>>() {
      @Override
      @NonNull
      public List<AuditLogEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_role_id");
          final int _cursorIndexOfActionType = CursorUtil.getColumnIndexOrThrow(_cursor, "action_type");
          final int _cursorIndexOfEntityType = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_type");
          final int _cursorIndexOfEntityId = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfOldValue = CursorUtil.getColumnIndexOrThrow(_cursor, "old_value");
          final int _cursorIndexOfNewValue = CursorUtil.getColumnIndexOrThrow(_cursor, "new_value");
          final int _cursorIndexOfActionDescriptionHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "action_description_hindi");
          final int _cursorIndexOfActionTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "action_timestamp");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfGpsAccuracyMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_accuracy_meters");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "device_id");
          final int _cursorIndexOfAppVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "app_version");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<AuditLogEntity> _result = new ArrayList<AuditLogEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final AuditLogEntity _item;
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
            final int _tmpUser_role_id;
            _tmpUser_role_id = _cursor.getInt(_cursorIndexOfUserRoleId);
            final String _tmpAction_type;
            if (_cursor.isNull(_cursorIndexOfActionType)) {
              _tmpAction_type = null;
            } else {
              _tmpAction_type = _cursor.getString(_cursorIndexOfActionType);
            }
            final String _tmpEntity_type;
            if (_cursor.isNull(_cursorIndexOfEntityType)) {
              _tmpEntity_type = null;
            } else {
              _tmpEntity_type = _cursor.getString(_cursorIndexOfEntityType);
            }
            final String _tmpEntity_id;
            if (_cursor.isNull(_cursorIndexOfEntityId)) {
              _tmpEntity_id = null;
            } else {
              _tmpEntity_id = _cursor.getString(_cursorIndexOfEntityId);
            }
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpOld_value;
            if (_cursor.isNull(_cursorIndexOfOldValue)) {
              _tmpOld_value = null;
            } else {
              _tmpOld_value = _cursor.getString(_cursorIndexOfOldValue);
            }
            final String _tmpNew_value;
            if (_cursor.isNull(_cursorIndexOfNewValue)) {
              _tmpNew_value = null;
            } else {
              _tmpNew_value = _cursor.getString(_cursorIndexOfNewValue);
            }
            final String _tmpAction_description_hindi;
            if (_cursor.isNull(_cursorIndexOfActionDescriptionHindi)) {
              _tmpAction_description_hindi = null;
            } else {
              _tmpAction_description_hindi = _cursor.getString(_cursorIndexOfActionDescriptionHindi);
            }
            final long _tmpAction_timestamp;
            _tmpAction_timestamp = _cursor.getLong(_cursorIndexOfActionTimestamp);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
            final float _tmpGps_accuracy_meters;
            _tmpGps_accuracy_meters = _cursor.getFloat(_cursorIndexOfGpsAccuracyMeters);
            final String _tmpDevice_id;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDevice_id = null;
            } else {
              _tmpDevice_id = _cursor.getString(_cursorIndexOfDeviceId);
            }
            final String _tmpApp_version;
            if (_cursor.isNull(_cursorIndexOfAppVersion)) {
              _tmpApp_version = null;
            } else {
              _tmpApp_version = _cursor.getString(_cursorIndexOfAppVersion);
            }
            final boolean _tmpIs_synced;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp != 0;
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
            _item = new AuditLogEntity(_tmpId,_tmpUser_id,_tmpUser_role_id,_tmpAction_type,_tmpEntity_type,_tmpEntity_id,_tmpField_name,_tmpOld_value,_tmpNew_value,_tmpAction_description_hindi,_tmpAction_timestamp,_tmpGps_lat,_tmpGps_lng,_tmpGps_accuracy_meters,_tmpDevice_id,_tmpApp_version,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<AuditLogEntity>> observeRecent(final int limit) {
    final String _sql = "SELECT * FROM audit_logs ORDER BY action_timestamp DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"audit_logs"}, new Callable<List<AuditLogEntity>>() {
      @Override
      @NonNull
      public List<AuditLogEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_role_id");
          final int _cursorIndexOfActionType = CursorUtil.getColumnIndexOrThrow(_cursor, "action_type");
          final int _cursorIndexOfEntityType = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_type");
          final int _cursorIndexOfEntityId = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfOldValue = CursorUtil.getColumnIndexOrThrow(_cursor, "old_value");
          final int _cursorIndexOfNewValue = CursorUtil.getColumnIndexOrThrow(_cursor, "new_value");
          final int _cursorIndexOfActionDescriptionHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "action_description_hindi");
          final int _cursorIndexOfActionTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "action_timestamp");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfGpsAccuracyMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_accuracy_meters");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "device_id");
          final int _cursorIndexOfAppVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "app_version");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<AuditLogEntity> _result = new ArrayList<AuditLogEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final AuditLogEntity _item;
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
            final int _tmpUser_role_id;
            _tmpUser_role_id = _cursor.getInt(_cursorIndexOfUserRoleId);
            final String _tmpAction_type;
            if (_cursor.isNull(_cursorIndexOfActionType)) {
              _tmpAction_type = null;
            } else {
              _tmpAction_type = _cursor.getString(_cursorIndexOfActionType);
            }
            final String _tmpEntity_type;
            if (_cursor.isNull(_cursorIndexOfEntityType)) {
              _tmpEntity_type = null;
            } else {
              _tmpEntity_type = _cursor.getString(_cursorIndexOfEntityType);
            }
            final String _tmpEntity_id;
            if (_cursor.isNull(_cursorIndexOfEntityId)) {
              _tmpEntity_id = null;
            } else {
              _tmpEntity_id = _cursor.getString(_cursorIndexOfEntityId);
            }
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpOld_value;
            if (_cursor.isNull(_cursorIndexOfOldValue)) {
              _tmpOld_value = null;
            } else {
              _tmpOld_value = _cursor.getString(_cursorIndexOfOldValue);
            }
            final String _tmpNew_value;
            if (_cursor.isNull(_cursorIndexOfNewValue)) {
              _tmpNew_value = null;
            } else {
              _tmpNew_value = _cursor.getString(_cursorIndexOfNewValue);
            }
            final String _tmpAction_description_hindi;
            if (_cursor.isNull(_cursorIndexOfActionDescriptionHindi)) {
              _tmpAction_description_hindi = null;
            } else {
              _tmpAction_description_hindi = _cursor.getString(_cursorIndexOfActionDescriptionHindi);
            }
            final long _tmpAction_timestamp;
            _tmpAction_timestamp = _cursor.getLong(_cursorIndexOfActionTimestamp);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
            final float _tmpGps_accuracy_meters;
            _tmpGps_accuracy_meters = _cursor.getFloat(_cursorIndexOfGpsAccuracyMeters);
            final String _tmpDevice_id;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDevice_id = null;
            } else {
              _tmpDevice_id = _cursor.getString(_cursorIndexOfDeviceId);
            }
            final String _tmpApp_version;
            if (_cursor.isNull(_cursorIndexOfAppVersion)) {
              _tmpApp_version = null;
            } else {
              _tmpApp_version = _cursor.getString(_cursorIndexOfAppVersion);
            }
            final boolean _tmpIs_synced;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp != 0;
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
            _item = new AuditLogEntity(_tmpId,_tmpUser_id,_tmpUser_role_id,_tmpAction_type,_tmpEntity_type,_tmpEntity_id,_tmpField_name,_tmpOld_value,_tmpNew_value,_tmpAction_description_hindi,_tmpAction_timestamp,_tmpGps_lat,_tmpGps_lng,_tmpGps_accuracy_meters,_tmpDevice_id,_tmpApp_version,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getUnsynced(final Continuation<? super List<AuditLogEntity>> $completion) {
    final String _sql = "SELECT * FROM audit_logs WHERE is_synced = 0 ORDER BY action_timestamp ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<AuditLogEntity>>() {
      @Override
      @NonNull
      public List<AuditLogEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_role_id");
          final int _cursorIndexOfActionType = CursorUtil.getColumnIndexOrThrow(_cursor, "action_type");
          final int _cursorIndexOfEntityType = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_type");
          final int _cursorIndexOfEntityId = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfOldValue = CursorUtil.getColumnIndexOrThrow(_cursor, "old_value");
          final int _cursorIndexOfNewValue = CursorUtil.getColumnIndexOrThrow(_cursor, "new_value");
          final int _cursorIndexOfActionDescriptionHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "action_description_hindi");
          final int _cursorIndexOfActionTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "action_timestamp");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfGpsAccuracyMeters = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_accuracy_meters");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "device_id");
          final int _cursorIndexOfAppVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "app_version");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<AuditLogEntity> _result = new ArrayList<AuditLogEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final AuditLogEntity _item;
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
            final int _tmpUser_role_id;
            _tmpUser_role_id = _cursor.getInt(_cursorIndexOfUserRoleId);
            final String _tmpAction_type;
            if (_cursor.isNull(_cursorIndexOfActionType)) {
              _tmpAction_type = null;
            } else {
              _tmpAction_type = _cursor.getString(_cursorIndexOfActionType);
            }
            final String _tmpEntity_type;
            if (_cursor.isNull(_cursorIndexOfEntityType)) {
              _tmpEntity_type = null;
            } else {
              _tmpEntity_type = _cursor.getString(_cursorIndexOfEntityType);
            }
            final String _tmpEntity_id;
            if (_cursor.isNull(_cursorIndexOfEntityId)) {
              _tmpEntity_id = null;
            } else {
              _tmpEntity_id = _cursor.getString(_cursorIndexOfEntityId);
            }
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpOld_value;
            if (_cursor.isNull(_cursorIndexOfOldValue)) {
              _tmpOld_value = null;
            } else {
              _tmpOld_value = _cursor.getString(_cursorIndexOfOldValue);
            }
            final String _tmpNew_value;
            if (_cursor.isNull(_cursorIndexOfNewValue)) {
              _tmpNew_value = null;
            } else {
              _tmpNew_value = _cursor.getString(_cursorIndexOfNewValue);
            }
            final String _tmpAction_description_hindi;
            if (_cursor.isNull(_cursorIndexOfActionDescriptionHindi)) {
              _tmpAction_description_hindi = null;
            } else {
              _tmpAction_description_hindi = _cursor.getString(_cursorIndexOfActionDescriptionHindi);
            }
            final long _tmpAction_timestamp;
            _tmpAction_timestamp = _cursor.getLong(_cursorIndexOfActionTimestamp);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
            final float _tmpGps_accuracy_meters;
            _tmpGps_accuracy_meters = _cursor.getFloat(_cursorIndexOfGpsAccuracyMeters);
            final String _tmpDevice_id;
            if (_cursor.isNull(_cursorIndexOfDeviceId)) {
              _tmpDevice_id = null;
            } else {
              _tmpDevice_id = _cursor.getString(_cursorIndexOfDeviceId);
            }
            final String _tmpApp_version;
            if (_cursor.isNull(_cursorIndexOfAppVersion)) {
              _tmpApp_version = null;
            } else {
              _tmpApp_version = _cursor.getString(_cursorIndexOfAppVersion);
            }
            final boolean _tmpIs_synced;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp != 0;
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
            _item = new AuditLogEntity(_tmpId,_tmpUser_id,_tmpUser_role_id,_tmpAction_type,_tmpEntity_type,_tmpEntity_id,_tmpField_name,_tmpOld_value,_tmpNew_value,_tmpAction_description_hindi,_tmpAction_timestamp,_tmpGps_lat,_tmpGps_lng,_tmpGps_accuracy_meters,_tmpDevice_id,_tmpApp_version,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<Integer> observeUnsyncedCount() {
    final String _sql = "SELECT COUNT(*) FROM audit_logs WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"audit_logs"}, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
