package com.example.a5m_2dz

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.a5m_2dz.databinding.FragmentFirstBinding
import com.example.a5m_2dz.remote.LoveModel
import com.example.a5m_2dz.remote.LoveService
import com.example.a5m_2dz.viewmodel.LoveViewModel
import retrofit2.Call
import retrofit2.Response

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val viewModel : LoveViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    private fun initListener() {
        with(binding) {
            btnCalculate.setOnClickListener {
                viewModel.getLiveLove(
                    firstName = firstEt.text.toString(),
                    secondName = secondEt.text.toString()
                ).observe(viewLifecycleOwner,
                    Observer {
                        Log.e("ololo", "initListener: $it", )
                })



            //                enqueue(object : retrofit2.Callback<LoveModel> {
//                    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
//                        if (response.isSuccessful) {
//                            Log.e("ololo", "onResponse: ${response.body()}")
//
//                                bundleOf("result" to response.body())
//                            )
//                        }
//                    }

                }
            }
        }
    }