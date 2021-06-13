package com.example.bloqueador_telemarketing.repository

import com.example.bloqueador_telemarketing.domain.ChatbotRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface ChatService {
    @POST("message/text/send")
    suspend fun sendTextMessage(@Body chatbotBody: ChatbotRequest): ChatbotResponse
}
