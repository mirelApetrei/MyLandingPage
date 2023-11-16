package com.mirel.apetrei.models

import com.mirel.apetrei.util.Constants.ANDROID
import com.mirel.apetrei.util.Constants.ANDROID_STUDIO
import com.mirel.apetrei.util.Constants.DESIGN
import com.mirel.apetrei.util.Constants.GIT
import com.mirel.apetrei.util.Constants.WEB
import com.mirel.apetrei.util.Constants.XCODE
import com.mirel.apetrei.util.Constants.iOS
import com.mirel.apetrei.util.Res

enum class Service(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = ANDROID
    ),
    IOS(
        icon = Res.Icon.iOS,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description = iOS
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = WEB
    ),
    Design(
        icon = Res.Icon.design,
        imageDesc = "Figma Icon",
        title = "UX/UI Design",
        description = DESIGN
    ),
    XCode(
        icon = Res.Icon.xcode,
        imageDesc = "xcode Icon",
        title = "Xcode Playground",
        description = XCODE
    ),
    Android_Studio(
        icon = Res.Icon.androidStudio,
        imageDesc = "Android Icon",
        title = "Android Studio",
        description = ANDROID_STUDIO
    ),
    Git(
    icon = Res.Icon.git,
    imageDesc = "Git Icon",
    title = "Git Flow",
    description = GIT
    )
}