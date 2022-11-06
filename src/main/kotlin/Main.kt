fun main(args: Array<String>) {
    var perso1: Personne = Personne("coundia", "lamine", 25, 145.0)
    perso1.afficherInfo()

    var perso2 = Personne("diop", "papa", 45)
    perso2.afficherInfo()
    var et1 = Etudiant("LAmine", "cnd", 32, 12.5)
    et1.afficherInfo()
    var ense1 = Enseignant("Farimaa", "cnd", 32, 12555555)
    ense1.afficherInfo()
}