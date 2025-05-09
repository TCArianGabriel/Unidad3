package org.dsm.unidad3

data class Event2(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

fun main() {
    val instancia = Event2(
        "Estudiar Kotlin",
        "Compremeterse a estudiar Kotlin al menos 15 minutos al dia.",
        Daypart.EVENING,
        15
    )

    println(instancia)
}