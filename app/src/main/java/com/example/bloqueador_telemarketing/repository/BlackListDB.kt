package com.example.bloqueador_telemarketing.repository

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [BlackListNum::class], version = 1)
abstract class BlackListDB: RoomDatabase() {
    abstract fun getTBlackListNumDao(): BlackListNumDao
}
