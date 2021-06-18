package com.example.bloqueador_telemarketing.repository

import androidx.annotation.WorkerThread
import androidx.room.*
import kotlinx.coroutines.flow.Flow

class BlackListRepository (private val blackListDao : BlackListDao) {

    val blackList : Flow<List<BlackListNum>> = blackListDao.getBlackListNum()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(blackListNum: BlackListNum) {
        blackListDao.insertBlackListNum(blackListNum)
    }
}