package org.dsm.unidad3

data class Event6(
    val title: String,
    val description: String? = null,
    val daypart: Daypart6,
    val durationInMinutes: Int,
)

enum class Daypart6 {
    MORNING,
    AFTERNOON,
    EVENING
}

fun main() {
    val event1 = Event6(title = "Wake up", description = "Time to get up", daypart = Daypart6.MORNING, durationInMinutes = 0)
    val event2 = Event6(title = "Eat breakfast", daypart = Daypart6.MORNING, durationInMinutes = 15)
    val event3 = Event6(title = "Learn about Kotlin", daypart = Daypart6.AFTERNOON, durationInMinutes = 30)
    val event4 = Event6(title = "Practice Compose", daypart = Daypart6.AFTERNOON, durationInMinutes = 60)
    val event5 = Event6(title = "Watch latest DevBytes video", daypart = Daypart6.AFTERNOON, durationInMinutes = 10)
    val event6 = Event6(title = "Check out latest Android Jetpack library", daypart = Daypart6.EVENING, durationInMinutes = 45)

    val events = mutableListOf<Event6>(event1, event2, event3, event4, event5, event6)

    println("Ultimo evento del dia: ${events.last().title}")

}