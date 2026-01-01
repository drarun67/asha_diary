package com.upgovt.ashadiary.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.upgovt.ashadiary.data.local.entities.BiometricLocalEntity;
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

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class BiometricLocalDao_Impl implements BiometricLocalDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BiometricLocalEntity> __insertionAdapterOfBiometricLocalEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByBeneficiary;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public BiometricLocalDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBiometricLocalEntity = new EntityInsertionAdapter<BiometricLocalEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `biometrics_local` (`id`,`beneficiary_id`,`finger_position`,`quality_score`,`iso_template`,`captured_by_user_id`,`captured_at`,`device_serial_number`,`is_synced`,`last_synced_at`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BiometricLocalEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getBeneficiary_id() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBeneficiary_id());
        }
        if (entity.getFinger_position() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFinger_position());
        }
        statement.bindLong(4, entity.getQuality_score());
        if (entity.getIso_template() == null) {
          statement.bindNull(5);
        } else {
          statement.bindBlob(5, entity.getIso_template());
        }
        if (entity.getCaptured_by_user_id() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getCaptured_by_user_id());
        }
        statement.bindLong(7, entity.getCaptured_at());
        if (entity.getDevice_serial_number() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getDevice_serial_number());
        }
        final int _tmp = entity.is_synced() ? 1 : 0;
        statement.bindLong(9, _tmp);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, entity.getLast_synced_at());
        }
      }
    };
    this.__preparedStmtOfDeleteByBeneficiary = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM biometrics_local WHERE beneficiary_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM biometrics_local WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final BiometricLocalEntity biometric,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfBiometricLocalEntity.insertAndReturnId(biometric);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteByBeneficiary(final String beneficiaryId,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByBeneficiary.acquire();
        int _argIndex = 1;
        if (beneficiaryId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, beneficiaryId);
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
          __preparedStmtOfDeleteByBeneficiary.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final String id, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
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
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getByBeneficiary(final String beneficiaryId,
      final Continuation<? super List<BiometricLocalEntity>> $completion) {
    final String _sql = "SELECT * FROM biometrics_local WHERE beneficiary_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BiometricLocalEntity>>() {
      @Override
      @NonNull
      public List<BiometricLocalEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFingerPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "finger_position");
          final int _cursorIndexOfQualityScore = CursorUtil.getColumnIndexOrThrow(_cursor, "quality_score");
          final int _cursorIndexOfIsoTemplate = CursorUtil.getColumnIndexOrThrow(_cursor, "iso_template");
          final int _cursorIndexOfCapturedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "captured_by_user_id");
          final int _cursorIndexOfCapturedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "captured_at");
          final int _cursorIndexOfDeviceSerialNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "device_serial_number");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final List<BiometricLocalEntity> _result = new ArrayList<BiometricLocalEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BiometricLocalEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBeneficiary_id;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId)) {
              _tmpBeneficiary_id = null;
            } else {
              _tmpBeneficiary_id = _cursor.getString(_cursorIndexOfBeneficiaryId);
            }
            final String _tmpFinger_position;
            if (_cursor.isNull(_cursorIndexOfFingerPosition)) {
              _tmpFinger_position = null;
            } else {
              _tmpFinger_position = _cursor.getString(_cursorIndexOfFingerPosition);
            }
            final int _tmpQuality_score;
            _tmpQuality_score = _cursor.getInt(_cursorIndexOfQualityScore);
            final byte[] _tmpIso_template;
            if (_cursor.isNull(_cursorIndexOfIsoTemplate)) {
              _tmpIso_template = null;
            } else {
              _tmpIso_template = _cursor.getBlob(_cursorIndexOfIsoTemplate);
            }
            final String _tmpCaptured_by_user_id;
            if (_cursor.isNull(_cursorIndexOfCapturedByUserId)) {
              _tmpCaptured_by_user_id = null;
            } else {
              _tmpCaptured_by_user_id = _cursor.getString(_cursorIndexOfCapturedByUserId);
            }
            final long _tmpCaptured_at;
            _tmpCaptured_at = _cursor.getLong(_cursorIndexOfCapturedAt);
            final String _tmpDevice_serial_number;
            if (_cursor.isNull(_cursorIndexOfDeviceSerialNumber)) {
              _tmpDevice_serial_number = null;
            } else {
              _tmpDevice_serial_number = _cursor.getString(_cursorIndexOfDeviceSerialNumber);
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
            _item = new BiometricLocalEntity(_tmpId,_tmpBeneficiary_id,_tmpFinger_position,_tmpQuality_score,_tmpIso_template,_tmpCaptured_by_user_id,_tmpCaptured_at,_tmpDevice_serial_number,_tmpIs_synced,_tmpLast_synced_at);
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
  public Object getByBeneficiaryAndFinger(final String beneficiaryId, final String fingerPosition,
      final Continuation<? super BiometricLocalEntity> $completion) {
    final String _sql = "SELECT * FROM biometrics_local WHERE beneficiary_id = ? AND finger_position = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    _argIndex = 2;
    if (fingerPosition == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, fingerPosition);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<BiometricLocalEntity>() {
      @Override
      @Nullable
      public BiometricLocalEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFingerPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "finger_position");
          final int _cursorIndexOfQualityScore = CursorUtil.getColumnIndexOrThrow(_cursor, "quality_score");
          final int _cursorIndexOfIsoTemplate = CursorUtil.getColumnIndexOrThrow(_cursor, "iso_template");
          final int _cursorIndexOfCapturedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "captured_by_user_id");
          final int _cursorIndexOfCapturedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "captured_at");
          final int _cursorIndexOfDeviceSerialNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "device_serial_number");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final BiometricLocalEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBeneficiary_id;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId)) {
              _tmpBeneficiary_id = null;
            } else {
              _tmpBeneficiary_id = _cursor.getString(_cursorIndexOfBeneficiaryId);
            }
            final String _tmpFinger_position;
            if (_cursor.isNull(_cursorIndexOfFingerPosition)) {
              _tmpFinger_position = null;
            } else {
              _tmpFinger_position = _cursor.getString(_cursorIndexOfFingerPosition);
            }
            final int _tmpQuality_score;
            _tmpQuality_score = _cursor.getInt(_cursorIndexOfQualityScore);
            final byte[] _tmpIso_template;
            if (_cursor.isNull(_cursorIndexOfIsoTemplate)) {
              _tmpIso_template = null;
            } else {
              _tmpIso_template = _cursor.getBlob(_cursorIndexOfIsoTemplate);
            }
            final String _tmpCaptured_by_user_id;
            if (_cursor.isNull(_cursorIndexOfCapturedByUserId)) {
              _tmpCaptured_by_user_id = null;
            } else {
              _tmpCaptured_by_user_id = _cursor.getString(_cursorIndexOfCapturedByUserId);
            }
            final long _tmpCaptured_at;
            _tmpCaptured_at = _cursor.getLong(_cursorIndexOfCapturedAt);
            final String _tmpDevice_serial_number;
            if (_cursor.isNull(_cursorIndexOfDeviceSerialNumber)) {
              _tmpDevice_serial_number = null;
            } else {
              _tmpDevice_serial_number = _cursor.getString(_cursorIndexOfDeviceSerialNumber);
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
            _result = new BiometricLocalEntity(_tmpId,_tmpBeneficiary_id,_tmpFinger_position,_tmpQuality_score,_tmpIso_template,_tmpCaptured_by_user_id,_tmpCaptured_at,_tmpDevice_serial_number,_tmpIs_synced,_tmpLast_synced_at);
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
  public Object getAllBiometrics(
      final Continuation<? super List<BiometricLocalEntity>> $completion) {
    final String _sql = "SELECT * FROM biometrics_local";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BiometricLocalEntity>>() {
      @Override
      @NonNull
      public List<BiometricLocalEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFingerPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "finger_position");
          final int _cursorIndexOfQualityScore = CursorUtil.getColumnIndexOrThrow(_cursor, "quality_score");
          final int _cursorIndexOfIsoTemplate = CursorUtil.getColumnIndexOrThrow(_cursor, "iso_template");
          final int _cursorIndexOfCapturedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "captured_by_user_id");
          final int _cursorIndexOfCapturedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "captured_at");
          final int _cursorIndexOfDeviceSerialNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "device_serial_number");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final List<BiometricLocalEntity> _result = new ArrayList<BiometricLocalEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BiometricLocalEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBeneficiary_id;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId)) {
              _tmpBeneficiary_id = null;
            } else {
              _tmpBeneficiary_id = _cursor.getString(_cursorIndexOfBeneficiaryId);
            }
            final String _tmpFinger_position;
            if (_cursor.isNull(_cursorIndexOfFingerPosition)) {
              _tmpFinger_position = null;
            } else {
              _tmpFinger_position = _cursor.getString(_cursorIndexOfFingerPosition);
            }
            final int _tmpQuality_score;
            _tmpQuality_score = _cursor.getInt(_cursorIndexOfQualityScore);
            final byte[] _tmpIso_template;
            if (_cursor.isNull(_cursorIndexOfIsoTemplate)) {
              _tmpIso_template = null;
            } else {
              _tmpIso_template = _cursor.getBlob(_cursorIndexOfIsoTemplate);
            }
            final String _tmpCaptured_by_user_id;
            if (_cursor.isNull(_cursorIndexOfCapturedByUserId)) {
              _tmpCaptured_by_user_id = null;
            } else {
              _tmpCaptured_by_user_id = _cursor.getString(_cursorIndexOfCapturedByUserId);
            }
            final long _tmpCaptured_at;
            _tmpCaptured_at = _cursor.getLong(_cursorIndexOfCapturedAt);
            final String _tmpDevice_serial_number;
            if (_cursor.isNull(_cursorIndexOfDeviceSerialNumber)) {
              _tmpDevice_serial_number = null;
            } else {
              _tmpDevice_serial_number = _cursor.getString(_cursorIndexOfDeviceSerialNumber);
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
            _item = new BiometricLocalEntity(_tmpId,_tmpBeneficiary_id,_tmpFinger_position,_tmpQuality_score,_tmpIso_template,_tmpCaptured_by_user_id,_tmpCaptured_at,_tmpDevice_serial_number,_tmpIs_synced,_tmpLast_synced_at);
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
