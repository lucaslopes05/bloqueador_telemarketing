package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentActionBarBinding
import com.example.bloqueador_telemarketing.databinding.FragmentLoginBinding
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
        binding.barMenu = this
        binding.barMenu = this
        binding.barMore = this
        binding.lifecycleOwner = this

        return binding.root
    }
    fun menu(v: View) {
        Toast.makeText(context, "Clicou menu", Toast.LENGTH_LONG).show()
    }

    fun search(v: View) {
        Toast.makeText(context, "Clicou menu", Toast.LENGTH_LONG).show()
    }

    fun options(v: View) {
        Toast.makeText(context, "Clicou menu", Toast.LENGTH_LONG).show()
    }
}