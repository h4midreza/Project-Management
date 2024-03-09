package com.example.projectmanagerapp.repository

import com.example.projectmanagerapp.domain.TeamDomain

class ProfileRepository {
    val myTeamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Food App Application", "Project in progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend", "Project in progress"),
        TeamDomain("Kotlin developers", "Completed"),
    )

    val archiveItems: MutableList<String> = mutableListOf(
        "Ui/Ux Screenshots",
        "Kotlin Source Code",
        "Source Codes"
    )
}