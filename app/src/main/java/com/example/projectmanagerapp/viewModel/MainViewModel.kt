package com.example.projectmanagerapp.viewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanagerapp.repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())

    fun loadData()= repository.items

}