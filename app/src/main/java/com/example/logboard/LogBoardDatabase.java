package com.example.logboard;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Player.class, Game.class}, version = 1)
public abstract class LogBoardDatabase extends RoomDatabase {

    public abstract PlayerDAO playerDAO();

    public abstract GameDAO gameDAO();
}
