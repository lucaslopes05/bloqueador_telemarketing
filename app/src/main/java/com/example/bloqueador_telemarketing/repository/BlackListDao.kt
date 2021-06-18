package com.example.bloqueador_telemarketing.repository

import androidx.room.*
import com.example.bloqueador_telemarketing.ui.activity.AppActivity
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.flow.Flow

@Dao
interface BlackListDao {

    @Query("Select * from BlackListNum ")
    fun getBlackListNum(): Flow<List<BlackListNum>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertBlackListNum(t: BlackListNum)

    @Delete
    fun deleteBlackListNum(t: BlackListNum)
}