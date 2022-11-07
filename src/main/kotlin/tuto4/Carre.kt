package tuto4

class Carre(override var color: String) : Forme() {
    override fun dessiner() {
        println("dessiner carre")
    }

    override fun colorer() {
        println("de couleur $color ")
    }

}