package com.example.bloqueador_telemarketing.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.repository.BlackListNum

class BlackListAdapter : ListAdapter<BlackListNum, BlackListAdapter.BlackListViewHolder>(WordsComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlackListViewHolder {
        return BlackListViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: BlackListViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.number)
    }

    class BlackListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val wordItemView: TextView = itemView.findViewById(R.id.textView)

        fun bind(text: String?) {
            wordItemView.text = text
        }

        companion object {
            fun create(parent: ViewGroup): BlackListViewHolder {
                val view: View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_black_list, parent, false)
                return BlackListViewHolder(view)
            }
        }
    }

    class WordsComparator : DiffUtil.ItemCallback<BlackListNum>() {
        override fun areItemsTheSame(oldItem: BlackListNum, newItem: BlackListNum): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: BlackListNum, newItem: BlackListNum): Boolean {
            return oldItem.number == newItem.number
        }
    }
}