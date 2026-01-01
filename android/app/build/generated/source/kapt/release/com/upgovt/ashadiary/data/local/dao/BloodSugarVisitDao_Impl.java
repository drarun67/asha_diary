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
import com.upgovt.ashadiary.data.local.entities.BloodSugarVisitEntity;
import error.NonExistentClass;
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
public final class BloodSugarVisitDao_Impl implements BloodSugarVisitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BloodSugarVisitEntity> __insertionAdapterOfBloodSugarVisitEntity;

  private final EntityDeletionOrUpdateAdapter<BloodSugarVisitEntity> __updateAdapterOfBloodSugarVisitEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public BloodSugarVisitDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBloodSugarVisitEntity = new EntityInsertionAdapter<BloodSugarVisitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `blood_sugar_visits` (`id`,`beneficiary_id`,`visit_date`,`test_type`,`blood_sugar_mg_dl`,`diabetes_risk`,`is_referred`,`referral_facility_hindi`,`follow_up_date`,`medications_prescribed_hindi`,`diet_advice_hindi`,`exercise_advice_hindi`,`recorded_by_user_id`,`recorded_at`,`gps_lat`,`gps_lng`,`created_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`,`last_modified_by_role_id`,`sync_version`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BloodSugarVisitEntity entity) {
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
        if (entity.getTest_type() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getTest_type());
        }
        statement.bindLong(5, entity.getBlood_sugar_mg_dl());
        if (entity.getDiabetes_risk() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDiabetes_risk());
        }
        final int _tmp = entity.is_referred() ? 1 : 0;
        statement.bindLong(7, _tmp);
        if (entity.getReferral_facility_hindi() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getReferral_facility_hindi());
        }
        if (entity.getFollow_up_date() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getFollow_up_date());
        }
        if (entity.getMedications_prescribed_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getMedications_prescribed_hindi());
        }
        if (entity.getDiet_advice_hindi() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getDiet_advice_hindi());
        }
        if (entity.getExercise_advice_hindi() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getExercise_advice_hindi());
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
    this.__updateAdapterOfBloodSugarVisitEntity = new EntityDeletionOrUpdateAdapter<BloodSugarVisitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `blood_sugar_visits` SET `id` = ?,`beneficiary_id` = ?,`visit_date` = ?,`test_type` = ?,`blood_sugar_mg_dl` = ?,`diabetes_risk` = ?,`is_referred` = ?,`referral_facility_hindi` = ?,`follow_up_date` = ?,`medications_prescribed_hindi` = ?,`diet_advice_hindi` = ?,`exercise_advice_hindi` = ?,`recorded_by_user_id` = ?,`recorded_at` = ?,`gps_lat` = ?,`gps_lng` = ?,`created_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ?,`last_modified_by_role_id` = ?,`sync_version` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BloodSugarVisitEntity entity) {
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
        if (entity.getTest_type() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getTest_type());
        }
        statement.bindLong(5, entity.getBlood_sugar_mg_dl());
        if (entity.getDiabetes_risk() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDiabetes_risk());
        }
        final int _tmp = entity.is_referred() ? 1 : 0;
        statement.bindLong(7, _tmp);
        if (entity.getReferral_facility_hindi() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getReferral_facility_hindi());
        }
        if (entity.getFollow_up_date() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getFollow_up_date());
        }
        if (entity.getMedications_prescribed_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getMedications_prescribed_hindi());
        }
        if (entity.getDiet_advice_hindi() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getDiet_advice_hindi());
        }
        if (entity.getExercise_advice_hindi() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getExercise_advice_hindi());
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
        final String _query = "DELETE FROM blood_sugar_visits WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final BloodSugarVisitEntity visit,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfBloodSugarVisitEntity.insertAndReturnId(visit);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<BloodSugarVisitEntity> visits,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfBloodSugarVisitEntity.insertAndReturnIdsList(visits);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final BloodSugarVisitEntity visit,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfBloodSugarVisitEntity.handle(visit);
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
      final Continuation<? super NonExistentClass> $completion) {
    final String _sql = "SELECT * FROM blood_sugar_visits WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (visitId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, visitId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<NonExistentClass>() {
      @Override
      @NonNull
      public NonExistentClass call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
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
      final Continuation<? super List<BloodSugarVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM blood_sugar_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BloodSugarVisitEntity>>() {
      @Override
      @NonNull
      public List<BloodSugarVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfTestType = CursorUtil.getColumnIndexOrThrow(_cursor, "test_type");
          final int _cursorIndexOfBloodSugarMgDl = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_sugar_mg_dl");
          final int _cursorIndexOfDiabetesRisk = CursorUtil.getColumnIndexOrThrow(_cursor, "diabetes_risk");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfDietAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "diet_advice_hindi");
          final int _cursorIndexOfExerciseAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise_advice_hindi");
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
          final List<BloodSugarVisitEntity> _result = new ArrayList<BloodSugarVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BloodSugarVisitEntity _item;
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
            final String _tmpTest_type;
            if (_cursor.isNull(_cursorIndexOfTestType)) {
              _tmpTest_type = null;
            } else {
              _tmpTest_type = _cursor.getString(_cursorIndexOfTestType);
            }
            final int _tmpBlood_sugar_mg_dl;
            _tmpBlood_sugar_mg_dl = _cursor.getInt(_cursorIndexOfBloodSugarMgDl);
            final String _tmpDiabetes_risk;
            if (_cursor.isNull(_cursorIndexOfDiabetesRisk)) {
              _tmpDiabetes_risk = null;
            } else {
              _tmpDiabetes_risk = _cursor.getString(_cursorIndexOfDiabetesRisk);
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
            final String _tmpDiet_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfDietAdviceHindi)) {
              _tmpDiet_advice_hindi = null;
            } else {
              _tmpDiet_advice_hindi = _cursor.getString(_cursorIndexOfDietAdviceHindi);
            }
            final String _tmpExercise_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfExerciseAdviceHindi)) {
              _tmpExercise_advice_hindi = null;
            } else {
              _tmpExercise_advice_hindi = _cursor.getString(_cursorIndexOfExerciseAdviceHindi);
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
            _item = new BloodSugarVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpTest_type,_tmpBlood_sugar_mg_dl,_tmpDiabetes_risk,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpDiet_advice_hindi,_tmpExercise_advice_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<List<BloodSugarVisitEntity>> observeByBeneficiary(final String beneficiaryId) {
    final String _sql = "SELECT * FROM blood_sugar_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"blood_sugar_visits"}, new Callable<List<BloodSugarVisitEntity>>() {
      @Override
      @NonNull
      public List<BloodSugarVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfTestType = CursorUtil.getColumnIndexOrThrow(_cursor, "test_type");
          final int _cursorIndexOfBloodSugarMgDl = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_sugar_mg_dl");
          final int _cursorIndexOfDiabetesRisk = CursorUtil.getColumnIndexOrThrow(_cursor, "diabetes_risk");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfDietAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "diet_advice_hindi");
          final int _cursorIndexOfExerciseAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise_advice_hindi");
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
          final List<BloodSugarVisitEntity> _result = new ArrayList<BloodSugarVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BloodSugarVisitEntity _item;
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
            final String _tmpTest_type;
            if (_cursor.isNull(_cursorIndexOfTestType)) {
              _tmpTest_type = null;
            } else {
              _tmpTest_type = _cursor.getString(_cursorIndexOfTestType);
            }
            final int _tmpBlood_sugar_mg_dl;
            _tmpBlood_sugar_mg_dl = _cursor.getInt(_cursorIndexOfBloodSugarMgDl);
            final String _tmpDiabetes_risk;
            if (_cursor.isNull(_cursorIndexOfDiabetesRisk)) {
              _tmpDiabetes_risk = null;
            } else {
              _tmpDiabetes_risk = _cursor.getString(_cursorIndexOfDiabetesRisk);
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
            final String _tmpDiet_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfDietAdviceHindi)) {
              _tmpDiet_advice_hindi = null;
            } else {
              _tmpDiet_advice_hindi = _cursor.getString(_cursorIndexOfDietAdviceHindi);
            }
            final String _tmpExercise_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfExerciseAdviceHindi)) {
              _tmpExercise_advice_hindi = null;
            } else {
              _tmpExercise_advice_hindi = _cursor.getString(_cursorIndexOfExerciseAdviceHindi);
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
            _item = new BloodSugarVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpTest_type,_tmpBlood_sugar_mg_dl,_tmpDiabetes_risk,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpDiet_advice_hindi,_tmpExercise_advice_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
      final Continuation<? super BloodSugarVisitEntity> $completion) {
    final String _sql = "SELECT * FROM blood_sugar_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<BloodSugarVisitEntity>() {
      @Override
      @Nullable
      public BloodSugarVisitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfTestType = CursorUtil.getColumnIndexOrThrow(_cursor, "test_type");
          final int _cursorIndexOfBloodSugarMgDl = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_sugar_mg_dl");
          final int _cursorIndexOfDiabetesRisk = CursorUtil.getColumnIndexOrThrow(_cursor, "diabetes_risk");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfDietAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "diet_advice_hindi");
          final int _cursorIndexOfExerciseAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise_advice_hindi");
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
          final BloodSugarVisitEntity _result;
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
            final String _tmpTest_type;
            if (_cursor.isNull(_cursorIndexOfTestType)) {
              _tmpTest_type = null;
            } else {
              _tmpTest_type = _cursor.getString(_cursorIndexOfTestType);
            }
            final int _tmpBlood_sugar_mg_dl;
            _tmpBlood_sugar_mg_dl = _cursor.getInt(_cursorIndexOfBloodSugarMgDl);
            final String _tmpDiabetes_risk;
            if (_cursor.isNull(_cursorIndexOfDiabetesRisk)) {
              _tmpDiabetes_risk = null;
            } else {
              _tmpDiabetes_risk = _cursor.getString(_cursorIndexOfDiabetesRisk);
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
            final String _tmpDiet_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfDietAdviceHindi)) {
              _tmpDiet_advice_hindi = null;
            } else {
              _tmpDiet_advice_hindi = _cursor.getString(_cursorIndexOfDietAdviceHindi);
            }
            final String _tmpExercise_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfExerciseAdviceHindi)) {
              _tmpExercise_advice_hindi = null;
            } else {
              _tmpExercise_advice_hindi = _cursor.getString(_cursorIndexOfExerciseAdviceHindi);
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
            _result = new BloodSugarVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpTest_type,_tmpBlood_sugar_mg_dl,_tmpDiabetes_risk,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpDiet_advice_hindi,_tmpExercise_advice_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getDiabeticVisits(
      final Continuation<? super List<BloodSugarVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM blood_sugar_visits WHERE diabetes_risk = 'DIABETIC' ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BloodSugarVisitEntity>>() {
      @Override
      @NonNull
      public List<BloodSugarVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfTestType = CursorUtil.getColumnIndexOrThrow(_cursor, "test_type");
          final int _cursorIndexOfBloodSugarMgDl = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_sugar_mg_dl");
          final int _cursorIndexOfDiabetesRisk = CursorUtil.getColumnIndexOrThrow(_cursor, "diabetes_risk");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfDietAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "diet_advice_hindi");
          final int _cursorIndexOfExerciseAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise_advice_hindi");
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
          final List<BloodSugarVisitEntity> _result = new ArrayList<BloodSugarVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BloodSugarVisitEntity _item;
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
            final String _tmpTest_type;
            if (_cursor.isNull(_cursorIndexOfTestType)) {
              _tmpTest_type = null;
            } else {
              _tmpTest_type = _cursor.getString(_cursorIndexOfTestType);
            }
            final int _tmpBlood_sugar_mg_dl;
            _tmpBlood_sugar_mg_dl = _cursor.getInt(_cursorIndexOfBloodSugarMgDl);
            final String _tmpDiabetes_risk;
            if (_cursor.isNull(_cursorIndexOfDiabetesRisk)) {
              _tmpDiabetes_risk = null;
            } else {
              _tmpDiabetes_risk = _cursor.getString(_cursorIndexOfDiabetesRisk);
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
            final String _tmpDiet_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfDietAdviceHindi)) {
              _tmpDiet_advice_hindi = null;
            } else {
              _tmpDiet_advice_hindi = _cursor.getString(_cursorIndexOfDietAdviceHindi);
            }
            final String _tmpExercise_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfExerciseAdviceHindi)) {
              _tmpExercise_advice_hindi = null;
            } else {
              _tmpExercise_advice_hindi = _cursor.getString(_cursorIndexOfExerciseAdviceHindi);
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
            _item = new BloodSugarVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpTest_type,_tmpBlood_sugar_mg_dl,_tmpDiabetes_risk,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpDiet_advice_hindi,_tmpExercise_advice_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getUnsynced(final Continuation<? super List<BloodSugarVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM blood_sugar_visits WHERE is_synced = 0 ORDER BY recorded_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BloodSugarVisitEntity>>() {
      @Override
      @NonNull
      public List<BloodSugarVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfTestType = CursorUtil.getColumnIndexOrThrow(_cursor, "test_type");
          final int _cursorIndexOfBloodSugarMgDl = CursorUtil.getColumnIndexOrThrow(_cursor, "blood_sugar_mg_dl");
          final int _cursorIndexOfDiabetesRisk = CursorUtil.getColumnIndexOrThrow(_cursor, "diabetes_risk");
          final int _cursorIndexOfIsReferred = CursorUtil.getColumnIndexOrThrow(_cursor, "is_referred");
          final int _cursorIndexOfReferralFacilityHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "referral_facility_hindi");
          final int _cursorIndexOfFollowUpDate = CursorUtil.getColumnIndexOrThrow(_cursor, "follow_up_date");
          final int _cursorIndexOfMedicationsPrescribedHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "medications_prescribed_hindi");
          final int _cursorIndexOfDietAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "diet_advice_hindi");
          final int _cursorIndexOfExerciseAdviceHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise_advice_hindi");
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
          final List<BloodSugarVisitEntity> _result = new ArrayList<BloodSugarVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BloodSugarVisitEntity _item;
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
            final String _tmpTest_type;
            if (_cursor.isNull(_cursorIndexOfTestType)) {
              _tmpTest_type = null;
            } else {
              _tmpTest_type = _cursor.getString(_cursorIndexOfTestType);
            }
            final int _tmpBlood_sugar_mg_dl;
            _tmpBlood_sugar_mg_dl = _cursor.getInt(_cursorIndexOfBloodSugarMgDl);
            final String _tmpDiabetes_risk;
            if (_cursor.isNull(_cursorIndexOfDiabetesRisk)) {
              _tmpDiabetes_risk = null;
            } else {
              _tmpDiabetes_risk = _cursor.getString(_cursorIndexOfDiabetesRisk);
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
            final String _tmpDiet_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfDietAdviceHindi)) {
              _tmpDiet_advice_hindi = null;
            } else {
              _tmpDiet_advice_hindi = _cursor.getString(_cursorIndexOfDietAdviceHindi);
            }
            final String _tmpExercise_advice_hindi;
            if (_cursor.isNull(_cursorIndexOfExerciseAdviceHindi)) {
              _tmpExercise_advice_hindi = null;
            } else {
              _tmpExercise_advice_hindi = _cursor.getString(_cursorIndexOfExerciseAdviceHindi);
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
            _item = new BloodSugarVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpTest_type,_tmpBlood_sugar_mg_dl,_tmpDiabetes_risk,_tmpIs_referred,_tmpReferral_facility_hindi,_tmpFollow_up_date,_tmpMedications_prescribed_hindi,_tmpDiet_advice_hindi,_tmpExercise_advice_hindi,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
    final String _sql = "SELECT COUNT(*) FROM blood_sugar_visits WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"blood_sugar_visits"}, new Callable<Integer>() {
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
