package com.example.bloqueador_telemarketing.repository.db.dao

import androidx.room.*
import com.example.bloqueador_telemarketing.repository.db.NumEntity

//talvez anotar databinding
@Dao
interface BlackListNumDao {

//    @Query("Select * from BlackListNum where number like '%' || :text || '%' ")
//    suspend fun getTBlackListNumDao(text: String): List<BlackListNum>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBlackListNum(t: NumEntity)

    @Delete
    suspend fun deleteBlackListNum(t: NumEntity)
}