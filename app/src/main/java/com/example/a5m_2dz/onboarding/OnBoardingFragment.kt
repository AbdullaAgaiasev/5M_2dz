package com.example.a5m_2dz.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.a5m_2dz.Pref
import com.example.a5m_2dz.R
import com.example.a5m_2dz.databinding.FragmentOnBoardingBinding
import com.example.a5m_2dz.onboarding.adapter.OnBoardingAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding
    private lateinit var adapter: OnBoardingAdapter

    @Inject
    lateinit var pref: Pref

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = OnBoardingAdapter(this::onClick)
        binding.viewPager.adapter = adapter
        if (pref.isUserSeen()){
            findNavController().navigate(R.id.firstFragment)
        }
    }

    private fun onClick(){
        pref.isUserSeenOnBoarding()
        findNavController().navigate(R.id.onBoardingFragment)
    }
}
