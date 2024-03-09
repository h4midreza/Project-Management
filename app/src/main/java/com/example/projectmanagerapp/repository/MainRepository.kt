package com.example.projectmanagerapp.repository

import com.example.projectmanagerapp.domain.OngoingDomain

class MainRepository {
    val items = listOf(
        OngoingDomain("Food App", "June 24, 2023", 50, "ongoing1"),
        OngoingDomain("AI Recoding", "June 26, 2023", 60, "ongoing1"),
        OngoingDomain("Weather App", "June 28, 2023", 25, "ongoing1"),
        OngoingDomain("E-Book app", "June 15, 2023", 80, "ongoing1")
    )
}