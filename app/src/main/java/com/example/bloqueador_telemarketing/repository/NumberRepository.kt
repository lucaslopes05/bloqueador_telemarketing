package com.example.bloqueador_telemarketing.repository

import com.example.bloqueador_telemarketing.repository.model.PhoneNumber
import com.example.bloqueador_telemarketing.ui.adapter.DataViewParams.PhoneNumberViewParams

interface NumberRepository {

    suspend fun createNumber(phoneNumberViewParams: PhoneNumberViewParams)


}