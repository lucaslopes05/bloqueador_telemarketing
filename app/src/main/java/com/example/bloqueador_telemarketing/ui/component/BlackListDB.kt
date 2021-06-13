package com.example.bloqueador_telemarketing.ui.component

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.bloqueador_telemarketing.domain.BlackList
import com.example.bloqueador_telemarketing.domain.BlackListDao
import kotlinx.coroutines.CoroutineScope

@Database(entities = arrayOf(BlackList::class), version = 1, exportSchema = false)

abstract class BlackListDB : RoomDatabase() {

    abstract fun blackListDao() : BlackListDao

    private class BlackListDatabaseCallback(
        private val scope: CoroutineScope
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.lauch {
                    populateDatabase(database.blackListDao())
                }
            }
        }

        suspend fun populateDatabase(blackListDao: BlackListDao) {
            // Delete all content here.
            blackListDao.deleteAll()

            // Add sample words.
            var item = BlackList(blackListNum = "061")
            blackListDao.insertBlackList(item)
            item = BlackList(blackListNum = "062")
            blackListDao.insertBlackList(item)

            // TODO: Add your own words!
        }
    }

    companion object {
        @Volatile
        private var INSTANCE : BlackListDB? = null

        fun getDataBase (context: Context, scope: CoroutineScope): BlackListDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BlackListDB::class.java,
                    "blacklist_database"
                )
                    .addCallback(BlackListDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }

}