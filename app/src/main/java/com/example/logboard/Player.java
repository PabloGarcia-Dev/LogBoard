package com.example.logboard;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Player {
    @PrimaryKey(autoGenerate = true)
    private int playerID;
    private String name;
    private int playerColor;
    private int totalWins;
}
