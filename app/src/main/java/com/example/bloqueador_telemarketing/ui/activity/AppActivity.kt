package com.example.bloqueador_telemarketing.ui.activity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.room.Room
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.repository.BlackListDB
import com.example.bloqueador_telemarketing.repository.BlackListNum
import com.example.bloqueador_telemarketing.repository.BlackListNumDao
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
@WithFragmentBindings
class AppActivity : FragmentActivity() {
    private lateinit var database: BlackListDB
    private lateinit var dao : BlackListNumDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        database = Room.databaseBuilder(
            applicationContext,
            BlackListDB::class.java,
            "black-list-db"
        ).build()

    }

    fun getDao(): BlackListNumDao
    {
        return database.getTBlackListNumDao()
    }
}



<<<<<<< HEAD
//
=======

>>>>>>> master
