class Enseignant(
    nom: String,
    prenom: String,
    age: Int,
    var salar: Int
) : Personne(nom, prenom, age) {

    override fun afficherInfo() {
        println("-----------liste ensegnant ------")

        //  super.afficherInfo()
        println("salire de base $salar")
    }
}