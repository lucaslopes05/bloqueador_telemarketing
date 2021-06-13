package com.example.bloqueador_telemarketing.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.domain.BlackList

class BlackListAdapter : ListAdapter<BlackList, BlackListAdapter.BlackListViewHolder>(BlackListComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlackListViewHolder {
        return BlackListViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: BlackListViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.blackListNum)
    }

    class BlackListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val BlackListItemView: TextView = itemView.findViewById(R.id.textView)

        fun bind(text: String?) {
            BlackListItemView.text = text
        }

        companion object {
            fun create(parent: ViewGroup): BlackListViewHolder {
                val view: View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.recyclerview_blacklist_item, parent, false)
                return BlackListViewHolder(view)
            }
        }
    }

    class BlackListComparator : DiffUtil.ItemCallback<BlackList>() {
        override fun areItemsTheSame(oldItem: BlackList, newItem: BlackList): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: BlackList, newItem: BlackList): Boolean {
            return oldItem.blackListNum == newItem.blackListNum
        }
    }
}