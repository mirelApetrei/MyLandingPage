package com.mirel.apetrei.models

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent

enum class Skill(
    val title: String,
    val percentage: CSSSizeValue<CSSUnit.percent>
) {
    Creative(title = "Creative", percentage = 90.percent),
    HardWorking(title = "Hard Working", percentage = 90.percent),
    Value(title = "Value", percentage = 90.percent),
    Delivery(title = "Delivery", percentage = 90.percent),
    Accountable(title = "Accountable", percentage = 90.percent),
    TeamPlayer(title = "Team Player", percentage = 90.percent),
}