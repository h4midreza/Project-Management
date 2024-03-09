package com.example.projectmanagerapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectmanagerapp.R
import com.example.projectmanagerapp.adapter.ArchiveAdapter
import com.example.projectmanagerapp.adapter.MyTeamAdapter
import com.example.projectmanagerapp.databinding.ActivityProfileBinding
import com.example.projectmanagerapp.viewModel.ProfileViewModel

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    val profileViewModel: ProfileViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            val myTeamAdapter by lazy { MyTeamAdapter(profileViewModel.loadDataMyTeam()) }
            viewTeam.apply {
                adapter = myTeamAdapter
                layoutManager = LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.VERTICAL,
                    false
                )
            }

            val archiveAdapter by lazy { ArchiveAdapter(profileViewModel.loadDataArchive()) }
            viewArchive.apply {
                adapter = archiveAdapter
                layoutManager = LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            }
        }
    }
}