package com.example.logboard;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface PlayerDAO {
    @Insert
    void inserPlayer(Player player);
    @Update
    void updatePlayer(Player player);
    @Delete
    void deletePlayer(Player player);
    @Query("SELECT * FROM Player WHERE playerID = :playerID")
    Player getPlayer(int playerID);
    @Query("SELECT * FROM Player")
    List<Player> getAllPlayers();
}