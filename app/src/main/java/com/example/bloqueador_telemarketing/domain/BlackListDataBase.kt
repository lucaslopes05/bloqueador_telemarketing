package com.example.bloqueador_telemarketing.domain

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bloqueador_telemarketing.repository.BlackListNum
import com.example.bloqueador_telemarketing.repository.BlackListDao

@Database(entities = [BlackListNum::class], version = 1, exportSchema = false)
abstract class BlackListDataBase : RoomDatabase() {

    abstract fun blackListDao(): BlackListDao

    companion object {
        @Volatile
        private var INSTANCE : BlackListDataBase? = null

        fun getDatabase(context: Context): BlackListDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BlackListDataBase::class.java,
                    "blacklist_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}