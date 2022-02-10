package com.example.demo.util

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.demo.R

@BindingAdapter("image", "placeholder")
fun setImage(image: ImageView, url: String?, placeHolder: Drawable) {
    if (!url.isNullOrEmpty()) {
        Glide.with(image.context).load(url)
            .into(image)
    } else {
        image.setImageDrawable(placeHolder)
    }


}