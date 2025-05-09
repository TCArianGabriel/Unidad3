package org.dsm.unidad3

data class Event7(
    val title: String,
    val description: String? = null,
    val daypart: Daypart7,
    val durationInMinutes: Int,
)

val Event7.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "corto"
    } else {
        "largo"
    }

enum class Daypart7 {
    MORNING,
    AFTERNOON,
    EVENING
}

fun main() {
    val event1 = Event7(title = "Wake up", description = "Time to get up", daypart = Daypart7.MORNING, durationInMinutes = 0)
    val event2 = Event7(title = "Eat breakfast", daypart = Daypart7.MORNING, durationInMinutes = 15)
    val event3 = Event7(title = "Learn about Kotlin", daypart = Daypart7.AFTERNOON, durationInMinutes = 30)
    val event4 = Event7(title = "Practice Compose", daypart = Daypart7.AFTERNOON, durationInMinutes = 60)
    val event5 = Event7(title = "Watch latest DevBytes video", daypart = Daypart7.AFTERNOON, durationInMinutes = 10)
    val event6 = Event7(title = "Check out latest Android Jetpack library", daypart = Daypart7.EVENING, durationInMinutes = 45)

    val events = mutableListOf<Event7>(event1, event2, event3, event4, event5, event6)

    println("Duracion del primer evento del dia: ${events[0].durationOfEvent}")

}