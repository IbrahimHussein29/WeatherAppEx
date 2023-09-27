package com.sec.weatherappex.ui.main.future

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.weatherappex.R
import com.sec.weatherappex.databinding.FragmentFutureBinding


class FutureFragment : Fragment() {

private lateinit var binding: FragmentFutureBinding
private lateinit var futureViewModel: FutureViewModel
private val futureAdapter by lazy{
    FutureAdapter(arrayListOf())
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentFutureBinding.inflate(layoutInflater)
        futureViewModel=ViewModelProvider(this)[FutureViewModel::class.java]
        callData()
        observeData()
binding.backArrow.setOnClickListener {
    findNavController().popBackStack()
}


        return  binding.root
    }

    private fun observeData() {
        binding.futureRecyclerView.adapter=futureAdapter
        futureViewModel.futureData.observe(viewLifecycleOwner){
            futureAdapter.items=it
            futureAdapter.notifyDataSetChanged()
        }
    }

    private fun callData() {
       futureViewModel.generateFutureData()
    }


}