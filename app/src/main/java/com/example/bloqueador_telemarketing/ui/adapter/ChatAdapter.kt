package com.example.bloqueador_telemarketing.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.repository.ChatbotResponse

class ChatAdapter(messageList: MutableList<ChatbotResponse>): RecyclerView.Adapter<ChatAdapter.ViewHolder>() {
    private var messages: MutableList<ChatbotResponse> = messageList
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAdapter.ViewHolder {

//        println(messages[messages.size-1].TIPO)
        if (messages[messages.size-1].TIPO ==2){
            val card = LayoutInflater.from(parent.context).inflate(R.layout.bot_message_layout,parent,false)
            return ViewHolder(card,2)
        }else{
            val card = LayoutInflater.from(parent.context).inflate(R.layout.my_message_layout,parent,false)
            return ViewHolder(card,1)
        }

    }

    override fun getItemCount(): Int {
        return messages.size
    }

    fun getItem(i:Int): ChatbotResponse {
        return messages[1]
    }

    override fun onBindViewHolder(holder: ChatAdapter.ViewHolder, position: Int) {
        holder.itemText.text = messages[position].message
//        println(messages[position].TIPO)
    }

    inner class ViewHolder(itemView: View, position: Int): RecyclerView.ViewHolder(itemView){
        lateinit var itemText: TextView
        init {
            if(position==2){
                itemText = itemView.findViewById(R.id.bot_message)
            }else{
                itemText = itemView.findViewById(R.id.my_message)
            }

        }
    }
}

