package tuto4

abstract class Forme {
    abstract var color: String

    init {
        color = "rouge"
    }

    abstract fun dessiner()
    abstract fun colorer()
}