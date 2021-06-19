package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentAppMainBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class AppMainFragment : Fragment() {

    private lateinit var binding: FragmentAppMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = FragmentAppMainBinding.inflate(inflater, container, false)
        binding.fragment = this
        binding.lifecycleOwner = this

        return binding.root
    }


    fun navChatbot(v: View){
        findNavController().navigate(R.id.action_appMainFragment_to_chatbotFragment)
    }

    fun navMaps(v: View){
        findNavController().navigate(R.id.action_appMainFragment_to_mapFragment)
    }

    fun navaddList(v: View){
        findNavController().navigate(R.id.action_appMainFragment_to_addBlackListFragment)
    }

    fun navList(v: View){
        findNavController().navigate(R.id.action_appMainFragment_to_blackListFragment)
    }

}