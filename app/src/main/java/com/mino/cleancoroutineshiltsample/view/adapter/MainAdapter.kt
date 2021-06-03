package com.mino.cleancoroutineshiltsample.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mino.cleancoroutineshiltsample.R
import com.mino.cleancoroutineshiltsample.databinding.ItemMainBinding
import com.mino.cleancoroutineshiltsample.vo.ImageVo

class MainAdapter(private val onClickAction: (String) -> Unit) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private val imageVoList = mutableListOf<ImageVo>()

    fun setImageList(voList: List<ImageVo>) {
        imageVoList.clear()
        imageVoList.addAll(voList)
        notifyDataSetChanged()
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int = imageVoList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = DataBindingUtil.inflate<ItemMainBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_main,
            parent,
            false
        )
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(imageVoList[position])
    }

    inner class MainViewHolder(private val binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                onClickAction(imageVoList[adapterPosition].link)
            }
        }

        fun bind(imageVo: ImageVo) {
            binding.item = imageVo
        }
    }
}