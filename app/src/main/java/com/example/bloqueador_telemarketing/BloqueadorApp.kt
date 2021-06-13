package com.example.bloqueador_telemarketing

import android.app.Application
import com.example.bloqueador_telemarketing.domain.BlackListDatabase
import com.example.bloqueador_telemarketing.repository.BlackListRepository
import com.example.bloqueador_telemarketing.ui.component.BlackListDB
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

@HiltAndroidApp
class BloqueadorApp : Application(){
    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { BlackListDB.getDataBase(this, applicationScope) }
    val repository by lazy { BlackListRepository(database.blackListDao()) }
}