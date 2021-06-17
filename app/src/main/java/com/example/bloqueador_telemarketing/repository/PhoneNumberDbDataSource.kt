package com.example.bloqueador_telemarketing.repository

import com.example.bloqueador_telemarketing.repository.db.dao.BlackListNumDao
import com.example.bloqueador_telemarketing.repository.db.toNumEntity
import com.example.bloqueador_telemarketing.ui.adapter.DataViewParams.PhoneNumberViewParams

class PhoneNumberDbDataSource(
    private val blackListNumDao: BlackListNumDao
): NumberRepository{
    override suspend fun createNumber(phoneNumberViewParams: PhoneNumberViewParams) {
        val numEntity = phoneNumberViewParams.toNumEntity()
        blackListNumDao.insertBlackListNum(numEntity)
    }
}