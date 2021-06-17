package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bloqueador_telemarketing.databinding.FragmentAddBlackListBinding
import com.example.bloqueador_telemarketing.ui.activity.AppActivity
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class AddBlackListFragment : Fragment() {

    private lateinit var binding : FragmentAddBlackListBinding
    private lateinit var daoAdd : AppActivity

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
        daoAdd = AppActivity()
        daoAdd.getDao(numAdd)
    }


}

