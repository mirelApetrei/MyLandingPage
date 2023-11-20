package com.mirel.apetrei.models

import com.mirel.apetrei.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String
) {
    One(
        image = Res.Image.portfolio1,
        title = "CookSmart",
        description = "iOS/Project-Firebase"
    ),
    Two(
        image = Res.Image.portfolio2,
        title = "WhatCanICook?",
        description = "Android/Project - Room database"
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "To Do app",
        description = "iOS/Project - Core Data"
    ),
    Four(
        image = Res.Image.portfolio4,
        title = "To Do app",
        description = "Android/Project - Room database"
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "JungleApp",
        description = "iOS/Project - SwiftUI and CoreData"
    )
}