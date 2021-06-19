package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentListCallsBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings

class HomeListFragment : Fragment() {

    private lateinit var binding : FragmentListCallsBinding

    fun irAddBlackList(v : View){
//        findNavController().navigate(R.id.action_listCallsFragment_to_addBlackListFragment)
    }

    fun irMap(v : View){
//        findNavController().navigate(R.id.action_listCallsFragment_to_mapFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListCallsBinding.inflate(inflater,container,false)
        binding.elementosTesteLogado = this
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root
    }

}