package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentChatbotBinding
import com.example.bloqueador_telemarketing.domain.ChatbotRequest
import com.example.bloqueador_telemarketing.repository.ChatService
import com.example.bloqueador_telemarketing.repository.ChatbotResponse
import com.example.bloqueador_telemarketing.ui.adapter.ChatAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class ChatbotFragment : Fragment() {
    private lateinit var binding: FragmentChatbotBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var chatAdapter: ChatAdapter
    private var messageList = mutableListOf<ChatbotResponse>()
    private val uniqueId = UUID.randomUUID().toString();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatbotBinding.inflate(inflater, container, false)
        binding.fragment = this
        binding.lifecycleOwner = this
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvMessageList.apply{
            binding.rvMessageList.layoutManager = LinearLayoutManager(activity?.applicationContext)
            recyclerView = requireView().findViewById(R.id.rvMessageList)
            chatAdapter = ChatAdapter(messageList)
            recyclerView.adapter = chatAdapter
        }
    }
    fun addMessage(v: View){
        if(binding.messageUser.text.toString().isEmpty()){
            Toast.makeText(view?.context, "Digite a sua mensagem!", Toast.LENGTH_LONG).show()
        }else{
            val index: Int = messageList.size
            messageList.add(index, ChatbotResponse(binding.messageUser.text.toString(),1))
            chatAdapter.notifyItemInserted(index)

            sendMessage(binding.messageUser.text.toString(), uniqueId)
            binding.messageUser.setText("")
            recyclerView.scrollToPosition(messageList.size - 1)
        }
    }
    fun addMessageBot(msg: String){
        val index: Int = messageList.size
        messageList.add(index, ChatbotResponse(msg,2))
        chatAdapter.notifyItemInserted(index)
        recyclerView.scrollToPosition(messageList.size - 1)
    }
    private fun sendMessage(msg: String, userId: String) {
        val index: Int = messageList.size
        val retrofit = Retrofit.Builder().baseUrl("https://dialogflow-bloq-telemk.herokuapp.com/api/").addConverterFactory(
            GsonConverterFactory.create()).build()
        val service = retrofit.create(ChatService::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            withContext(Dispatchers.Main) {
                val response = service.sendTextMessage(ChatbotRequest(msg,1))
                addMessageBot(response.message)
            }
        }
    }
}