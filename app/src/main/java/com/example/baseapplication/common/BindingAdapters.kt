package com.example.baseapplication.common
//
//import android.view.View
//import android.widget.BaseAdapter
//import android.widget.ProgressBar
//import androidx.databinding.BindingAdapter
//import androidx.databinding.ViewDataBinding
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.example.baseapplication.R
//import com.example.baseapplication.base.ListAdapterItem
//import com.google.android.material.imageview.ShapeableImageView
//
//@BindingAdapter("setAdapter")
//fun setAdapter(
//    recyclerView: RecyclerView,
//    adapter: BaseAdapter<ViewDataBinding, ListAdapterItem>?
//) {
//    adapter?.let {
//        recyclerView.adapter = it
//    }
//}
//
//@Suppress("UNCHECKED_CAST")
//@BindingAdapter("submitList")
//fun submitList(recyclerView: RecyclerView, list: List<ListAdapterItem>?) {
//    val adapter = recyclerView.adapter as BaseAdapter<ViewDataBinding, ListAdapterItem>?
//    adapter?.updateData(list ?: listOf())
//}
//
//@BindingAdapter("manageState")
//fun manageState(progressBar: ProgressBar, state: Boolean) {
//    progressBar.visibility = if (state) View.VISIBLE else View.GONE
//}
//
//@BindingAdapter("setImage")
//fun setImage(imageView: ShapeableImageView, image: Int) {
//    Glide.with(imageView.context)
//        .load(image)
//        .into(imageView)
//}
//
//@BindingAdapter("setFavouriteCondition")
//fun setFavouriteCondition(imageView: ShapeableImageView, isFavourite: Boolean) {
////    if (isFavourite) {
////        imageView.setImageResource(R.drawable.ic_favorite)
////    } else {
////        imageView.setImageResource(R.drawable.ic_favorite_border)
////    }
//
//}