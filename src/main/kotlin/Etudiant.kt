class Etudiant(
    nom: String, prenom: String, age: Int, var moy: Double
) : Personne(nom, prenom, age) {

    //lesfonctions
    override fun afficherInfo() {
        println("-----------liste etudiant ------")
        afficherInfo()
        println("moyenne: $moy")
    }

}
