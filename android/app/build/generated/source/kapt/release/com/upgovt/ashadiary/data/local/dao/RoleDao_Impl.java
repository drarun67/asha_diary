package com.upgovt.ashadiary.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.upgovt.ashadiary.data.local.entities.RoleEntity;
import java.lang.Class;
import java.lang.Exception;
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
public final class RoleDao_Impl implements RoleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RoleEntity> __insertionAdapterOfRoleEntity;

  public RoleDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoleEntity = new EntityInsertionAdapter<RoleEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `roles` (`id`,`name_hindi`,`name_english`,`authority_level`,`can_edit_beneficiary`,`can_approve_edits`,`can_merge_duplicates`,`created_at`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RoleEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName_hindi() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName_hindi());
        }
        if (entity.getName_english() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName_english());
        }
        statement.bindLong(4, entity.getAuthority_level());
        final int _tmp = entity.getCan_edit_beneficiary() ? 1 : 0;
        statement.bindLong(5, _tmp);
        final int _tmp_1 = entity.getCan_approve_edits() ? 1 : 0;
        statement.bindLong(6, _tmp_1);
        final int _tmp_2 = entity.getCan_merge_duplicates() ? 1 : 0;
        statement.bindLong(7, _tmp_2);
        statement.bindLong(8, entity.getCreated_at());
      }
    };
  }

  @Override
  public Object insert(final RoleEntity role, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfRoleEntity.insertAndReturnId(role);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<RoleEntity> roles,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfRoleEntity.insertAndReturnIdsList(roles);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getById(final int roleId, final Continuation<? super RoleEntity> $completion) {
    final String _sql = "SELECT * FROM roles WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, roleId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<RoleEntity>() {
      @Override
      @Nullable
      public RoleEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "name_english");
          final int _cursorIndexOfAuthorityLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "authority_level");
          final int _cursorIndexOfCanEditBeneficiary = CursorUtil.getColumnIndexOrThrow(_cursor, "can_edit_beneficiary");
          final int _cursorIndexOfCanApproveEdits = CursorUtil.getColumnIndexOrThrow(_cursor, "can_approve_edits");
          final int _cursorIndexOfCanMergeDuplicates = CursorUtil.getColumnIndexOrThrow(_cursor, "can_merge_duplicates");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final RoleEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpName_english;
            if (_cursor.isNull(_cursorIndexOfNameEnglish)) {
              _tmpName_english = null;
            } else {
              _tmpName_english = _cursor.getString(_cursorIndexOfNameEnglish);
            }
            final int _tmpAuthority_level;
            _tmpAuthority_level = _cursor.getInt(_cursorIndexOfAuthorityLevel);
            final boolean _tmpCan_edit_beneficiary;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCanEditBeneficiary);
            _tmpCan_edit_beneficiary = _tmp != 0;
            final boolean _tmpCan_approve_edits;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfCanApproveEdits);
            _tmpCan_approve_edits = _tmp_1 != 0;
            final boolean _tmpCan_merge_duplicates;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfCanMergeDuplicates);
            _tmpCan_merge_duplicates = _tmp_2 != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            _result = new RoleEntity(_tmpId,_tmpName_hindi,_tmpName_english,_tmpAuthority_level,_tmpCan_edit_beneficiary,_tmpCan_approve_edits,_tmpCan_merge_duplicates,_tmpCreated_at);
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
  public Object getAllRoles(final Continuation<? super List<RoleEntity>> $completion) {
    final String _sql = "SELECT * FROM roles ORDER BY authority_level ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<RoleEntity>>() {
      @Override
      @NonNull
      public List<RoleEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "name_english");
          final int _cursorIndexOfAuthorityLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "authority_level");
          final int _cursorIndexOfCanEditBeneficiary = CursorUtil.getColumnIndexOrThrow(_cursor, "can_edit_beneficiary");
          final int _cursorIndexOfCanApproveEdits = CursorUtil.getColumnIndexOrThrow(_cursor, "can_approve_edits");
          final int _cursorIndexOfCanMergeDuplicates = CursorUtil.getColumnIndexOrThrow(_cursor, "can_merge_duplicates");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final List<RoleEntity> _result = new ArrayList<RoleEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RoleEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpName_english;
            if (_cursor.isNull(_cursorIndexOfNameEnglish)) {
              _tmpName_english = null;
            } else {
              _tmpName_english = _cursor.getString(_cursorIndexOfNameEnglish);
            }
            final int _tmpAuthority_level;
            _tmpAuthority_level = _cursor.getInt(_cursorIndexOfAuthorityLevel);
            final boolean _tmpCan_edit_beneficiary;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCanEditBeneficiary);
            _tmpCan_edit_beneficiary = _tmp != 0;
            final boolean _tmpCan_approve_edits;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfCanApproveEdits);
            _tmpCan_approve_edits = _tmp_1 != 0;
            final boolean _tmpCan_merge_duplicates;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfCanMergeDuplicates);
            _tmpCan_merge_duplicates = _tmp_2 != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new RoleEntity(_tmpId,_tmpName_hindi,_tmpName_english,_tmpAuthority_level,_tmpCan_edit_beneficiary,_tmpCan_approve_edits,_tmpCan_merge_duplicates,_tmpCreated_at);
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
  public Flow<List<RoleEntity>> observeAllRoles() {
    final String _sql = "SELECT * FROM roles ORDER BY authority_level ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"roles"}, new Callable<List<RoleEntity>>() {
      @Override
      @NonNull
      public List<RoleEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNameHindi = CursorUtil.getColumnIndexOrThrow(_cursor, "name_hindi");
          final int _cursorIndexOfNameEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "name_english");
          final int _cursorIndexOfAuthorityLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "authority_level");
          final int _cursorIndexOfCanEditBeneficiary = CursorUtil.getColumnIndexOrThrow(_cursor, "can_edit_beneficiary");
          final int _cursorIndexOfCanApproveEdits = CursorUtil.getColumnIndexOrThrow(_cursor, "can_approve_edits");
          final int _cursorIndexOfCanMergeDuplicates = CursorUtil.getColumnIndexOrThrow(_cursor, "can_merge_duplicates");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final List<RoleEntity> _result = new ArrayList<RoleEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RoleEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName_hindi;
            if (_cursor.isNull(_cursorIndexOfNameHindi)) {
              _tmpName_hindi = null;
            } else {
              _tmpName_hindi = _cursor.getString(_cursorIndexOfNameHindi);
            }
            final String _tmpName_english;
            if (_cursor.isNull(_cursorIndexOfNameEnglish)) {
              _tmpName_english = null;
            } else {
              _tmpName_english = _cursor.getString(_cursorIndexOfNameEnglish);
            }
            final int _tmpAuthority_level;
            _tmpAuthority_level = _cursor.getInt(_cursorIndexOfAuthorityLevel);
            final boolean _tmpCan_edit_beneficiary;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCanEditBeneficiary);
            _tmpCan_edit_beneficiary = _tmp != 0;
            final boolean _tmpCan_approve_edits;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfCanApproveEdits);
            _tmpCan_approve_edits = _tmp_1 != 0;
            final boolean _tmpCan_merge_duplicates;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfCanMergeDuplicates);
            _tmpCan_merge_duplicates = _tmp_2 != 0;
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new RoleEntity(_tmpId,_tmpName_hindi,_tmpName_english,_tmpAuthority_level,_tmpCan_edit_beneficiary,_tmpCan_approve_edits,_tmpCan_merge_duplicates,_tmpCreated_at);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
