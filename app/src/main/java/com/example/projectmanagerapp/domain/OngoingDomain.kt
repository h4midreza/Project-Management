package com.example.projectmanagerapp.domain

data class OngoingDomain(
    var title: String,
    var date: String,
    var progressPercent: Int,
    var picPath: String,
)
