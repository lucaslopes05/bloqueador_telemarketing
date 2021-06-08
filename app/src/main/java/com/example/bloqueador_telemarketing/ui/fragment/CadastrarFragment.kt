package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentCadastrarBinding
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import javax.inject.Inject

@AndroidEntryPoint
@WithFragmentBindings

class CadastrarFragment : Fragment() {

    @Inject lateinit var auth: FirebaseAuth
    private lateinit var binding : FragmentCadastrarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCadastrarBinding.inflate(inflater, container, false)
        binding.elementosCadastrar = this
        binding.lifecycleOwner = this

        return binding.root
    }

    fun cadastrarUsuario(v: View) {
        if(binding.etCadastrarSenha.text.toString() != binding.etCadastrarSenhaNovamente.text.toString())
            Toast.makeText(context,"Os campos senha e confirmar senha são diferentes",Toast.LENGTH_LONG).show()
        else {
            val cadastra = auth.createUserWithEmailAndPassword(binding.etCadastrarEmail.text.toString() ,
                binding.etCadastrarSenha.text.toString())

            cadastra.addOnCompleteListener { resultado ->
                if(cadastra.isSuccessful) {
                    findNavController().navigate(R.id.action_cadastrarFragment_to_loginFragment)

                } else {
                    Toast.makeText(context, "o e-mail digitado não é válido", Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}