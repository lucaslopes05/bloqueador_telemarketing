package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentAddBlackListBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class AddBlackListFragment : Fragment() {

    private lateinit var binding : FragmentAddBlackListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBlackListBinding.inflate(inflater,container,false)
        //binding.elementosTesteLogado = this
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root
    }

}