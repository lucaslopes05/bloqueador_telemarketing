package com.example.bloqueador_telemarketing.repository

//import androidx.room.*
//import dagger.hilt.android.AndroidEntryPoint
//import dagger.hilt.android.WithFragmentBindings
//
//@AndroidEntryPoint
//@WithFragmentBindings
//@Entity(indices = [Index(value = ["blackListNum"], unique = true)])
//data class BlackList (
//
//    @PrimaryKey(autoGenerate = true)
//    var id: Int = 0,
//    var blackListNum: String? = null,
//
//    )
//
//@Dao
//interface BlackListDao {
//    @Query("Select * from blacklist where blackListNum like '%' || :text || '%'")
//    suspend fun getTasks(text: String): List<BlackList>
//
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun insertBlackList(t: BlackList)
//
//    @Update
//    suspend fun updateTask(t: BlackList)
//
//    @Delete
//    suspend fun deleteTask(t: BlackList)
//}
//
//@Database(entities = [BlackList::class], version = 1)
//abstract class BlackListDatabase: RoomDatabase() {
//    abstract fun getTaskDao(): BlackListDao
//}