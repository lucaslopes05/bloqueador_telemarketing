package com.example.bloqueador_telemarketing.repository

import androidx.room.*
import com.example.bloqueador_telemarketing.ui.activity.AppActivity
import dagger.hilt.android.WithFragmentBindings

//talvez anotar databinding
@Dao
interface BlackListNumDao {

//    @Query("Select * from BlackListNum where number like '%' || :text || '%' ")
//    suspend fun getTBlackListNumDao(text: String): List<BlackListNum>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBlackListNum(t: BlackListNum)

    @Delete
    suspend fun deleteBlackListNum(t: BlackListNum)
}