package com.example.cotcscouting.data.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AllianceDAO_Impl implements AllianceDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Alliance> __insertionAdapterOfAlliance;

  private final EntityDeletionOrUpdateAdapter<Alliance> __deletionAdapterOfAlliance;

  public AllianceDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAlliance = new EntityInsertionAdapter<Alliance>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `alliance` (`uid`,`blue_notes`,`blue_amp_count`,`blue_co_op`,`blue_melody`,`blue_ensamble`,`blue_harmony`,`red_notes`,`red_amp_count`,`red_co_op`,`red_melody`,`red_ensamble`,`red_harmony`,`match_number`,`scout_name`,`regional_code`,`michael_red_1`,`michael_red_2`,`michael_red_3`,`michael_blue_1`,`michael_blue_2`,`michael_blue_3`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Alliance entity) {
        statement.bindLong(1, entity.getUid());
        statement.bindString(2, entity.getBlueNotes());
        statement.bindLong(3, entity.getBlueAmpCount());
        final int _tmp = entity.getBlueCoOp() ? 1 : 0;
        statement.bindLong(4, _tmp);
        final int _tmp_1 = entity.getBlueMelody() ? 1 : 0;
        statement.bindLong(5, _tmp_1);
        final int _tmp_2 = entity.getBlueEnsamble() ? 1 : 0;
        statement.bindLong(6, _tmp_2);
        final int _tmp_3 = entity.getBlueHarmony() ? 1 : 0;
        statement.bindLong(7, _tmp_3);
        statement.bindString(8, entity.getRedNotes());
        statement.bindLong(9, entity.getRedAmpCount());
        final int _tmp_4 = entity.getRedCoOp() ? 1 : 0;
        statement.bindLong(10, _tmp_4);
        final int _tmp_5 = entity.getRedMelody() ? 1 : 0;
        statement.bindLong(11, _tmp_5);
        final int _tmp_6 = entity.getRedEnsamble() ? 1 : 0;
        statement.bindLong(12, _tmp_6);
        final int _tmp_7 = entity.getRedHarmony() ? 1 : 0;
        statement.bindLong(13, _tmp_7);
        statement.bindLong(14, entity.getMatchNumber());
        statement.bindString(15, entity.getScoutName());
        statement.bindString(16, entity.getRegionalCode());
        statement.bindString(17, entity.getMichaelRed1());
        statement.bindString(18, entity.getMichaelRed2());
        statement.bindString(19, entity.getMichaelRed3());
        statement.bindString(20, entity.getMichaelBlue1());
        statement.bindString(21, entity.getMichaelBlue2());
        statement.bindString(22, entity.getMichaelBlue3());
      }
    };
    this.__deletionAdapterOfAlliance = new EntityDeletionOrUpdateAdapter<Alliance>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `alliance` WHERE `uid` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Alliance entity) {
        statement.bindLong(1, entity.getUid());
      }
    };
  }

  @Override
  public void insertAll(final Alliance... alliances) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAlliance.insert(alliances);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Alliance alliance) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAlliance.insert(alliance);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Alliance alliance) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfAlliance.handle(alliance);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Alliance> getAll() {
    final String _sql = "SELECT * FROM alliance";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfBlueNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_notes");
      final int _cursorIndexOfBlueAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_amp_count");
      final int _cursorIndexOfBlueCoOp = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_co_op");
      final int _cursorIndexOfBlueMelody = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_melody");
      final int _cursorIndexOfBlueEnsamble = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_ensamble");
      final int _cursorIndexOfBlueHarmony = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_harmony");
      final int _cursorIndexOfRedNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "red_notes");
      final int _cursorIndexOfRedAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "red_amp_count");
      final int _cursorIndexOfRedCoOp = CursorUtil.getColumnIndexOrThrow(_cursor, "red_co_op");
      final int _cursorIndexOfRedMelody = CursorUtil.getColumnIndexOrThrow(_cursor, "red_melody");
      final int _cursorIndexOfRedEnsamble = CursorUtil.getColumnIndexOrThrow(_cursor, "red_ensamble");
      final int _cursorIndexOfRedHarmony = CursorUtil.getColumnIndexOrThrow(_cursor, "red_harmony");
      final int _cursorIndexOfMatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "match_number");
      final int _cursorIndexOfScoutName = CursorUtil.getColumnIndexOrThrow(_cursor, "scout_name");
      final int _cursorIndexOfRegionalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "regional_code");
      final int _cursorIndexOfMichaelRed1 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_red_1");
      final int _cursorIndexOfMichaelRed2 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_red_2");
      final int _cursorIndexOfMichaelRed3 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_red_3");
      final int _cursorIndexOfMichaelBlue1 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_blue_1");
      final int _cursorIndexOfMichaelBlue2 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_blue_2");
      final int _cursorIndexOfMichaelBlue3 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_blue_3");
      final List<Alliance> _result = new ArrayList<Alliance>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Alliance _item;
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final String _tmpBlueNotes;
        _tmpBlueNotes = _cursor.getString(_cursorIndexOfBlueNotes);
        final int _tmpBlueAmpCount;
        _tmpBlueAmpCount = _cursor.getInt(_cursorIndexOfBlueAmpCount);
        final boolean _tmpBlueCoOp;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfBlueCoOp);
        _tmpBlueCoOp = _tmp != 0;
        final boolean _tmpBlueMelody;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfBlueMelody);
        _tmpBlueMelody = _tmp_1 != 0;
        final boolean _tmpBlueEnsamble;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfBlueEnsamble);
        _tmpBlueEnsamble = _tmp_2 != 0;
        final boolean _tmpBlueHarmony;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfBlueHarmony);
        _tmpBlueHarmony = _tmp_3 != 0;
        final String _tmpRedNotes;
        _tmpRedNotes = _cursor.getString(_cursorIndexOfRedNotes);
        final int _tmpRedAmpCount;
        _tmpRedAmpCount = _cursor.getInt(_cursorIndexOfRedAmpCount);
        final boolean _tmpRedCoOp;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfRedCoOp);
        _tmpRedCoOp = _tmp_4 != 0;
        final boolean _tmpRedMelody;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfRedMelody);
        _tmpRedMelody = _tmp_5 != 0;
        final boolean _tmpRedEnsamble;
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfRedEnsamble);
        _tmpRedEnsamble = _tmp_6 != 0;
        final boolean _tmpRedHarmony;
        final int _tmp_7;
        _tmp_7 = _cursor.getInt(_cursorIndexOfRedHarmony);
        _tmpRedHarmony = _tmp_7 != 0;
        final int _tmpMatchNumber;
        _tmpMatchNumber = _cursor.getInt(_cursorIndexOfMatchNumber);
        final String _tmpScoutName;
        _tmpScoutName = _cursor.getString(_cursorIndexOfScoutName);
        final String _tmpRegionalCode;
        _tmpRegionalCode = _cursor.getString(_cursorIndexOfRegionalCode);
        final String _tmpMichaelRed1;
        _tmpMichaelRed1 = _cursor.getString(_cursorIndexOfMichaelRed1);
        final String _tmpMichaelRed2;
        _tmpMichaelRed2 = _cursor.getString(_cursorIndexOfMichaelRed2);
        final String _tmpMichaelRed3;
        _tmpMichaelRed3 = _cursor.getString(_cursorIndexOfMichaelRed3);
        final String _tmpMichaelBlue1;
        _tmpMichaelBlue1 = _cursor.getString(_cursorIndexOfMichaelBlue1);
        final String _tmpMichaelBlue2;
        _tmpMichaelBlue2 = _cursor.getString(_cursorIndexOfMichaelBlue2);
        final String _tmpMichaelBlue3;
        _tmpMichaelBlue3 = _cursor.getString(_cursorIndexOfMichaelBlue3);
        _item = new Alliance(_tmpUid,_tmpBlueNotes,_tmpBlueAmpCount,_tmpBlueCoOp,_tmpBlueMelody,_tmpBlueEnsamble,_tmpBlueHarmony,_tmpRedNotes,_tmpRedAmpCount,_tmpRedCoOp,_tmpRedMelody,_tmpRedEnsamble,_tmpRedHarmony,_tmpMatchNumber,_tmpScoutName,_tmpRegionalCode,_tmpMichaelRed1,_tmpMichaelRed2,_tmpMichaelRed3,_tmpMichaelBlue1,_tmpMichaelBlue2,_tmpMichaelBlue3);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Alliance> loadAllByIds(final int[] allianceIds) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM alliance WHERE uid IN (");
    final int _inputSize = allianceIds.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int _item : allianceIds) {
      _statement.bindLong(_argIndex, _item);
      _argIndex++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfBlueNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_notes");
      final int _cursorIndexOfBlueAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_amp_count");
      final int _cursorIndexOfBlueCoOp = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_co_op");
      final int _cursorIndexOfBlueMelody = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_melody");
      final int _cursorIndexOfBlueEnsamble = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_ensamble");
      final int _cursorIndexOfBlueHarmony = CursorUtil.getColumnIndexOrThrow(_cursor, "blue_harmony");
      final int _cursorIndexOfRedNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "red_notes");
      final int _cursorIndexOfRedAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "red_amp_count");
      final int _cursorIndexOfRedCoOp = CursorUtil.getColumnIndexOrThrow(_cursor, "red_co_op");
      final int _cursorIndexOfRedMelody = CursorUtil.getColumnIndexOrThrow(_cursor, "red_melody");
      final int _cursorIndexOfRedEnsamble = CursorUtil.getColumnIndexOrThrow(_cursor, "red_ensamble");
      final int _cursorIndexOfRedHarmony = CursorUtil.getColumnIndexOrThrow(_cursor, "red_harmony");
      final int _cursorIndexOfMatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "match_number");
      final int _cursorIndexOfScoutName = CursorUtil.getColumnIndexOrThrow(_cursor, "scout_name");
      final int _cursorIndexOfRegionalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "regional_code");
      final int _cursorIndexOfMichaelRed1 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_red_1");
      final int _cursorIndexOfMichaelRed2 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_red_2");
      final int _cursorIndexOfMichaelRed3 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_red_3");
      final int _cursorIndexOfMichaelBlue1 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_blue_1");
      final int _cursorIndexOfMichaelBlue2 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_blue_2");
      final int _cursorIndexOfMichaelBlue3 = CursorUtil.getColumnIndexOrThrow(_cursor, "michael_blue_3");
      final List<Alliance> _result = new ArrayList<Alliance>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Alliance _item_1;
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final String _tmpBlueNotes;
        _tmpBlueNotes = _cursor.getString(_cursorIndexOfBlueNotes);
        final int _tmpBlueAmpCount;
        _tmpBlueAmpCount = _cursor.getInt(_cursorIndexOfBlueAmpCount);
        final boolean _tmpBlueCoOp;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfBlueCoOp);
        _tmpBlueCoOp = _tmp != 0;
        final boolean _tmpBlueMelody;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfBlueMelody);
        _tmpBlueMelody = _tmp_1 != 0;
        final boolean _tmpBlueEnsamble;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfBlueEnsamble);
        _tmpBlueEnsamble = _tmp_2 != 0;
        final boolean _tmpBlueHarmony;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfBlueHarmony);
        _tmpBlueHarmony = _tmp_3 != 0;
        final String _tmpRedNotes;
        _tmpRedNotes = _cursor.getString(_cursorIndexOfRedNotes);
        final int _tmpRedAmpCount;
        _tmpRedAmpCount = _cursor.getInt(_cursorIndexOfRedAmpCount);
        final boolean _tmpRedCoOp;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfRedCoOp);
        _tmpRedCoOp = _tmp_4 != 0;
        final boolean _tmpRedMelody;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfRedMelody);
        _tmpRedMelody = _tmp_5 != 0;
        final boolean _tmpRedEnsamble;
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfRedEnsamble);
        _tmpRedEnsamble = _tmp_6 != 0;
        final boolean _tmpRedHarmony;
        final int _tmp_7;
        _tmp_7 = _cursor.getInt(_cursorIndexOfRedHarmony);
        _tmpRedHarmony = _tmp_7 != 0;
        final int _tmpMatchNumber;
        _tmpMatchNumber = _cursor.getInt(_cursorIndexOfMatchNumber);
        final String _tmpScoutName;
        _tmpScoutName = _cursor.getString(_cursorIndexOfScoutName);
        final String _tmpRegionalCode;
        _tmpRegionalCode = _cursor.getString(_cursorIndexOfRegionalCode);
        final String _tmpMichaelRed1;
        _tmpMichaelRed1 = _cursor.getString(_cursorIndexOfMichaelRed1);
        final String _tmpMichaelRed2;
        _tmpMichaelRed2 = _cursor.getString(_cursorIndexOfMichaelRed2);
        final String _tmpMichaelRed3;
        _tmpMichaelRed3 = _cursor.getString(_cursorIndexOfMichaelRed3);
        final String _tmpMichaelBlue1;
        _tmpMichaelBlue1 = _cursor.getString(_cursorIndexOfMichaelBlue1);
        final String _tmpMichaelBlue2;
        _tmpMichaelBlue2 = _cursor.getString(_cursorIndexOfMichaelBlue2);
        final String _tmpMichaelBlue3;
        _tmpMichaelBlue3 = _cursor.getString(_cursorIndexOfMichaelBlue3);
        _item_1 = new Alliance(_tmpUid,_tmpBlueNotes,_tmpBlueAmpCount,_tmpBlueCoOp,_tmpBlueMelody,_tmpBlueEnsamble,_tmpBlueHarmony,_tmpRedNotes,_tmpRedAmpCount,_tmpRedCoOp,_tmpRedMelody,_tmpRedEnsamble,_tmpRedHarmony,_tmpMatchNumber,_tmpScoutName,_tmpRegionalCode,_tmpMichaelRed1,_tmpMichaelRed2,_tmpMichaelRed3,_tmpMichaelBlue1,_tmpMichaelBlue2,_tmpMichaelBlue3);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
