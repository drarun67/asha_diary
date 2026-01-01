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
import com.upgovt.ashadiary.data.local.entities.SyncQueueEntity;
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
public final class SyncQueueDao_Impl implements SyncQueueDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SyncQueueEntity> __insertionAdapterOfSyncQueueEntity;

  private final EntityDeletionOrUpdateAdapter<SyncQueueEntity> __updateAdapterOfSyncQueueEntity;

  private final SharedSQLiteStatement __preparedStmtOfMarkAsSuccess;

  private final SharedSQLiteStatement __preparedStmtOfMarkAsFailed;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOldSuccessful;

  public SyncQueueDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSyncQueueEntity = new EntityInsertionAdapter<SyncQueueEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `sync_queue` (`id`,`entity_type`,`entity_id`,`operation`,`payload_json`,`priority`,`sync_status`,`retry_count`,`max_retries`,`last_retry_at`,`next_retry_at`,`last_error_message`,`last_error_code`,`user_role_id`,`sync_version`,`created_at`,`updated_at`,`synced_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SyncQueueEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getEntity_type() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getEntity_type());
        }
        if (entity.getEntity_id() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEntity_id());
        }
        if (entity.getOperation() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getOperation());
        }
        if (entity.getPayload_json() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPayload_json());
        }
        statement.bindLong(6, entity.getPriority());
        if (entity.getSync_status() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getSync_status());
        }
        statement.bindLong(8, entity.getRetry_count());
        statement.bindLong(9, entity.getMax_retries());
        if (entity.getLast_retry_at() == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, entity.getLast_retry_at());
        }
        if (entity.getNext_retry_at() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, entity.getNext_retry_at());
        }
        if (entity.getLast_error_message() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getLast_error_message());
        }
        if (entity.getLast_error_code() == null) {
          statement.bindNull(13);
        } else {
          statement.bindLong(13, entity.getLast_error_code());
        }
        statement.bindLong(14, entity.getUser_role_id());
        statement.bindLong(15, entity.getSync_version());
        statement.bindLong(16, entity.getCreated_at());
        statement.bindLong(17, entity.getUpdated_at());
        if (entity.getSynced_at() == null) {
          statement.bindNull(18);
        } else {
          statement.bindLong(18, entity.getSynced_at());
        }
      }
    };
    this.__updateAdapterOfSyncQueueEntity = new EntityDeletionOrUpdateAdapter<SyncQueueEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `sync_queue` SET `id` = ?,`entity_type` = ?,`entity_id` = ?,`operation` = ?,`payload_json` = ?,`priority` = ?,`sync_status` = ?,`retry_count` = ?,`max_retries` = ?,`last_retry_at` = ?,`next_retry_at` = ?,`last_error_message` = ?,`last_error_code` = ?,`user_role_id` = ?,`sync_version` = ?,`created_at` = ?,`updated_at` = ?,`synced_at` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SyncQueueEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getEntity_type() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getEntity_type());
        }
        if (entity.getEntity_id() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEntity_id());
        }
        if (entity.getOperation() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getOperation());
        }
        if (entity.getPayload_json() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPayload_json());
        }
        statement.bindLong(6, entity.getPriority());
        if (entity.getSync_status() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getSync_status());
        }
        statement.bindLong(8, entity.getRetry_count());
        statement.bindLong(9, entity.getMax_retries());
        if (entity.getLast_retry_at() == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, entity.getLast_retry_at());
        }
        if (entity.getNext_retry_at() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, entity.getNext_retry_at());
        }
        if (entity.getLast_error_message() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getLast_error_message());
        }
        if (entity.getLast_error_code() == null) {
          statement.bindNull(13);
        } else {
          statement.bindLong(13, entity.getLast_error_code());
        }
        statement.bindLong(14, entity.getUser_role_id());
        statement.bindLong(15, entity.getSync_version());
        statement.bindLong(16, entity.getCreated_at());
        statement.bindLong(17, entity.getUpdated_at());
        if (entity.getSynced_at() == null) {
          statement.bindNull(18);
        } else {
          statement.bindLong(18, entity.getSynced_at());
        }
        if (entity.getId() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getId());
        }
      }
    };
    this.__preparedStmtOfMarkAsSuccess = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE sync_queue \n"
                + "        SET sync_status = 'SUCCESS',\n"
                + "            synced_at = ?,\n"
                + "            updated_at = ?\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAsFailed = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE sync_queue \n"
                + "        SET sync_status = 'FAILED',\n"
                + "            retry_count = retry_count + 1,\n"
                + "            last_retry_at = ?,\n"
                + "            next_retry_at = ?,\n"
                + "            last_error_message = ?,\n"
                + "            last_error_code = ?,\n"
                + "            updated_at = ?\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOldSuccessful = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM sync_queue WHERE sync_status = 'SUCCESS' AND synced_at < ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final SyncQueueEntity item, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfSyncQueueEntity.insertAndReturnId(item);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<SyncQueueEntity> items,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfSyncQueueEntity.insertAndReturnIdsList(items);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final SyncQueueEntity item,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfSyncQueueEntity.handle(item);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object markAsSuccess(final String queueId, final long syncedAt,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAsSuccess.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, syncedAt);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, syncedAt);
        _argIndex = 3;
        if (queueId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, queueId);
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
          __preparedStmtOfMarkAsSuccess.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object markAsFailed(final String queueId, final String errorMessage,
      final Integer errorCode, final long attemptedAt, final long nextRetryAt,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAsFailed.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, attemptedAt);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, nextRetryAt);
        _argIndex = 3;
        if (errorMessage == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, errorMessage);
        }
        _argIndex = 4;
        if (errorCode == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, errorCode);
        }
        _argIndex = 5;
        _stmt.bindLong(_argIndex, attemptedAt);
        _argIndex = 6;
        if (queueId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, queueId);
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
          __preparedStmtOfMarkAsFailed.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteOldSuccessful(final long olderThan,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOldSuccessful.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, olderThan);
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
          __preparedStmtOfDeleteOldSuccessful.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getPendingItems(final int limit,
      final Continuation<? super List<SyncQueueEntity>> $completion) {
    final String _sql = "SELECT * FROM sync_queue WHERE sync_status = 'PENDING' ORDER BY priority DESC, created_at ASC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SyncQueueEntity>>() {
      @Override
      @NonNull
      public List<SyncQueueEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEntityType = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_type");
          final int _cursorIndexOfEntityId = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_id");
          final int _cursorIndexOfOperation = CursorUtil.getColumnIndexOrThrow(_cursor, "operation");
          final int _cursorIndexOfPayloadJson = CursorUtil.getColumnIndexOrThrow(_cursor, "payload_json");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfSyncStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_status");
          final int _cursorIndexOfRetryCount = CursorUtil.getColumnIndexOrThrow(_cursor, "retry_count");
          final int _cursorIndexOfMaxRetries = CursorUtil.getColumnIndexOrThrow(_cursor, "max_retries");
          final int _cursorIndexOfLastRetryAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_retry_at");
          final int _cursorIndexOfNextRetryAt = CursorUtil.getColumnIndexOrThrow(_cursor, "next_retry_at");
          final int _cursorIndexOfLastErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "last_error_message");
          final int _cursorIndexOfLastErrorCode = CursorUtil.getColumnIndexOrThrow(_cursor, "last_error_code");
          final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "synced_at");
          final List<SyncQueueEntity> _result = new ArrayList<SyncQueueEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final SyncQueueEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
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
            final String _tmpOperation;
            if (_cursor.isNull(_cursorIndexOfOperation)) {
              _tmpOperation = null;
            } else {
              _tmpOperation = _cursor.getString(_cursorIndexOfOperation);
            }
            final String _tmpPayload_json;
            if (_cursor.isNull(_cursorIndexOfPayloadJson)) {
              _tmpPayload_json = null;
            } else {
              _tmpPayload_json = _cursor.getString(_cursorIndexOfPayloadJson);
            }
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            final String _tmpSync_status;
            if (_cursor.isNull(_cursorIndexOfSyncStatus)) {
              _tmpSync_status = null;
            } else {
              _tmpSync_status = _cursor.getString(_cursorIndexOfSyncStatus);
            }
            final int _tmpRetry_count;
            _tmpRetry_count = _cursor.getInt(_cursorIndexOfRetryCount);
            final int _tmpMax_retries;
            _tmpMax_retries = _cursor.getInt(_cursorIndexOfMaxRetries);
            final Long _tmpLast_retry_at;
            if (_cursor.isNull(_cursorIndexOfLastRetryAt)) {
              _tmpLast_retry_at = null;
            } else {
              _tmpLast_retry_at = _cursor.getLong(_cursorIndexOfLastRetryAt);
            }
            final Long _tmpNext_retry_at;
            if (_cursor.isNull(_cursorIndexOfNextRetryAt)) {
              _tmpNext_retry_at = null;
            } else {
              _tmpNext_retry_at = _cursor.getLong(_cursorIndexOfNextRetryAt);
            }
            final String _tmpLast_error_message;
            if (_cursor.isNull(_cursorIndexOfLastErrorMessage)) {
              _tmpLast_error_message = null;
            } else {
              _tmpLast_error_message = _cursor.getString(_cursorIndexOfLastErrorMessage);
            }
            final Integer _tmpLast_error_code;
            if (_cursor.isNull(_cursorIndexOfLastErrorCode)) {
              _tmpLast_error_code = null;
            } else {
              _tmpLast_error_code = _cursor.getInt(_cursorIndexOfLastErrorCode);
            }
            final int _tmpUser_role_id;
            _tmpUser_role_id = _cursor.getInt(_cursorIndexOfUserRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpSynced_at;
            if (_cursor.isNull(_cursorIndexOfSyncedAt)) {
              _tmpSynced_at = null;
            } else {
              _tmpSynced_at = _cursor.getLong(_cursorIndexOfSyncedAt);
            }
            _item = new SyncQueueEntity(_tmpId,_tmpEntity_type,_tmpEntity_id,_tmpOperation,_tmpPayload_json,_tmpPriority,_tmpSync_status,_tmpRetry_count,_tmpMax_retries,_tmpLast_retry_at,_tmpNext_retry_at,_tmpLast_error_message,_tmpLast_error_code,_tmpUser_role_id,_tmpSync_version,_tmpCreated_at,_tmpUpdated_at,_tmpSynced_at);
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
  public Object getRetryableItems(final int limit,
      final Continuation<? super List<SyncQueueEntity>> $completion) {
    final String _sql = "SELECT * FROM sync_queue WHERE sync_status = 'FAILED' AND retry_count < max_retries ORDER BY next_retry_at ASC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SyncQueueEntity>>() {
      @Override
      @NonNull
      public List<SyncQueueEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEntityType = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_type");
          final int _cursorIndexOfEntityId = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_id");
          final int _cursorIndexOfOperation = CursorUtil.getColumnIndexOrThrow(_cursor, "operation");
          final int _cursorIndexOfPayloadJson = CursorUtil.getColumnIndexOrThrow(_cursor, "payload_json");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfSyncStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_status");
          final int _cursorIndexOfRetryCount = CursorUtil.getColumnIndexOrThrow(_cursor, "retry_count");
          final int _cursorIndexOfMaxRetries = CursorUtil.getColumnIndexOrThrow(_cursor, "max_retries");
          final int _cursorIndexOfLastRetryAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_retry_at");
          final int _cursorIndexOfNextRetryAt = CursorUtil.getColumnIndexOrThrow(_cursor, "next_retry_at");
          final int _cursorIndexOfLastErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "last_error_message");
          final int _cursorIndexOfLastErrorCode = CursorUtil.getColumnIndexOrThrow(_cursor, "last_error_code");
          final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "synced_at");
          final List<SyncQueueEntity> _result = new ArrayList<SyncQueueEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final SyncQueueEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
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
            final String _tmpOperation;
            if (_cursor.isNull(_cursorIndexOfOperation)) {
              _tmpOperation = null;
            } else {
              _tmpOperation = _cursor.getString(_cursorIndexOfOperation);
            }
            final String _tmpPayload_json;
            if (_cursor.isNull(_cursorIndexOfPayloadJson)) {
              _tmpPayload_json = null;
            } else {
              _tmpPayload_json = _cursor.getString(_cursorIndexOfPayloadJson);
            }
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            final String _tmpSync_status;
            if (_cursor.isNull(_cursorIndexOfSyncStatus)) {
              _tmpSync_status = null;
            } else {
              _tmpSync_status = _cursor.getString(_cursorIndexOfSyncStatus);
            }
            final int _tmpRetry_count;
            _tmpRetry_count = _cursor.getInt(_cursorIndexOfRetryCount);
            final int _tmpMax_retries;
            _tmpMax_retries = _cursor.getInt(_cursorIndexOfMaxRetries);
            final Long _tmpLast_retry_at;
            if (_cursor.isNull(_cursorIndexOfLastRetryAt)) {
              _tmpLast_retry_at = null;
            } else {
              _tmpLast_retry_at = _cursor.getLong(_cursorIndexOfLastRetryAt);
            }
            final Long _tmpNext_retry_at;
            if (_cursor.isNull(_cursorIndexOfNextRetryAt)) {
              _tmpNext_retry_at = null;
            } else {
              _tmpNext_retry_at = _cursor.getLong(_cursorIndexOfNextRetryAt);
            }
            final String _tmpLast_error_message;
            if (_cursor.isNull(_cursorIndexOfLastErrorMessage)) {
              _tmpLast_error_message = null;
            } else {
              _tmpLast_error_message = _cursor.getString(_cursorIndexOfLastErrorMessage);
            }
            final Integer _tmpLast_error_code;
            if (_cursor.isNull(_cursorIndexOfLastErrorCode)) {
              _tmpLast_error_code = null;
            } else {
              _tmpLast_error_code = _cursor.getInt(_cursorIndexOfLastErrorCode);
            }
            final int _tmpUser_role_id;
            _tmpUser_role_id = _cursor.getInt(_cursorIndexOfUserRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpSynced_at;
            if (_cursor.isNull(_cursorIndexOfSyncedAt)) {
              _tmpSynced_at = null;
            } else {
              _tmpSynced_at = _cursor.getLong(_cursorIndexOfSyncedAt);
            }
            _item = new SyncQueueEntity(_tmpId,_tmpEntity_type,_tmpEntity_id,_tmpOperation,_tmpPayload_json,_tmpPriority,_tmpSync_status,_tmpRetry_count,_tmpMax_retries,_tmpLast_retry_at,_tmpNext_retry_at,_tmpLast_error_message,_tmpLast_error_code,_tmpUser_role_id,_tmpSync_version,_tmpCreated_at,_tmpUpdated_at,_tmpSynced_at);
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
  public Object getByEntity(final String entityType, final String entityId,
      final Continuation<? super SyncQueueEntity> $completion) {
    final String _sql = "SELECT * FROM sync_queue WHERE entity_type = ? AND entity_id = ? LIMIT 1";
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
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<SyncQueueEntity>() {
      @Override
      @Nullable
      public SyncQueueEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEntityType = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_type");
          final int _cursorIndexOfEntityId = CursorUtil.getColumnIndexOrThrow(_cursor, "entity_id");
          final int _cursorIndexOfOperation = CursorUtil.getColumnIndexOrThrow(_cursor, "operation");
          final int _cursorIndexOfPayloadJson = CursorUtil.getColumnIndexOrThrow(_cursor, "payload_json");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfSyncStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_status");
          final int _cursorIndexOfRetryCount = CursorUtil.getColumnIndexOrThrow(_cursor, "retry_count");
          final int _cursorIndexOfMaxRetries = CursorUtil.getColumnIndexOrThrow(_cursor, "max_retries");
          final int _cursorIndexOfLastRetryAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_retry_at");
          final int _cursorIndexOfNextRetryAt = CursorUtil.getColumnIndexOrThrow(_cursor, "next_retry_at");
          final int _cursorIndexOfLastErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "last_error_message");
          final int _cursorIndexOfLastErrorCode = CursorUtil.getColumnIndexOrThrow(_cursor, "last_error_code");
          final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "synced_at");
          final SyncQueueEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
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
            final String _tmpOperation;
            if (_cursor.isNull(_cursorIndexOfOperation)) {
              _tmpOperation = null;
            } else {
              _tmpOperation = _cursor.getString(_cursorIndexOfOperation);
            }
            final String _tmpPayload_json;
            if (_cursor.isNull(_cursorIndexOfPayloadJson)) {
              _tmpPayload_json = null;
            } else {
              _tmpPayload_json = _cursor.getString(_cursorIndexOfPayloadJson);
            }
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            final String _tmpSync_status;
            if (_cursor.isNull(_cursorIndexOfSyncStatus)) {
              _tmpSync_status = null;
            } else {
              _tmpSync_status = _cursor.getString(_cursorIndexOfSyncStatus);
            }
            final int _tmpRetry_count;
            _tmpRetry_count = _cursor.getInt(_cursorIndexOfRetryCount);
            final int _tmpMax_retries;
            _tmpMax_retries = _cursor.getInt(_cursorIndexOfMaxRetries);
            final Long _tmpLast_retry_at;
            if (_cursor.isNull(_cursorIndexOfLastRetryAt)) {
              _tmpLast_retry_at = null;
            } else {
              _tmpLast_retry_at = _cursor.getLong(_cursorIndexOfLastRetryAt);
            }
            final Long _tmpNext_retry_at;
            if (_cursor.isNull(_cursorIndexOfNextRetryAt)) {
              _tmpNext_retry_at = null;
            } else {
              _tmpNext_retry_at = _cursor.getLong(_cursorIndexOfNextRetryAt);
            }
            final String _tmpLast_error_message;
            if (_cursor.isNull(_cursorIndexOfLastErrorMessage)) {
              _tmpLast_error_message = null;
            } else {
              _tmpLast_error_message = _cursor.getString(_cursorIndexOfLastErrorMessage);
            }
            final Integer _tmpLast_error_code;
            if (_cursor.isNull(_cursorIndexOfLastErrorCode)) {
              _tmpLast_error_code = null;
            } else {
              _tmpLast_error_code = _cursor.getInt(_cursorIndexOfLastErrorCode);
            }
            final int _tmpUser_role_id;
            _tmpUser_role_id = _cursor.getInt(_cursorIndexOfUserRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpSynced_at;
            if (_cursor.isNull(_cursorIndexOfSyncedAt)) {
              _tmpSynced_at = null;
            } else {
              _tmpSynced_at = _cursor.getLong(_cursorIndexOfSyncedAt);
            }
            _result = new SyncQueueEntity(_tmpId,_tmpEntity_type,_tmpEntity_id,_tmpOperation,_tmpPayload_json,_tmpPriority,_tmpSync_status,_tmpRetry_count,_tmpMax_retries,_tmpLast_retry_at,_tmpNext_retry_at,_tmpLast_error_message,_tmpLast_error_code,_tmpUser_role_id,_tmpSync_version,_tmpCreated_at,_tmpUpdated_at,_tmpSynced_at);
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
  public Object getPendingCount(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM sync_queue WHERE sync_status = 'PENDING' OR sync_status = 'FAILED'";
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
  public Flow<Integer> observePendingCount() {
    final String _sql = "SELECT COUNT(*) FROM sync_queue WHERE sync_status = 'PENDING' OR sync_status = 'FAILED'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"sync_queue"}, new Callable<Integer>() {
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
