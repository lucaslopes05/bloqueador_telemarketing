package com.example.bloqueador_telemarketing.ui.fragment.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentOnboardingFirstScreenBinding


class OnboardingFirstScreenFragment : Fragment() {


    private lateinit var binding: FragmentOnboardingFirstScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
<<<<<<< HEAD

            binding = FragmentOnboardingFirstScreenBinding.inflate(inflater, container, false)
            binding.lifecycleOwner = this
            return binding.root
=======
        binding = FragmentOnboardingFirstScreenBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
>>>>>>> 63b748b619cec6a0f0e7e53dbbe8e9fd3c88cc58
    }

}