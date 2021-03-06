package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentActionBarBinding

import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class ActionBarFragment : Fragment() {

    private lateinit var binding : FragmentActionBarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentActionBarBinding.inflate(inflater,container,false)
        binding.barBlackList = this
        binding.barAddBlackList = this
        binding.lifecycleOwner = this

        return binding.root
    }
    fun blackList(v: View) {
        Toast.makeText(context, "Clicou menu", Toast.LENGTH_LONG).show()
    }

    fun addBlackList(v: View) {

        //findNavController().navigate(R.id.action_blackListFragment_to_addBlackListFragment22)
    }
}