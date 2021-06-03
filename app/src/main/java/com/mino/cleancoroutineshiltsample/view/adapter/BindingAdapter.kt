package com.mino.cleancoroutineshiltsample.view.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bind:setImage")
fun ImageView.setImage(imageUrl: String?) {

    imageUrl?.let {
        Glide.with(this)
            .load(it)
            .override(300)
            .into(this)
    }
}