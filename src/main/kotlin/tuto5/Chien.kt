package tuto5

class Chien : Animal {
    override var crie: String = "Aboie"
    override var deplacer: String = "en marchant avec mes 4 pattes"

    override fun presentation() {
        println("je suis un chien")
        seDeplacer()
        crieer()

    }

    override fun seDeplacer() {
        println("je me deplace => $deplacer")
    }

    override fun crieer() {
        println("je => $crie")
    }


}