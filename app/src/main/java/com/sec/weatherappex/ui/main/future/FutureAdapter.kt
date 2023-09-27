package com.sec.weatherappex.ui.main.future

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.weatherappex.databinding.CellFutureItemBinding
import com.sec.weatherappex.ui.main.future.items.FutureUiItem

class FutureAdapter(var items: ArrayList<FutureUiItem>) :RecyclerView.Adapter<FutureVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FutureVH {
      val binding=CellFutureItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FutureVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: FutureVH, position: Int) {
        val item=items[position]
        holder.bind(item)
    }
}