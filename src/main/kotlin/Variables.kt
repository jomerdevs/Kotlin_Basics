
// ------ ZONA DE CONSTANTES -------
const val PI = 3.14

fun main(args: Array<String>){
    // Tipos de variables en Kotlin
    /*
        VALORES:
        SE USA LA PALABRA RESERVADA 'val'... EN LAS VARIABLES TIPO val LOS VALORES NO PUEDEN SER REASIGNADOS

        VARIABLE:
        SE USA LA PALABRA RESERVADA 'var'

        CONSTANTES:
        SE USA LA PALABRA RESERVADA 'const' SEGUIDA DEL TIPO 'val' LUEGO EL NOMBRE Y SU VALOR
        Y NO PUEDEN SER DECLARADAS EN AMBITO GLOBAL, HAY QUE DECLARARLAS EN AMBITO GLOBAL
    */

    val valor1 = "Valor usando 'val'";
    var nombre = "Jomer";

    println("El valor de la varible con var es: " + nombre + " y el valor de la variable con val es: " + valor1)
    println("El valor de la constante es: " + PI)
}