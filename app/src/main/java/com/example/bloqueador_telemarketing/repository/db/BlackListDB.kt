package com.example.bloqueador_telemarketing.repository.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bloqueador_telemarketing.repository.data.dao.BlackListNumDao

@Database(entities = [NumEntity::class], version = 1)
abstract class BlackListDB: RoomDatabase() {

    abstract fun userDao(): BlackListNumDao

    companion object{
        @Volatile
        private var INSTANCE: BlackListDB? = null

        fun getDataBase(context: Context): BlackListDB {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BlackListDB::class.java,
                    "black-list-db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
