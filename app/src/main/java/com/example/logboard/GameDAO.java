package com.example.logboard;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface GameDAO {
    @Insert
    void insertGame(Game game);
    @Update
    void updateGame(Game game);
    @Delete
    void deleteGame(Game game);
    @Query("SELECT * FROM Game WHERE gameID = :gameID")
    Game getGame(int gameID);
    @Query("SELECT * FROM Game")
    List<Game> getAllGames();
}
