package com.example.bloqueador_telemarketing.ui.activity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.room.Room
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.repository.db.BlackListDB
import com.example.bloqueador_telemarketing.repository.db.NumEntity
import com.example.bloqueador_telemarketing.repository.db.dao.BlackListNumDao
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
        
    }

    fun getDao(numAdd : String) {

        GlobalScope.launch {
            val numAddBL = NumEntity(number = numAdd)
//            dao.insertBlackListNum(numAddBL)
//            withContext(Dispatchers.Main){
//                binding.etPhone.setText("")
//                Toast.makeText(context,"Pode crer!",Toast.LENGTH_SHORT).show()
//           }

        }
    }
}




