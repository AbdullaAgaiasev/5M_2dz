package com.example.a5m_2dz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a5m_2dz.apps.App
import com.example.a5m_2dz.databinding.FragmentFirstBinding
import com.example.a5m_2dz.databinding.FragmentHistoryBinding


class HistoryFragment : Fragment() {

    private lateinit var binding : FragmentHistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = App.appDatabase.loveDao().getAllSort()
        var data = ""
        list.forEach {
            data += "${it.firstName} \n ${it.secondName} \n ${it.percentage} \n ${it.result} \n\n\n"
        }
        binding.tvResult.text = data


    }
}