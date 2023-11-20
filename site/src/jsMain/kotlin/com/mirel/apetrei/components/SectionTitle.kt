package com.mirel.apetrei.components

import androidx.compose.runtime.Composable
import com.mirel.apetrei.models.Section
import com.mirel.apetrei.models.Theme
import com.mirel.apetrei.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionTitle(
    modifier: Modifier = Modifier,
    section: Section,
    alignment: Alignment.Horizontal = Alignment.Start,
) {
    Column(modifier = modifier, horizontalAlignment = alignment) {
        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(topBottom = 0.px)
                .textAlign(if (alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start)
                .fontFamily(FONT_FAMILY)
                .fontSize(26.px)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Primary.rgb)
                .toAttrs()
        ) {
            Text(section.title)
        }

        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(bottom = 10.px, top = 0.px)
                .textAlign(if (alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start)
                .fontFamily(FONT_FAMILY)
                .fontSize(40.px)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(section.subtitle)
        }

        Box(
            modifier = Modifier
                .height(2.px)
                .width(80.px)
                .backgroundColor(Theme.Primary.rgb)
                .borderRadius(r = 50.px)
        )
    }

}