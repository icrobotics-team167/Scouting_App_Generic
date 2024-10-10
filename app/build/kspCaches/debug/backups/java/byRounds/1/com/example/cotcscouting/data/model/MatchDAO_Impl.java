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
public final class MatchDAO_Impl implements MatchDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Match> __insertionAdapterOfMatch;

  private final EntityDeletionOrUpdateAdapter<Match> __deletionAdapterOfMatch;

  public MatchDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMatch = new EntityInsertionAdapter<Match>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `match` (`uid`,`auto_amp_count`,`auto_speaker_count`,`teleop_amp_count`,`tele_op_speaker_count`,`leave`,`on_stage`,`on_stage_spotlit`,`trap_note`,`park`,`defense`,`disabled_robot`,`shooting_distance_bar`,`match_number`,`match_notes`,`team_number`,`scout_name`,`regional_code`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Match entity) {
        statement.bindLong(1, entity.getUid());
        statement.bindLong(2, entity.getAutoAmpCount());
        statement.bindLong(3, entity.getAutoSpeakerCount());
        statement.bindLong(4, entity.getTeleopAmpCount());
        statement.bindLong(5, entity.getTeleOpSpeakerCount());
        final int _tmp = entity.getLeave() ? 1 : 0;
        statement.bindLong(6, _tmp);
        final int _tmp_1 = entity.getOnStage() ? 1 : 0;
        statement.bindLong(7, _tmp_1);
        final int _tmp_2 = entity.getOnStageSpotlit() ? 1 : 0;
        statement.bindLong(8, _tmp_2);
        statement.bindLong(9, entity.getTrapNote());
        final int _tmp_3 = entity.getPark() ? 1 : 0;
        statement.bindLong(10, _tmp_3);
        final int _tmp_4 = entity.getDefense() ? 1 : 0;
        statement.bindLong(11, _tmp_4);
        final int _tmp_5 = entity.getDisabledRobot() ? 1 : 0;
        statement.bindLong(12, _tmp_5);
        statement.bindLong(13, entity.getShootingDistanceBar());
        statement.bindString(14, entity.getMatchNumber());
        statement.bindString(15, entity.getMatchNotes());
        statement.bindString(16, entity.getTeamNumber());
        statement.bindString(17, entity.getScoutName());
        statement.bindString(18, entity.getRegionalCode());
      }
    };
    this.__deletionAdapterOfMatch = new EntityDeletionOrUpdateAdapter<Match>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `match` WHERE `uid` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Match entity) {
        statement.bindLong(1, entity.getUid());
      }
    };
  }

  @Override
  public void insertAll(final Match... matches) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMatch.insert(matches);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Match match) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMatch.insert(match);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Match match) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMatch.handle(match);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Match> getAll() {
    final String _sql = "SELECT * FROM `match`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfAutoAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "auto_amp_count");
      final int _cursorIndexOfAutoSpeakerCount = CursorUtil.getColumnIndexOrThrow(_cursor, "auto_speaker_count");
      final int _cursorIndexOfTeleopAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "teleop_amp_count");
      final int _cursorIndexOfTeleOpSpeakerCount = CursorUtil.getColumnIndexOrThrow(_cursor, "tele_op_speaker_count");
      final int _cursorIndexOfLeave = CursorUtil.getColumnIndexOrThrow(_cursor, "leave");
      final int _cursorIndexOfOnStage = CursorUtil.getColumnIndexOrThrow(_cursor, "on_stage");
      final int _cursorIndexOfOnStageSpotlit = CursorUtil.getColumnIndexOrThrow(_cursor, "on_stage_spotlit");
      final int _cursorIndexOfTrapNote = CursorUtil.getColumnIndexOrThrow(_cursor, "trap_note");
      final int _cursorIndexOfPark = CursorUtil.getColumnIndexOrThrow(_cursor, "park");
      final int _cursorIndexOfDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "defense");
      final int _cursorIndexOfDisabledRobot = CursorUtil.getColumnIndexOrThrow(_cursor, "disabled_robot");
      final int _cursorIndexOfShootingDistanceBar = CursorUtil.getColumnIndexOrThrow(_cursor, "shooting_distance_bar");
      final int _cursorIndexOfMatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "match_number");
      final int _cursorIndexOfMatchNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "match_notes");
      final int _cursorIndexOfTeamNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "team_number");
      final int _cursorIndexOfScoutName = CursorUtil.getColumnIndexOrThrow(_cursor, "scout_name");
      final int _cursorIndexOfRegionalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "regional_code");
      final List<Match> _result = new ArrayList<Match>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Match _item;
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final int _tmpAutoAmpCount;
        _tmpAutoAmpCount = _cursor.getInt(_cursorIndexOfAutoAmpCount);
        final int _tmpAutoSpeakerCount;
        _tmpAutoSpeakerCount = _cursor.getInt(_cursorIndexOfAutoSpeakerCount);
        final int _tmpTeleopAmpCount;
        _tmpTeleopAmpCount = _cursor.getInt(_cursorIndexOfTeleopAmpCount);
        final int _tmpTeleOpSpeakerCount;
        _tmpTeleOpSpeakerCount = _cursor.getInt(_cursorIndexOfTeleOpSpeakerCount);
        final boolean _tmpLeave;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfLeave);
        _tmpLeave = _tmp != 0;
        final boolean _tmpOnStage;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfOnStage);
        _tmpOnStage = _tmp_1 != 0;
        final boolean _tmpOnStageSpotlit;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOnStageSpotlit);
        _tmpOnStageSpotlit = _tmp_2 != 0;
        final int _tmpTrapNote;
        _tmpTrapNote = _cursor.getInt(_cursorIndexOfTrapNote);
        final boolean _tmpPark;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfPark);
        _tmpPark = _tmp_3 != 0;
        final boolean _tmpDefense;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfDefense);
        _tmpDefense = _tmp_4 != 0;
        final boolean _tmpDisabledRobot;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfDisabledRobot);
        _tmpDisabledRobot = _tmp_5 != 0;
        final int _tmpShootingDistanceBar;
        _tmpShootingDistanceBar = _cursor.getInt(_cursorIndexOfShootingDistanceBar);
        final String _tmpMatchNumber;
        _tmpMatchNumber = _cursor.getString(_cursorIndexOfMatchNumber);
        final String _tmpMatchNotes;
        _tmpMatchNotes = _cursor.getString(_cursorIndexOfMatchNotes);
        final String _tmpTeamNumber;
        _tmpTeamNumber = _cursor.getString(_cursorIndexOfTeamNumber);
        final String _tmpScoutName;
        _tmpScoutName = _cursor.getString(_cursorIndexOfScoutName);
        final String _tmpRegionalCode;
        _tmpRegionalCode = _cursor.getString(_cursorIndexOfRegionalCode);
        _item = new Match(_tmpUid,_tmpAutoAmpCount,_tmpAutoSpeakerCount,_tmpTeleopAmpCount,_tmpTeleOpSpeakerCount,_tmpLeave,_tmpOnStage,_tmpOnStageSpotlit,_tmpTrapNote,_tmpPark,_tmpDefense,_tmpDisabledRobot,_tmpShootingDistanceBar,_tmpMatchNumber,_tmpMatchNotes,_tmpTeamNumber,_tmpScoutName,_tmpRegionalCode);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Match> loadAllByIds(final int[] matchIds) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM `match` WHERE uid IN (");
    final int _inputSize = matchIds.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int _item : matchIds) {
      _statement.bindLong(_argIndex, _item);
      _argIndex++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfAutoAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "auto_amp_count");
      final int _cursorIndexOfAutoSpeakerCount = CursorUtil.getColumnIndexOrThrow(_cursor, "auto_speaker_count");
      final int _cursorIndexOfTeleopAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "teleop_amp_count");
      final int _cursorIndexOfTeleOpSpeakerCount = CursorUtil.getColumnIndexOrThrow(_cursor, "tele_op_speaker_count");
      final int _cursorIndexOfLeave = CursorUtil.getColumnIndexOrThrow(_cursor, "leave");
      final int _cursorIndexOfOnStage = CursorUtil.getColumnIndexOrThrow(_cursor, "on_stage");
      final int _cursorIndexOfOnStageSpotlit = CursorUtil.getColumnIndexOrThrow(_cursor, "on_stage_spotlit");
      final int _cursorIndexOfTrapNote = CursorUtil.getColumnIndexOrThrow(_cursor, "trap_note");
      final int _cursorIndexOfPark = CursorUtil.getColumnIndexOrThrow(_cursor, "park");
      final int _cursorIndexOfDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "defense");
      final int _cursorIndexOfDisabledRobot = CursorUtil.getColumnIndexOrThrow(_cursor, "disabled_robot");
      final int _cursorIndexOfShootingDistanceBar = CursorUtil.getColumnIndexOrThrow(_cursor, "shooting_distance_bar");
      final int _cursorIndexOfMatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "match_number");
      final int _cursorIndexOfMatchNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "match_notes");
      final int _cursorIndexOfTeamNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "team_number");
      final int _cursorIndexOfScoutName = CursorUtil.getColumnIndexOrThrow(_cursor, "scout_name");
      final int _cursorIndexOfRegionalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "regional_code");
      final List<Match> _result = new ArrayList<Match>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Match _item_1;
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final int _tmpAutoAmpCount;
        _tmpAutoAmpCount = _cursor.getInt(_cursorIndexOfAutoAmpCount);
        final int _tmpAutoSpeakerCount;
        _tmpAutoSpeakerCount = _cursor.getInt(_cursorIndexOfAutoSpeakerCount);
        final int _tmpTeleopAmpCount;
        _tmpTeleopAmpCount = _cursor.getInt(_cursorIndexOfTeleopAmpCount);
        final int _tmpTeleOpSpeakerCount;
        _tmpTeleOpSpeakerCount = _cursor.getInt(_cursorIndexOfTeleOpSpeakerCount);
        final boolean _tmpLeave;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfLeave);
        _tmpLeave = _tmp != 0;
        final boolean _tmpOnStage;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfOnStage);
        _tmpOnStage = _tmp_1 != 0;
        final boolean _tmpOnStageSpotlit;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOnStageSpotlit);
        _tmpOnStageSpotlit = _tmp_2 != 0;
        final int _tmpTrapNote;
        _tmpTrapNote = _cursor.getInt(_cursorIndexOfTrapNote);
        final boolean _tmpPark;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfPark);
        _tmpPark = _tmp_3 != 0;
        final boolean _tmpDefense;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfDefense);
        _tmpDefense = _tmp_4 != 0;
        final boolean _tmpDisabledRobot;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfDisabledRobot);
        _tmpDisabledRobot = _tmp_5 != 0;
        final int _tmpShootingDistanceBar;
        _tmpShootingDistanceBar = _cursor.getInt(_cursorIndexOfShootingDistanceBar);
        final String _tmpMatchNumber;
        _tmpMatchNumber = _cursor.getString(_cursorIndexOfMatchNumber);
        final String _tmpMatchNotes;
        _tmpMatchNotes = _cursor.getString(_cursorIndexOfMatchNotes);
        final String _tmpTeamNumber;
        _tmpTeamNumber = _cursor.getString(_cursorIndexOfTeamNumber);
        final String _tmpScoutName;
        _tmpScoutName = _cursor.getString(_cursorIndexOfScoutName);
        final String _tmpRegionalCode;
        _tmpRegionalCode = _cursor.getString(_cursorIndexOfRegionalCode);
        _item_1 = new Match(_tmpUid,_tmpAutoAmpCount,_tmpAutoSpeakerCount,_tmpTeleopAmpCount,_tmpTeleOpSpeakerCount,_tmpLeave,_tmpOnStage,_tmpOnStageSpotlit,_tmpTrapNote,_tmpPark,_tmpDefense,_tmpDisabledRobot,_tmpShootingDistanceBar,_tmpMatchNumber,_tmpMatchNotes,_tmpTeamNumber,_tmpScoutName,_tmpRegionalCode);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Match findByTeamNumber(final int teamNumber) {
    final String _sql = "SELECT * FROM `match` WHERE team_number LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, teamNumber);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfAutoAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "auto_amp_count");
      final int _cursorIndexOfAutoSpeakerCount = CursorUtil.getColumnIndexOrThrow(_cursor, "auto_speaker_count");
      final int _cursorIndexOfTeleopAmpCount = CursorUtil.getColumnIndexOrThrow(_cursor, "teleop_amp_count");
      final int _cursorIndexOfTeleOpSpeakerCount = CursorUtil.getColumnIndexOrThrow(_cursor, "tele_op_speaker_count");
      final int _cursorIndexOfLeave = CursorUtil.getColumnIndexOrThrow(_cursor, "leave");
      final int _cursorIndexOfOnStage = CursorUtil.getColumnIndexOrThrow(_cursor, "on_stage");
      final int _cursorIndexOfOnStageSpotlit = CursorUtil.getColumnIndexOrThrow(_cursor, "on_stage_spotlit");
      final int _cursorIndexOfTrapNote = CursorUtil.getColumnIndexOrThrow(_cursor, "trap_note");
      final int _cursorIndexOfPark = CursorUtil.getColumnIndexOrThrow(_cursor, "park");
      final int _cursorIndexOfDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "defense");
      final int _cursorIndexOfDisabledRobot = CursorUtil.getColumnIndexOrThrow(_cursor, "disabled_robot");
      final int _cursorIndexOfShootingDistanceBar = CursorUtil.getColumnIndexOrThrow(_cursor, "shooting_distance_bar");
      final int _cursorIndexOfMatchNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "match_number");
      final int _cursorIndexOfMatchNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "match_notes");
      final int _cursorIndexOfTeamNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "team_number");
      final int _cursorIndexOfScoutName = CursorUtil.getColumnIndexOrThrow(_cursor, "scout_name");
      final int _cursorIndexOfRegionalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "regional_code");
      final Match _result;
      if (_cursor.moveToFirst()) {
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final int _tmpAutoAmpCount;
        _tmpAutoAmpCount = _cursor.getInt(_cursorIndexOfAutoAmpCount);
        final int _tmpAutoSpeakerCount;
        _tmpAutoSpeakerCount = _cursor.getInt(_cursorIndexOfAutoSpeakerCount);
        final int _tmpTeleopAmpCount;
        _tmpTeleopAmpCount = _cursor.getInt(_cursorIndexOfTeleopAmpCount);
        final int _tmpTeleOpSpeakerCount;
        _tmpTeleOpSpeakerCount = _cursor.getInt(_cursorIndexOfTeleOpSpeakerCount);
        final boolean _tmpLeave;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfLeave);
        _tmpLeave = _tmp != 0;
        final boolean _tmpOnStage;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfOnStage);
        _tmpOnStage = _tmp_1 != 0;
        final boolean _tmpOnStageSpotlit;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOnStageSpotlit);
        _tmpOnStageSpotlit = _tmp_2 != 0;
        final int _tmpTrapNote;
        _tmpTrapNote = _cursor.getInt(_cursorIndexOfTrapNote);
        final boolean _tmpPark;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfPark);
        _tmpPark = _tmp_3 != 0;
        final boolean _tmpDefense;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfDefense);
        _tmpDefense = _tmp_4 != 0;
        final boolean _tmpDisabledRobot;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfDisabledRobot);
        _tmpDisabledRobot = _tmp_5 != 0;
        final int _tmpShootingDistanceBar;
        _tmpShootingDistanceBar = _cursor.getInt(_cursorIndexOfShootingDistanceBar);
        final String _tmpMatchNumber;
        _tmpMatchNumber = _cursor.getString(_cursorIndexOfMatchNumber);
        final String _tmpMatchNotes;
        _tmpMatchNotes = _cursor.getString(_cursorIndexOfMatchNotes);
        final String _tmpTeamNumber;
        _tmpTeamNumber = _cursor.getString(_cursorIndexOfTeamNumber);
        final String _tmpScoutName;
        _tmpScoutName = _cursor.getString(_cursorIndexOfScoutName);
        final String _tmpRegionalCode;
        _tmpRegionalCode = _cursor.getString(_cursorIndexOfRegionalCode);
        _result = new Match(_tmpUid,_tmpAutoAmpCount,_tmpAutoSpeakerCount,_tmpTeleopAmpCount,_tmpTeleOpSpeakerCount,_tmpLeave,_tmpOnStage,_tmpOnStageSpotlit,_tmpTrapNote,_tmpPark,_tmpDefense,_tmpDisabledRobot,_tmpShootingDistanceBar,_tmpMatchNumber,_tmpMatchNotes,_tmpTeamNumber,_tmpScoutName,_tmpRegionalCode);
      } else {
        _result = null;
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
