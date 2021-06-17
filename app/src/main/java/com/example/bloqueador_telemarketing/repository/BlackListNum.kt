package com.example.bloqueador_telemarketing.repository

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["number"], unique = true)])
data class BlackListNum (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var number: String? = null,
)
