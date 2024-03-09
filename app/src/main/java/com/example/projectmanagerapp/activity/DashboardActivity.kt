package com.example.projectmanagerapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.GridLayoutManager
import com.example.projectmanagerapp.R
import com.example.projectmanagerapp.adapter.OngoingAdapter
import com.example.projectmanagerapp.databinding.ActivityMainBinding
import com.example.projectmanagerapp.viewModel.MainViewModel

class DashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val onGoingAdapter by lazy { OngoingAdapter(mainViewModel.loadData()) }

            viewOngoing.apply {
                adapter = onGoingAdapter
                    layoutManager = GridLayoutManager(this@DashboardActivity, 2)
            }
            profileMenu.setOnClickListener {
                val intent = Intent(this@DashboardActivity, ProfileActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}