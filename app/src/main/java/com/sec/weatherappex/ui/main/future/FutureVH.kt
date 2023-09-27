package com.sec.weatherappex.ui.main.future

import androidx.recyclerview.widget.RecyclerView
import com.sec.weatherappex.databinding.CellFutureItemBinding
import com.sec.weatherappex.ui.main.future.items.FutureUiItem

class FutureVH(val binding: CellFutureItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item:FutureUiItem){
        binding.imageView.setImageResource(item.picPath)
        binding.dayText.text=item.day
        binding.highText.text=item.highTamp
        binding.lowText.text=item.lowTamp
        binding.statusText.text=item.status
    }
}