package com.example.cotcscouting.data.model;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile MatchDAO _matchDAO;

  private volatile AllianceDAO _allianceDAO;

  private volatile PitDAO _pitDAO;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `match` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `auto_amp_count` INTEGER NOT NULL, `auto_speaker_count` INTEGER NOT NULL, `teleop_amp_count` INTEGER NOT NULL, `tele_op_speaker_count` INTEGER NOT NULL, `leave` INTEGER NOT NULL, `on_stage` INTEGER NOT NULL, `on_stage_spotlit` INTEGER NOT NULL, `trap_note` INTEGER NOT NULL, `park` INTEGER NOT NULL, `defense` INTEGER NOT NULL, `disabled_robot` INTEGER NOT NULL, `shooting_distance_bar` INTEGER NOT NULL, `match_number` TEXT NOT NULL, `match_notes` TEXT NOT NULL, `team_number` TEXT NOT NULL, `scout_name` TEXT NOT NULL, `regional_code` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `alliance` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `blue_notes` TEXT NOT NULL, `blue_amp_count` INTEGER NOT NULL, `blue_co_op` INTEGER NOT NULL, `blue_melody` INTEGER NOT NULL, `blue_ensamble` INTEGER NOT NULL, `blue_harmony` INTEGER NOT NULL, `red_notes` TEXT NOT NULL, `red_amp_count` INTEGER NOT NULL, `red_co_op` INTEGER NOT NULL, `red_melody` INTEGER NOT NULL, `red_ensamble` INTEGER NOT NULL, `red_harmony` INTEGER NOT NULL, `match_number` INTEGER NOT NULL, `scout_name` TEXT NOT NULL, `regional_code` TEXT NOT NULL, `michael_red_1` TEXT NOT NULL, `michael_red_2` TEXT NOT NULL, `michael_red_3` TEXT NOT NULL, `michael_blue_1` TEXT NOT NULL, `michael_blue_2` TEXT NOT NULL, `michael_blue_3` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `pit` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `team_number` TEXT, `scout_name` TEXT NOT NULL, `drive_coach_name` TEXT NOT NULL, `drive_base` TEXT NOT NULL, `rookie_team` INTEGER, `how_many_autos` TEXT, `has_auto` INTEGER, `does_preload` INTEGER, `does_shoot` INTEGER, `does_intake` INTEGER, `where_do_you_start` TEXT NOT NULL, `where_do_you_score` TEXT NOT NULL, `notes_score_count` TEXT, `game_strategy` TEXT, `intake` TEXT, `farthest_shot` TEXT, `does_climb` INTEGER, `climb_time` TEXT, `can_harmony` INTEGER, `can_score_trap` INTEGER)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '29de8de350825294ff1b6b25f3092c99')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `match`");
        db.execSQL("DROP TABLE IF EXISTS `alliance`");
        db.execSQL("DROP TABLE IF EXISTS `pit`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsMatch = new HashMap<String, TableInfo.Column>(18);
        _columnsMatch.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("auto_amp_count", new TableInfo.Column("auto_amp_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("auto_speaker_count", new TableInfo.Column("auto_speaker_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("teleop_amp_count", new TableInfo.Column("teleop_amp_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("tele_op_speaker_count", new TableInfo.Column("tele_op_speaker_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("leave", new TableInfo.Column("leave", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("on_stage", new TableInfo.Column("on_stage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("on_stage_spotlit", new TableInfo.Column("on_stage_spotlit", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("trap_note", new TableInfo.Column("trap_note", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("park", new TableInfo.Column("park", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("defense", new TableInfo.Column("defense", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("disabled_robot", new TableInfo.Column("disabled_robot", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("shooting_distance_bar", new TableInfo.Column("shooting_distance_bar", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("match_number", new TableInfo.Column("match_number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("match_notes", new TableInfo.Column("match_notes", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("team_number", new TableInfo.Column("team_number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("scout_name", new TableInfo.Column("scout_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatch.put("regional_code", new TableInfo.Column("regional_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMatch = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMatch = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMatch = new TableInfo("match", _columnsMatch, _foreignKeysMatch, _indicesMatch);
        final TableInfo _existingMatch = TableInfo.read(db, "match");
        if (!_infoMatch.equals(_existingMatch)) {
          return new RoomOpenHelper.ValidationResult(false, "match(com.example.cotcscouting.data.model.Match).\n"
                  + " Expected:\n" + _infoMatch + "\n"
                  + " Found:\n" + _existingMatch);
        }
        final HashMap<String, TableInfo.Column> _columnsAlliance = new HashMap<String, TableInfo.Column>(22);
        _columnsAlliance.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("blue_notes", new TableInfo.Column("blue_notes", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("blue_amp_count", new TableInfo.Column("blue_amp_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("blue_co_op", new TableInfo.Column("blue_co_op", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("blue_melody", new TableInfo.Column("blue_melody", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("blue_ensamble", new TableInfo.Column("blue_ensamble", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("blue_harmony", new TableInfo.Column("blue_harmony", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("red_notes", new TableInfo.Column("red_notes", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("red_amp_count", new TableInfo.Column("red_amp_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("red_co_op", new TableInfo.Column("red_co_op", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("red_melody", new TableInfo.Column("red_melody", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("red_ensamble", new TableInfo.Column("red_ensamble", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("red_harmony", new TableInfo.Column("red_harmony", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("match_number", new TableInfo.Column("match_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("scout_name", new TableInfo.Column("scout_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("regional_code", new TableInfo.Column("regional_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("michael_red_1", new TableInfo.Column("michael_red_1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("michael_red_2", new TableInfo.Column("michael_red_2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("michael_red_3", new TableInfo.Column("michael_red_3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("michael_blue_1", new TableInfo.Column("michael_blue_1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("michael_blue_2", new TableInfo.Column("michael_blue_2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlliance.put("michael_blue_3", new TableInfo.Column("michael_blue_3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAlliance = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAlliance = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAlliance = new TableInfo("alliance", _columnsAlliance, _foreignKeysAlliance, _indicesAlliance);
        final TableInfo _existingAlliance = TableInfo.read(db, "alliance");
        if (!_infoAlliance.equals(_existingAlliance)) {
          return new RoomOpenHelper.ValidationResult(false, "alliance(com.example.cotcscouting.data.model.Alliance).\n"
                  + " Expected:\n" + _infoAlliance + "\n"
                  + " Found:\n" + _existingAlliance);
        }
        final HashMap<String, TableInfo.Column> _columnsPit = new HashMap<String, TableInfo.Column>(21);
        _columnsPit.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("team_number", new TableInfo.Column("team_number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("scout_name", new TableInfo.Column("scout_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("drive_coach_name", new TableInfo.Column("drive_coach_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("drive_base", new TableInfo.Column("drive_base", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("rookie_team", new TableInfo.Column("rookie_team", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("how_many_autos", new TableInfo.Column("how_many_autos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("has_auto", new TableInfo.Column("has_auto", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("does_preload", new TableInfo.Column("does_preload", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("does_shoot", new TableInfo.Column("does_shoot", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("does_intake", new TableInfo.Column("does_intake", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("where_do_you_start", new TableInfo.Column("where_do_you_start", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("where_do_you_score", new TableInfo.Column("where_do_you_score", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("notes_score_count", new TableInfo.Column("notes_score_count", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("game_strategy", new TableInfo.Column("game_strategy", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("intake", new TableInfo.Column("intake", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("farthest_shot", new TableInfo.Column("farthest_shot", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("does_climb", new TableInfo.Column("does_climb", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("climb_time", new TableInfo.Column("climb_time", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("can_harmony", new TableInfo.Column("can_harmony", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPit.put("can_score_trap", new TableInfo.Column("can_score_trap", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPit = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPit = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPit = new TableInfo("pit", _columnsPit, _foreignKeysPit, _indicesPit);
        final TableInfo _existingPit = TableInfo.read(db, "pit");
        if (!_infoPit.equals(_existingPit)) {
          return new RoomOpenHelper.ValidationResult(false, "pit(com.example.cotcscouting.data.model.Pit).\n"
                  + " Expected:\n" + _infoPit + "\n"
                  + " Found:\n" + _existingPit);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "29de8de350825294ff1b6b25f3092c99", "1f1998d19f0a90a94209bcf6c37129e1");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "match","alliance","pit");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `match`");
      _db.execSQL("DELETE FROM `alliance`");
      _db.execSQL("DELETE FROM `pit`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MatchDAO.class, MatchDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(AllianceDAO.class, AllianceDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(PitDAO.class, PitDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public MatchDAO matchDAO() {
    if (_matchDAO != null) {
      return _matchDAO;
    } else {
      synchronized(this) {
        if(_matchDAO == null) {
          _matchDAO = new MatchDAO_Impl(this);
        }
        return _matchDAO;
      }
    }
  }

  @Override
  public AllianceDAO allianceDAO() {
    if (_allianceDAO != null) {
      return _allianceDAO;
    } else {
      synchronized(this) {
        if(_allianceDAO == null) {
          _allianceDAO = new AllianceDAO_Impl(this);
        }
        return _allianceDAO;
      }
    }
  }

  @Override
  public PitDAO pitDAO() {
    if (_pitDAO != null) {
      return _pitDAO;
    } else {
      synchronized(this) {
        if(_pitDAO == null) {
          _pitDAO = new PitDAO_Impl(this);
        }
        return _pitDAO;
      }
    }
  }
}
