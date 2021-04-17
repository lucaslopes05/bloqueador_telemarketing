package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bloqueador_telemarketing.databinding.FragmentTesteLogadoBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings

class TesteLogadoFragment : Fragment() {

    private lateinit var binding : FragmentTesteLogadoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTesteLogadoBinding.inflate(inflater,container,false)
        binding.elementosTesteLogado = this
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root
    }


}