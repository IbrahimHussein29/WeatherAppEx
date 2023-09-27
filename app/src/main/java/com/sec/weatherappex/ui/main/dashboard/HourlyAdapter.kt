package com.sec.weatherappex.ui.main.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.weatherappex.databinding.CellHourlyBinding
import com.sec.weatherappex.ui.main.dashboard.items.HourlyUiItem

class HourlyAdapter(var items:ArrayList<HourlyUiItem>):RecyclerView.Adapter<HourlyVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyVH {
     val binding=CellHourlyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HourlyVH(binding)
    }

    override fun getItemCount(): Int {
     return  items.size
    }

    override fun onBindViewHolder(holder: HourlyVH, position: Int) {
        val item=items[position]
    holder.bind(item)
    }
}