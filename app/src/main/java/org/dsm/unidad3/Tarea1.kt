package org.dsm.unidad3

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int,
)

fun main() {
    val instancia = Event(
        "Estudiar Kotlin",
        "Compremeterse a estudiar Kotlin al menos 15 minutos al dia.",
        "Noche",
        15
    )

    println(instancia)
}