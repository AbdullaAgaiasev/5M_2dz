package com.example.a5m_2dz.onBoarding.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.a5m_2dz.R
import com.example.a5m_2dz.databinding.ItemOnBoardingBinding
import com.example.a5m_2dz.onboard.OnBoarding

class OnBoardingAdapter(private val onClick: () -> Unit) :
    Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {
    private val image = arrayListOf(R.raw.man,R.raw.update,R.raw.goodbye,R.raw.android)
        private val data = arrayListOf(
            OnBoarding(
                "Have a good time!",
                "You should take the time to help those \n who who need you"
            ),
            OnBoarding(
                "Cherishing love",
                "It is now no longer possible for\nyou to cherish love"
            ),
            OnBoarding(
                "Have a breakup?",
                "We have made the correction for you\n don't worry\n Maybe someone is waiting for you!"
            ),
            OnBoarding(
                "It's Funs and Many more",
                " ")
        )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder{
        return OnBoardingViewHolder(
            ItemOnBoardingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() : Int = data.size

    inner class OnBoardingViewHolder(private val binding: ItemOnBoardingBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(onBoarding: OnBoarding) {
            binding.apply {
//                onBoarding.image?.let { lottieMain.setImageResource(it) }
                title.text = onBoarding.title
                desc.text = onBoarding.desc
                binding.lottieMain.setAnimation(image[position])
                binding.btnGetStart.isVisible = adapterPosition == data.lastIndex
                binding.btnGetStart.setOnClickListener {
                    onClick()
                }
            }
        }

    }
}