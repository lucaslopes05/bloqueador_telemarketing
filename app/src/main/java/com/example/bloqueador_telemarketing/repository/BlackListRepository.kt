package com.example.bloqueador_telemarketing.repository

import androidx.annotation.WorkerThread
import com.example.bloqueador_telemarketing.domain.BlackList
import com.example.bloqueador_telemarketing.domain.BlackListDao
import kotlinx.coroutines.flow.Flow

class BlackListRepository(private val blackListDao: BlackListDao) {

    val allWords: Flow<List<BlackList>> = blackListDao.getTasks()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(blacklist: BlackList) {
        blackListDao.insertBlackList(blacklist)
    }
}