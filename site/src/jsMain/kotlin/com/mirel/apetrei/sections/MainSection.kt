package com.mirel.apetrei.sections

import androidx.compose.runtime.Composable
import com.mirel.apetrei.components.Header
import com.mirel.apetrei.components.SocialBar
import com.mirel.apetrei.models.Section
import com.mirel.apetrei.models.Theme
import com.mirel.apetrei.styles.MainButtonStyle
import com.mirel.apetrei.styles.MainImageStyle
import com.mirel.apetrei.util.Constants.DESCRIPTION_FIRST
import com.mirel.apetrei.util.Constants.FONT_FAMILY
import com.mirel.apetrei.util.Constants.SECTION_WIDTH
import com.mirel.apetrei.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection(onMenuClicked: () -> Unit) {

    Box (
        modifier = Modifier
            .id(Section.Home.id )
            .maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ){
        MainBackground()
        MainContent(onMenuClicked = onMenuClicked)


    }

}

@Composable
fun MainBackground() {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = Res.Image.BACKGROUND,
        description = " Background Image",
    )
}

@Composable
fun MainContent(onMenuClicked: () -> Unit) {
    val breakpoint by rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(onMenuClicked = onMenuClicked)
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SimpleGrid(
                modifier = Modifier
                    .fillMaxWidth(if (breakpoint > Breakpoint.MD) 80.percent else 90.percent),
                numColumns = numColumns(base = 1, md = 2)
            ) {
                MainText(breakpoint = breakpoint)
                MainImage()
            }
        }
    }
}

@Composable
fun MainText(breakpoint: Breakpoint) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        if (breakpoint > Breakpoint.MD){
        SocialBar()
        }
        Column {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 45.px else 20.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text("Hi, I'm ")
            }
            P(
                attrs = Modifier
                    .margin(top = 20.px, bottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 68.px else 40.px) // this is for screen size management
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("Mirel Apetrei")
            }
            P(
                attrs = Modifier
                    .margin(top = 10.px, bottom = 5.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("Native Android & iOS Developer")
            }
            P(
                attrs = Modifier
                    .margin(bottom = 25.px)
                    .maxWidth(400.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(15.px)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text(DESCRIPTION_FIRST)
            }
            Button(
                attrs = MainButtonStyle.toModifier()
                    .height(40.px)
                    .border(width = 0.px)
                    .borderRadius(r = 5.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Colors.White)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Link(
                    modifier = Modifier
                        .color(Colors.White)
                        .textDecorationLine(TextDecorationLine.None),
                    text = "Hire Me",
                    path = Section.Contact.path
                )
            }
        }
    }
}

@Composable
fun MainImage() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Image(
            modifier = MainImageStyle.toModifier()
                .fillMaxWidth(),

            src = Res.Image.PERSONAL_PHOTO,
            description = "Personal Photo"
        )
    }
}