package com.begers.instagramclonekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.begers.instagramclonekotlin.databinding.ActivityFeedBinding
import com.begers.instagramclonekotlin.databinding.ActivityMainBinding

class FeedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFeedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}