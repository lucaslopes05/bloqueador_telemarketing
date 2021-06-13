package com.example.bloqueador_telemarketing.domain

import com.google.gson.annotations.SerializedName

data class ChatbotRequest(
    @SerializedName("text")
    var message: String,
    val TIPO:Int
)
