package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bloqueador_telemarketing.databinding.FragmentAddBlackListBinding
import com.example.bloqueador_telemarketing.repository.BlackList
import com.example.bloqueador_telemarketing.ui.activity.AppActivity
import com.example.bloqueador_telemarketing.ui.activity.AppActivity_GeneratedInjector
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
@WithFragmentBindings
class AddBlackListFragment : Fragment() {

    private lateinit var binding : FragmentAddBlackListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAddBlackListBinding.inflate(inflater,container,false)
        binding.addBlackList = this
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root
    }

    fun addBlackList(v: View) {
        val numAdd = binding.etPhone.text.toString()


        GlobalScope.launch {

            val blackListDb = BlackList(blackListNum = numAdd)

        }
    }


    }

