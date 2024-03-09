package com.example.projectmanagerapp.viewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanagerapp.repository.ProfileRepository

class ProfileViewModel(val repository: ProfileRepository):ViewModel() {
    constructor(): this(ProfileRepository())

    fun loadDataMyTeam() = repository.myTeamItems
    fun loadDataArchive() = repository.archiveItems
}