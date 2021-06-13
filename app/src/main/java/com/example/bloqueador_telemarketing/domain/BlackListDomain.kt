package com.example.bloqueador_telemarketing.domain

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "blacklist_table")
data class BlackList (

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var blackListNum: String? = null,

    )

@Dao
interface BlackListDao {

    @Query("Select * from blacklist_table where blackListNum like '%' || :text || '%'")
    suspend fun getTasks(): Flow<List<BlackList>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBlackList(t: BlackList)

    @Delete
    suspend fun deleteBlackList(t: BlackList)

    @Query("DELETE FROM blacklist_table")
    suspend fun deleteAll()

}

@Database(entities = [BlackList::class], version = 1)
abstract class BlackListDatabase: RoomDatabase() {
    abstract fun getTaskDao(): BlackListDao
}