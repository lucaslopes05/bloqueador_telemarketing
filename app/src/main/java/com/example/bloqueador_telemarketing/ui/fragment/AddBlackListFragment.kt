package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bloqueador_telemarketing.databinding.FragmentAddBlackListBinding
import com.example.bloqueador_telemarketing.repository.BlackListNum
import com.example.bloqueador_telemarketing.repository.BlackListNumDao
import com.example.bloqueador_telemarketing.ui.activity.AppActivity
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
@WithFragmentBindings
class AddBlackListFragment : Fragment() {

    private lateinit var binding : FragmentAddBlackListBinding
    private lateinit var dao : BlackListNumDao

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAddBlackListBinding.inflate(inflater,container,false)
        binding.addBlackList = this
        binding.lifecycleOwner = this

        dao = (activity as AppActivity).getDao()
        // Inflate the layout for this fragment
        return binding.root
    }

    fun addBlackList(v: View) {

        val numAdd = binding.etPhone.text.toString()

        GlobalScope.launch {
            val numAddBL = BlackListNum(number = numAdd)
            dao.insertBlackListNum(numAddBL)
            withContext(Dispatchers.Main){
                binding.etPhone.setText("")
                Toast.makeText(context,"Pode crer!",Toast.LENGTH_SHORT).show()
            }
        }
    }


}

