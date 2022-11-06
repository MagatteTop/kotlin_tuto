abstract class Personne(
    var nom: String,
    var prenom: String,
    var age: Int

) {

    //les fonctions abstract âs de corps car sera redefini loes  heriter
    abstract fun afficherInfo()
}