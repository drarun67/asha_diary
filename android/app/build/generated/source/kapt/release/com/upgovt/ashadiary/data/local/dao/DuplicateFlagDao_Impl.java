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
import com.upgovt.ashadiary.data.local.entities.DuplicateFlagEntity;
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
public final class DuplicateFlagDao_Impl implements DuplicateFlagDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DuplicateFlagEntity> __insertionAdapterOfDuplicateFlagEntity;

  private final EntityDeletionOrUpdateAdapter<DuplicateFlagEntity> __updateAdapterOfDuplicateFlagEntity;

  private final SharedSQLiteStatement __preparedStmtOfResolveFlag;

  public DuplicateFlagDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDuplicateFlagEntity = new EntityInsertionAdapter<DuplicateFlagEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `duplicate_flags` (`id`,`beneficiary_id_1`,`beneficiary_id_2`,`similarity_score`,`name_match`,`village_match`,`gender_match`,`age_within_range`,`status`,`flagged_by_user_id`,`flagged_at`,`flag_source`,`resolved_by_user_id`,`resolved_at`,`resolution_action`,`resolution_notes_hindi`,`master_beneficiary_id`,`created_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DuplicateFlagEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getBeneficiary_id_1() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBeneficiary_id_1());
        }
        if (entity.getBeneficiary_id_2() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getBeneficiary_id_2());
        }
        statement.bindLong(4, entity.getSimilarity_score());
        final int _tmp = entity.getName_match() ? 1 : 0;
        statement.bindLong(5, _tmp);
        final int _tmp_1 = entity.getVillage_match() ? 1 : 0;
        statement.bindLong(6, _tmp_1);
        final int _tmp_2 = entity.getGender_match() ? 1 : 0;
        statement.bindLong(7, _tmp_2);
        final int _tmp_3 = entity.getAge_within_range() ? 1 : 0;
        statement.bindLong(8, _tmp_3);
        if (entity.getStatus() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getStatus());
        }
        if (entity.getFlagged_by_user_id() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getFlagged_by_user_id());
        }
        statement.bindLong(11, entity.getFlagged_at());
        if (entity.getFlag_source() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getFlag_source());
        }
        if (entity.getResolved_by_user_id() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getResolved_by_user_id());
        }
        if (entity.getResolved_at() == null) {
          statement.bindNull(14);
        } else {
          statement.bindLong(14, entity.getResolved_at());
        }
        if (entity.getResolution_action() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getResolution_action());
        }
        if (entity.getResolution_notes_hindi() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getResolution_notes_hindi());
        }
        if (entity.getMaster_beneficiary_id() == null) {
          statement.bindNull(17);
        } else {
          statement.bindString(17, entity.getMaster_beneficiary_id());
        }
        statement.bindLong(18, entity.getCreated_at());
        statement.bindLong(19, entity.getUpdated_at());
        final int _tmp_4 = entity.is_synced() ? 1 : 0;
        statement.bindLong(20, _tmp_4);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(21);
        } else {
          statement.bindLong(21, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(22);
        } else {
          statement.bindString(22, entity.getServer_id());
        }
      }
    };
    this.__updateAdapterOfDuplicateFlagEntity = new EntityDeletionOrUpdateAdapter<DuplicateFlagEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `duplicate_flags` SET `id` = ?,`beneficiary_id_1` = ?,`beneficiary_id_2` = ?,`similarity_score` = ?,`name_match` = ?,`village_match` = ?,`gender_match` = ?,`age_within_range` = ?,`status` = ?,`flagged_by_user_id` = ?,`flagged_at` = ?,`flag_source` = ?,`resolved_by_user_id` = ?,`resolved_at` = ?,`resolution_action` = ?,`resolution_notes_hindi` = ?,`master_beneficiary_id` = ?,`created_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DuplicateFlagEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getBeneficiary_id_1() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBeneficiary_id_1());
        }
        if (entity.getBeneficiary_id_2() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getBeneficiary_id_2());
        }
        statement.bindLong(4, entity.getSimilarity_score());
        final int _tmp = entity.getName_match() ? 1 : 0;
        statement.bindLong(5, _tmp);
        final int _tmp_1 = entity.getVillage_match() ? 1 : 0;
        statement.bindLong(6, _tmp_1);
        final int _tmp_2 = entity.getGender_match() ? 1 : 0;
        statement.bindLong(7, _tmp_2);
        final int _tmp_3 = entity.getAge_within_range() ? 1 : 0;
        statement.bindLong(8, _tmp_3);
        if (entity.getStatus() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getStatus());
        }
        if (entity.getFlagged_by_user_id() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getFlagged_by_user_id());
        }
        statement.bindLong(11, entity.getFlagged_at());
        if (entity.getFlag_source() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getFlag_source());
        }
        if (entity.getResolved_by_user_id() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getResolved_by_user_id());
        }
        if (entity.getResolved_at() == null) {
          statement.bindNull(14);
        } else {
          statement.bindLong(14, entity.getResolved_at());
        }
        if (entity.getResolution_action() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getResolution_action());
        }
        if (entity.getResolution_notes_hindi() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getResolution_notes_hindi());
        }
        if (entity.getMaster_beneficiary_id() == null) {
          statement.bindNull(17);
        } else {
          statement.bindString(17, entity.getMaster_beneficiary_id());
        }
        statement.bindLong(18, entity.getCreated_at());
        statement.bindLong(19, entity.getUpdated_at());
        final int _tmp_4 = entity.is_synced() ? 1 : 0;
        statement.bindLong(20, _tmp_4);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(21);
        } else {
          statement.bindLong(21, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(22);
        } else {
          statement.bindString(22, entity.getServer_id());
        }
        if (entity.getId() == null) {
          statement.bindNull(23);
        } else {
          statement.bindString(23, entity.getId());
        }
      }
    };
    this.__preparedStmtOfResolveFlag = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE duplicate_flags \n"
                + "        SET status = ?,\n"
                + "            resolution_action = ?,\n"
                + "            resolution_notes_hindi = ?,\n"
                + "            resolved_by_user_id = ?,\n"
                + "            resolved_at = ?,\n"
                + "            master_beneficiary_id = ?,\n"
                + "            updated_at = ?\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final DuplicateFlagEntity flag,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfDuplicateFlagEntity.insertAndReturnId(flag);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<DuplicateFlagEntity> flags,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfDuplicateFlagEntity.insertAndReturnIdsList(flags);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final DuplicateFlagEntity flag,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfDuplicateFlagEntity.handle(flag);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object resolveFlag(final String flagId, final String status, final String action,
      final String notes, final String resolvedByUserId, final long resolvedAt,
      final String masterBeneficiaryId, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfResolveFlag.acquire();
        int _argIndex = 1;
        if (status == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, status);
        }
        _argIndex = 2;
        if (action == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, action);
        }
        _argIndex = 3;
        if (notes == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, notes);
        }
        _argIndex = 4;
        if (resolvedByUserId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, resolvedByUserId);
        }
        _argIndex = 5;
        _stmt.bindLong(_argIndex, resolvedAt);
        _argIndex = 6;
        if (masterBeneficiaryId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, masterBeneficiaryId);
        }
        _argIndex = 7;
        _stmt.bindLong(_argIndex, resolvedAt);
        _argIndex = 8;
        if (flagId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, flagId);
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
          __preparedStmtOfResolveFlag.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getById(final String flagId,
      final Continuation<? super DuplicateFlagEntity> $completion) {
    final String _sql = "SELECT * FROM duplicate_flags WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (flagId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, flagId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<DuplicateFlagEntity>() {
      @Override
      @Nullable
      public DuplicateFlagEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId1 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_1");
          final int _cursorIndexOfBeneficiaryId2 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_2");
          final int _cursorIndexOfSimilarityScore = CursorUtil.getColumnIndexOrThrow(_cursor, "similarity_score");
          final int _cursorIndexOfNameMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "name_match");
          final int _cursorIndexOfVillageMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "village_match");
          final int _cursorIndexOfGenderMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "gender_match");
          final int _cursorIndexOfAgeWithinRange = CursorUtil.getColumnIndexOrThrow(_cursor, "age_within_range");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfFlaggedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_by_user_id");
          final int _cursorIndexOfFlaggedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_at");
          final int _cursorIndexOfFlagSource = CursorUtil.getColumnIndexOrThrow(_cursor, "flag_source");
          final int _cursorIndexOfResolvedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_by_user_id");
          final int _cursorIndexOfResolvedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_at");
          final int _cursorIndexOfResolutionAction = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_action");
          final int _cursorIndexOfResolutionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_notes_hindi");
          final int _cursorIndexOfMasterBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "master_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final DuplicateFlagEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBeneficiary_id_1;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId1)) {
              _tmpBeneficiary_id_1 = null;
            } else {
              _tmpBeneficiary_id_1 = _cursor.getString(_cursorIndexOfBeneficiaryId1);
            }
            final String _tmpBeneficiary_id_2;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId2)) {
              _tmpBeneficiary_id_2 = null;
            } else {
              _tmpBeneficiary_id_2 = _cursor.getString(_cursorIndexOfBeneficiaryId2);
            }
            final int _tmpSimilarity_score;
            _tmpSimilarity_score = _cursor.getInt(_cursorIndexOfSimilarityScore);
            final boolean _tmpName_match;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNameMatch);
            _tmpName_match = _tmp != 0;
            final boolean _tmpVillage_match;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfVillageMatch);
            _tmpVillage_match = _tmp_1 != 0;
            final boolean _tmpGender_match;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGenderMatch);
            _tmpGender_match = _tmp_2 != 0;
            final boolean _tmpAge_within_range;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfAgeWithinRange);
            _tmpAge_within_range = _tmp_3 != 0;
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpFlagged_by_user_id;
            if (_cursor.isNull(_cursorIndexOfFlaggedByUserId)) {
              _tmpFlagged_by_user_id = null;
            } else {
              _tmpFlagged_by_user_id = _cursor.getString(_cursorIndexOfFlaggedByUserId);
            }
            final long _tmpFlagged_at;
            _tmpFlagged_at = _cursor.getLong(_cursorIndexOfFlaggedAt);
            final String _tmpFlag_source;
            if (_cursor.isNull(_cursorIndexOfFlagSource)) {
              _tmpFlag_source = null;
            } else {
              _tmpFlag_source = _cursor.getString(_cursorIndexOfFlagSource);
            }
            final String _tmpResolved_by_user_id;
            if (_cursor.isNull(_cursorIndexOfResolvedByUserId)) {
              _tmpResolved_by_user_id = null;
            } else {
              _tmpResolved_by_user_id = _cursor.getString(_cursorIndexOfResolvedByUserId);
            }
            final Long _tmpResolved_at;
            if (_cursor.isNull(_cursorIndexOfResolvedAt)) {
              _tmpResolved_at = null;
            } else {
              _tmpResolved_at = _cursor.getLong(_cursorIndexOfResolvedAt);
            }
            final String _tmpResolution_action;
            if (_cursor.isNull(_cursorIndexOfResolutionAction)) {
              _tmpResolution_action = null;
            } else {
              _tmpResolution_action = _cursor.getString(_cursorIndexOfResolutionAction);
            }
            final String _tmpResolution_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfResolutionNotesHindi)) {
              _tmpResolution_notes_hindi = null;
            } else {
              _tmpResolution_notes_hindi = _cursor.getString(_cursorIndexOfResolutionNotesHindi);
            }
            final String _tmpMaster_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfMasterBeneficiaryId)) {
              _tmpMaster_beneficiary_id = null;
            } else {
              _tmpMaster_beneficiary_id = _cursor.getString(_cursorIndexOfMasterBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_4 != 0;
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
            _result = new DuplicateFlagEntity(_tmpId,_tmpBeneficiary_id_1,_tmpBeneficiary_id_2,_tmpSimilarity_score,_tmpName_match,_tmpVillage_match,_tmpGender_match,_tmpAge_within_range,_tmpStatus,_tmpFlagged_by_user_id,_tmpFlagged_at,_tmpFlag_source,_tmpResolved_by_user_id,_tmpResolved_at,_tmpResolution_action,_tmpResolution_notes_hindi,_tmpMaster_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getPendingFlags(final Continuation<? super List<DuplicateFlagEntity>> $completion) {
    final String _sql = "SELECT * FROM duplicate_flags WHERE status = 'PENDING' ORDER BY similarity_score DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DuplicateFlagEntity>>() {
      @Override
      @NonNull
      public List<DuplicateFlagEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId1 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_1");
          final int _cursorIndexOfBeneficiaryId2 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_2");
          final int _cursorIndexOfSimilarityScore = CursorUtil.getColumnIndexOrThrow(_cursor, "similarity_score");
          final int _cursorIndexOfNameMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "name_match");
          final int _cursorIndexOfVillageMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "village_match");
          final int _cursorIndexOfGenderMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "gender_match");
          final int _cursorIndexOfAgeWithinRange = CursorUtil.getColumnIndexOrThrow(_cursor, "age_within_range");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfFlaggedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_by_user_id");
          final int _cursorIndexOfFlaggedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_at");
          final int _cursorIndexOfFlagSource = CursorUtil.getColumnIndexOrThrow(_cursor, "flag_source");
          final int _cursorIndexOfResolvedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_by_user_id");
          final int _cursorIndexOfResolvedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_at");
          final int _cursorIndexOfResolutionAction = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_action");
          final int _cursorIndexOfResolutionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_notes_hindi");
          final int _cursorIndexOfMasterBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "master_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<DuplicateFlagEntity> _result = new ArrayList<DuplicateFlagEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DuplicateFlagEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBeneficiary_id_1;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId1)) {
              _tmpBeneficiary_id_1 = null;
            } else {
              _tmpBeneficiary_id_1 = _cursor.getString(_cursorIndexOfBeneficiaryId1);
            }
            final String _tmpBeneficiary_id_2;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId2)) {
              _tmpBeneficiary_id_2 = null;
            } else {
              _tmpBeneficiary_id_2 = _cursor.getString(_cursorIndexOfBeneficiaryId2);
            }
            final int _tmpSimilarity_score;
            _tmpSimilarity_score = _cursor.getInt(_cursorIndexOfSimilarityScore);
            final boolean _tmpName_match;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNameMatch);
            _tmpName_match = _tmp != 0;
            final boolean _tmpVillage_match;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfVillageMatch);
            _tmpVillage_match = _tmp_1 != 0;
            final boolean _tmpGender_match;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGenderMatch);
            _tmpGender_match = _tmp_2 != 0;
            final boolean _tmpAge_within_range;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfAgeWithinRange);
            _tmpAge_within_range = _tmp_3 != 0;
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpFlagged_by_user_id;
            if (_cursor.isNull(_cursorIndexOfFlaggedByUserId)) {
              _tmpFlagged_by_user_id = null;
            } else {
              _tmpFlagged_by_user_id = _cursor.getString(_cursorIndexOfFlaggedByUserId);
            }
            final long _tmpFlagged_at;
            _tmpFlagged_at = _cursor.getLong(_cursorIndexOfFlaggedAt);
            final String _tmpFlag_source;
            if (_cursor.isNull(_cursorIndexOfFlagSource)) {
              _tmpFlag_source = null;
            } else {
              _tmpFlag_source = _cursor.getString(_cursorIndexOfFlagSource);
            }
            final String _tmpResolved_by_user_id;
            if (_cursor.isNull(_cursorIndexOfResolvedByUserId)) {
              _tmpResolved_by_user_id = null;
            } else {
              _tmpResolved_by_user_id = _cursor.getString(_cursorIndexOfResolvedByUserId);
            }
            final Long _tmpResolved_at;
            if (_cursor.isNull(_cursorIndexOfResolvedAt)) {
              _tmpResolved_at = null;
            } else {
              _tmpResolved_at = _cursor.getLong(_cursorIndexOfResolvedAt);
            }
            final String _tmpResolution_action;
            if (_cursor.isNull(_cursorIndexOfResolutionAction)) {
              _tmpResolution_action = null;
            } else {
              _tmpResolution_action = _cursor.getString(_cursorIndexOfResolutionAction);
            }
            final String _tmpResolution_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfResolutionNotesHindi)) {
              _tmpResolution_notes_hindi = null;
            } else {
              _tmpResolution_notes_hindi = _cursor.getString(_cursorIndexOfResolutionNotesHindi);
            }
            final String _tmpMaster_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfMasterBeneficiaryId)) {
              _tmpMaster_beneficiary_id = null;
            } else {
              _tmpMaster_beneficiary_id = _cursor.getString(_cursorIndexOfMasterBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_4 != 0;
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
            _item = new DuplicateFlagEntity(_tmpId,_tmpBeneficiary_id_1,_tmpBeneficiary_id_2,_tmpSimilarity_score,_tmpName_match,_tmpVillage_match,_tmpGender_match,_tmpAge_within_range,_tmpStatus,_tmpFlagged_by_user_id,_tmpFlagged_at,_tmpFlag_source,_tmpResolved_by_user_id,_tmpResolved_at,_tmpResolution_action,_tmpResolution_notes_hindi,_tmpMaster_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<List<DuplicateFlagEntity>> observePendingFlags() {
    final String _sql = "SELECT * FROM duplicate_flags WHERE status = 'PENDING' ORDER BY similarity_score DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"duplicate_flags"}, new Callable<List<DuplicateFlagEntity>>() {
      @Override
      @NonNull
      public List<DuplicateFlagEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId1 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_1");
          final int _cursorIndexOfBeneficiaryId2 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_2");
          final int _cursorIndexOfSimilarityScore = CursorUtil.getColumnIndexOrThrow(_cursor, "similarity_score");
          final int _cursorIndexOfNameMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "name_match");
          final int _cursorIndexOfVillageMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "village_match");
          final int _cursorIndexOfGenderMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "gender_match");
          final int _cursorIndexOfAgeWithinRange = CursorUtil.getColumnIndexOrThrow(_cursor, "age_within_range");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfFlaggedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_by_user_id");
          final int _cursorIndexOfFlaggedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_at");
          final int _cursorIndexOfFlagSource = CursorUtil.getColumnIndexOrThrow(_cursor, "flag_source");
          final int _cursorIndexOfResolvedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_by_user_id");
          final int _cursorIndexOfResolvedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_at");
          final int _cursorIndexOfResolutionAction = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_action");
          final int _cursorIndexOfResolutionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_notes_hindi");
          final int _cursorIndexOfMasterBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "master_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<DuplicateFlagEntity> _result = new ArrayList<DuplicateFlagEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DuplicateFlagEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBeneficiary_id_1;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId1)) {
              _tmpBeneficiary_id_1 = null;
            } else {
              _tmpBeneficiary_id_1 = _cursor.getString(_cursorIndexOfBeneficiaryId1);
            }
            final String _tmpBeneficiary_id_2;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId2)) {
              _tmpBeneficiary_id_2 = null;
            } else {
              _tmpBeneficiary_id_2 = _cursor.getString(_cursorIndexOfBeneficiaryId2);
            }
            final int _tmpSimilarity_score;
            _tmpSimilarity_score = _cursor.getInt(_cursorIndexOfSimilarityScore);
            final boolean _tmpName_match;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNameMatch);
            _tmpName_match = _tmp != 0;
            final boolean _tmpVillage_match;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfVillageMatch);
            _tmpVillage_match = _tmp_1 != 0;
            final boolean _tmpGender_match;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGenderMatch);
            _tmpGender_match = _tmp_2 != 0;
            final boolean _tmpAge_within_range;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfAgeWithinRange);
            _tmpAge_within_range = _tmp_3 != 0;
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpFlagged_by_user_id;
            if (_cursor.isNull(_cursorIndexOfFlaggedByUserId)) {
              _tmpFlagged_by_user_id = null;
            } else {
              _tmpFlagged_by_user_id = _cursor.getString(_cursorIndexOfFlaggedByUserId);
            }
            final long _tmpFlagged_at;
            _tmpFlagged_at = _cursor.getLong(_cursorIndexOfFlaggedAt);
            final String _tmpFlag_source;
            if (_cursor.isNull(_cursorIndexOfFlagSource)) {
              _tmpFlag_source = null;
            } else {
              _tmpFlag_source = _cursor.getString(_cursorIndexOfFlagSource);
            }
            final String _tmpResolved_by_user_id;
            if (_cursor.isNull(_cursorIndexOfResolvedByUserId)) {
              _tmpResolved_by_user_id = null;
            } else {
              _tmpResolved_by_user_id = _cursor.getString(_cursorIndexOfResolvedByUserId);
            }
            final Long _tmpResolved_at;
            if (_cursor.isNull(_cursorIndexOfResolvedAt)) {
              _tmpResolved_at = null;
            } else {
              _tmpResolved_at = _cursor.getLong(_cursorIndexOfResolvedAt);
            }
            final String _tmpResolution_action;
            if (_cursor.isNull(_cursorIndexOfResolutionAction)) {
              _tmpResolution_action = null;
            } else {
              _tmpResolution_action = _cursor.getString(_cursorIndexOfResolutionAction);
            }
            final String _tmpResolution_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfResolutionNotesHindi)) {
              _tmpResolution_notes_hindi = null;
            } else {
              _tmpResolution_notes_hindi = _cursor.getString(_cursorIndexOfResolutionNotesHindi);
            }
            final String _tmpMaster_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfMasterBeneficiaryId)) {
              _tmpMaster_beneficiary_id = null;
            } else {
              _tmpMaster_beneficiary_id = _cursor.getString(_cursorIndexOfMasterBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_4 != 0;
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
            _item = new DuplicateFlagEntity(_tmpId,_tmpBeneficiary_id_1,_tmpBeneficiary_id_2,_tmpSimilarity_score,_tmpName_match,_tmpVillage_match,_tmpGender_match,_tmpAge_within_range,_tmpStatus,_tmpFlagged_by_user_id,_tmpFlagged_at,_tmpFlag_source,_tmpResolved_by_user_id,_tmpResolved_at,_tmpResolution_action,_tmpResolution_notes_hindi,_tmpMaster_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getByBeneficiary(final String beneficiaryId,
      final Continuation<? super List<DuplicateFlagEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT * FROM duplicate_flags \n"
            + "        WHERE (beneficiary_id_1 = ? OR beneficiary_id_2 = ?)\n"
            + "        ORDER BY flagged_at DESC\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    _argIndex = 2;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DuplicateFlagEntity>>() {
      @Override
      @NonNull
      public List<DuplicateFlagEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId1 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_1");
          final int _cursorIndexOfBeneficiaryId2 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_2");
          final int _cursorIndexOfSimilarityScore = CursorUtil.getColumnIndexOrThrow(_cursor, "similarity_score");
          final int _cursorIndexOfNameMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "name_match");
          final int _cursorIndexOfVillageMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "village_match");
          final int _cursorIndexOfGenderMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "gender_match");
          final int _cursorIndexOfAgeWithinRange = CursorUtil.getColumnIndexOrThrow(_cursor, "age_within_range");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfFlaggedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_by_user_id");
          final int _cursorIndexOfFlaggedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_at");
          final int _cursorIndexOfFlagSource = CursorUtil.getColumnIndexOrThrow(_cursor, "flag_source");
          final int _cursorIndexOfResolvedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_by_user_id");
          final int _cursorIndexOfResolvedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_at");
          final int _cursorIndexOfResolutionAction = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_action");
          final int _cursorIndexOfResolutionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_notes_hindi");
          final int _cursorIndexOfMasterBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "master_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<DuplicateFlagEntity> _result = new ArrayList<DuplicateFlagEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DuplicateFlagEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBeneficiary_id_1;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId1)) {
              _tmpBeneficiary_id_1 = null;
            } else {
              _tmpBeneficiary_id_1 = _cursor.getString(_cursorIndexOfBeneficiaryId1);
            }
            final String _tmpBeneficiary_id_2;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId2)) {
              _tmpBeneficiary_id_2 = null;
            } else {
              _tmpBeneficiary_id_2 = _cursor.getString(_cursorIndexOfBeneficiaryId2);
            }
            final int _tmpSimilarity_score;
            _tmpSimilarity_score = _cursor.getInt(_cursorIndexOfSimilarityScore);
            final boolean _tmpName_match;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNameMatch);
            _tmpName_match = _tmp != 0;
            final boolean _tmpVillage_match;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfVillageMatch);
            _tmpVillage_match = _tmp_1 != 0;
            final boolean _tmpGender_match;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGenderMatch);
            _tmpGender_match = _tmp_2 != 0;
            final boolean _tmpAge_within_range;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfAgeWithinRange);
            _tmpAge_within_range = _tmp_3 != 0;
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpFlagged_by_user_id;
            if (_cursor.isNull(_cursorIndexOfFlaggedByUserId)) {
              _tmpFlagged_by_user_id = null;
            } else {
              _tmpFlagged_by_user_id = _cursor.getString(_cursorIndexOfFlaggedByUserId);
            }
            final long _tmpFlagged_at;
            _tmpFlagged_at = _cursor.getLong(_cursorIndexOfFlaggedAt);
            final String _tmpFlag_source;
            if (_cursor.isNull(_cursorIndexOfFlagSource)) {
              _tmpFlag_source = null;
            } else {
              _tmpFlag_source = _cursor.getString(_cursorIndexOfFlagSource);
            }
            final String _tmpResolved_by_user_id;
            if (_cursor.isNull(_cursorIndexOfResolvedByUserId)) {
              _tmpResolved_by_user_id = null;
            } else {
              _tmpResolved_by_user_id = _cursor.getString(_cursorIndexOfResolvedByUserId);
            }
            final Long _tmpResolved_at;
            if (_cursor.isNull(_cursorIndexOfResolvedAt)) {
              _tmpResolved_at = null;
            } else {
              _tmpResolved_at = _cursor.getLong(_cursorIndexOfResolvedAt);
            }
            final String _tmpResolution_action;
            if (_cursor.isNull(_cursorIndexOfResolutionAction)) {
              _tmpResolution_action = null;
            } else {
              _tmpResolution_action = _cursor.getString(_cursorIndexOfResolutionAction);
            }
            final String _tmpResolution_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfResolutionNotesHindi)) {
              _tmpResolution_notes_hindi = null;
            } else {
              _tmpResolution_notes_hindi = _cursor.getString(_cursorIndexOfResolutionNotesHindi);
            }
            final String _tmpMaster_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfMasterBeneficiaryId)) {
              _tmpMaster_beneficiary_id = null;
            } else {
              _tmpMaster_beneficiary_id = _cursor.getString(_cursorIndexOfMasterBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_4 != 0;
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
            _item = new DuplicateFlagEntity(_tmpId,_tmpBeneficiary_id_1,_tmpBeneficiary_id_2,_tmpSimilarity_score,_tmpName_match,_tmpVillage_match,_tmpGender_match,_tmpAge_within_range,_tmpStatus,_tmpFlagged_by_user_id,_tmpFlagged_at,_tmpFlag_source,_tmpResolved_by_user_id,_tmpResolved_at,_tmpResolution_action,_tmpResolution_notes_hindi,_tmpMaster_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Object getUnsynced(final Continuation<? super List<DuplicateFlagEntity>> $completion) {
    final String _sql = "SELECT * FROM duplicate_flags WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DuplicateFlagEntity>>() {
      @Override
      @NonNull
      public List<DuplicateFlagEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId1 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_1");
          final int _cursorIndexOfBeneficiaryId2 = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id_2");
          final int _cursorIndexOfSimilarityScore = CursorUtil.getColumnIndexOrThrow(_cursor, "similarity_score");
          final int _cursorIndexOfNameMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "name_match");
          final int _cursorIndexOfVillageMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "village_match");
          final int _cursorIndexOfGenderMatch = CursorUtil.getColumnIndexOrThrow(_cursor, "gender_match");
          final int _cursorIndexOfAgeWithinRange = CursorUtil.getColumnIndexOrThrow(_cursor, "age_within_range");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfFlaggedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_by_user_id");
          final int _cursorIndexOfFlaggedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "flagged_at");
          final int _cursorIndexOfFlagSource = CursorUtil.getColumnIndexOrThrow(_cursor, "flag_source");
          final int _cursorIndexOfResolvedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_by_user_id");
          final int _cursorIndexOfResolvedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "resolved_at");
          final int _cursorIndexOfResolutionAction = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_action");
          final int _cursorIndexOfResolutionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "resolution_notes_hindi");
          final int _cursorIndexOfMasterBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "master_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final List<DuplicateFlagEntity> _result = new ArrayList<DuplicateFlagEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DuplicateFlagEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpBeneficiary_id_1;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId1)) {
              _tmpBeneficiary_id_1 = null;
            } else {
              _tmpBeneficiary_id_1 = _cursor.getString(_cursorIndexOfBeneficiaryId1);
            }
            final String _tmpBeneficiary_id_2;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryId2)) {
              _tmpBeneficiary_id_2 = null;
            } else {
              _tmpBeneficiary_id_2 = _cursor.getString(_cursorIndexOfBeneficiaryId2);
            }
            final int _tmpSimilarity_score;
            _tmpSimilarity_score = _cursor.getInt(_cursorIndexOfSimilarityScore);
            final boolean _tmpName_match;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNameMatch);
            _tmpName_match = _tmp != 0;
            final boolean _tmpVillage_match;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfVillageMatch);
            _tmpVillage_match = _tmp_1 != 0;
            final boolean _tmpGender_match;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfGenderMatch);
            _tmpGender_match = _tmp_2 != 0;
            final boolean _tmpAge_within_range;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfAgeWithinRange);
            _tmpAge_within_range = _tmp_3 != 0;
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpFlagged_by_user_id;
            if (_cursor.isNull(_cursorIndexOfFlaggedByUserId)) {
              _tmpFlagged_by_user_id = null;
            } else {
              _tmpFlagged_by_user_id = _cursor.getString(_cursorIndexOfFlaggedByUserId);
            }
            final long _tmpFlagged_at;
            _tmpFlagged_at = _cursor.getLong(_cursorIndexOfFlaggedAt);
            final String _tmpFlag_source;
            if (_cursor.isNull(_cursorIndexOfFlagSource)) {
              _tmpFlag_source = null;
            } else {
              _tmpFlag_source = _cursor.getString(_cursorIndexOfFlagSource);
            }
            final String _tmpResolved_by_user_id;
            if (_cursor.isNull(_cursorIndexOfResolvedByUserId)) {
              _tmpResolved_by_user_id = null;
            } else {
              _tmpResolved_by_user_id = _cursor.getString(_cursorIndexOfResolvedByUserId);
            }
            final Long _tmpResolved_at;
            if (_cursor.isNull(_cursorIndexOfResolvedAt)) {
              _tmpResolved_at = null;
            } else {
              _tmpResolved_at = _cursor.getLong(_cursorIndexOfResolvedAt);
            }
            final String _tmpResolution_action;
            if (_cursor.isNull(_cursorIndexOfResolutionAction)) {
              _tmpResolution_action = null;
            } else {
              _tmpResolution_action = _cursor.getString(_cursorIndexOfResolutionAction);
            }
            final String _tmpResolution_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfResolutionNotesHindi)) {
              _tmpResolution_notes_hindi = null;
            } else {
              _tmpResolution_notes_hindi = _cursor.getString(_cursorIndexOfResolutionNotesHindi);
            }
            final String _tmpMaster_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfMasterBeneficiaryId)) {
              _tmpMaster_beneficiary_id = null;
            } else {
              _tmpMaster_beneficiary_id = _cursor.getString(_cursorIndexOfMasterBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final boolean _tmpIs_synced;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_4 != 0;
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
            _item = new DuplicateFlagEntity(_tmpId,_tmpBeneficiary_id_1,_tmpBeneficiary_id_2,_tmpSimilarity_score,_tmpName_match,_tmpVillage_match,_tmpGender_match,_tmpAge_within_range,_tmpStatus,_tmpFlagged_by_user_id,_tmpFlagged_at,_tmpFlag_source,_tmpResolved_by_user_id,_tmpResolved_at,_tmpResolution_action,_tmpResolution_notes_hindi,_tmpMaster_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id);
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
  public Flow<Integer> observePendingCount() {
    final String _sql = "SELECT COUNT(*) FROM duplicate_flags WHERE status = 'PENDING'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"duplicate_flags"}, new Callable<Integer>() {
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
