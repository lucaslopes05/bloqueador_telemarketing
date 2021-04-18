package com.example.bloqueador_telemarketing.ui.fragment.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentOnboardingBinding
import com.example.bloqueador_telemarketing.ui.fragment.onboarding.screen.OnboardingFirstScreenFragment
import com.example.bloqueador_telemarketing.ui.fragment.onboarding.screen.OnboardingSecondScreenFragment

class OnboardingFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)

        //binding.fragment = this
        binding.lifecycleOwner = this

        val pages = arrayListOf(
            OnboardingFirstScreenFragment(),
            OnboardingSecondScreenFragment(),

        )

        binding.vpOnboarding.adapter = OnboardingAdapter(
            pages,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.wormDotsIndicator.setViewPager2(binding.vpOnboarding)

        return binding.root
    }

    @SuppressWarnings
    fun start(v: View) {

    }

}

