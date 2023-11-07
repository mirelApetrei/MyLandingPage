package com.mirel.apetrei.components

import androidx.compose.runtime.Composable
import com.mirel.apetrei.models.Section
import com.mirel.apetrei.models.Theme
import com.mirel.apetrei.styles.LogoStyle
import com.mirel.apetrei.styles.NavigationItemStyle
import com.mirel.apetrei.util.Constants.FONT_FAMILY
import com.mirel.apetrei.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Header() {
    val breakpoint by rememberBreakpoint() // this is for screen size management
    Row(
        modifier = Modifier
            .fillMaxWidth(80.percent)
             .margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        LeftSide(breakpoint = breakpoint)
        if (breakpoint > Breakpoint.MD){
            RightSide()
        }
    }
}


@Composable
fun LeftSide(breakpoint: Breakpoint) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint <= Breakpoint.MD){
            FaBars(
                modifier = Modifier
                    .margin(right = 15.px),
                size = IconSize.XL
            )
        }
        Image(
            modifier = LogoStyle.toModifier()
                .width(140.px)
                .height(130.px)
                .borderRadius(30.px),
            src = Res.Image.LOGO,
            description = "Logo Image",
        )

    }
}

@Composable
fun RightSide() {
    Row(
        modifier = Modifier
            .fillMaxWidth(80.percent)
            .borderRadius(r = 50.px)
            .background(Theme.LightGray.rgb)
            .padding(all = 20.px),
        horizontalArrangement = Arrangement.End
    ) {
        Section.values().take(6).forEach { section ->
            Link(
                modifier = NavigationItemStyle.toModifier()
                    .padding(right = 30.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Normal)
                    .textDecorationLine(TextDecorationLine.None),
                path = section.path,
                text = section.title
            )

        }
    }
}
