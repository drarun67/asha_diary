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
import com.upgovt.ashadiary.data.local.entities.VaccinationVisitEntity;
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
public final class VaccinationVisitDao_Impl implements VaccinationVisitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<VaccinationVisitEntity> __insertionAdapterOfVaccinationVisitEntity;

  private final EntityDeletionOrUpdateAdapter<VaccinationVisitEntity> __updateAdapterOfVaccinationVisitEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public VaccinationVisitDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVaccinationVisitEntity = new EntityInsertionAdapter<VaccinationVisitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `vaccination_visits` (`id`,`beneficiary_id`,`visit_date`,`vaccine_type`,`vaccine_name_hindi`,`dose_number`,`vaccine_batch_number`,`vaccine_expiry_date`,`has_adverse_reaction`,`adverse_reaction_notes_hindi`,`next_dose_due_date`,`recorded_by_user_id`,`recorded_at`,`gps_lat`,`gps_lng`,`created_at`,`updated_at`,`is_synced`,`last_synced_at`,`server_id`,`last_modified_by_role_id`,`sync_version`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final VaccinationVisitEntity entity) {
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
        if (entity.getVaccine_type() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getVaccine_type());
        }
        if (entity.getVaccine_name_hindi() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getVaccine_name_hindi());
        }
        statement.bindLong(6, entity.getDose_number());
        if (entity.getVaccine_batch_number() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getVaccine_batch_number());
        }
        if (entity.getVaccine_expiry_date() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getVaccine_expiry_date());
        }
        final int _tmp = entity.getHas_adverse_reaction() ? 1 : 0;
        statement.bindLong(9, _tmp);
        if (entity.getAdverse_reaction_notes_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getAdverse_reaction_notes_hindi());
        }
        if (entity.getNext_dose_due_date() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, entity.getNext_dose_due_date());
        }
        if (entity.getRecorded_by_user_id() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getRecorded_by_user_id());
        }
        statement.bindLong(13, entity.getRecorded_at());
        statement.bindDouble(14, entity.getGps_lat());
        statement.bindDouble(15, entity.getGps_lng());
        statement.bindLong(16, entity.getCreated_at());
        statement.bindLong(17, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(18, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(19);
        } else {
          statement.bindLong(19, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.getServer_id());
        }
        statement.bindLong(21, entity.getLast_modified_by_role_id());
        statement.bindLong(22, entity.getSync_version());
      }
    };
    this.__updateAdapterOfVaccinationVisitEntity = new EntityDeletionOrUpdateAdapter<VaccinationVisitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `vaccination_visits` SET `id` = ?,`beneficiary_id` = ?,`visit_date` = ?,`vaccine_type` = ?,`vaccine_name_hindi` = ?,`dose_number` = ?,`vaccine_batch_number` = ?,`vaccine_expiry_date` = ?,`has_adverse_reaction` = ?,`adverse_reaction_notes_hindi` = ?,`next_dose_due_date` = ?,`recorded_by_user_id` = ?,`recorded_at` = ?,`gps_lat` = ?,`gps_lng` = ?,`created_at` = ?,`updated_at` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ?,`last_modified_by_role_id` = ?,`sync_version` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final VaccinationVisitEntity entity) {
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
        if (entity.getVaccine_type() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getVaccine_type());
        }
        if (entity.getVaccine_name_hindi() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getVaccine_name_hindi());
        }
        statement.bindLong(6, entity.getDose_number());
        if (entity.getVaccine_batch_number() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getVaccine_batch_number());
        }
        if (entity.getVaccine_expiry_date() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getVaccine_expiry_date());
        }
        final int _tmp = entity.getHas_adverse_reaction() ? 1 : 0;
        statement.bindLong(9, _tmp);
        if (entity.getAdverse_reaction_notes_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getAdverse_reaction_notes_hindi());
        }
        if (entity.getNext_dose_due_date() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, entity.getNext_dose_due_date());
        }
        if (entity.getRecorded_by_user_id() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getRecorded_by_user_id());
        }
        statement.bindLong(13, entity.getRecorded_at());
        statement.bindDouble(14, entity.getGps_lat());
        statement.bindDouble(15, entity.getGps_lng());
        statement.bindLong(16, entity.getCreated_at());
        statement.bindLong(17, entity.getUpdated_at());
        final int _tmp_1 = entity.is_synced() ? 1 : 0;
        statement.bindLong(18, _tmp_1);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(19);
        } else {
          statement.bindLong(19, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.getServer_id());
        }
        statement.bindLong(21, entity.getLast_modified_by_role_id());
        statement.bindLong(22, entity.getSync_version());
        if (entity.getId() == null) {
          statement.bindNull(23);
        } else {
          statement.bindString(23, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM vaccination_visits WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final VaccinationVisitEntity visit,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfVaccinationVisitEntity.insertAndReturnId(visit);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<VaccinationVisitEntity> visits,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfVaccinationVisitEntity.insertAndReturnIdsList(visits);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final VaccinationVisitEntity visit,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfVaccinationVisitEntity.handle(visit);
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
      final Continuation<? super VaccinationVisitEntity> $completion) {
    final String _sql = "SELECT * FROM vaccination_visits WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (visitId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, visitId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<VaccinationVisitEntity>() {
      @Override
      @Nullable
      public VaccinationVisitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfVaccineType = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_type");
          final int _cursorIndexOfVaccineNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_name_hindi");
          final int _cursorIndexOfDoseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "dose_number");
          final int _cursorIndexOfVaccineBatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_batch_number");
          final int _cursorIndexOfVaccineExpiryDate = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_expiry_date");
          final int _cursorIndexOfHasAdverseReaction = CursorUtil.getColumnIndexOrThrow(_cursor, "has_adverse_reaction");
          final int _cursorIndexOfAdverseReactionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "adverse_reaction_notes_hindi");
          final int _cursorIndexOfNextDoseDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "next_dose_due_date");
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
          final VaccinationVisitEntity _result;
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
            final String _tmpVaccine_type;
            if (_cursor.isNull(_cursorIndexOfVaccineType)) {
              _tmpVaccine_type = null;
            } else {
              _tmpVaccine_type = _cursor.getString(_cursorIndexOfVaccineType);
            }
            final String _tmpVaccine_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVaccineNameHindi)) {
              _tmpVaccine_name_hindi = null;
            } else {
              _tmpVaccine_name_hindi = _cursor.getString(_cursorIndexOfVaccineNameHindi);
            }
            final int _tmpDose_number;
            _tmpDose_number = _cursor.getInt(_cursorIndexOfDoseNumber);
            final String _tmpVaccine_batch_number;
            if (_cursor.isNull(_cursorIndexOfVaccineBatchNumber)) {
              _tmpVaccine_batch_number = null;
            } else {
              _tmpVaccine_batch_number = _cursor.getString(_cursorIndexOfVaccineBatchNumber);
            }
            final Long _tmpVaccine_expiry_date;
            if (_cursor.isNull(_cursorIndexOfVaccineExpiryDate)) {
              _tmpVaccine_expiry_date = null;
            } else {
              _tmpVaccine_expiry_date = _cursor.getLong(_cursorIndexOfVaccineExpiryDate);
            }
            final boolean _tmpHas_adverse_reaction;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasAdverseReaction);
            _tmpHas_adverse_reaction = _tmp != 0;
            final String _tmpAdverse_reaction_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdverseReactionNotesHindi)) {
              _tmpAdverse_reaction_notes_hindi = null;
            } else {
              _tmpAdverse_reaction_notes_hindi = _cursor.getString(_cursorIndexOfAdverseReactionNotesHindi);
            }
            final Long _tmpNext_dose_due_date;
            if (_cursor.isNull(_cursorIndexOfNextDoseDueDate)) {
              _tmpNext_dose_due_date = null;
            } else {
              _tmpNext_dose_due_date = _cursor.getLong(_cursorIndexOfNextDoseDueDate);
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
            _result = new VaccinationVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpVaccine_type,_tmpVaccine_name_hindi,_tmpDose_number,_tmpVaccine_batch_number,_tmpVaccine_expiry_date,_tmpHas_adverse_reaction,_tmpAdverse_reaction_notes_hindi,_tmpNext_dose_due_date,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
      final Continuation<? super List<VaccinationVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM vaccination_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VaccinationVisitEntity>>() {
      @Override
      @NonNull
      public List<VaccinationVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfVaccineType = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_type");
          final int _cursorIndexOfVaccineNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_name_hindi");
          final int _cursorIndexOfDoseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "dose_number");
          final int _cursorIndexOfVaccineBatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_batch_number");
          final int _cursorIndexOfVaccineExpiryDate = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_expiry_date");
          final int _cursorIndexOfHasAdverseReaction = CursorUtil.getColumnIndexOrThrow(_cursor, "has_adverse_reaction");
          final int _cursorIndexOfAdverseReactionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "adverse_reaction_notes_hindi");
          final int _cursorIndexOfNextDoseDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "next_dose_due_date");
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
          final List<VaccinationVisitEntity> _result = new ArrayList<VaccinationVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VaccinationVisitEntity _item;
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
            final String _tmpVaccine_type;
            if (_cursor.isNull(_cursorIndexOfVaccineType)) {
              _tmpVaccine_type = null;
            } else {
              _tmpVaccine_type = _cursor.getString(_cursorIndexOfVaccineType);
            }
            final String _tmpVaccine_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVaccineNameHindi)) {
              _tmpVaccine_name_hindi = null;
            } else {
              _tmpVaccine_name_hindi = _cursor.getString(_cursorIndexOfVaccineNameHindi);
            }
            final int _tmpDose_number;
            _tmpDose_number = _cursor.getInt(_cursorIndexOfDoseNumber);
            final String _tmpVaccine_batch_number;
            if (_cursor.isNull(_cursorIndexOfVaccineBatchNumber)) {
              _tmpVaccine_batch_number = null;
            } else {
              _tmpVaccine_batch_number = _cursor.getString(_cursorIndexOfVaccineBatchNumber);
            }
            final Long _tmpVaccine_expiry_date;
            if (_cursor.isNull(_cursorIndexOfVaccineExpiryDate)) {
              _tmpVaccine_expiry_date = null;
            } else {
              _tmpVaccine_expiry_date = _cursor.getLong(_cursorIndexOfVaccineExpiryDate);
            }
            final boolean _tmpHas_adverse_reaction;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasAdverseReaction);
            _tmpHas_adverse_reaction = _tmp != 0;
            final String _tmpAdverse_reaction_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdverseReactionNotesHindi)) {
              _tmpAdverse_reaction_notes_hindi = null;
            } else {
              _tmpAdverse_reaction_notes_hindi = _cursor.getString(_cursorIndexOfAdverseReactionNotesHindi);
            }
            final Long _tmpNext_dose_due_date;
            if (_cursor.isNull(_cursorIndexOfNextDoseDueDate)) {
              _tmpNext_dose_due_date = null;
            } else {
              _tmpNext_dose_due_date = _cursor.getLong(_cursorIndexOfNextDoseDueDate);
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
            _item = new VaccinationVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpVaccine_type,_tmpVaccine_name_hindi,_tmpDose_number,_tmpVaccine_batch_number,_tmpVaccine_expiry_date,_tmpHas_adverse_reaction,_tmpAdverse_reaction_notes_hindi,_tmpNext_dose_due_date,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<List<VaccinationVisitEntity>> observeByBeneficiary(final String beneficiaryId) {
    final String _sql = "SELECT * FROM vaccination_visits WHERE beneficiary_id = ? ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"vaccination_visits"}, new Callable<List<VaccinationVisitEntity>>() {
      @Override
      @NonNull
      public List<VaccinationVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfVaccineType = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_type");
          final int _cursorIndexOfVaccineNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_name_hindi");
          final int _cursorIndexOfDoseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "dose_number");
          final int _cursorIndexOfVaccineBatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_batch_number");
          final int _cursorIndexOfVaccineExpiryDate = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_expiry_date");
          final int _cursorIndexOfHasAdverseReaction = CursorUtil.getColumnIndexOrThrow(_cursor, "has_adverse_reaction");
          final int _cursorIndexOfAdverseReactionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "adverse_reaction_notes_hindi");
          final int _cursorIndexOfNextDoseDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "next_dose_due_date");
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
          final List<VaccinationVisitEntity> _result = new ArrayList<VaccinationVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VaccinationVisitEntity _item;
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
            final String _tmpVaccine_type;
            if (_cursor.isNull(_cursorIndexOfVaccineType)) {
              _tmpVaccine_type = null;
            } else {
              _tmpVaccine_type = _cursor.getString(_cursorIndexOfVaccineType);
            }
            final String _tmpVaccine_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVaccineNameHindi)) {
              _tmpVaccine_name_hindi = null;
            } else {
              _tmpVaccine_name_hindi = _cursor.getString(_cursorIndexOfVaccineNameHindi);
            }
            final int _tmpDose_number;
            _tmpDose_number = _cursor.getInt(_cursorIndexOfDoseNumber);
            final String _tmpVaccine_batch_number;
            if (_cursor.isNull(_cursorIndexOfVaccineBatchNumber)) {
              _tmpVaccine_batch_number = null;
            } else {
              _tmpVaccine_batch_number = _cursor.getString(_cursorIndexOfVaccineBatchNumber);
            }
            final Long _tmpVaccine_expiry_date;
            if (_cursor.isNull(_cursorIndexOfVaccineExpiryDate)) {
              _tmpVaccine_expiry_date = null;
            } else {
              _tmpVaccine_expiry_date = _cursor.getLong(_cursorIndexOfVaccineExpiryDate);
            }
            final boolean _tmpHas_adverse_reaction;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasAdverseReaction);
            _tmpHas_adverse_reaction = _tmp != 0;
            final String _tmpAdverse_reaction_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdverseReactionNotesHindi)) {
              _tmpAdverse_reaction_notes_hindi = null;
            } else {
              _tmpAdverse_reaction_notes_hindi = _cursor.getString(_cursorIndexOfAdverseReactionNotesHindi);
            }
            final Long _tmpNext_dose_due_date;
            if (_cursor.isNull(_cursorIndexOfNextDoseDueDate)) {
              _tmpNext_dose_due_date = null;
            } else {
              _tmpNext_dose_due_date = _cursor.getLong(_cursorIndexOfNextDoseDueDate);
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
            _item = new VaccinationVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpVaccine_type,_tmpVaccine_name_hindi,_tmpDose_number,_tmpVaccine_batch_number,_tmpVaccine_expiry_date,_tmpHas_adverse_reaction,_tmpAdverse_reaction_notes_hindi,_tmpNext_dose_due_date,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getLatestDoseForVaccine(final String beneficiaryId, final String vaccineType,
      final Continuation<? super VaccinationVisitEntity> $completion) {
    final String _sql = "SELECT * FROM vaccination_visits WHERE beneficiary_id = ? AND vaccine_type = ? ORDER BY dose_number DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    _argIndex = 2;
    if (vaccineType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, vaccineType);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<VaccinationVisitEntity>() {
      @Override
      @Nullable
      public VaccinationVisitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfVaccineType = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_type");
          final int _cursorIndexOfVaccineNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_name_hindi");
          final int _cursorIndexOfDoseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "dose_number");
          final int _cursorIndexOfVaccineBatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_batch_number");
          final int _cursorIndexOfVaccineExpiryDate = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_expiry_date");
          final int _cursorIndexOfHasAdverseReaction = CursorUtil.getColumnIndexOrThrow(_cursor, "has_adverse_reaction");
          final int _cursorIndexOfAdverseReactionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "adverse_reaction_notes_hindi");
          final int _cursorIndexOfNextDoseDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "next_dose_due_date");
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
          final VaccinationVisitEntity _result;
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
            final String _tmpVaccine_type;
            if (_cursor.isNull(_cursorIndexOfVaccineType)) {
              _tmpVaccine_type = null;
            } else {
              _tmpVaccine_type = _cursor.getString(_cursorIndexOfVaccineType);
            }
            final String _tmpVaccine_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVaccineNameHindi)) {
              _tmpVaccine_name_hindi = null;
            } else {
              _tmpVaccine_name_hindi = _cursor.getString(_cursorIndexOfVaccineNameHindi);
            }
            final int _tmpDose_number;
            _tmpDose_number = _cursor.getInt(_cursorIndexOfDoseNumber);
            final String _tmpVaccine_batch_number;
            if (_cursor.isNull(_cursorIndexOfVaccineBatchNumber)) {
              _tmpVaccine_batch_number = null;
            } else {
              _tmpVaccine_batch_number = _cursor.getString(_cursorIndexOfVaccineBatchNumber);
            }
            final Long _tmpVaccine_expiry_date;
            if (_cursor.isNull(_cursorIndexOfVaccineExpiryDate)) {
              _tmpVaccine_expiry_date = null;
            } else {
              _tmpVaccine_expiry_date = _cursor.getLong(_cursorIndexOfVaccineExpiryDate);
            }
            final boolean _tmpHas_adverse_reaction;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasAdverseReaction);
            _tmpHas_adverse_reaction = _tmp != 0;
            final String _tmpAdverse_reaction_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdverseReactionNotesHindi)) {
              _tmpAdverse_reaction_notes_hindi = null;
            } else {
              _tmpAdverse_reaction_notes_hindi = _cursor.getString(_cursorIndexOfAdverseReactionNotesHindi);
            }
            final Long _tmpNext_dose_due_date;
            if (_cursor.isNull(_cursorIndexOfNextDoseDueDate)) {
              _tmpNext_dose_due_date = null;
            } else {
              _tmpNext_dose_due_date = _cursor.getLong(_cursorIndexOfNextDoseDueDate);
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
            _result = new VaccinationVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpVaccine_type,_tmpVaccine_name_hindi,_tmpDose_number,_tmpVaccine_batch_number,_tmpVaccine_expiry_date,_tmpHas_adverse_reaction,_tmpAdverse_reaction_notes_hindi,_tmpNext_dose_due_date,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getVisitsWithAdverseReactions(
      final Continuation<? super List<VaccinationVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM vaccination_visits WHERE has_adverse_reaction = 1 ORDER BY visit_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VaccinationVisitEntity>>() {
      @Override
      @NonNull
      public List<VaccinationVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfVaccineType = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_type");
          final int _cursorIndexOfVaccineNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_name_hindi");
          final int _cursorIndexOfDoseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "dose_number");
          final int _cursorIndexOfVaccineBatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_batch_number");
          final int _cursorIndexOfVaccineExpiryDate = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_expiry_date");
          final int _cursorIndexOfHasAdverseReaction = CursorUtil.getColumnIndexOrThrow(_cursor, "has_adverse_reaction");
          final int _cursorIndexOfAdverseReactionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "adverse_reaction_notes_hindi");
          final int _cursorIndexOfNextDoseDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "next_dose_due_date");
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
          final List<VaccinationVisitEntity> _result = new ArrayList<VaccinationVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VaccinationVisitEntity _item;
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
            final String _tmpVaccine_type;
            if (_cursor.isNull(_cursorIndexOfVaccineType)) {
              _tmpVaccine_type = null;
            } else {
              _tmpVaccine_type = _cursor.getString(_cursorIndexOfVaccineType);
            }
            final String _tmpVaccine_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVaccineNameHindi)) {
              _tmpVaccine_name_hindi = null;
            } else {
              _tmpVaccine_name_hindi = _cursor.getString(_cursorIndexOfVaccineNameHindi);
            }
            final int _tmpDose_number;
            _tmpDose_number = _cursor.getInt(_cursorIndexOfDoseNumber);
            final String _tmpVaccine_batch_number;
            if (_cursor.isNull(_cursorIndexOfVaccineBatchNumber)) {
              _tmpVaccine_batch_number = null;
            } else {
              _tmpVaccine_batch_number = _cursor.getString(_cursorIndexOfVaccineBatchNumber);
            }
            final Long _tmpVaccine_expiry_date;
            if (_cursor.isNull(_cursorIndexOfVaccineExpiryDate)) {
              _tmpVaccine_expiry_date = null;
            } else {
              _tmpVaccine_expiry_date = _cursor.getLong(_cursorIndexOfVaccineExpiryDate);
            }
            final boolean _tmpHas_adverse_reaction;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasAdverseReaction);
            _tmpHas_adverse_reaction = _tmp != 0;
            final String _tmpAdverse_reaction_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdverseReactionNotesHindi)) {
              _tmpAdverse_reaction_notes_hindi = null;
            } else {
              _tmpAdverse_reaction_notes_hindi = _cursor.getString(_cursorIndexOfAdverseReactionNotesHindi);
            }
            final Long _tmpNext_dose_due_date;
            if (_cursor.isNull(_cursorIndexOfNextDoseDueDate)) {
              _tmpNext_dose_due_date = null;
            } else {
              _tmpNext_dose_due_date = _cursor.getLong(_cursorIndexOfNextDoseDueDate);
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
            _item = new VaccinationVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpVaccine_type,_tmpVaccine_name_hindi,_tmpDose_number,_tmpVaccine_batch_number,_tmpVaccine_expiry_date,_tmpHas_adverse_reaction,_tmpAdverse_reaction_notes_hindi,_tmpNext_dose_due_date,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getUnsynced(final Continuation<? super List<VaccinationVisitEntity>> $completion) {
    final String _sql = "SELECT * FROM vaccination_visits WHERE is_synced = 0 ORDER BY recorded_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VaccinationVisitEntity>>() {
      @Override
      @NonNull
      public List<VaccinationVisitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfVisitDate = CursorUtil.getColumnIndexOrThrow(_cursor, "visit_date");
          final int _cursorIndexOfVaccineType = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_type");
          final int _cursorIndexOfVaccineNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_name_hindi");
          final int _cursorIndexOfDoseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "dose_number");
          final int _cursorIndexOfVaccineBatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_batch_number");
          final int _cursorIndexOfVaccineExpiryDate = CursorUtil.getColumnIndexOrThrow(_cursor, "vaccine_expiry_date");
          final int _cursorIndexOfHasAdverseReaction = CursorUtil.getColumnIndexOrThrow(_cursor, "has_adverse_reaction");
          final int _cursorIndexOfAdverseReactionNotesHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "adverse_reaction_notes_hindi");
          final int _cursorIndexOfNextDoseDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "next_dose_due_date");
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
          final List<VaccinationVisitEntity> _result = new ArrayList<VaccinationVisitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VaccinationVisitEntity _item;
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
            final String _tmpVaccine_type;
            if (_cursor.isNull(_cursorIndexOfVaccineType)) {
              _tmpVaccine_type = null;
            } else {
              _tmpVaccine_type = _cursor.getString(_cursorIndexOfVaccineType);
            }
            final String _tmpVaccine_name_hindi;
            if (_cursor.isNull(_cursorIndexOfVaccineNameHindi)) {
              _tmpVaccine_name_hindi = null;
            } else {
              _tmpVaccine_name_hindi = _cursor.getString(_cursorIndexOfVaccineNameHindi);
            }
            final int _tmpDose_number;
            _tmpDose_number = _cursor.getInt(_cursorIndexOfDoseNumber);
            final String _tmpVaccine_batch_number;
            if (_cursor.isNull(_cursorIndexOfVaccineBatchNumber)) {
              _tmpVaccine_batch_number = null;
            } else {
              _tmpVaccine_batch_number = _cursor.getString(_cursorIndexOfVaccineBatchNumber);
            }
            final Long _tmpVaccine_expiry_date;
            if (_cursor.isNull(_cursorIndexOfVaccineExpiryDate)) {
              _tmpVaccine_expiry_date = null;
            } else {
              _tmpVaccine_expiry_date = _cursor.getLong(_cursorIndexOfVaccineExpiryDate);
            }
            final boolean _tmpHas_adverse_reaction;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasAdverseReaction);
            _tmpHas_adverse_reaction = _tmp != 0;
            final String _tmpAdverse_reaction_notes_hindi;
            if (_cursor.isNull(_cursorIndexOfAdverseReactionNotesHindi)) {
              _tmpAdverse_reaction_notes_hindi = null;
            } else {
              _tmpAdverse_reaction_notes_hindi = _cursor.getString(_cursorIndexOfAdverseReactionNotesHindi);
            }
            final Long _tmpNext_dose_due_date;
            if (_cursor.isNull(_cursorIndexOfNextDoseDueDate)) {
              _tmpNext_dose_due_date = null;
            } else {
              _tmpNext_dose_due_date = _cursor.getLong(_cursorIndexOfNextDoseDueDate);
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
            _item = new VaccinationVisitEntity(_tmpId,_tmpBeneficiary_id,_tmpVisit_date,_tmpVaccine_type,_tmpVaccine_name_hindi,_tmpDose_number,_tmpVaccine_batch_number,_tmpVaccine_expiry_date,_tmpHas_adverse_reaction,_tmpAdverse_reaction_notes_hindi,_tmpNext_dose_due_date,_tmpRecorded_by_user_id,_tmpRecorded_at,_tmpGps_lat,_tmpGps_lng,_tmpCreated_at,_tmpUpdated_at,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
    final String _sql = "SELECT COUNT(*) FROM vaccination_visits WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"vaccination_visits"}, new Callable<Integer>() {
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
