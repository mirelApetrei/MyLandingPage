package com.mirel.apetrei.models

enum class Section(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Home",
        subtitle = "",
        path = "#home"
    ),
    About(
        id = "about",
        title = "About Me",
        subtitle = "Why Choose Me?",
        path = "#about"
    ),
    Services(
        id = "services",
        title = "Services",
        subtitle = "I'm good at",
        path = "#services"
    ),
    Portfolio(
        id = "portfolio",
        title = "Portfolio",
        subtitle = "My Works",
        path = "#portfolio"
    ),
    Experience(
        id = "experience",
        title = "Experience",
        subtitle = "My Journey",
        path = "#experience"
    ),
    Contact(
        id = "contact",
        title = "Contact",
        subtitle = "Get in Touch",
        path = "#contact"
    ),
    Testimonials(
        id = "testimonials",
        title = "Testimonials",
        subtitle = "What they say",
        path = "#testimonials"
    ),
    Achievements(
        id = "achievements",
        title = "Achievements",
        subtitle = "My Achievements",
        path = "#achievements"
    ),

}