package com.example.bloqueador_telemarketing.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentEsqueciSenhaBinding
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import javax.inject.Inject

@AndroidEntryPoint
@WithFragmentBindings

class EsqueciSenhaFragment : Fragment() {

    @Inject
    lateinit var auth: FirebaseAuth
    private lateinit var binding : FragmentEsqueciSenhaBinding

    fun enviarEmail(v: View) {
        val emailEsqueci = auth.sendPasswordResetEmail(binding.tvEsqueciEmail.text.toString())

        emailEsqueci.addOnCompleteListener { resultado ->
            if (emailEsqueci.isSuccessful) {
                Toast.makeText(context, "Um e-mail foi enviado para ${binding.tvEsqueciEmail.text}"
                    , Toast.LENGTH_LONG).show()
                findNavController().navigate(R.id.action_esqueciSenhaFragment_to_loginFragment)
            } else {
                Toast.makeText(context, "o e-mail digitado não é válido", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentEsqueciSenhaBinding.inflate(inflater, container, false)
        binding.elementosEsqueci = this
        binding.lifecycleOwner = this

        return binding.root
    }


}