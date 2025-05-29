package com.example.contentproviderdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contentproviderdemo.databinding.RvItemViewBinding

class RvAdapter(private val items : List<ItemModel>) : RecyclerView.Adapter<RvAdapter.ItemViewHolder>() {


    inner class ItemViewHolder(val binding : RvItemViewBinding) : RecyclerView.ViewHolder(binding.root){

        fun bindData(item : ItemModel){
            binding.apply {
                name.text = item.name
                number.text = item.number
            }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RvAdapter.ItemViewHolder {
        val binding = RvItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RvAdapter.ItemViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount(): Int = items.size
}