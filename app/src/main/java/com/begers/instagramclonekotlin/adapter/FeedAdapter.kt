package com.begers.instagramclonekotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.begers.instagramclonekotlin.databinding.RecyclerRowBinding
import com.begers.instagramclonekotlin.model.Post
import com.squareup.picasso.Picasso

class FeedAdapter(private val postList: ArrayList<Post>) : RecyclerView.Adapter<FeedAdapter.PostHolder>() {

    class PostHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostHolder(binding)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.binding.recyclerEmailText.text = postList.get(position).email
        holder.binding.recyclerCommentText.text = postList.get(position).comment
        Picasso.get().load(postList.get(position).downloadUrl).into(holder.binding.imageView)
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}