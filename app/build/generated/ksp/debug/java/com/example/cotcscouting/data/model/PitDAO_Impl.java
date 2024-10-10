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
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
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
public final class PitDAO_Impl implements PitDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Pit> __insertionAdapterOfPit;

  private final EntityDeletionOrUpdateAdapter<Pit> __deletionAdapterOfPit;

  public PitDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPit = new EntityInsertionAdapter<Pit>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `pit` (`uid`,`team_number`,`scout_name`,`drive_coach_name`,`drive_base`,`rookie_team`,`how_many_autos`,`has_auto`,`does_preload`,`does_shoot`,`does_intake`,`where_do_you_start`,`where_do_you_score`,`notes_score_count`,`game_strategy`,`intake`,`farthest_shot`,`does_climb`,`climb_time`,`can_harmony`,`can_score_trap`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Pit entity) {
        statement.bindLong(1, entity.getUid());
        if (entity.getTeamNumber() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTeamNumber());
        }
        statement.bindString(3, entity.getScoutName());
        statement.bindString(4, entity.getDriveCoachName());
        statement.bindString(5, entity.getDriveBase());
        final Integer _tmp = entity.getRookieTeam() == null ? null : (entity.getRookieTeam() ? 1 : 0);
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, _tmp);
        }
        if (entity.getHowManyAutos() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getHowManyAutos());
        }
        final Integer _tmp_1 = entity.getHasAuto() == null ? null : (entity.getHasAuto() ? 1 : 0);
        if (_tmp_1 == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, _tmp_1);
        }
        final Integer _tmp_2 = entity.getDoesPreload() == null ? null : (entity.getDoesPreload() ? 1 : 0);
        if (_tmp_2 == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, _tmp_2);
        }
        final Integer _tmp_3 = entity.getDoesShoot() == null ? null : (entity.getDoesShoot() ? 1 : 0);
        if (_tmp_3 == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, _tmp_3);
        }
        final Integer _tmp_4 = entity.getDoesIntake() == null ? null : (entity.getDoesIntake() ? 1 : 0);
        if (_tmp_4 == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, _tmp_4);
        }
        statement.bindString(12, entity.getWhereDoYouStart());
        statement.bindString(13, entity.getWhereDoYouScore());
        if (entity.getNotesScoreCount() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getNotesScoreCount());
        }
        if (entity.getGameStrategy() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getGameStrategy());
        }
        if (entity.getIntake() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getIntake());
        }
        if (entity.getFarthestShot() == null) {
          statement.bindNull(17);
        } else {
          statement.bindString(17, entity.getFarthestShot());
        }
        final Integer _tmp_5 = entity.getDoesClimb() == null ? null : (entity.getDoesClimb() ? 1 : 0);
        if (_tmp_5 == null) {
          statement.bindNull(18);
        } else {
          statement.bindLong(18, _tmp_5);
        }
        if (entity.getClimbTime() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getClimbTime());
        }
        final Integer _tmp_6 = entity.getCanHarmony() == null ? null : (entity.getCanHarmony() ? 1 : 0);
        if (_tmp_6 == null) {
          statement.bindNull(20);
        } else {
          statement.bindLong(20, _tmp_6);
        }
        final Integer _tmp_7 = entity.getCanScoreTrap() == null ? null : (entity.getCanScoreTrap() ? 1 : 0);
        if (_tmp_7 == null) {
          statement.bindNull(21);
        } else {
          statement.bindLong(21, _tmp_7);
        }
      }
    };
    this.__deletionAdapterOfPit = new EntityDeletionOrUpdateAdapter<Pit>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `pit` WHERE `uid` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Pit entity) {
        statement.bindLong(1, entity.getUid());
      }
    };
  }

  @Override
  public void insertAll(final Pit... pits) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPit.insert(pits);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Pit pit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPit.insert(pit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Pit pit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPit.handle(pit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Pit> getAll() {
    final String _sql = "SELECT * FROM `pit`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfTeamNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "team_number");
      final int _cursorIndexOfScoutName = CursorUtil.getColumnIndexOrThrow(_cursor, "scout_name");
      final int _cursorIndexOfDriveCoachName = CursorUtil.getColumnIndexOrThrow(_cursor, "drive_coach_name");
      final int _cursorIndexOfDriveBase = CursorUtil.getColumnIndexOrThrow(_cursor, "drive_base");
      final int _cursorIndexOfRookieTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "rookie_team");
      final int _cursorIndexOfHowManyAutos = CursorUtil.getColumnIndexOrThrow(_cursor, "how_many_autos");
      final int _cursorIndexOfHasAuto = CursorUtil.getColumnIndexOrThrow(_cursor, "has_auto");
      final int _cursorIndexOfDoesPreload = CursorUtil.getColumnIndexOrThrow(_cursor, "does_preload");
      final int _cursorIndexOfDoesShoot = CursorUtil.getColumnIndexOrThrow(_cursor, "does_shoot");
      final int _cursorIndexOfDoesIntake = CursorUtil.getColumnIndexOrThrow(_cursor, "does_intake");
      final int _cursorIndexOfWhereDoYouStart = CursorUtil.getColumnIndexOrThrow(_cursor, "where_do_you_start");
      final int _cursorIndexOfWhereDoYouScore = CursorUtil.getColumnIndexOrThrow(_cursor, "where_do_you_score");
      final int _cursorIndexOfNotesScoreCount = CursorUtil.getColumnIndexOrThrow(_cursor, "notes_score_count");
      final int _cursorIndexOfGameStrategy = CursorUtil.getColumnIndexOrThrow(_cursor, "game_strategy");
      final int _cursorIndexOfIntake = CursorUtil.getColumnIndexOrThrow(_cursor, "intake");
      final int _cursorIndexOfFarthestShot = CursorUtil.getColumnIndexOrThrow(_cursor, "farthest_shot");
      final int _cursorIndexOfDoesClimb = CursorUtil.getColumnIndexOrThrow(_cursor, "does_climb");
      final int _cursorIndexOfClimbTime = CursorUtil.getColumnIndexOrThrow(_cursor, "climb_time");
      final int _cursorIndexOfCanHarmony = CursorUtil.getColumnIndexOrThrow(_cursor, "can_harmony");
      final int _cursorIndexOfCanScoreTrap = CursorUtil.getColumnIndexOrThrow(_cursor, "can_score_trap");
      final List<Pit> _result = new ArrayList<Pit>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Pit _item;
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final String _tmpTeamNumber;
        if (_cursor.isNull(_cursorIndexOfTeamNumber)) {
          _tmpTeamNumber = null;
        } else {
          _tmpTeamNumber = _cursor.getString(_cursorIndexOfTeamNumber);
        }
        final String _tmpScoutName;
        _tmpScoutName = _cursor.getString(_cursorIndexOfScoutName);
        final String _tmpDriveCoachName;
        _tmpDriveCoachName = _cursor.getString(_cursorIndexOfDriveCoachName);
        final String _tmpDriveBase;
        _tmpDriveBase = _cursor.getString(_cursorIndexOfDriveBase);
        final Boolean _tmpRookieTeam;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfRookieTeam)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfRookieTeam);
        }
        _tmpRookieTeam = _tmp == null ? null : _tmp != 0;
        final String _tmpHowManyAutos;
        if (_cursor.isNull(_cursorIndexOfHowManyAutos)) {
          _tmpHowManyAutos = null;
        } else {
          _tmpHowManyAutos = _cursor.getString(_cursorIndexOfHowManyAutos);
        }
        final Boolean _tmpHasAuto;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfHasAuto)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfHasAuto);
        }
        _tmpHasAuto = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpDoesPreload;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfDoesPreload)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfDoesPreload);
        }
        _tmpDoesPreload = _tmp_2 == null ? null : _tmp_2 != 0;
        final Boolean _tmpDoesShoot;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfDoesShoot)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfDoesShoot);
        }
        _tmpDoesShoot = _tmp_3 == null ? null : _tmp_3 != 0;
        final Boolean _tmpDoesIntake;
        final Integer _tmp_4;
        if (_cursor.isNull(_cursorIndexOfDoesIntake)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getInt(_cursorIndexOfDoesIntake);
        }
        _tmpDoesIntake = _tmp_4 == null ? null : _tmp_4 != 0;
        final String _tmpWhereDoYouStart;
        _tmpWhereDoYouStart = _cursor.getString(_cursorIndexOfWhereDoYouStart);
        final String _tmpWhereDoYouScore;
        _tmpWhereDoYouScore = _cursor.getString(_cursorIndexOfWhereDoYouScore);
        final String _tmpNotesScoreCount;
        if (_cursor.isNull(_cursorIndexOfNotesScoreCount)) {
          _tmpNotesScoreCount = null;
        } else {
          _tmpNotesScoreCount = _cursor.getString(_cursorIndexOfNotesScoreCount);
        }
        final String _tmpGameStrategy;
        if (_cursor.isNull(_cursorIndexOfGameStrategy)) {
          _tmpGameStrategy = null;
        } else {
          _tmpGameStrategy = _cursor.getString(_cursorIndexOfGameStrategy);
        }
        final String _tmpIntake;
        if (_cursor.isNull(_cursorIndexOfIntake)) {
          _tmpIntake = null;
        } else {
          _tmpIntake = _cursor.getString(_cursorIndexOfIntake);
        }
        final String _tmpFarthestShot;
        if (_cursor.isNull(_cursorIndexOfFarthestShot)) {
          _tmpFarthestShot = null;
        } else {
          _tmpFarthestShot = _cursor.getString(_cursorIndexOfFarthestShot);
        }
        final Boolean _tmpDoesClimb;
        final Integer _tmp_5;
        if (_cursor.isNull(_cursorIndexOfDoesClimb)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getInt(_cursorIndexOfDoesClimb);
        }
        _tmpDoesClimb = _tmp_5 == null ? null : _tmp_5 != 0;
        final String _tmpClimbTime;
        if (_cursor.isNull(_cursorIndexOfClimbTime)) {
          _tmpClimbTime = null;
        } else {
          _tmpClimbTime = _cursor.getString(_cursorIndexOfClimbTime);
        }
        final Boolean _tmpCanHarmony;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfCanHarmony)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfCanHarmony);
        }
        _tmpCanHarmony = _tmp_6 == null ? null : _tmp_6 != 0;
        final Boolean _tmpCanScoreTrap;
        final Integer _tmp_7;
        if (_cursor.isNull(_cursorIndexOfCanScoreTrap)) {
          _tmp_7 = null;
        } else {
          _tmp_7 = _cursor.getInt(_cursorIndexOfCanScoreTrap);
        }
        _tmpCanScoreTrap = _tmp_7 == null ? null : _tmp_7 != 0;
        _item = new Pit(_tmpUid,_tmpTeamNumber,_tmpScoutName,_tmpDriveCoachName,_tmpDriveBase,_tmpRookieTeam,_tmpHowManyAutos,_tmpHasAuto,_tmpDoesPreload,_tmpDoesShoot,_tmpDoesIntake,_tmpWhereDoYouStart,_tmpWhereDoYouScore,_tmpNotesScoreCount,_tmpGameStrategy,_tmpIntake,_tmpFarthestShot,_tmpDoesClimb,_tmpClimbTime,_tmpCanHarmony,_tmpCanScoreTrap);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Pit> loadAllByIds(final int[] pitIds) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM 'pit' WHERE uid IN (");
    final int _inputSize = pitIds.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int _item : pitIds) {
      _statement.bindLong(_argIndex, _item);
      _argIndex++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfTeamNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "team_number");
      final int _cursorIndexOfScoutName = CursorUtil.getColumnIndexOrThrow(_cursor, "scout_name");
      final int _cursorIndexOfDriveCoachName = CursorUtil.getColumnIndexOrThrow(_cursor, "drive_coach_name");
      final int _cursorIndexOfDriveBase = CursorUtil.getColumnIndexOrThrow(_cursor, "drive_base");
      final int _cursorIndexOfRookieTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "rookie_team");
      final int _cursorIndexOfHowManyAutos = CursorUtil.getColumnIndexOrThrow(_cursor, "how_many_autos");
      final int _cursorIndexOfHasAuto = CursorUtil.getColumnIndexOrThrow(_cursor, "has_auto");
      final int _cursorIndexOfDoesPreload = CursorUtil.getColumnIndexOrThrow(_cursor, "does_preload");
      final int _cursorIndexOfDoesShoot = CursorUtil.getColumnIndexOrThrow(_cursor, "does_shoot");
      final int _cursorIndexOfDoesIntake = CursorUtil.getColumnIndexOrThrow(_cursor, "does_intake");
      final int _cursorIndexOfWhereDoYouStart = CursorUtil.getColumnIndexOrThrow(_cursor, "where_do_you_start");
      final int _cursorIndexOfWhereDoYouScore = CursorUtil.getColumnIndexOrThrow(_cursor, "where_do_you_score");
      final int _cursorIndexOfNotesScoreCount = CursorUtil.getColumnIndexOrThrow(_cursor, "notes_score_count");
      final int _cursorIndexOfGameStrategy = CursorUtil.getColumnIndexOrThrow(_cursor, "game_strategy");
      final int _cursorIndexOfIntake = CursorUtil.getColumnIndexOrThrow(_cursor, "intake");
      final int _cursorIndexOfFarthestShot = CursorUtil.getColumnIndexOrThrow(_cursor, "farthest_shot");
      final int _cursorIndexOfDoesClimb = CursorUtil.getColumnIndexOrThrow(_cursor, "does_climb");
      final int _cursorIndexOfClimbTime = CursorUtil.getColumnIndexOrThrow(_cursor, "climb_time");
      final int _cursorIndexOfCanHarmony = CursorUtil.getColumnIndexOrThrow(_cursor, "can_harmony");
      final int _cursorIndexOfCanScoreTrap = CursorUtil.getColumnIndexOrThrow(_cursor, "can_score_trap");
      final List<Pit> _result = new ArrayList<Pit>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Pit _item_1;
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final String _tmpTeamNumber;
        if (_cursor.isNull(_cursorIndexOfTeamNumber)) {
          _tmpTeamNumber = null;
        } else {
          _tmpTeamNumber = _cursor.getString(_cursorIndexOfTeamNumber);
        }
        final String _tmpScoutName;
        _tmpScoutName = _cursor.getString(_cursorIndexOfScoutName);
        final String _tmpDriveCoachName;
        _tmpDriveCoachName = _cursor.getString(_cursorIndexOfDriveCoachName);
        final String _tmpDriveBase;
        _tmpDriveBase = _cursor.getString(_cursorIndexOfDriveBase);
        final Boolean _tmpRookieTeam;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfRookieTeam)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfRookieTeam);
        }
        _tmpRookieTeam = _tmp == null ? null : _tmp != 0;
        final String _tmpHowManyAutos;
        if (_cursor.isNull(_cursorIndexOfHowManyAutos)) {
          _tmpHowManyAutos = null;
        } else {
          _tmpHowManyAutos = _cursor.getString(_cursorIndexOfHowManyAutos);
        }
        final Boolean _tmpHasAuto;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfHasAuto)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfHasAuto);
        }
        _tmpHasAuto = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpDoesPreload;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfDoesPreload)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfDoesPreload);
        }
        _tmpDoesPreload = _tmp_2 == null ? null : _tmp_2 != 0;
        final Boolean _tmpDoesShoot;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfDoesShoot)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfDoesShoot);
        }
        _tmpDoesShoot = _tmp_3 == null ? null : _tmp_3 != 0;
        final Boolean _tmpDoesIntake;
        final Integer _tmp_4;
        if (_cursor.isNull(_cursorIndexOfDoesIntake)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getInt(_cursorIndexOfDoesIntake);
        }
        _tmpDoesIntake = _tmp_4 == null ? null : _tmp_4 != 0;
        final String _tmpWhereDoYouStart;
        _tmpWhereDoYouStart = _cursor.getString(_cursorIndexOfWhereDoYouStart);
        final String _tmpWhereDoYouScore;
        _tmpWhereDoYouScore = _cursor.getString(_cursorIndexOfWhereDoYouScore);
        final String _tmpNotesScoreCount;
        if (_cursor.isNull(_cursorIndexOfNotesScoreCount)) {
          _tmpNotesScoreCount = null;
        } else {
          _tmpNotesScoreCount = _cursor.getString(_cursorIndexOfNotesScoreCount);
        }
        final String _tmpGameStrategy;
        if (_cursor.isNull(_cursorIndexOfGameStrategy)) {
          _tmpGameStrategy = null;
        } else {
          _tmpGameStrategy = _cursor.getString(_cursorIndexOfGameStrategy);
        }
        final String _tmpIntake;
        if (_cursor.isNull(_cursorIndexOfIntake)) {
          _tmpIntake = null;
        } else {
          _tmpIntake = _cursor.getString(_cursorIndexOfIntake);
        }
        final String _tmpFarthestShot;
        if (_cursor.isNull(_cursorIndexOfFarthestShot)) {
          _tmpFarthestShot = null;
        } else {
          _tmpFarthestShot = _cursor.getString(_cursorIndexOfFarthestShot);
        }
        final Boolean _tmpDoesClimb;
        final Integer _tmp_5;
        if (_cursor.isNull(_cursorIndexOfDoesClimb)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getInt(_cursorIndexOfDoesClimb);
        }
        _tmpDoesClimb = _tmp_5 == null ? null : _tmp_5 != 0;
        final String _tmpClimbTime;
        if (_cursor.isNull(_cursorIndexOfClimbTime)) {
          _tmpClimbTime = null;
        } else {
          _tmpClimbTime = _cursor.getString(_cursorIndexOfClimbTime);
        }
        final Boolean _tmpCanHarmony;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfCanHarmony)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfCanHarmony);
        }
        _tmpCanHarmony = _tmp_6 == null ? null : _tmp_6 != 0;
        final Boolean _tmpCanScoreTrap;
        final Integer _tmp_7;
        if (_cursor.isNull(_cursorIndexOfCanScoreTrap)) {
          _tmp_7 = null;
        } else {
          _tmp_7 = _cursor.getInt(_cursorIndexOfCanScoreTrap);
        }
        _tmpCanScoreTrap = _tmp_7 == null ? null : _tmp_7 != 0;
        _item_1 = new Pit(_tmpUid,_tmpTeamNumber,_tmpScoutName,_tmpDriveCoachName,_tmpDriveBase,_tmpRookieTeam,_tmpHowManyAutos,_tmpHasAuto,_tmpDoesPreload,_tmpDoesShoot,_tmpDoesIntake,_tmpWhereDoYouStart,_tmpWhereDoYouScore,_tmpNotesScoreCount,_tmpGameStrategy,_tmpIntake,_tmpFarthestShot,_tmpDoesClimb,_tmpClimbTime,_tmpCanHarmony,_tmpCanScoreTrap);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Pit findByTeamNumber(final int teamNumber) {
    final String _sql = "SELECT * FROM `pit` WHERE team_number LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, teamNumber);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfTeamNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "team_number");
      final int _cursorIndexOfScoutName = CursorUtil.getColumnIndexOrThrow(_cursor, "scout_name");
      final int _cursorIndexOfDriveCoachName = CursorUtil.getColumnIndexOrThrow(_cursor, "drive_coach_name");
      final int _cursorIndexOfDriveBase = CursorUtil.getColumnIndexOrThrow(_cursor, "drive_base");
      final int _cursorIndexOfRookieTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "rookie_team");
      final int _cursorIndexOfHowManyAutos = CursorUtil.getColumnIndexOrThrow(_cursor, "how_many_autos");
      final int _cursorIndexOfHasAuto = CursorUtil.getColumnIndexOrThrow(_cursor, "has_auto");
      final int _cursorIndexOfDoesPreload = CursorUtil.getColumnIndexOrThrow(_cursor, "does_preload");
      final int _cursorIndexOfDoesShoot = CursorUtil.getColumnIndexOrThrow(_cursor, "does_shoot");
      final int _cursorIndexOfDoesIntake = CursorUtil.getColumnIndexOrThrow(_cursor, "does_intake");
      final int _cursorIndexOfWhereDoYouStart = CursorUtil.getColumnIndexOrThrow(_cursor, "where_do_you_start");
      final int _cursorIndexOfWhereDoYouScore = CursorUtil.getColumnIndexOrThrow(_cursor, "where_do_you_score");
      final int _cursorIndexOfNotesScoreCount = CursorUtil.getColumnIndexOrThrow(_cursor, "notes_score_count");
      final int _cursorIndexOfGameStrategy = CursorUtil.getColumnIndexOrThrow(_cursor, "game_strategy");
      final int _cursorIndexOfIntake = CursorUtil.getColumnIndexOrThrow(_cursor, "intake");
      final int _cursorIndexOfFarthestShot = CursorUtil.getColumnIndexOrThrow(_cursor, "farthest_shot");
      final int _cursorIndexOfDoesClimb = CursorUtil.getColumnIndexOrThrow(_cursor, "does_climb");
      final int _cursorIndexOfClimbTime = CursorUtil.getColumnIndexOrThrow(_cursor, "climb_time");
      final int _cursorIndexOfCanHarmony = CursorUtil.getColumnIndexOrThrow(_cursor, "can_harmony");
      final int _cursorIndexOfCanScoreTrap = CursorUtil.getColumnIndexOrThrow(_cursor, "can_score_trap");
      final Pit _result;
      if (_cursor.moveToFirst()) {
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final String _tmpTeamNumber;
        if (_cursor.isNull(_cursorIndexOfTeamNumber)) {
          _tmpTeamNumber = null;
        } else {
          _tmpTeamNumber = _cursor.getString(_cursorIndexOfTeamNumber);
        }
        final String _tmpScoutName;
        _tmpScoutName = _cursor.getString(_cursorIndexOfScoutName);
        final String _tmpDriveCoachName;
        _tmpDriveCoachName = _cursor.getString(_cursorIndexOfDriveCoachName);
        final String _tmpDriveBase;
        _tmpDriveBase = _cursor.getString(_cursorIndexOfDriveBase);
        final Boolean _tmpRookieTeam;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfRookieTeam)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfRookieTeam);
        }
        _tmpRookieTeam = _tmp == null ? null : _tmp != 0;
        final String _tmpHowManyAutos;
        if (_cursor.isNull(_cursorIndexOfHowManyAutos)) {
          _tmpHowManyAutos = null;
        } else {
          _tmpHowManyAutos = _cursor.getString(_cursorIndexOfHowManyAutos);
        }
        final Boolean _tmpHasAuto;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfHasAuto)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfHasAuto);
        }
        _tmpHasAuto = _tmp_1 == null ? null : _tmp_1 != 0;
        final Boolean _tmpDoesPreload;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfDoesPreload)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfDoesPreload);
        }
        _tmpDoesPreload = _tmp_2 == null ? null : _tmp_2 != 0;
        final Boolean _tmpDoesShoot;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfDoesShoot)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfDoesShoot);
        }
        _tmpDoesShoot = _tmp_3 == null ? null : _tmp_3 != 0;
        final Boolean _tmpDoesIntake;
        final Integer _tmp_4;
        if (_cursor.isNull(_cursorIndexOfDoesIntake)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getInt(_cursorIndexOfDoesIntake);
        }
        _tmpDoesIntake = _tmp_4 == null ? null : _tmp_4 != 0;
        final String _tmpWhereDoYouStart;
        _tmpWhereDoYouStart = _cursor.getString(_cursorIndexOfWhereDoYouStart);
        final String _tmpWhereDoYouScore;
        _tmpWhereDoYouScore = _cursor.getString(_cursorIndexOfWhereDoYouScore);
        final String _tmpNotesScoreCount;
        if (_cursor.isNull(_cursorIndexOfNotesScoreCount)) {
          _tmpNotesScoreCount = null;
        } else {
          _tmpNotesScoreCount = _cursor.getString(_cursorIndexOfNotesScoreCount);
        }
        final String _tmpGameStrategy;
        if (_cursor.isNull(_cursorIndexOfGameStrategy)) {
          _tmpGameStrategy = null;
        } else {
          _tmpGameStrategy = _cursor.getString(_cursorIndexOfGameStrategy);
        }
        final String _tmpIntake;
        if (_cursor.isNull(_cursorIndexOfIntake)) {
          _tmpIntake = null;
        } else {
          _tmpIntake = _cursor.getString(_cursorIndexOfIntake);
        }
        final String _tmpFarthestShot;
        if (_cursor.isNull(_cursorIndexOfFarthestShot)) {
          _tmpFarthestShot = null;
        } else {
          _tmpFarthestShot = _cursor.getString(_cursorIndexOfFarthestShot);
        }
        final Boolean _tmpDoesClimb;
        final Integer _tmp_5;
        if (_cursor.isNull(_cursorIndexOfDoesClimb)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getInt(_cursorIndexOfDoesClimb);
        }
        _tmpDoesClimb = _tmp_5 == null ? null : _tmp_5 != 0;
        final String _tmpClimbTime;
        if (_cursor.isNull(_cursorIndexOfClimbTime)) {
          _tmpClimbTime = null;
        } else {
          _tmpClimbTime = _cursor.getString(_cursorIndexOfClimbTime);
        }
        final Boolean _tmpCanHarmony;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfCanHarmony)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfCanHarmony);
        }
        _tmpCanHarmony = _tmp_6 == null ? null : _tmp_6 != 0;
        final Boolean _tmpCanScoreTrap;
        final Integer _tmp_7;
        if (_cursor.isNull(_cursorIndexOfCanScoreTrap)) {
          _tmp_7 = null;
        } else {
          _tmp_7 = _cursor.getInt(_cursorIndexOfCanScoreTrap);
        }
        _tmpCanScoreTrap = _tmp_7 == null ? null : _tmp_7 != 0;
        _result = new Pit(_tmpUid,_tmpTeamNumber,_tmpScoutName,_tmpDriveCoachName,_tmpDriveBase,_tmpRookieTeam,_tmpHowManyAutos,_tmpHasAuto,_tmpDoesPreload,_tmpDoesShoot,_tmpDoesIntake,_tmpWhereDoYouStart,_tmpWhereDoYouScore,_tmpNotesScoreCount,_tmpGameStrategy,_tmpIntake,_tmpFarthestShot,_tmpDoesClimb,_tmpClimbTime,_tmpCanHarmony,_tmpCanScoreTrap);
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
