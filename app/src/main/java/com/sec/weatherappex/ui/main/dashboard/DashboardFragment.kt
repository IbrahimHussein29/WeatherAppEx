package com.sec.weatherappex.ui.main.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.weatherappex.R
import com.sec.weatherappex.databinding.FragmentDashboardBinding



class DashboardFragment : Fragment() {
private lateinit var binding:FragmentDashboardBinding
private lateinit var dashboardViewModel:DashboardViewModel
private val hourlyAdapter by lazy{
    HourlyAdapter(arrayListOf())
}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentDashboardBinding.inflate(layoutInflater)
       dashboardViewModel=ViewModelProvider(this)[DashboardViewModel::class.java]
        callData()
        observeData()
        bindData()

        return binding.root

    }

    private fun bindData() {
       binding.todayRecyclerView.adapter=hourlyAdapter
        binding.nextDaysText.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_FutureFragment)
        }

    }

    private fun observeData() {
      dashboardViewModel.hourlyData.observe(viewLifecycleOwner){
           hourlyAdapter.items=it
           hourlyAdapter.notifyDataSetChanged()
       }
    }

    private fun callData() {
      dashboardViewModel.generateHourlyData()
    }

}