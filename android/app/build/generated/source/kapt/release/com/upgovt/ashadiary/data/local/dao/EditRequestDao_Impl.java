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
import com.upgovt.ashadiary.data.local.entities.EditRequestEntity;
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
public final class EditRequestDao_Impl implements EditRequestDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EditRequestEntity> __insertionAdapterOfEditRequestEntity;

  private final EntityDeletionOrUpdateAdapter<EditRequestEntity> __updateAdapterOfEditRequestEntity;

  private final SharedSQLiteStatement __preparedStmtOfApproveRequest;

  private final SharedSQLiteStatement __preparedStmtOfRejectRequest;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public EditRequestDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEditRequestEntity = new EntityInsertionAdapter<EditRequestEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `edit_requests` (`id`,`beneficiary_id`,`field_name`,`current_value`,`requested_value`,`reason_hindi`,`status`,`requested_by_user_id`,`requested_at`,`request_gps_lat`,`request_gps_lng`,`reviewed_by_user_id`,`reviewed_at`,`review_notes_hindi`,`created_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final EditRequestEntity entity) {
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
        if (entity.getField_name() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getField_name());
        }
        if (entity.getCurrent_value() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCurrent_value());
        }
        if (entity.getRequested_value() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getRequested_value());
        }
        if (entity.getReason_hindi() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getReason_hindi());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getStatus());
        }
        if (entity.getRequested_by_user_id() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getRequested_by_user_id());
        }
        statement.bindLong(9, entity.getRequested_at());
        statement.bindDouble(10, entity.getRequest_gps_lat());
        statement.bindDouble(11, entity.getRequest_gps_lng());
        if (entity.getReviewed_by_user_id() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getReviewed_by_user_id());
        }
        if (entity.getReviewed_at() == null) {
          statement.bindNull(13);
        } else {
          statement.bindLong(13, entity.getReviewed_at());
        }
        if (entity.getReview_notes_hindi() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getReview_notes_hindi());
        }
        statement.bindLong(15, entity.getCreated_at());
        statement.bindLong(16, entity.getUpdated_at());
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
    this.__updateAdapterOfEditRequestEntity = new EntityDeletionOrUpdateAdapter<EditRequestEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `edit_requests` SET `id` = ?,`beneficiary_id` = ?,`field_name` = ?,`current_value` = ?,`requested_value` = ?,`reason_hindi` = ?,`status` = ?,`requested_by_user_id` = ?,`requested_at` = ?,`request_gps_lat` = ?,`request_gps_lng` = ?,`reviewed_by_user_id` = ?,`reviewed_at` = ?,`review_notes_hindi` = ?,`created_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final EditRequestEntity entity) {
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
        if (entity.getField_name() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getField_name());
        }
        if (entity.getCurrent_value() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCurrent_value());
        }
        if (entity.getRequested_value() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getRequested_value());
        }
        if (entity.getReason_hindi() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getReason_hindi());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getStatus());
        }
        if (entity.getRequested_by_user_id() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getRequested_by_user_id());
        }
        statement.bindLong(9, entity.getRequested_at());
        statement.bindDouble(10, entity.getRequest_gps_lat());
        statement.bindDouble(11, entity.getRequest_gps_lng());
        if (entity.getReviewed_by_user_id() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getReviewed_by_user_id());
        }
        if (entity.getReviewed_at() == null) {
          statement.bindNull(13);
        } else {
          statement.bindLong(13, entity.getReviewed_at());
        }
        if (entity.getReview_notes_hindi() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getReview_notes_hindi());
        }
        statement.bindLong(15, entity.getCreated_at());
        statement.bindLong(16, entity.getUpdated_at());
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
        if (entity.getId() == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.getId());
        }
      }
    };
    this.__preparedStmtOfApproveRequest = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE edit_requests \n"
                + "        SET status = 'APPROVED',\n"
                + "            reviewed_by_user_id = ?,\n"
                + "            reviewed_at = ?,\n"
                + "            review_notes_hindi = ?,\n"
                + "            updated_at = ?\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfRejectRequest = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE edit_requests \n"
                + "        SET status = 'REJECTED',\n"
                + "            reviewed_by_user_id = ?,\n"
                + "            reviewed_at = ?,\n"
                + "            review_notes_hindi = ?,\n"
                + "            updated_at = ?\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM edit_requests WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final EditRequestEntity request,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfEditRequestEntity.insertAndReturnId(request);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<EditRequestEntity> requests,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfEditRequestEntity.insertAndReturnIdsList(requests);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final EditRequestEntity request,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfEditRequestEntity.handle(request);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object approveRequest(final String requestId, final String reviewedByUserId,
      final long reviewedAt, final String reviewNotes,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfApproveRequest.acquire();
        int _argIndex = 1;
        if (reviewedByUserId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, reviewedByUserId);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, reviewedAt);
        _argIndex = 3;
        if (reviewNotes == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, reviewNotes);
        }
        _argIndex = 4;
        _stmt.bindLong(_argIndex, reviewedAt);
        _argIndex = 5;
        if (requestId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, requestId);
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
          __preparedStmtOfApproveRequest.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object rejectRequest(final String requestId, final String reviewedByUserId,
      final long reviewedAt, final String reviewNotes,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfRejectRequest.acquire();
        int _argIndex = 1;
        if (reviewedByUserId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, reviewedByUserId);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, reviewedAt);
        _argIndex = 3;
        if (reviewNotes == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, reviewNotes);
        }
        _argIndex = 4;
        _stmt.bindLong(_argIndex, reviewedAt);
        _argIndex = 5;
        if (requestId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, requestId);
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
          __preparedStmtOfRejectRequest.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final String requestId, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        if (requestId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, requestId);
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
  public Object getById(final String requestId,
      final Continuation<? super EditRequestEntity> $completion) {
    final String _sql = "SELECT * FROM edit_requests WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (requestId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, requestId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<EditRequestEntity>() {
      @Override
      @Nullable
      public EditRequestEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final EditRequestEntity _result;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _result = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<EditRequestEntity> observeById(final String requestId) {
    final String _sql = "SELECT * FROM edit_requests WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (requestId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, requestId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"edit_requests"}, new Callable<EditRequestEntity>() {
      @Override
      @Nullable
      public EditRequestEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final EditRequestEntity _result;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _result = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getByBeneficiary(final String beneficiaryId,
      final Continuation<? super List<EditRequestEntity>> $completion) {
    final String _sql = "SELECT * FROM edit_requests WHERE beneficiary_id = ? ORDER BY requested_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<EditRequestEntity>> observeByBeneficiary(final String beneficiaryId) {
    final String _sql = "SELECT * FROM edit_requests WHERE beneficiary_id = ? ORDER BY requested_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"edit_requests"}, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getByStatus(final String status,
      final Continuation<? super List<EditRequestEntity>> $completion) {
    final String _sql = "SELECT * FROM edit_requests WHERE status = ? ORDER BY requested_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (status == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, status);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<EditRequestEntity>> observeByStatus(final String status) {
    final String _sql = "SELECT * FROM edit_requests WHERE status = ? ORDER BY requested_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (status == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, status);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"edit_requests"}, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getPendingRequests(
      final Continuation<? super List<EditRequestEntity>> $completion) {
    final String _sql = "SELECT * FROM edit_requests WHERE status = 'PENDING' ORDER BY requested_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<EditRequestEntity>> observePendingRequests() {
    final String _sql = "SELECT * FROM edit_requests WHERE status = 'PENDING' ORDER BY requested_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"edit_requests"}, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getByRequestedUser(final String userId,
      final Continuation<? super List<EditRequestEntity>> $completion) {
    final String _sql = "SELECT * FROM edit_requests WHERE requested_by_user_id = ? ORDER BY requested_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<EditRequestEntity>> observeByRequestedUser(final String userId) {
    final String _sql = "SELECT * FROM edit_requests WHERE requested_by_user_id = ? ORDER BY requested_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"edit_requests"}, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getUnsynced(final Continuation<? super List<EditRequestEntity>> $completion) {
    final String _sql = "SELECT * FROM edit_requests WHERE is_synced = 0 ORDER BY requested_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<EditRequestEntity>>() {
      @Override
      @NonNull
      public List<EditRequestEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfFieldName = CursorUtil.getColumnIndexOrThrow(_cursor, "field_name");
          final int _cursorIndexOfCurrentValue = CursorUtil.getColumnIndexOrThrow(_cursor, "current_value");
          final int _cursorIndexOfRequestedValue = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_value");
          final int _cursorIndexOfReasonHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "reason_hindi");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRequestedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by_user_id");
          final int _cursorIndexOfRequestedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_at");
          final int _cursorIndexOfRequestGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lat");
          final int _cursorIndexOfRequestGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "request_gps_lng");
          final int _cursorIndexOfReviewedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_by_user_id");
          final int _cursorIndexOfReviewedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "reviewed_at");
          final int _cursorIndexOfReviewNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "review_notes_hindi");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<EditRequestEntity> _result = new ArrayList<EditRequestEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final EditRequestEntity _item;
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
            final String _tmpField_name;
            if (_cursor.isNull(_cursorIndexOfFieldName)) {
              _tmpField_name = null;
            } else {
              _tmpField_name = _cursor.getString(_cursorIndexOfFieldName);
            }
            final String _tmpCurrent_value;
            if (_cursor.isNull(_cursorIndexOfCurrentValue)) {
              _tmpCurrent_value = null;
            } else {
              _tmpCurrent_value = _cursor.getString(_cursorIndexOfCurrentValue);
            }
            final String _tmpRequested_value;
            if (_cursor.isNull(_cursorIndexOfRequestedValue)) {
              _tmpRequested_value = null;
            } else {
              _tmpRequested_value = _cursor.getString(_cursorIndexOfRequestedValue);
            }
            final String _tmpReason_hindi;
            if (_cursor.isNull(_cursorIndexOfReasonHindi)) {
              _tmpReason_hindi = null;
            } else {
              _tmpReason_hindi = _cursor.getString(_cursorIndexOfReasonHindi);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpRequested_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRequestedByUserId)) {
              _tmpRequested_by_user_id = null;
            } else {
              _tmpRequested_by_user_id = _cursor.getString(_cursorIndexOfRequestedByUserId);
            }
            final long _tmpRequested_at;
            _tmpRequested_at = _cursor.getLong(_cursorIndexOfRequestedAt);
            final double _tmpRequest_gps_lat;
            _tmpRequest_gps_lat = _cursor.getDouble(_cursorIndexOfRequestGpsLat);
            final double _tmpRequest_gps_lng;
            _tmpRequest_gps_lng = _cursor.getDouble(_cursorIndexOfRequestGpsLng);
            final String _tmpReviewed_by_user_id;
            if (_cursor.isNull(_cursorIndexOfReviewedByUserId)) {
              _tmpReviewed_by_user_id = null;
            } else {
              _tmpReviewed_by_user_id = _cursor.getString(_cursorIndexOfReviewedByUserId);
            }
            final Long _tmpReviewed_at;
            if (_cursor.isNull(_cursorIndexOfReviewedAt)) {
              _tmpReviewed_at = null;
            } else {
              _tmpReviewed_at = _cursor.getLong(_cursorIndexOfReviewedAt);
            }
            final String _tmpReview_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfReviewNotesHindi)) {
              _tmpReview_notes_hindi = null;
            } else {
              _tmpReview_notes_hindi = _cursor.getString(_cursorIndexOfReviewNotesHindi);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
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
            _item = new EditRequestEntity(_tmpId,_tmpBeneficiary_id,_tmpField_name,_tmpCurrent_value,_tmpRequested_value,_tmpReason_hindi,_tmpStatus,_tmpRequested_by_user_id,_tmpRequested_at,_tmpRequest_gps_lat,_tmpRequest_gps_lng,_tmpReviewed_by_user_id,_tmpReviewed_at,_tmpReview_notes_hindi,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getPendingCount(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM edit_requests WHERE status = 'PENDING'";
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
    final String _sql = "SELECT COUNT(*) FROM edit_requests WHERE status = 'PENDING'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"edit_requests"}, new Callable<Integer>() {
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

  @Override
  public Flow<Integer> observeUnsyncedCount() {
    final String _sql = "SELECT COUNT(*) FROM edit_requests WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"edit_requests"}, new Callable<Integer>() {
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
