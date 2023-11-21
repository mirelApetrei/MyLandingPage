package com.mirel.apetrei.pages

import androidx.compose.runtime.*
import com.mirel.apetrei.sections.*
import com.mirel.apetrei.util.Res.Image.SECTION_BACKGROUND
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.Color


@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Color(SECTION_BACKGROUND)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainSection()
        AboutSection()
        PortfolioSection()
        ServiceSection()
        ContactSection()
        FooterSection()
        }
}
