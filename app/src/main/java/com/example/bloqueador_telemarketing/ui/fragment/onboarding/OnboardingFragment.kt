package com.example.bloqueador_telemarketing.ui.fragment.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentOnboardingBinding
import com.example.bloqueador_telemarketing.ui.adapter.OnboardingAdapter
import com.example.bloqueador_telemarketing.ui.fragment.onboarding.screen.OnboardingFirstScreenFragment
import com.example.bloqueador_telemarketing.ui.fragment.onboarding.screen.OnboardingSecondScreenFragment
import com.example.bloqueador_telemarketing.ui.fragment.onboarding.screen.OnboardingThirdScreenFragment
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class OnboardingFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater,container,false)
        binding.fragmentOnboarding = this
        binding.lifecycleOwner = this


        val pages = arrayListOf(
            OnboardingFirstScreenFragment(),
            OnboardingSecondScreenFragment(),
            OnboardingThirdScreenFragment()
        )


        binding.vpOnboarding.adapter = OnboardingAdapter(
            pages,
            requireActivity().supportFragmentManager,
            lifecycle
        )



        return binding.root


    }

    fun irLogin(v: View) {
        findNavController().navigate(R.id.action_onboardingFragment_to_loginFragment)
    }


    @SuppressWarnings
    fun start(v: View) {

    }
}

