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
import com.upgovt.ashadiary.data.local.entities.BPVisitEntity;
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
public final class BPVisitDao_Impl implements BPVisitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BPVisitEntity> __insertionAdapterOfBPVisitEntity;

  private final EntityDeletionOrUpdateAdapter<BPVisitEntity> __updateAdapterOfBPVisitEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public BPVisitDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBPVisitEntity = new EntityInsertionAdapter<BPVisitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `bp_visits` (`id`,`beneficiary_id`,`visit_date`,`bp_systolic`,`bp_diastolic`,`pulse_rate`,`bp_category`,`is_referred`,`referral_facility_hindi`,`follow_up_date`,`medications_prescribed_hindi`,`advice_notes_hindi`,`recorded_by_user_id`,`recorded_at`,`gps_lat`,`gps_lng`,`created_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`,`last_modified_by_role_id`,`sync_version`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BPVisitEntity entity) {
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
        statement.bindLong(3, entity.getVisit_date());
        statement.bindLong(4, entity.getBp_systolic());
        statement.bindLong(5, entity.getBp_diastolic());
        if (entity.getPulse_rate() == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, entity.getPulse_rate());
        }
        if (entity.getBp_category() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getBp_category());
        }
        final int _tmp = entity.is_referred() ? 1 : 0;
        statement.bindLong(8, _tmp);
        if (entity.getReferral_facility_hindi() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getReferral_facility_hindi());
        }
        if (entity.getFollow_up_date() == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, entity.getFollow_up_date());
        }
        if (entity.getMedications_prescribed_hindi() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getMedications_prescribed_hindi());
        }
        if (entity.getAdvice_notes_hindi() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getAdvice_notes_hindi());
        }
        if (entity.getRecorded_by_user_id() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getRecorded_by_user_id());
        }
        statement.bindLong(14, entity.getRecorded_at());
        statement.bindDouble(15, entity.getGps_lat());
        statement.bindDouble(16, entity.getGps_lng());
        statement.bindLong(17, entity.getCreated_at());
        statement.bindLong(18, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(19, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(20);
        } else {
          statement.bindLong(20, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, entity.getServer_id());
        }
        statement.bindLong(22, entity.getLast_modified_by_role_id());
        statement.bindLong(23, entity.getSync_version());
      }
    };
    this.__updateAdapterOfBPVisitEntity = new EntityDeletionOrUpdateAdapter<BPVisitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `bp_visits` SET `id` = ?,`beneficiary_id` = ?,`visit_date` = ?,`bp_systolic` = ?,`bp_diastolic` = ?,`pulse_rate` = ?,`bp_category` = ?,`is_referred` = ?,`referral_facility_hindi` = ?,`follow_up_date` = ?,`medications_prescribed_hindi` = ?,`advice_notes_hindi` = ?,`recorded_by_user_id` = ?,`recorded_at` = ?,`gps_lat` = ?,`gps_lng` = ?,`created_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ?,`last_modified_by_role_id` = ?,`sync_version` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BPVisitEntity entity) {
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
        statement.bindLong(3, entity.getVisit_date());
        statement.bindLong(4, entity.getBp_systolic());
        statement.bindLong(5, entity.getBp_diastolic());
        if (entity.getPulse_rate() == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, entity.getPulse_rate());
        }
        if (entity.getBp_category() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getBp_category());
        }
        final int _tmp = entity.is_referred() ? 1 : 0;
        statement.bindLong(8, _tmp);
        if (entity.getReferral_facility_hindi() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getReferral_facility_hindi());
        }
        if (entity.getFollow_up_date() == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, entity.getFollow_up_date());
        }
        if (entity.getMedications_prescribed_hindi() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getMedications_prescribed_hindi());
        }
        if (entity.getAdvice_notes_hindi() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getAdvice_notes_hindi());
        }
        if (entity.getRecorded_by_user_id() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getRecorded_by_user_id());
        }
        statement.bindLong(14, entity.getRecorded_at());
        statement.bindDouble(15, entity.getGps_lat());
        statement.bindDouble(16, entity.getGps_lng());
        statement.bindLong(17, entity.getCreated_at());
        statement.bindLong(18, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(19, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(20);
        } else {
          statement.bindLong(20, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, entity.getServer_id());
        }
        statement.bindLong(22, entity.getLast_modified_by_role_id());
        statement.bindLong(23, entity.getSync_version());
        if (entity.getId() == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM bp_visits WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final BPVisitEntity visit, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfBPVisitEntity.insertAndReturnId(visit);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<BPVisitEntity> visits,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfBPVisitEntity.insertAndReturnIdsList(visits);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final BPVisitEntity visit, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfBPVisitEntity.handle(visit);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final String visitId, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        if (visitId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, visitId);
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
  public Object getById(final String visitId,
      final Continuation<? super BPVisitEntity> $completion) {
    final String _sql = "SELECT * FROM bp_visits WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (visitId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, visitId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<BPVisitEntity>() {
      @Override
      @Nullable
      public BPVisitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfBpSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_systolic");
          final int _cursorIndexOfBpDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_diastolic");
          final int _cursorIndexOfPulseRate = CursorUtil.getColumnIndexOrThrow(_cursor, "pulse_rate");
          final int _cursorIndexOfBpCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_category");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfAdviceNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "advice_notes_hindi");
          final int _cursorIndexOfRecordedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_by_user_id");
          final int _cursorIndexOfRecordedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_at");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final BPVisitEntity _result;
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
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final int _tmpBp_systolic;
            _tmpBp_systolic = _cursor.getInt(_cursorIndexOfBpSystolic);
            final int _tmpBp_diastolic;
            _tmpBp_diastolic = _cursor.getInt(_cursorIndexOfBpDiastolic);
            final Integer _tmpPulse_rate;
            if (_cursor.isNull(_cursorIndexOfPulseRate)) {
              _tmpPulse_rate = null;
            } else {
              _tmpPulse_rate = _cursor.getInt(_cursorIndexOfPulseRate);
            }
            final String _tmpBp_category;
            if (_cursor.isNull(_cursorIndexOfBpCategory)) {
              _tmpBp_category = null;
            } else {
              _tmpBp_category = _cursor.getString(_cursorIndexOfBpCategory);
            }
            final boolean _tmpIs_referred;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsReferred);
            _tmpIs_referred = _tmp != 0;
            final String _tmpReferral_facility_hindi;
            if (_cursor.isNull(_cursorIndexOfReferralFacilityHindi)) {
              _tmpReferral_facility_hindi = null;
            } else {
              _tmpReferral_facility_hindi = _cursor.getString(_cursorIndexOfReferralFacilityHindi);
            }
            final Long _tmpFollow_up_date;
            if (_cursor.isNull(_cursorIndexOfFollowUpDate)) {
              _tmpFollow_up_date = null;
            } else {
              _tmpFollow_up_date = _cursor.getLong(_cursorIndexOfFollowUpDate);
            }
            final String _tmpMedications_prescribed_hindi;
            if (_cursor.isNull(_cursorIndexOfMedicationsPrescribedHindi)) {
              _tmpMedications_prescribed_hindi = null;
            } else {
              _tmpMedications_prescribed_hindi = _cursor.getString(_cursorIndexOfMedicationsPrescribedHindi);
            }
            final String _tmpAdvice_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdviceNotesHindi)) {
              _tmpAdvice_notes_hindi = null;
            } else {
              _tmpAdvice_notes_hindi = _cursor.getString(_cursorIndexOfAdviceNotesHindi);
            }
            final String _tmpRecorded_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRecordedByUserId)) {
              _tmpRecorded_by_user_id = null;
            } else {
              _tmpRecorded_by_user_id = _cursor.getString(_cursorIndexOfRecordedByUserId);
            }
            final long _tmpRecorded_at;
            _tmpRecorded_at = _cursor.getLong(_cursorIndexOfRecordedAt);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _result = new BPVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpBp_systolic,_tmpBp_diastolic,_tmpPulse_rate,_tmpBp_category,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getByBeneficiary(final String beneficiaryId,
      final Continuation<? super List<BPVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM bp_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BPVisitEntity>>() {
      @Override
      @NonNull
      public List<BPVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfBpSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_systolic");
          final int _cursorIndexOfBpDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_diastolic");
          final int _cursorIndexOfPulseRate = CursorUtil.getColumnIndexOrThrow(_cursor, "pulse_rate");
          final int _cursorIndexOfBpCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_category");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfAdviceNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "advice_notes_hindi");
          final int _cursorIndexOfRecordedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_by_user_id");
          final int _cursorIndexOfRecordedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_at");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BPVisitEntity> _result = new ArrayList<BPVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BPVisitEntity _item;
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
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final int _tmpBp_systolic;
            _tmpBp_systolic = _cursor.getInt(_cursorIndexOfBpSystolic);
            final int _tmpBp_diastolic;
            _tmpBp_diastolic = _cursor.getInt(_cursorIndexOfBpDiastolic);
            final Integer _tmpPulse_rate;
            if (_cursor.isNull(_cursorIndexOfPulseRate)) {
              _tmpPulse_rate = null;
            } else {
              _tmpPulse_rate = _cursor.getInt(_cursorIndexOfPulseRate);
            }
            final String _tmpBp_category;
            if (_cursor.isNull(_cursorIndexOfBpCategory)) {
              _tmpBp_category = null;
            } else {
              _tmpBp_category = _cursor.getString(_cursorIndexOfBpCategory);
            }
            final boolean _tmpIs_referred;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsReferred);
            _tmpIs_referred = _tmp != 0;
            final String _tmpReferral_facility_hindi;
            if (_cursor.isNull(_cursorIndexOfReferralFacilityHindi)) {
              _tmpReferral_facility_hindi = null;
            } else {
              _tmpReferral_facility_hindi = _cursor.getString(_cursorIndexOfReferralFacilityHindi);
            }
            final Long _tmpFollow_up_date;
            if (_cursor.isNull(_cursorIndexOfFollowUpDate)) {
              _tmpFollow_up_date = null;
            } else {
              _tmpFollow_up_date = _cursor.getLong(_cursorIndexOfFollowUpDate);
            }
            final String _tmpMedications_prescribed_hindi;
            if (_cursor.isNull(_cursorIndexOfMedicationsPrescribedHindi)) {
              _tmpMedications_prescribed_hindi = null;
            } else {
              _tmpMedications_prescribed_hindi = _cursor.getString(_cursorIndexOfMedicationsPrescribedHindi);
            }
            final String _tmpAdvice_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdviceNotesHindi)) {
              _tmpAdvice_notes_hindi = null;
            } else {
              _tmpAdvice_notes_hindi = _cursor.getString(_cursorIndexOfAdviceNotesHindi);
            }
            final String _tmpRecorded_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRecordedByUserId)) {
              _tmpRecorded_by_user_id = null;
            } else {
              _tmpRecorded_by_user_id = _cursor.getString(_cursorIndexOfRecordedByUserId);
            }
            final long _tmpRecorded_at;
            _tmpRecorded_at = _cursor.getLong(_cursorIndexOfRecordedAt);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _item = new BPVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpBp_systolic,_tmpBp_diastolic,_tmpPulse_rate,_tmpBp_category,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<List<BPVisitEntity>> observeByBeneficiary(final String beneficiaryId) {
    final String _sql = "SELECT * FROM bp_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"bp_visits"}, new Callable<List<BPVisitEntity>>() {
      @Override
      @NonNull
      public List<BPVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfBpSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_systolic");
          final int _cursorIndexOfBpDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_diastolic");
          final int _cursorIndexOfPulseRate = CursorUtil.getColumnIndexOrThrow(_cursor, "pulse_rate");
          final int _cursorIndexOfBpCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_category");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfAdviceNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "advice_notes_hindi");
          final int _cursorIndexOfRecordedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_by_user_id");
          final int _cursorIndexOfRecordedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_at");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BPVisitEntity> _result = new ArrayList<BPVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BPVisitEntity _item;
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
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final int _tmpBp_systolic;
            _tmpBp_systolic = _cursor.getInt(_cursorIndexOfBpSystolic);
            final int _tmpBp_diastolic;
            _tmpBp_diastolic = _cursor.getInt(_cursorIndexOfBpDiastolic);
            final Integer _tmpPulse_rate;
            if (_cursor.isNull(_cursorIndexOfPulseRate)) {
              _tmpPulse_rate = null;
            } else {
              _tmpPulse_rate = _cursor.getInt(_cursorIndexOfPulseRate);
            }
            final String _tmpBp_category;
            if (_cursor.isNull(_cursorIndexOfBpCategory)) {
              _tmpBp_category = null;
            } else {
              _tmpBp_category = _cursor.getString(_cursorIndexOfBpCategory);
            }
            final boolean _tmpIs_referred;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsReferred);
            _tmpIs_referred = _tmp != 0;
            final String _tmpReferral_facility_hindi;
            if (_cursor.isNull(_cursorIndexOfReferralFacilityHindi)) {
              _tmpReferral_facility_hindi = null;
            } else {
              _tmpReferral_facility_hindi = _cursor.getString(_cursorIndexOfReferralFacilityHindi);
            }
            final Long _tmpFollow_up_date;
            if (_cursor.isNull(_cursorIndexOfFollowUpDate)) {
              _tmpFollow_up_date = null;
            } else {
              _tmpFollow_up_date = _cursor.getLong(_cursorIndexOfFollowUpDate);
            }
            final String _tmpMedications_prescribed_hindi;
            if (_cursor.isNull(_cursorIndexOfMedicationsPrescribedHindi)) {
              _tmpMedications_prescribed_hindi = null;
            } else {
              _tmpMedications_prescribed_hindi = _cursor.getString(_cursorIndexOfMedicationsPrescribedHindi);
            }
            final String _tmpAdvice_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdviceNotesHindi)) {
              _tmpAdvice_notes_hindi = null;
            } else {
              _tmpAdvice_notes_hindi = _cursor.getString(_cursorIndexOfAdviceNotesHindi);
            }
            final String _tmpRecorded_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRecordedByUserId)) {
              _tmpRecorded_by_user_id = null;
            } else {
              _tmpRecorded_by_user_id = _cursor.getString(_cursorIndexOfRecordedByUserId);
            }
            final long _tmpRecorded_at;
            _tmpRecorded_at = _cursor.getLong(_cursorIndexOfRecordedAt);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _item = new BPVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpBp_systolic,_tmpBp_diastolic,_tmpPulse_rate,_tmpBp_category,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getLatestVisit(final String beneficiaryId,
      final Continuation<? super BPVisitEntity> $completion) {
    final String _sql = "SELECT * FROM bp_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<BPVisitEntity>() {
      @Override
      @Nullable
      public BPVisitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfBpSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_systolic");
          final int _cursorIndexOfBpDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_diastolic");
          final int _cursorIndexOfPulseRate = CursorUtil.getColumnIndexOrThrow(_cursor, "pulse_rate");
          final int _cursorIndexOfBpCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_category");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfAdviceNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "advice_notes_hindi");
          final int _cursorIndexOfRecordedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_by_user_id");
          final int _cursorIndexOfRecordedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_at");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final BPVisitEntity _result;
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
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final int _tmpBp_systolic;
            _tmpBp_systolic = _cursor.getInt(_cursorIndexOfBpSystolic);
            final int _tmpBp_diastolic;
            _tmpBp_diastolic = _cursor.getInt(_cursorIndexOfBpDiastolic);
            final Integer _tmpPulse_rate;
            if (_cursor.isNull(_cursorIndexOfPulseRate)) {
              _tmpPulse_rate = null;
            } else {
              _tmpPulse_rate = _cursor.getInt(_cursorIndexOfPulseRate);
            }
            final String _tmpBp_category;
            if (_cursor.isNull(_cursorIndexOfBpCategory)) {
              _tmpBp_category = null;
            } else {
              _tmpBp_category = _cursor.getString(_cursorIndexOfBpCategory);
            }
            final boolean _tmpIs_referred;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsReferred);
            _tmpIs_referred = _tmp != 0;
            final String _tmpReferral_facility_hindi;
            if (_cursor.isNull(_cursorIndexOfReferralFacilityHindi)) {
              _tmpReferral_facility_hindi = null;
            } else {
              _tmpReferral_facility_hindi = _cursor.getString(_cursorIndexOfReferralFacilityHindi);
            }
            final Long _tmpFollow_up_date;
            if (_cursor.isNull(_cursorIndexOfFollowUpDate)) {
              _tmpFollow_up_date = null;
            } else {
              _tmpFollow_up_date = _cursor.getLong(_cursorIndexOfFollowUpDate);
            }
            final String _tmpMedications_prescribed_hindi;
            if (_cursor.isNull(_cursorIndexOfMedicationsPrescribedHindi)) {
              _tmpMedications_prescribed_hindi = null;
            } else {
              _tmpMedications_prescribed_hindi = _cursor.getString(_cursorIndexOfMedicationsPrescribedHindi);
            }
            final String _tmpAdvice_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdviceNotesHindi)) {
              _tmpAdvice_notes_hindi = null;
            } else {
              _tmpAdvice_notes_hindi = _cursor.getString(_cursorIndexOfAdviceNotesHindi);
            }
            final String _tmpRecorded_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRecordedByUserId)) {
              _tmpRecorded_by_user_id = null;
            } else {
              _tmpRecorded_by_user_id = _cursor.getString(_cursorIndexOfRecordedByUserId);
            }
            final long _tmpRecorded_at;
            _tmpRecorded_at = _cursor.getLong(_cursorIndexOfRecordedAt);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _result = new BPVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpBp_systolic,_tmpBp_diastolic,_tmpPulse_rate,_tmpBp_category,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getHighRiskVisits(final Continuation<? super List<BPVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM bp_visits WHERE bp_category IN ('HIGH_STAGE_2', 'HYPERTENSIVE_CRISIS') ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BPVisitEntity>>() {
      @Override
      @NonNull
      public List<BPVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfBpSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_systolic");
          final int _cursorIndexOfBpDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_diastolic");
          final int _cursorIndexOfPulseRate = CursorUtil.getColumnIndexOrThrow(_cursor, "pulse_rate");
          final int _cursorIndexOfBpCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_category");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfAdviceNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "advice_notes_hindi");
          final int _cursorIndexOfRecordedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_by_user_id");
          final int _cursorIndexOfRecordedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_at");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BPVisitEntity> _result = new ArrayList<BPVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BPVisitEntity _item;
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
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final int _tmpBp_systolic;
            _tmpBp_systolic = _cursor.getInt(_cursorIndexOfBpSystolic);
            final int _tmpBp_diastolic;
            _tmpBp_diastolic = _cursor.getInt(_cursorIndexOfBpDiastolic);
            final Integer _tmpPulse_rate;
            if (_cursor.isNull(_cursorIndexOfPulseRate)) {
              _tmpPulse_rate = null;
            } else {
              _tmpPulse_rate = _cursor.getInt(_cursorIndexOfPulseRate);
            }
            final String _tmpBp_category;
            if (_cursor.isNull(_cursorIndexOfBpCategory)) {
              _tmpBp_category = null;
            } else {
              _tmpBp_category = _cursor.getString(_cursorIndexOfBpCategory);
            }
            final boolean _tmpIs_referred;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsReferred);
            _tmpIs_referred = _tmp != 0;
            final String _tmpReferral_facility_hindi;
            if (_cursor.isNull(_cursorIndexOfReferralFacilityHindi)) {
              _tmpReferral_facility_hindi = null;
            } else {
              _tmpReferral_facility_hindi = _cursor.getString(_cursorIndexOfReferralFacilityHindi);
            }
            final Long _tmpFollow_up_date;
            if (_cursor.isNull(_cursorIndexOfFollowUpDate)) {
              _tmpFollow_up_date = null;
            } else {
              _tmpFollow_up_date = _cursor.getLong(_cursorIndexOfFollowUpDate);
            }
            final String _tmpMedications_prescribed_hindi;
            if (_cursor.isNull(_cursorIndexOfMedicationsPrescribedHindi)) {
              _tmpMedications_prescribed_hindi = null;
            } else {
              _tmpMedications_prescribed_hindi = _cursor.getString(_cursorIndexOfMedicationsPrescribedHindi);
            }
            final String _tmpAdvice_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdviceNotesHindi)) {
              _tmpAdvice_notes_hindi = null;
            } else {
              _tmpAdvice_notes_hindi = _cursor.getString(_cursorIndexOfAdviceNotesHindi);
            }
            final String _tmpRecorded_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRecordedByUserId)) {
              _tmpRecorded_by_user_id = null;
            } else {
              _tmpRecorded_by_user_id = _cursor.getString(_cursorIndexOfRecordedByUserId);
            }
            final long _tmpRecorded_at;
            _tmpRecorded_at = _cursor.getLong(_cursorIndexOfRecordedAt);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _item = new BPVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpBp_systolic,_tmpBp_diastolic,_tmpPulse_rate,_tmpBp_category,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getUnsynced(final Continuation<? super List<BPVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM bp_visits WHERE is_synced = 0 ORDER BY recorded_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BPVisitEntity>>() {
      @Override
      @NonNull
      public List<BPVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfBpSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_systolic");
          final int _cursorIndexOfBpDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_diastolic");
          final int _cursorIndexOfPulseRate = CursorUtil.getColumnIndexOrThrow(_cursor, "pulse_rate");
          final int _cursorIndexOfBpCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "bp_category");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfAdviceNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "advice_notes_hindi");
          final int _cursorIndexOfRecordedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_by_user_id");
          final int _cursorIndexOfRecordedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "recorded_at");
          final int _cursorIndexOfGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lat");
          final int _cursorIndexOfGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "gps_lng");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BPVisitEntity> _result = new ArrayList<BPVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BPVisitEntity _item;
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
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final int _tmpBp_systolic;
            _tmpBp_systolic = _cursor.getInt(_cursorIndexOfBpSystolic);
            final int _tmpBp_diastolic;
            _tmpBp_diastolic = _cursor.getInt(_cursorIndexOfBpDiastolic);
            final Integer _tmpPulse_rate;
            if (_cursor.isNull(_cursorIndexOfPulseRate)) {
              _tmpPulse_rate = null;
            } else {
              _tmpPulse_rate = _cursor.getInt(_cursorIndexOfPulseRate);
            }
            final String _tmpBp_category;
            if (_cursor.isNull(_cursorIndexOfBpCategory)) {
              _tmpBp_category = null;
            } else {
              _tmpBp_category = _cursor.getString(_cursorIndexOfBpCategory);
            }
            final boolean _tmpIs_referred;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsReferred);
            _tmpIs_referred = _tmp != 0;
            final String _tmpReferral_facility_hindi;
            if (_cursor.isNull(_cursorIndexOfReferralFacilityHindi)) {
              _tmpReferral_facility_hindi = null;
            } else {
              _tmpReferral_facility_hindi = _cursor.getString(_cursorIndexOfReferralFacilityHindi);
            }
            final Long _tmpFollow_up_date;
            if (_cursor.isNull(_cursorIndexOfFollowUpDate)) {
              _tmpFollow_up_date = null;
            } else {
              _tmpFollow_up_date = _cursor.getLong(_cursorIndexOfFollowUpDate);
            }
            final String _tmpMedications_prescribed_hindi;
            if (_cursor.isNull(_cursorIndexOfMedicationsPrescribedHindi)) {
              _tmpMedications_prescribed_hindi = null;
            } else {
              _tmpMedications_prescribed_hindi = _cursor.getString(_cursorIndexOfMedicationsPrescribedHindi);
            }
            final String _tmpAdvice_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdviceNotesHindi)) {
              _tmpAdvice_notes_hindi = null;
            } else {
              _tmpAdvice_notes_hindi = _cursor.getString(_cursorIndexOfAdviceNotesHindi);
            }
            final String _tmpRecorded_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRecordedByUserId)) {
              _tmpRecorded_by_user_id = null;
            } else {
              _tmpRecorded_by_user_id = _cursor.getString(_cursorIndexOfRecordedByUserId);
            }
            final long _tmpRecorded_at;
            _tmpRecorded_at = _cursor.getLong(_cursorIndexOfRecordedAt);
            final double _tmpGps_lat;
            _tmpGps_lat = _cursor.getDouble(_cursorIndexOfGpsLat);
            final double _tmpGps_lng;
            _tmpGps_lng = _cursor.getDouble(_cursorIndexOfGpsLng);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _item = new BPVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpBp_systolic,_tmpBp_diastolic,_tmpPulse_rate,_tmpBp_category,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
    final String _sql = "SELECT COUNT(*) FROM bp_visits WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"bp_visits"}, new Callable<Integer>() {
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
