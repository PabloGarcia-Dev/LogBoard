package com.example.logboard;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Game {
    @PrimaryKey(autoGenerate = true)
    private int gameID;
    private String gameName;
    private String gameDescription;
}
