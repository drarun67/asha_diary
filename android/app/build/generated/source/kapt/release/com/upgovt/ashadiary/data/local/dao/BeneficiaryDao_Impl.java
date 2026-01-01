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
import com.upgovt.ashadiary.data.local.entities.BeneficiaryEntity;
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
public final class BeneficiaryDao_Impl implements BeneficiaryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BeneficiaryEntity> __insertionAdapterOfBeneficiaryEntity;

  private final EntityDeletionOrUpdateAdapter<BeneficiaryEntity> __updateAdapterOfBeneficiaryEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeactivateBeneficiary;

  private final SharedSQLiteStatement __preparedStmtOfSetDuplicateFlagged;

  private final SharedSQLiteStatement __preparedStmtOfMergeBeneficiaryInto;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSyncStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeleteBeneficiary;

  public BeneficiaryDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBeneficiaryEntity = new EntityInsertionAdapter<BeneficiaryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `beneficiaries` (`id`,`beneficiary_id`,`name_hindi`,`father_husband_name_hindi`,`gender`,`date_of_birth`,`age_years`,`beneficiary_type`,`village_id`,`address_hindi`,`mobile_number`,`registered_by_user_id`,`registration_date`,`registration_gps_lat`,`registration_gps_lng`,`is_active`,`is_duplicate_flagged`,`duplicate_of_beneficiary_id`,`created_at`,`updated_at`,`last_modified_by_user_id`,`is_synced`,`last_synced_at`,`server_id`,`last_modified_by_role_id`,`sync_version`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BeneficiaryEntity entity) {
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
        if (entity.getName_hindi() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName_hindi());
        }
        if (entity.getFather_husband_name_hindi() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFather_husband_name_hindi());
        }
        if (entity.getGender() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getGender());
        }
        statement.bindLong(6, entity.getDate_of_birth());
        statement.bindLong(7, entity.getAge_years());
        if (entity.getBeneficiary_type() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getBeneficiary_type());
        }
        if (entity.getVillage_id() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getVillage_id());
        }
        if (entity.getAddress_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getAddress_hindi());
        }
        if (entity.getMobile_number() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getMobile_number());
        }
        if (entity.getRegistered_by_user_id() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getRegistered_by_user_id());
        }
        statement.bindLong(13, entity.getRegistration_date());
        statement.bindDouble(14, entity.getRegistration_gps_lat());
        statement.bindDouble(15, entity.getRegistration_gps_lng());
        final int _tmp = entity.is_active() ? 1 : 0;
        statement.bindLong(16, _tmp);
        final int _tmp_1 = entity.is_duplicate_flagged() ? 1 : 0;
        statement.bindLong(17, _tmp_1);
        if (entity.getDuplicate_of_beneficiary_id() == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, entity.getDuplicate_of_beneficiary_id());
        }
        statement.bindLong(19, entity.getCreated_at());
        statement.bindLong(20, entity.getUpdated_at());
        if (entity.getLast_modified_by_user_id() == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, entity.getLast_modified_by_user_id());
        }
        final int _tmp_2 = entity.is_synced() ? 1 : 0;
        statement.bindLong(22, _tmp_2);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(23);
        } else {
          statement.bindLong(23, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.getServer_id());
        }
        statement.bindLong(25, entity.getLast_modified_by_role_id());
        statement.bindLong(26, entity.getSync_version());
      }
    };
    this.__updateAdapterOfBeneficiaryEntity = new EntityDeletionOrUpdateAdapter<BeneficiaryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `beneficiaries` SET `id` = ?,`beneficiary_id` = ?,`name_hindi` = ?,`father_husband_name_hindi` = ?,`gender` = ?,`date_of_birth` = ?,`age_years` = ?,`beneficiary_type` = ?,`village_id` = ?,`address_hindi` = ?,`mobile_number` = ?,`registered_by_user_id` = ?,`registration_date` = ?,`registration_gps_lat` = ?,`registration_gps_lng` = ?,`is_active` = ?,`is_duplicate_flagged` = ?,`duplicate_of_beneficiary_id` = ?,`created_at` = ?,`updated_at` = ?,`last_modified_by_user_id` = ?,`is_synced` = ?,`last_synced_at` = ?,`server_id` = ?,`last_modified_by_role_id` = ?,`sync_version` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BeneficiaryEntity entity) {
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
        if (entity.getName_hindi() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName_hindi());
        }
        if (entity.getFather_husband_name_hindi() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFather_husband_name_hindi());
        }
        if (entity.getGender() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getGender());
        }
        statement.bindLong(6, entity.getDate_of_birth());
        statement.bindLong(7, entity.getAge_years());
        if (entity.getBeneficiary_type() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getBeneficiary_type());
        }
        if (entity.getVillage_id() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getVillage_id());
        }
        if (entity.getAddress_hindi() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getAddress_hindi());
        }
        if (entity.getMobile_number() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getMobile_number());
        }
        if (entity.getRegistered_by_user_id() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getRegistered_by_user_id());
        }
        statement.bindLong(13, entity.getRegistration_date());
        statement.bindDouble(14, entity.getRegistration_gps_lat());
        statement.bindDouble(15, entity.getRegistration_gps_lng());
        final int _tmp = entity.is_active() ? 1 : 0;
        statement.bindLong(16, _tmp);
        final int _tmp_1 = entity.is_duplicate_flagged() ? 1 : 0;
        statement.bindLong(17, _tmp_1);
        if (entity.getDuplicate_of_beneficiary_id() == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, entity.getDuplicate_of_beneficiary_id());
        }
        statement.bindLong(19, entity.getCreated_at());
        statement.bindLong(20, entity.getUpdated_at());
        if (entity.getLast_modified_by_user_id() == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, entity.getLast_modified_by_user_id());
        }
        final int _tmp_2 = entity.is_synced() ? 1 : 0;
        statement.bindLong(22, _tmp_2);
        if (entity.getLast_synced_at() == null) {
          statement.bindNull(23);
        } else {
          statement.bindLong(23, entity.getLast_synced_at());
        }
        if (entity.getServer_id() == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.getServer_id());
        }
        statement.bindLong(25, entity.getLast_modified_by_role_id());
        statement.bindLong(26, entity.getSync_version());
        if (entity.getId() == null) {
          statement.bindNull(27);
        } else {
          statement.bindString(27, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDeactivateBeneficiary = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE beneficiaries \n"
                + "        SET is_active = 0, \n"
                + "            updated_at = ?,\n"
                + "            last_modified_by_user_id = ?,\n"
                + "            last_modified_by_role_id = ?,\n"
                + "            sync_version = sync_version + 1\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfSetDuplicateFlagged = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE beneficiaries \n"
                + "        SET is_duplicate_flagged = ?,\n"
                + "            updated_at = ?,\n"
                + "            sync_version = sync_version + 1\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfMergeBeneficiaryInto = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE beneficiaries \n"
                + "        SET is_active = 0,\n"
                + "            duplicate_of_beneficiary_id = ?,\n"
                + "            updated_at = ?,\n"
                + "            last_modified_by_user_id = ?,\n"
                + "            last_modified_by_role_id = ?,\n"
                + "            sync_version = sync_version + 1\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSyncStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE beneficiaries \n"
                + "        SET is_synced = ?, \n"
                + "            last_synced_at = ?, \n"
                + "            server_id = ? \n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteBeneficiary = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM beneficiaries WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertBeneficiary(final BeneficiaryEntity beneficiary,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfBeneficiaryEntity.insertAndReturnId(beneficiary);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertBeneficiaries(final List<BeneficiaryEntity> beneficiaries,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfBeneficiaryEntity.insertAndReturnIdsList(beneficiaries);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateBeneficiary(final BeneficiaryEntity beneficiary,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfBeneficiaryEntity.handle(beneficiary);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deactivateBeneficiary(final String beneficiaryId, final String modifiedByUserId,
      final int modifiedByRoleId, final long timestamp,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeactivateBeneficiary.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 2;
        if (modifiedByUserId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, modifiedByUserId);
        }
        _argIndex = 3;
        _stmt.bindLong(_argIndex, modifiedByRoleId);
        _argIndex = 4;
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
          __preparedStmtOfDeactivateBeneficiary.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object setDuplicateFlagged(final String beneficiaryId, final boolean isFlagged,
      final long timestamp, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetDuplicateFlagged.acquire();
        int _argIndex = 1;
        final int _tmp = isFlagged ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 3;
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
          __preparedStmtOfSetDuplicateFlagged.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object mergeBeneficiaryInto(final String beneficiaryId, final String masterBeneficiaryId,
      final String modifiedByUserId, final int modifiedByRoleId, final long timestamp,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMergeBeneficiaryInto.acquire();
        int _argIndex = 1;
        if (masterBeneficiaryId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, masterBeneficiaryId);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, timestamp);
        _argIndex = 3;
        if (modifiedByUserId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, modifiedByUserId);
        }
        _argIndex = 4;
        _stmt.bindLong(_argIndex, modifiedByRoleId);
        _argIndex = 5;
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
          __preparedStmtOfMergeBeneficiaryInto.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateSyncStatus(final String beneficiaryId, final boolean isSynced,
      final long syncedAt, final String serverId, final Continuation<? super Integer> $completion) {
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
          __preparedStmtOfUpdateSyncStatus.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteBeneficiary(final String beneficiaryId,
      final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteBeneficiary.acquire();
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
          __preparedStmtOfDeleteBeneficiary.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getBeneficiaryById(final String beneficiaryId,
      final Continuation<? super BeneficiaryEntity> $completion) {
    final String _sql = "SELECT * FROM beneficiaries WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<BeneficiaryEntity>() {
      @Override
      @Nullable
      public BeneficiaryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final BeneficiaryEntity _result;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _result = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<BeneficiaryEntity> observeBeneficiaryById(final String beneficiaryId) {
    final String _sql = "SELECT * FROM beneficiaries WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"beneficiaries"}, new Callable<BeneficiaryEntity>() {
      @Override
      @Nullable
      public BeneficiaryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final BeneficiaryEntity _result;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _result = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getBeneficiaryByUniqueId(final String beneficiaryId,
      final Continuation<? super BeneficiaryEntity> $completion) {
    final String _sql = "SELECT * FROM beneficiaries WHERE beneficiary_id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (beneficiaryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, beneficiaryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<BeneficiaryEntity>() {
      @Override
      @Nullable
      public BeneficiaryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final BeneficiaryEntity _result;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _result = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getBeneficiariesByVillage(final String villageId,
      final Continuation<? super List<BeneficiaryEntity>> $completion) {
    final String _sql = "SELECT * FROM beneficiaries WHERE village_id = ? AND is_active = 1 ORDER BY name_hindi ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (villageId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, villageId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<List<BeneficiaryEntity>> observeBeneficiariesByVillage(final String villageId) {
    final String _sql = "SELECT * FROM beneficiaries WHERE village_id = ? AND is_active = 1 ORDER BY name_hindi ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (villageId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, villageId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"beneficiaries"}, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getBeneficiariesByUser(final String userId,
      final Continuation<? super List<BeneficiaryEntity>> $completion) {
    final String _sql = "SELECT * FROM beneficiaries WHERE registered_by_user_id = ? AND is_active = 1 ORDER BY registration_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<List<BeneficiaryEntity>> observeBeneficiariesByUser(final String userId) {
    final String _sql = "SELECT * FROM beneficiaries WHERE registered_by_user_id = ? AND is_active = 1 ORDER BY registration_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"beneficiaries"}, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getBeneficiariesPaginated(final int limit, final int offset,
      final Continuation<? super List<BeneficiaryEntity>> $completion) {
    final String _sql = "SELECT * FROM beneficiaries WHERE is_active = 1 ORDER BY name_hindi ASC LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    _argIndex = 2;
    _statement.bindLong(_argIndex, offset);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object searchBeneficiaries(final String query, final int limit,
      final Continuation<? super List<BeneficiaryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT * FROM beneficiaries \n"
            + "        WHERE is_active = 1 \n"
            + "        AND (\n"
            + "            name_hindi LIKE '%' || ? || '%' \n"
            + "            OR beneficiary_id LIKE '%' || ? || '%'\n"
            + "            OR mobile_number LIKE '%' || ? || '%'\n"
            + "        )\n"
            + "        ORDER BY name_hindi ASC\n"
            + "        LIMIT ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 4;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<List<BeneficiaryEntity>> observeSearchBeneficiaries(final String query,
      final int limit) {
    final String _sql = "\n"
            + "        SELECT * FROM beneficiaries \n"
            + "        WHERE is_active = 1 \n"
            + "        AND (\n"
            + "            name_hindi LIKE '%' || ? || '%' \n"
            + "            OR beneficiary_id LIKE '%' || ? || '%'\n"
            + "            OR mobile_number LIKE '%' || ? || '%'\n"
            + "        )\n"
            + "        ORDER BY name_hindi ASC\n"
            + "        LIMIT ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 4;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"beneficiaries"}, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object findPotentialDuplicates(final String villageId, final String gender,
      final int ageYears, final String excludeId,
      final Continuation<? super List<BeneficiaryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT * FROM beneficiaries \n"
            + "        WHERE village_id = ? \n"
            + "        AND gender = ? \n"
            + "        AND is_active = 1\n"
            + "        AND ABS(age_years - ?) <= 2\n"
            + "        AND id != ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (villageId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, villageId);
    }
    _argIndex = 2;
    if (gender == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, gender);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, ageYears);
    _argIndex = 4;
    if (excludeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, excludeId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object findExactNameMatch(final String nameHindi, final String villageId,
      final String gender, final String excludeId,
      final Continuation<? super List<BeneficiaryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT * FROM beneficiaries \n"
            + "        WHERE name_hindi = ? \n"
            + "        AND village_id = ? \n"
            + "        AND gender = ? \n"
            + "        AND is_active = 1\n"
            + "        AND id != ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (nameHindi == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, nameHindi);
    }
    _argIndex = 2;
    if (villageId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, villageId);
    }
    _argIndex = 3;
    if (gender == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, gender);
    }
    _argIndex = 4;
    if (excludeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, excludeId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getDuplicateFlaggedBeneficiaries(
      final Continuation<? super List<BeneficiaryEntity>> $completion) {
    final String _sql = "SELECT * FROM beneficiaries WHERE is_duplicate_flagged = 1 AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Flow<List<BeneficiaryEntity>> observeDuplicateFlaggedBeneficiaries() {
    final String _sql = "SELECT * FROM beneficiaries WHERE is_duplicate_flagged = 1 AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"beneficiaries"}, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
  public Object getUnsyncedBeneficiaries(
      final Continuation<? super List<BeneficiaryEntity>> $completion) {
    final String _sql = "SELECT * FROM beneficiaries WHERE is_synced = 0 ORDER BY created_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BeneficiaryEntity>>() {
      @Override
      @NonNull
      public List<BeneficiaryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfFatherHusbandNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "father_husband_name_hindi");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDateOfBirth = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_birth");
          final int _cursorIndexOfAgeYears = CursorUtil.getColumnIndexOrThrow(_cursor, "age_years");
          final int _cursorIndexOfBeneficiaryType = CursorUtil.getColumnIndexOrThrow(_cursor, "beneficiary_type");
          final int _cursorIndexOfVillageId = CursorUtil.getColumnIndexOrThrow(_cursor, "village_id");
          final int _cursorIndexOfAddressHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "address_hindi");
          final int _cursorIndexOfMobileNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile_number");
          final int _cursorIndexOfRegisteredByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_by_user_id");
          final int _cursorIndexOfRegistrationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_date");
          final int _cursorIndexOfRegistrationGpsLat = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lat");
          final int _cursorIndexOfRegistrationGpsLng = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_gps_lng");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfIsDuplicateFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_duplicate_flagged");
          final int _cursorIndexOfDuplicateOfBeneficiaryId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_of_beneficiary_id");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfLastModifiedByUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_user_id");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "is_synced");
          final int _cursorIndexOfLastSyncedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "last_synced_at");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "server_id");
          final int _cursorIndexOfLastModifiedByRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified_by_role_id");
          final int _cursorIndexOfSyncVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "sync_version");
          final List<BeneficiaryEntity> _result = new ArrayList<BeneficiaryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BeneficiaryEntity _item;
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
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpFather_husband_name_hindi;
            if (_cursor.isNull(_cursorIndexOfFatherHusbandNameHindi)) {
              _tmpFather_husband_name_hindi = null;
            } else {
              _tmpFather_husband_name_hindi = _cursor.getString(_cursorIndexOfFatherHusbandNameHindi);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final long _tmpDate_of_birth;
            _tmpDate_of_birth = _cursor.getLong(_cursorIndexOfDateOfBirth);
            final int _tmpAge_years;
            _tmpAge_years = _cursor.getInt(_cursorIndexOfAgeYears);
            final String _tmpBeneficiary_type;
            if (_cursor.isNull(_cursorIndexOfBeneficiaryType)) {
              _tmpBeneficiary_type = null;
            } else {
              _tmpBeneficiary_type = _cursor.getString(_cursorIndexOfBeneficiaryType);
            }
            final String _tmpVillage_id;
            if (_cursor.isNull(_cursorIndexOfVillageId)) {
              _tmpVillage_id = null;
            } else {
              _tmpVillage_id = _cursor.getString(_cursorIndexOfVillageId);
            }
            final String _tmpAddress_hindi;
            if (_cursor.isNull(_cursorIndexOfAddressHindi)) {
              _tmpAddress_hindi = null;
            } else {
              _tmpAddress_hindi = _cursor.getString(_cursorIndexOfAddressHindi);
            }
            final String _tmpMobile_number;
            if (_cursor.isNull(_cursorIndexOfMobileNumber)) {
              _tmpMobile_number = null;
            } else {
              _tmpMobile_number = _cursor.getString(_cursorIndexOfMobileNumber);
            }
            final String _tmpRegistered_by_user_id;
            if (_cursor.isNull(_cursorIndexOfRegisteredByUserId)) {
              _tmpRegistered_by_user_id = null;
            } else {
              _tmpRegistered_by_user_id = _cursor.getString(_cursorIndexOfRegisteredByUserId);
            }
            final long _tmpRegistration_date;
            _tmpRegistration_date = _cursor.getLong(_cursorIndexOfRegistrationDate);
            final double _tmpRegistration_gps_lat;
            _tmpRegistration_gps_lat = _cursor.getDouble(_cursorIndexOfRegistrationGpsLat);
            final double _tmpRegistration_gps_lng;
            _tmpRegistration_gps_lng = _cursor.getDouble(_cursorIndexOfRegistrationGpsLng);
            final boolean _tmpIs_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIs_active = _tmp != 0;
            final boolean _tmpIs_duplicate_flagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDuplicateFlagged);
            _tmpIs_duplicate_flagged = _tmp_1 != 0;
            final String _tmpDuplicate_of_beneficiary_id;
            if (_cursor.isNull(_cursorIndexOfDuplicateOfBeneficiaryId)) {
              _tmpDuplicate_of_beneficiary_id = null;
            } else {
              _tmpDuplicate_of_beneficiary_id = _cursor.getString(_cursorIndexOfDuplicateOfBeneficiaryId);
            }
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final String _tmpLast_modified_by_user_id;
            if (_cursor.isNull(_cursorIndexOfLastModifiedByUserId)) {
              _tmpLast_modified_by_user_id = null;
            } else {
              _tmpLast_modified_by_user_id = _cursor.getString(_cursorIndexOfLastModifiedByUserId);
            }
            final boolean _tmpIs_synced;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIs_synced = _tmp_2 != 0;
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
            _item = new BeneficiaryEntity(_tmpId,_tmpBeneficiary_id,_tmpName_hindi,_tmpFather_husband_name_hindi,_tmpGender,_tmpDate_of_birth,_tmpAge_years,_tmpBeneficiary_type,_tmpVillage_id,_tmpAddress_hindi,_tmpMobile_number,_tmpRegistered_by_user_id,_tmpRegistration_date,_tmpRegistration_gps_lat,_tmpRegistration_gps_lng,_tmpIs_active,_tmpIs_duplicate_flagged,_tmpDuplicate_of_beneficiary_id,_tmpCreated_at,_tmpUpdated_at,_tmpLast_modified_by_user_id,_tmpIs_synced,_tmpLast_synced_at,_tmpServer_id,_tmpLast_modified_by_role_id,_tmpSync_version);
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
    final String _sql = "SELECT COUNT(*) FROM beneficiaries WHERE is_synced = 0";
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
    final String _sql = "SELECT COUNT(*) FROM beneficiaries WHERE is_synced = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"beneficiaries"}, new Callable<Integer>() {
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
  public Object getTotalActiveBeneficiaries(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM beneficiaries WHERE is_active = 1";
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
  public Flow<Integer> observeTotalActiveBeneficiaries() {
    final String _sql = "SELECT COUNT(*) FROM beneficiaries WHERE is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"beneficiaries"}, new Callable<Integer>() {
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
  public Object getCountByVillage(final String villageId,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM beneficiaries WHERE village_id = ? AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (villageId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, villageId);
    }
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
  public Object getCountByType(final String type, final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM beneficiaries WHERE beneficiary_type = ? AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
