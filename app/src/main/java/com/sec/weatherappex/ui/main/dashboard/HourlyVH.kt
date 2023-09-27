package com.sec.weatherappex.ui.main.dashboard

import androidx.recyclerview.widget.RecyclerView

import com.sec.weatherappex.databinding.CellHourlyBinding
import com.sec.weatherappex.ui.main.dashboard.items.HourlyUiItem


class HourlyVH(val binding: CellHourlyBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item:HourlyUiItem){
        binding.cardImg.setImageResource(item.img)
        binding.degreeText.text=item.tempTxt
        binding.hourText.text=item.hourTxt
    }
}