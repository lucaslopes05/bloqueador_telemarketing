package com.example.bloqueador_telemarketing.ui.fragment.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
<<<<<<< HEAD
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentOnboardingBinding
import com.example.bloqueador_telemarketing.ui.adapter.OnboardingAdapter
=======
import com.example.bloqueador_telemarketing.R
import com.example.bloqueador_telemarketing.databinding.FragmentOnboardingBinding
>>>>>>> 63b748b619cec6a0f0e7e53dbbe8e9fd3c88cc58
import com.example.bloqueador_telemarketing.ui.fragment.onboarding.screen.OnboardingFirstScreenFragment
import com.example.bloqueador_telemarketing.ui.fragment.onboarding.screen.OnboardingSecondScreenFragment

class OnboardingFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(
<<<<<<< HEAD
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        //Criar fonte de dados
=======
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)

        //binding.fragment = this
        binding.lifecycleOwner = this

>>>>>>> 63b748b619cec6a0f0e7e53dbbe8e9fd3c88cc58
        val pages = arrayListOf(
            OnboardingFirstScreenFragment(),
            OnboardingSecondScreenFragment(),

        )

<<<<<<< HEAD
        //Criar o adaptador
        val adpetador = AdaptadorParaVp(pages, requireActivity().supportFragmentManager,lifecycle)
        binding.vpOnboarding.adapter = adpetador


        /*
=======
>>>>>>> 63b748b619cec6a0f0e7e53dbbe8e9fd3c88cc58
        binding.vpOnboarding.adapter = OnboardingAdapter(
            pages,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.wormDotsIndicator.setViewPager2(binding.vpOnboarding)
<<<<<<< HEAD
        */
=======
>>>>>>> 63b748b619cec6a0f0e7e53dbbe8e9fd3c88cc58

        return binding.root
    }

    @SuppressWarnings
    fun start(v: View) {

    }

}

<<<<<<< HEAD
class AdaptadorParaVp (
        val listaFragmentos: List<Fragment>,
        fragmentManager : FragmentManager ,
        lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount() = listaFragmentos.size
    override fun createFragment(position: Int)= listaFragmentos[position]


}

=======
>>>>>>> 63b748b619cec6a0f0e7e53dbbe8e9fd3c88cc58
