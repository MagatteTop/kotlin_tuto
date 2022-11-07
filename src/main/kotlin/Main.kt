//import tuto4.Carre
//import tuto4.Cercle
//import tuto5.Chien
//import java.lang.NumberFormatException
/**lheritage
 *
 */
//fun main() {
////    val cercle =  Cercle()
////    cercle.dessiner()
////    cercle.colorer()
////
////    val carre =  Carre("vert")
////    carre.dessiner()
////    carre.colorer()
//
//    val chien = Chien()
//    // chien.presentation()
//
/** les exceptions
 *
 */
//    val a: Double = 10.0
//    val b: Double = 20.0
//
//
//    try {
//        //le code declencheur de lexception
//       // println("entrer une valeur b=")
//       // val b = readLine()?.toInt()
//        val c =diviser(a, b)
//        println("result de $a/$b = $c")
//    } catch (e: ArithmeticException) {
//        //le code a executersi ya exeption
//        println(e.message)
//    } catch (e: NumberFormatException) {
//        //le code a executersi ya exeption
//        println("b doit etre un entier  valide")
//    } finally {
//        println("executer par defaut")
//    }
//
//}
//
//fun diviser(a: Double, b: Double) : Double {
//    if (b == 0.0) {
//        throw ArithmeticException("division par zero  impossible !")
//    }
//    if (a <= b) {
//        throw ArithmeticException("b doit etre inferieur a a")
//    } else
//    return  a/b
//
//}
/**les exceptions
 * personnalisees
 */
//fun main() {
//    println("ton age ? ")
//    val age = readLine()?.toInt()
//    try {
//        verifierAg(age!!)
//        println("Bienvenue dans notre plateforme !!!!")
//
//    } catch (e: AgeException) {
//        println(e.message)
//    }
//}
//
//fun verifierAg(age: Int) {
//    if (age <= 12) {
//        throw AgeException("trop jeune pour acceder a ce site")
//    }
//}
/**les
 * tableaux
 */
//fun main(){
//    var monTab= Array(5){0}
//    // autrement var montab=Array<Int>(5){0}
//
//    //tab avec initialisation
//    var montabMixee= arrayOf("aaa",20.5,"dd",12,true)
//    var montab2= intArrayOf(10,54,78,56,45)
//
//    //tab avec initialisation boucle for
//
////    for (i in 0.. monTab.lastIndex){
////        println("entrer un nombre pour la case $i")
////        monTab[i] = readLine()?.toInt()!!
////    }
//    println("Affichage du  tableau  ")
//    //parcourt tab avec les index et les element a la fois
//    for ((index, element) in montabMixee.withIndex()){
//        println("case : [$index] => $element")
//    }
//}

/** les collection
 *1. imutable collection
 * les list=>listOf(), listOF<T>(), t peut etre de type Any
 * les map => mapOf(),
 * les set => setOf()
 **/
fun main() {
    //listOf contenue non modifiable
    var listNoms = listOf("magat", "lamine", "pape", 12.8, 75)
    println("-----------liste non mutable--------------->")
    for (elem in listNoms) {
        println(elem)
    }
    /**list mutable
     * mutableListOF ou ArrayList<String>
     */
    var listNomMutable = mutableListOf("cote", "sadio", "tobene", 12.8, 75)
    listNomMutable[2] = "rien"
    //ajouter un nouveau elem dans le tab
    listNomMutable.add("khady")
    listNomMutable.add(25)
    listNomMutable.add(45.78)
    //ajouter un elemen a un index precis
    listNomMutable.add(3, "encorree")
    //retirer index
    listNomMutable.removeAt(2)
    //retirer elem
    listNomMutable.remove(75)

    println("-----------liste  mutable--------------->")
    for (elem in listNomMutable) {
        println(elem)
    }
    println("la taille du tableau est ${listNomMutable.size}\n")
    //ajouter des eleme dun tab a un autre tab mutable avec addAll

    listNomMutable.addAll(0, listNoms)

    println("-----------nouvelle liste  fusionnees--------------->")
    for (elem in listNomMutable) {
        println(elem)
    }
    println("la taille finale du tableau est     ${listNomMutable.size}\n")
}