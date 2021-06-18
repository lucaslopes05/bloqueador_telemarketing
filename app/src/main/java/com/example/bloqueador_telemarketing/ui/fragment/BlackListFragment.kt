package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentBlackListBinding
import com.example.bloqueador_telemarketing.databinding.FragmentListCallsBinding
import com.example.bloqueador_telemarketing.repository.BlackListRepository
import com.example.bloqueador_telemarketing.ui.adapter.BlackListAdapter
import com.example.bloqueador_telemarketing.viewmodel.BlackListViewModelFactory
import com.example.bloqueador_telemarketing.viewmodel.BloqueadorViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class BlackListFragment : Fragment() {

    private lateinit var binding : FragmentBlackListBinding
//    private val blacklistViewModel: BloqueadorViewModel by viewModels {
//        BlackListViewModelFactory((application as WordsApplication).repository)
//    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentBlackListBinding.inflate(inflater,container,false)
        binding.number = this
        binding.lifecycleOwner = this

        val recyclerView = binding.rvListaHome
        val adapter = BlackListAdapter()
        recyclerView.adapter = BlackListAdapter()
        recyclerView.layoutManager = LinearLayoutManager(context)

//        BloqueadorViewModel.blackList.observe(owner = this) { words ->
//
//            words.let { adapter.submitList(it) }
//        }


        // Inflate the layout for this fragment
        return binding.root
    }

}