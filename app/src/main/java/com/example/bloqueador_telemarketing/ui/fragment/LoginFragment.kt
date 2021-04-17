package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import javax.inject.Inject

@AndroidEntryPoint
@WithFragmentBindings

class LoginFragment : Fragment() {

    @Inject lateinit var auth : FirebaseAuth

    private lateinit var binding : FragmentLoginBinding

    fun irCadastrar(v: View) {
        findNavController().navigate(R.id.action_loginFragment_to_cadastrarFragment)
    }

    fun irEsqueciSenha(v: View) {
        findNavController().navigate(R.id.action_loginFragment_to_esqueciSenhaFragment)
    }

    fun irEntrar(v: View) {

        val login = auth.signInWithEmailAndPassword(binding.etLoginEmail.text.toString(), binding.etLoginSenha.text.toString())

        login.addOnCompleteListener { resultado ->
            if(login.isSuccessful) {
                findNavController().navigate(R.id.action_loginFragment_to_appActivity)

            } else {
                Toast.makeText(context, "e-mail ou senha inválidos", Toast.LENGTH_LONG).show()
            }
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        binding.elementosLogin = this
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root


    }


}