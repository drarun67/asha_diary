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
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.upgovt.ashadiary.data.local.entities.UserEntity;
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
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserEntity> __insertionAdapterOfUserEntity;

  private final EntityDeletionOrUpdateAdapter<UserEntity> __updateAdapterOfUserEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeactivateUser;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSyncStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUser;

  public UserDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserEntity = new EntityInsertionAdapter<UserEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `users` (`id`,`username`,`password_hash`,`full_name`,`phone_number`,`role_id`,`offline_token`,`worker_code`,`is_active`,`created_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getUsername() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUsername());
        }
        if (entity.getPassword_hash() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPassword_hash());
        }
        if (entity.getFull_name() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFull_name());
        }
        if (entity.getPhone_number() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPhone_number());
        }
        statement.bindLong(6, entity.getRole_id());
        if (entity.getOffline_token() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getOffline_token());
        }
        if (entity.getWorker_code() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getWorker_code());
        }
        final int _tmp = entity.is_active() ? 1 : 0;
        statement.bindLong(9, _tmp);
        statement.bindLong(10, entity.getCreated_at());
        statement.bindLong(11, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(12, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(13);
        } else {
          statement.bindLong(13, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getServer_id());
        }
      }
    };
    this.__updateAdapterOfUserEntity = new EntityDeletionOrUpdateAdapter<UserEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `users` SET `id` = ?,`username` = ?,`password_hash` = ?,`full_name` = ?,`phone_number` = ?,`role_id` = ?,`offline_token` = ?,`worker_code` = ?,`is_active` = ?,`created_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getUsername() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUsername());
        }
        if (entity.getPassword_hash() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPassword_hash());
        }
        if (entity.getFull_name() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFull_name());
        }
        if (entity.getPhone_number() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPhone_number());
        }
        statement.bindLong(6, entity.getRole_id());
        if (entity.getOffline_token() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getOffline_token());
        }
        if (entity.getWorker_code() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getWorker_code());
        }
        final int _tmp = entity.is_active() ? 1 : 0;
        statement.bindLong(9, _tmp);
        statement.bindLong(10, entity.getCreated_at());
        statement.bindLong(11, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(12, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(13);
        } else {
          statement.bindLong(13, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getServer_id());
        }
        if (entity.getId() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDeactivateUser = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE users SET is_active = 0, updated_at = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSyncStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE users \n"
                + "        SET is_synced = ?, \n"
                + "            last_synced_at = ?, \n"
                + "            server_id = ? \n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteUser = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM users WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertUser(final UserEntity user, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfUserEntity.insertAndReturnId(user);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertUsers(final List<UserEntity> users,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfUserEntity.insertAndReturnIdsList(users);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateUser(final UserEntity user, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfUserEntity.handle(user);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deactivateUser(final String userId, final long timestamp,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeactivateUser.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 2;
        if (userId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, userId);
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
          __preparedStmtOfDeactivateUser.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateSyncStatus(final String userId, final boolean isSynced, final long syncedAt,
      final String serverId, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSyncStatus.acquire();
        int _argIndex = 1;
        final int _tmp = isSynced ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, syncedAt);
        _argIndex = 3;
        if (serverId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, serverId);
        }
        _argIndex = 4;
        if (userId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, userId);
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
          __preparedStmtOfUpdateSyncStatus.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteUser(final String userId, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUser.acquire();
        int _argIndex = 1;
        if (userId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, userId);
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
          __preparedStmtOfDeleteUser.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getUserById(final String userId,
      final Continuation<? super UserEntity> $completion) {
    final String _sql = "SELECT * FROM users WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserEntity>() {
      @Override
      @Nullable
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final UserEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _result = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<UserEntity> observeUserById(final String userId) {
    final String _sql = "SELECT * FROM users WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"users"}, new Callable<UserEntity>() {
      @Override
      @Nullable
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final UserEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _result = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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

  @Override
  public Object getUserByUsername(final String username,
      final Continuation<? super UserEntity> $completion) {
    final String _sql = "SELECT * FROM users WHERE username = ? AND is_active = 1 LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserEntity>() {
      @Override
      @Nullable
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final UserEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _result = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getUserByPhone(final String phoneNumber,
      final Continuation<? super UserEntity> $completion) {
    final String _sql = "SELECT * FROM users WHERE phone_number = ? AND is_active = 1 LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (phoneNumber == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, phoneNumber);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserEntity>() {
      @Override
      @Nullable
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final UserEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _result = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getUsersByRole(final int roleId,
      final Continuation<? super List<UserEntity>> $completion) {
    final String _sql = "SELECT * FROM users WHERE role_id = ? AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, roleId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserEntity>>() {
      @Override
      @NonNull
      public List<UserEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserEntity> _result = new ArrayList<UserEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _item = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<UserEntity>> observeUsersByRole(final int roleId) {
    final String _sql = "SELECT * FROM users WHERE role_id = ? AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, roleId);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"users"}, new Callable<List<UserEntity>>() {
      @Override
      @NonNull
      public List<UserEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserEntity> _result = new ArrayList<UserEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _item = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getAllActiveUsers(final Continuation<? super List<UserEntity>> $completion) {
    final String _sql = "SELECT * FROM users WHERE is_active = 1 ORDER BY full_name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserEntity>>() {
      @Override
      @NonNull
      public List<UserEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserEntity> _result = new ArrayList<UserEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _item = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<UserEntity>> observeAllActiveUsers() {
    final String _sql = "SELECT * FROM users WHERE is_active = 1 ORDER BY full_name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"users"}, new Callable<List<UserEntity>>() {
      @Override
      @NonNull
      public List<UserEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserEntity> _result = new ArrayList<UserEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _item = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object authenticateUser(final String username, final String passwordHash,
      final Continuation<? super UserEntity> $completion) {
    final String _sql = "\n"
            + "        SELECT * FROM users \n"
            + "        WHERE username = ? \n"
            + "        AND password_hash = ? \n"
            + "        AND is_active = 1 \n"
            + "        LIMIT 1\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    _argIndex = 2;
    if (passwordHash == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, passwordHash);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserEntity>() {
      @Override
      @Nullable
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final UserEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _result = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getUserByOfflineToken(final String token,
      final Continuation<? super UserEntity> $completion) {
    final String _sql = "\n"
            + "        SELECT * FROM users \n"
            + "        WHERE offline_token = ? \n"
            + "        AND is_active = 1 \n"
            + "        LIMIT 1\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (token == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, token);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserEntity>() {
      @Override
      @Nullable
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final UserEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _result = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getUnsyncedUsers(final Continuation<? super List<UserEntity>> $completion) {
    final String _sql = "SELECT * FROM users WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserEntity>>() {
      @Override
      @NonNull
      public List<UserEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "password_hash");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "role_id");
          final int _cursorIndexOfOfflineToken = CursorUtil.getColumnIndexOrThrow(_cursor, "offline_token");
          final int _cursorIndexOfWorkerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "worker_code");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<UserEntity> _result = new ArrayList<UserEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final UserEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPassword_hash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPassword_hash = null;
            } else {
              _tmpPassword_hash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpPhone_number;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhone_number = null;
            } else {
              _tmpPhone_number = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final int _tmpRole_id;
            _tmpRole_id = _cursor.getInt(_cursorIndexOfRoleId);
            final String _tmpOffline_token;
            if (_cursor.isNull(_cursorIndexOfOfflineToken)) {
              _tmpOffline_token = null;
            } else {
              _tmpOffline_token = _cursor.getString(_cursorIndexOfOfflineToken);
            }
            final String _tmpWorker_code;
            if (_cursor.isNull(_cursorIndexOfWorkerCode)) {
              _tmpWorker_code = null;
            } else {
              _tmpWorker_code = _cursor.getString(_cursorIndexOfWorkerCode);
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
            _item = new UserEntity(_tmpId,_tmpUsername,_tmpPassword_hash,_tmpFull_name,_tmpPhone_number,_tmpRole_id,_tmpOffline_token,_tmpWorker_code,_tmpIs_active,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getUnsyncedCount(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM users WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
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
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<Integer> observeUnsyncedCount() {
    final String _sql = "SELECT COUNT(*) FROM users WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"users"}, new Callable<Integer>() {
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
