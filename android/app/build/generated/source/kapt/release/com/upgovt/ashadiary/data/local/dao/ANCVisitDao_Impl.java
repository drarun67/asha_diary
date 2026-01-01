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
import com.upgovt.ashadiary.data.local.entities.ANCVisitEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Float;
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
public final class ANCVisitDao_Impl implements ANCVisitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ANCVisitEntity> __insertionAdapterOfANCVisitEntity;

  private final EntityDeletionOrUpdateAdapter<ANCVisitEntity> __updateAdapterOfANCVisitEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public ANCVisitDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfANCVisitEntity = new EntityInsertionAdapter<ANCVisitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `anc_visits` (`id`,`beneficiary_id`,`visit_number`,`visit_date`,`weight_kg`,`blood_pressure_systolic`,`blood_pressure_diastolic`,`hemoglobin_gm_dl`,`risk_factors_hindi`,`complications_hindi`,`ifa_tablets_given`,`calcium_tablets_given`,`other_medicines_hindi`,`advice_notes_hindi`,`recorded_by_user_id`,`recorded_at`,`gps_lat`,`gps_lng`,`created_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`,`last_modified_by_role_id`,`sync_version`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ANCVisitEntity entity) {
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
        statement.bindLong(3, entity.getVisit_number());
        statement.bindLong(4, entity.getVisit_date());
        if (entity.getWeight_kg() == null) {
          statement.bindNull(5);
        } else {
          statement.bindDouble(5, entity.getWeight_kg());
        }
        if (entity.getBlood_pressure_systolic() == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, entity.getBlood_pressure_systolic());
        }
        if (entity.getBlood_pressure_diastolic() == null) {
          statement.bindNull(7);
        } else {
          statement.bindLong(7, entity.getBlood_pressure_diastolic());
        }
        if (entity.getHemoglobin_gm_dl() == null) {
          statement.bindNull(8);
        } else {
          statement.bindDouble(8, entity.getHemoglobin_gm_dl());
        }
        if (entity.getRisk_factors_hindi() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getRisk_factors_hindi());
        }
        if (entity.getComplications_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getComplications_hindi());
        }
        if (entity.getIfa_tablets_given() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, entity.getIfa_tablets_given());
        }
        if (entity.getCalcium_tablets_given() == null) {
          statement.bindNull(12);
        } else {
          statement.bindLong(12, entity.getCalcium_tablets_given());
        }
        if (entity.getOther_medicines_hindi() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getOther_medicines_hindi());
        }
        if (entity.getAdvice_notes_hindi() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getAdvice_notes_hindi());
        }
        if (entity.getRecorded_by_user_id() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getRecorded_by_user_id());
        }
        statement.bindLong(16, entity.getRecorded_at());
        statement.bindDouble(17, entity.getGps_lat());
        statement.bindDouble(18, entity.getGps_lng());
        statement.bindLong(19, entity.getCreated_at());
        statement.bindLong(20, entity.getUpdated_at());
        final int _tmp = entity.is_synced() ? 1 : 0;
        statement.bindLong(21, _tmp);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(22);
        } else {
          statement.bindLong(22, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(23);
        } else {
          statement.bindString(23, entity.getServer_id());
        }
        statement.bindLong(24, entity.getLast_modified_by_role_id());
        statement.bindLong(25, entity.getSync_version());
      }
    };
    this.__updateAdapterOfANCVisitEntity = new EntityDeletionOrUpdateAdapter<ANCVisitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `anc_visits` SET `id` = ?,`beneficiary_id` = ?,`visit_number` = ?,`visit_date` = ?,`weight_kg` = ?,`blood_pressure_systolic` = ?,`blood_pressure_diastolic` = ?,`hemoglobin_gm_dl` = ?,`risk_factors_hindi` = ?,`complications_hindi` = ?,`ifa_tablets_given` = ?,`calcium_tablets_given` = ?,`other_medicines_hindi` = ?,`advice_notes_hindi` = ?,`recorded_by_user_id` = ?,`recorded_at` = ?,`gps_lat` = ?,`gps_lng` = ?,`created_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ?,`last_modified_by_role_id` = ?,`sync_version` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ANCVisitEntity entity) {
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
        statement.bindLong(3, entity.getVisit_number());
        statement.bindLong(4, entity.getVisit_date());
        if (entity.getWeight_kg() == null) {
          statement.bindNull(5);
        } else {
          statement.bindDouble(5, entity.getWeight_kg());
        }
        if (entity.getBlood_pressure_systolic() == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, entity.getBlood_pressure_systolic());
        }
        if (entity.getBlood_pressure_diastolic() == null) {
          statement.bindNull(7);
        } else {
          statement.bindLong(7, entity.getBlood_pressure_diastolic());
        }
        if (entity.getHemoglobin_gm_dl() == null) {
          statement.bindNull(8);
        } else {
          statement.bindDouble(8, entity.getHemoglobin_gm_dl());
        }
        if (entity.getRisk_factors_hindi() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getRisk_factors_hindi());
        }
        if (entity.getComplications_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getComplications_hindi());
        }
        if (entity.getIfa_tablets_given() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, entity.getIfa_tablets_given());
        }
        if (entity.getCalcium_tablets_given() == null) {
          statement.bindNull(12);
        } else {
          statement.bindLong(12, entity.getCalcium_tablets_given());
        }
        if (entity.getOther_medicines_hindi() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getOther_medicines_hindi());
        }
        if (entity.getAdvice_notes_hindi() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getAdvice_notes_hindi());
        }
        if (entity.getRecorded_by_user_id() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getRecorded_by_user_id());
        }
        statement.bindLong(16, entity.getRecorded_at());
        statement.bindDouble(17, entity.getGps_lat());
        statement.bindDouble(18, entity.getGps_lng());
        statement.bindLong(19, entity.getCreated_at());
        statement.bindLong(20, entity.getUpdated_at());
        final int _tmp = entity.is_synced() ? 1 : 0;
        statement.bindLong(21, _tmp);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(22);
        } else {
          statement.bindLong(22, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(23);
        } else {
          statement.bindString(23, entity.getServer_id());
        }
        statement.bindLong(24, entity.getLast_modified_by_role_id());
        statement.bindLong(25, entity.getSync_version());
        if (entity.getId() == null) {
          statement.bindNull(26);
        } else {
          statement.bindString(26, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM anc_visits WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ANCVisitEntity visit, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfANCVisitEntity.insertAndReturnId(visit);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<ANCVisitEntity> visits,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfANCVisitEntity.insertAndReturnIdsList(visits);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final ANCVisitEntity visit,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfANCVisitEntity.handle(visit);
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
      final Continuation<? super ANCVisitEntity> $completion) {
    final String _sql = "SELECT * FROM anc_visits WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (visitId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, visitId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ANCVisitEntity>() {
      @Override
      @Nullable
      public ANCVisitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_number");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfWeightKg = CursorUtil.getColumnIndexOrThrow(_cursor, "weight_kg");
          final int _cursorIndexOfBloodPressureSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_systolic");
          final int _cursorIndexOfBloodPressureDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_diastolic");
          final int _cursorIndexOfHemoglobinGmDl = CursorUtil.getColumnIndexOrThrow(_cursor, "hemoglobin_gm_dl");
          final int _cursorIndexOfRiskFactorsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "risk_factors_hindi");
          final int _cursorIndexOfComplicationsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "complications_hindi");
          final int _cursorIndexOfIfaTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "ifa_tablets_given");
          final int _cursorIndexOfCalciumTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "calcium_tablets_given");
          final int _cursorIndexOfOtherMedicinesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "other_medicines_hindi");
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
          final ANCVisitEntity _result;
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
            final int _tmpVisit_number;
            _tmpVisit_number = _cursor.getInt(_cursorIndexOfVisitNumber);
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final Float _tmpWeight_kg;
            if (_cursor.isNull(_cursorIndexOfWeightKg)) {
              _tmpWeight_kg = null;
            } else {
              _tmpWeight_kg = _cursor.getFloat(_cursorIndexOfWeightKg);
            }
            final Integer _tmpBlood_pressure_systolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureSystolic)) {
              _tmpBlood_pressure_systolic = null;
            } else {
              _tmpBlood_pressure_systolic = _cursor.getInt(_cursorIndexOfBloodPressureSystolic);
            }
            final Integer _tmpBlood_pressure_diastolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureDiastolic)) {
              _tmpBlood_pressure_diastolic = null;
            } else {
              _tmpBlood_pressure_diastolic = _cursor.getInt(_cursorIndexOfBloodPressureDiastolic);
            }
            final Float _tmpHemoglobin_gm_dl;
            if (_cursor.isNull(_cursorIndexOfHemoglobinGmDl)) {
              _tmpHemoglobin_gm_dl = null;
            } else {
              _tmpHemoglobin_gm_dl = _cursor.getFloat(_cursorIndexOfHemoglobinGmDl);
            }
            final String _tmpRisk_factors_hindi;
            if (_cursor.isNull(_cursorIndexOfRiskFactorsHindi)) {
              _tmpRisk_factors_hindi = null;
            } else {
              _tmpRisk_factors_hindi = _cursor.getString(_cursorIndexOfRiskFactorsHindi);
            }
            final String _tmpComplications_hindi;
            if (_cursor.isNull(_cursorIndexOfComplicationsHindi)) {
              _tmpComplications_hindi = null;
            } else {
              _tmpComplications_hindi = _cursor.getString(_cursorIndexOfComplicationsHindi);
            }
            final Integer _tmpIfa_tablets_given;
            if (_cursor.isNull(_cursorIndexOfIfaTabletsGiven)) {
              _tmpIfa_tablets_given = null;
            } else {
              _tmpIfa_tablets_given = _cursor.getInt(_cursorIndexOfIfaTabletsGiven);
            }
            final Integer _tmpCalcium_tablets_given;
            if (_cursor.isNull(_cursorIndexOfCalciumTabletsGiven)) {
              _tmpCalcium_tablets_given = null;
            } else {
              _tmpCalcium_tablets_given = _cursor.getInt(_cursorIndexOfCalciumTabletsGiven);
            }
            final String _tmpOther_medicines_hindi;
            if (_cursor.isNull(_cursorIndexOfOtherMedicinesHindi)) {
              _tmpOther_medicines_hindi = null;
            } else {
              _tmpOther_medicines_hindi = _cursor.getString(_cursorIndexOfOtherMedicinesHindi);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _result = new ANCVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_number,_tmpVisit_date,_tmpWeight_kg,_tmpBlood_pressure_systolic,_tmpBlood_pressure_diastolic,_tmpHemoglobin_gm_dl,_tmpRisk_factors_hindi,_tmpComplications_hindi,_tmpIfa_tablets_given,_tmpCalcium_tablets_given,_tmpOther_medicines_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
      final Continuation<? super List<ANCVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM anc_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ANCVisitEntity>>() {
      @Override
      @NonNull
      public List<ANCVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_number");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfWeightKg = CursorUtil.getColumnIndexOrThrow(_cursor, "weight_kg");
          final int _cursorIndexOfBloodPressureSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_systolic");
          final int _cursorIndexOfBloodPressureDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_diastolic");
          final int _cursorIndexOfHemoglobinGmDl = CursorUtil.getColumnIndexOrThrow(_cursor, "hemoglobin_gm_dl");
          final int _cursorIndexOfRiskFactorsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "risk_factors_hindi");
          final int _cursorIndexOfComplicationsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "complications_hindi");
          final int _cursorIndexOfIfaTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "ifa_tablets_given");
          final int _cursorIndexOfCalciumTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "calcium_tablets_given");
          final int _cursorIndexOfOtherMedicinesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "other_medicines_hindi");
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
          final List<ANCVisitEntity> _result = new ArrayList<ANCVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ANCVisitEntity _item;
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
            final int _tmpVisit_number;
            _tmpVisit_number = _cursor.getInt(_cursorIndexOfVisitNumber);
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final Float _tmpWeight_kg;
            if (_cursor.isNull(_cursorIndexOfWeightKg)) {
              _tmpWeight_kg = null;
            } else {
              _tmpWeight_kg = _cursor.getFloat(_cursorIndexOfWeightKg);
            }
            final Integer _tmpBlood_pressure_systolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureSystolic)) {
              _tmpBlood_pressure_systolic = null;
            } else {
              _tmpBlood_pressure_systolic = _cursor.getInt(_cursorIndexOfBloodPressureSystolic);
            }
            final Integer _tmpBlood_pressure_diastolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureDiastolic)) {
              _tmpBlood_pressure_diastolic = null;
            } else {
              _tmpBlood_pressure_diastolic = _cursor.getInt(_cursorIndexOfBloodPressureDiastolic);
            }
            final Float _tmpHemoglobin_gm_dl;
            if (_cursor.isNull(_cursorIndexOfHemoglobinGmDl)) {
              _tmpHemoglobin_gm_dl = null;
            } else {
              _tmpHemoglobin_gm_dl = _cursor.getFloat(_cursorIndexOfHemoglobinGmDl);
            }
            final String _tmpRisk_factors_hindi;
            if (_cursor.isNull(_cursorIndexOfRiskFactorsHindi)) {
              _tmpRisk_factors_hindi = null;
            } else {
              _tmpRisk_factors_hindi = _cursor.getString(_cursorIndexOfRiskFactorsHindi);
            }
            final String _tmpComplications_hindi;
            if (_cursor.isNull(_cursorIndexOfComplicationsHindi)) {
              _tmpComplications_hindi = null;
            } else {
              _tmpComplications_hindi = _cursor.getString(_cursorIndexOfComplicationsHindi);
            }
            final Integer _tmpIfa_tablets_given;
            if (_cursor.isNull(_cursorIndexOfIfaTabletsGiven)) {
              _tmpIfa_tablets_given = null;
            } else {
              _tmpIfa_tablets_given = _cursor.getInt(_cursorIndexOfIfaTabletsGiven);
            }
            final Integer _tmpCalcium_tablets_given;
            if (_cursor.isNull(_cursorIndexOfCalciumTabletsGiven)) {
              _tmpCalcium_tablets_given = null;
            } else {
              _tmpCalcium_tablets_given = _cursor.getInt(_cursorIndexOfCalciumTabletsGiven);
            }
            final String _tmpOther_medicines_hindi;
            if (_cursor.isNull(_cursorIndexOfOtherMedicinesHindi)) {
              _tmpOther_medicines_hindi = null;
            } else {
              _tmpOther_medicines_hindi = _cursor.getString(_cursorIndexOfOtherMedicinesHindi);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _item = new ANCVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_number,_tmpVisit_date,_tmpWeight_kg,_tmpBlood_pressure_systolic,_tmpBlood_pressure_diastolic,_tmpHemoglobin_gm_dl,_tmpRisk_factors_hindi,_tmpComplications_hindi,_tmpIfa_tablets_given,_tmpCalcium_tablets_given,_tmpOther_medicines_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<List<ANCVisitEntity>> observeByBeneficiary(final String beneficiaryId) {
    final String _sql = "SELECT * FROM anc_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"anc_visits"}, new Callable<List<ANCVisitEntity>>() {
      @Override
      @NonNull
      public List<ANCVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_number");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfWeightKg = CursorUtil.getColumnIndexOrThrow(_cursor, "weight_kg");
          final int _cursorIndexOfBloodPressureSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_systolic");
          final int _cursorIndexOfBloodPressureDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_diastolic");
          final int _cursorIndexOfHemoglobinGmDl = CursorUtil.getColumnIndexOrThrow(_cursor, "hemoglobin_gm_dl");
          final int _cursorIndexOfRiskFactorsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "risk_factors_hindi");
          final int _cursorIndexOfComplicationsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "complications_hindi");
          final int _cursorIndexOfIfaTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "ifa_tablets_given");
          final int _cursorIndexOfCalciumTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "calcium_tablets_given");
          final int _cursorIndexOfOtherMedicinesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "other_medicines_hindi");
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
          final List<ANCVisitEntity> _result = new ArrayList<ANCVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ANCVisitEntity _item;
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
            final int _tmpVisit_number;
            _tmpVisit_number = _cursor.getInt(_cursorIndexOfVisitNumber);
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final Float _tmpWeight_kg;
            if (_cursor.isNull(_cursorIndexOfWeightKg)) {
              _tmpWeight_kg = null;
            } else {
              _tmpWeight_kg = _cursor.getFloat(_cursorIndexOfWeightKg);
            }
            final Integer _tmpBlood_pressure_systolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureSystolic)) {
              _tmpBlood_pressure_systolic = null;
            } else {
              _tmpBlood_pressure_systolic = _cursor.getInt(_cursorIndexOfBloodPressureSystolic);
            }
            final Integer _tmpBlood_pressure_diastolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureDiastolic)) {
              _tmpBlood_pressure_diastolic = null;
            } else {
              _tmpBlood_pressure_diastolic = _cursor.getInt(_cursorIndexOfBloodPressureDiastolic);
            }
            final Float _tmpHemoglobin_gm_dl;
            if (_cursor.isNull(_cursorIndexOfHemoglobinGmDl)) {
              _tmpHemoglobin_gm_dl = null;
            } else {
              _tmpHemoglobin_gm_dl = _cursor.getFloat(_cursorIndexOfHemoglobinGmDl);
            }
            final String _tmpRisk_factors_hindi;
            if (_cursor.isNull(_cursorIndexOfRiskFactorsHindi)) {
              _tmpRisk_factors_hindi = null;
            } else {
              _tmpRisk_factors_hindi = _cursor.getString(_cursorIndexOfRiskFactorsHindi);
            }
            final String _tmpComplications_hindi;
            if (_cursor.isNull(_cursorIndexOfComplicationsHindi)) {
              _tmpComplications_hindi = null;
            } else {
              _tmpComplications_hindi = _cursor.getString(_cursorIndexOfComplicationsHindi);
            }
            final Integer _tmpIfa_tablets_given;
            if (_cursor.isNull(_cursorIndexOfIfaTabletsGiven)) {
              _tmpIfa_tablets_given = null;
            } else {
              _tmpIfa_tablets_given = _cursor.getInt(_cursorIndexOfIfaTabletsGiven);
            }
            final Integer _tmpCalcium_tablets_given;
            if (_cursor.isNull(_cursorIndexOfCalciumTabletsGiven)) {
              _tmpCalcium_tablets_given = null;
            } else {
              _tmpCalcium_tablets_given = _cursor.getInt(_cursorIndexOfCalciumTabletsGiven);
            }
            final String _tmpOther_medicines_hindi;
            if (_cursor.isNull(_cursorIndexOfOtherMedicinesHindi)) {
              _tmpOther_medicines_hindi = null;
            } else {
              _tmpOther_medicines_hindi = _cursor.getString(_cursorIndexOfOtherMedicinesHindi);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _item = new ANCVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_number,_tmpVisit_date,_tmpWeight_kg,_tmpBlood_pressure_systolic,_tmpBlood_pressure_diastolic,_tmpHemoglobin_gm_dl,_tmpRisk_factors_hindi,_tmpComplications_hindi,_tmpIfa_tablets_given,_tmpCalcium_tablets_given,_tmpOther_medicines_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
      final Continuation<? super ANCVisitEntity> $completion) {
    final String _sql = "SELECT * FROM anc_visits WHERE beneficiary_id = ? ORDER BY visit_number DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ANCVisitEntity>() {
      @Override
      @Nullable
      public ANCVisitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_number");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfWeightKg = CursorUtil.getColumnIndexOrThrow(_cursor, "weight_kg");
          final int _cursorIndexOfBloodPressureSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_systolic");
          final int _cursorIndexOfBloodPressureDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_diastolic");
          final int _cursorIndexOfHemoglobinGmDl = CursorUtil.getColumnIndexOrThrow(_cursor, "hemoglobin_gm_dl");
          final int _cursorIndexOfRiskFactorsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "risk_factors_hindi");
          final int _cursorIndexOfComplicationsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "complications_hindi");
          final int _cursorIndexOfIfaTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "ifa_tablets_given");
          final int _cursorIndexOfCalciumTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "calcium_tablets_given");
          final int _cursorIndexOfOtherMedicinesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "other_medicines_hindi");
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
          final ANCVisitEntity _result;
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
            final int _tmpVisit_number;
            _tmpVisit_number = _cursor.getInt(_cursorIndexOfVisitNumber);
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final Float _tmpWeight_kg;
            if (_cursor.isNull(_cursorIndexOfWeightKg)) {
              _tmpWeight_kg = null;
            } else {
              _tmpWeight_kg = _cursor.getFloat(_cursorIndexOfWeightKg);
            }
            final Integer _tmpBlood_pressure_systolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureSystolic)) {
              _tmpBlood_pressure_systolic = null;
            } else {
              _tmpBlood_pressure_systolic = _cursor.getInt(_cursorIndexOfBloodPressureSystolic);
            }
            final Integer _tmpBlood_pressure_diastolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureDiastolic)) {
              _tmpBlood_pressure_diastolic = null;
            } else {
              _tmpBlood_pressure_diastolic = _cursor.getInt(_cursorIndexOfBloodPressureDiastolic);
            }
            final Float _tmpHemoglobin_gm_dl;
            if (_cursor.isNull(_cursorIndexOfHemoglobinGmDl)) {
              _tmpHemoglobin_gm_dl = null;
            } else {
              _tmpHemoglobin_gm_dl = _cursor.getFloat(_cursorIndexOfHemoglobinGmDl);
            }
            final String _tmpRisk_factors_hindi;
            if (_cursor.isNull(_cursorIndexOfRiskFactorsHindi)) {
              _tmpRisk_factors_hindi = null;
            } else {
              _tmpRisk_factors_hindi = _cursor.getString(_cursorIndexOfRiskFactorsHindi);
            }
            final String _tmpComplications_hindi;
            if (_cursor.isNull(_cursorIndexOfComplicationsHindi)) {
              _tmpComplications_hindi = null;
            } else {
              _tmpComplications_hindi = _cursor.getString(_cursorIndexOfComplicationsHindi);
            }
            final Integer _tmpIfa_tablets_given;
            if (_cursor.isNull(_cursorIndexOfIfaTabletsGiven)) {
              _tmpIfa_tablets_given = null;
            } else {
              _tmpIfa_tablets_given = _cursor.getInt(_cursorIndexOfIfaTabletsGiven);
            }
            final Integer _tmpCalcium_tablets_given;
            if (_cursor.isNull(_cursorIndexOfCalciumTabletsGiven)) {
              _tmpCalcium_tablets_given = null;
            } else {
              _tmpCalcium_tablets_given = _cursor.getInt(_cursorIndexOfCalciumTabletsGiven);
            }
            final String _tmpOther_medicines_hindi;
            if (_cursor.isNull(_cursorIndexOfOtherMedicinesHindi)) {
              _tmpOther_medicines_hindi = null;
            } else {
              _tmpOther_medicines_hindi = _cursor.getString(_cursorIndexOfOtherMedicinesHindi);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _result = new ANCVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_number,_tmpVisit_date,_tmpWeight_kg,_tmpBlood_pressure_systolic,_tmpBlood_pressure_diastolic,_tmpHemoglobin_gm_dl,_tmpRisk_factors_hindi,_tmpComplications_hindi,_tmpIfa_tablets_given,_tmpCalcium_tablets_given,_tmpOther_medicines_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getLastVisitNumber(final String beneficiaryId,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT MAX(visit_number) FROM anc_visits WHERE beneficiary_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @Nullable
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
  public Object getUnsynced(final Continuation<? super List<ANCVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM anc_visits WHERE is_synced = 0 ORDER BY recorded_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ANCVisitEntity>>() {
      @Override
      @NonNull
      public List<ANCVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_number");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfWeightKg = CursorUtil.getColumnIndexOrThrow(_cursor, "weight_kg");
          final int _cursorIndexOfBloodPressureSystolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_systolic");
          final int _cursorIndexOfBloodPressureDiastolic = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_pressure_diastolic");
          final int _cursorIndexOfHemoglobinGmDl = CursorUtil.getColumnIndexOrThrow(_cursor, "hemoglobin_gm_dl");
          final int _cursorIndexOfRiskFactorsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "risk_factors_hindi");
          final int _cursorIndexOfComplicationsHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "complications_hindi");
          final int _cursorIndexOfIfaTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "ifa_tablets_given");
          final int _cursorIndexOfCalciumTabletsGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "calcium_tablets_given");
          final int _cursorIndexOfOtherMedicinesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "other_medicines_hindi");
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
          final List<ANCVisitEntity> _result = new ArrayList<ANCVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ANCVisitEntity _item;
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
            final int _tmpVisit_number;
            _tmpVisit_number = _cursor.getInt(_cursorIndexOfVisitNumber);
            final long _tmpVisit_date;
            _tmpVisit_date = _cursor.getLong(_cursorIndexOfVisitDate);
            final Float _tmpWeight_kg;
            if (_cursor.isNull(_cursorIndexOfWeightKg)) {
              _tmpWeight_kg = null;
            } else {
              _tmpWeight_kg = _cursor.getFloat(_cursorIndexOfWeightKg);
            }
            final Integer _tmpBlood_pressure_systolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureSystolic)) {
              _tmpBlood_pressure_systolic = null;
            } else {
              _tmpBlood_pressure_systolic = _cursor.getInt(_cursorIndexOfBloodPressureSystolic);
            }
            final Integer _tmpBlood_pressure_diastolic;
            if (_cursor.isNull(_cursorIndexOfBloodPressureDiastolic)) {
              _tmpBlood_pressure_diastolic = null;
            } else {
              _tmpBlood_pressure_diastolic = _cursor.getInt(_cursorIndexOfBloodPressureDiastolic);
            }
            final Float _tmpHemoglobin_gm_dl;
            if (_cursor.isNull(_cursorIndexOfHemoglobinGmDl)) {
              _tmpHemoglobin_gm_dl = null;
            } else {
              _tmpHemoglobin_gm_dl = _cursor.getFloat(_cursorIndexOfHemoglobinGmDl);
            }
            final String _tmpRisk_factors_hindi;
            if (_cursor.isNull(_cursorIndexOfRiskFactorsHindi)) {
              _tmpRisk_factors_hindi = null;
            } else {
              _tmpRisk_factors_hindi = _cursor.getString(_cursorIndexOfRiskFactorsHindi);
            }
            final String _tmpComplications_hindi;
            if (_cursor.isNull(_cursorIndexOfComplicationsHindi)) {
              _tmpComplications_hindi = null;
            } else {
              _tmpComplications_hindi = _cursor.getString(_cursorIndexOfComplicationsHindi);
            }
            final Integer _tmpIfa_tablets_given;
            if (_cursor.isNull(_cursorIndexOfIfaTabletsGiven)) {
              _tmpIfa_tablets_given = null;
            } else {
              _tmpIfa_tablets_given = _cursor.getInt(_cursorIndexOfIfaTabletsGiven);
            }
            final Integer _tmpCalcium_tablets_given;
            if (_cursor.isNull(_cursorIndexOfCalciumTabletsGiven)) {
              _tmpCalcium_tablets_given = null;
            } else {
              _tmpCalcium_tablets_given = _cursor.getInt(_cursorIndexOfCalciumTabletsGiven);
            }
            final String _tmpOther_medicines_hindi;
            if (_cursor.isNull(_cursorIndexOfOtherMedicinesHindi)) {
              _tmpOther_medicines_hindi = null;
            } else {
              _tmpOther_medicines_hindi = _cursor.getString(_cursorIndexOfOtherMedicinesHindi);
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
            final int _tmpLast_modified_by_role_id;
            _tmpLast_modified_by_role_id = _cursor.getInt(_cursorIndexOfLastModifiedByRoleId);
            final int _tmpSync_version;
            _tmpSync_version = _cursor.getInt(_cursorIndexOfSyncVersion);
            _item = new ANCVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_number,_tmpVisit_date,_tmpWeight_kg,_tmpBlood_pressure_systolic,_tmpBlood_pressure_diastolic,_tmpHemoglobin_gm_dl,_tmpRisk_factors_hindi,_tmpComplications_hindi,_tmpIfa_tablets_given,_tmpCalcium_tablets_given,_tmpOther_medicines_hindi,_tmpAdvice_notes_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
    final String _sql = "SELECT COUNT(*) FROM anc_visits WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"anc_visits"}, new Callable<Integer>() {
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
