
/*
        LA SENTENCIA CONDICIONAL when SE USA PARA EVALUAR UNA CONDICION Y
        PARTIENDO DE ELLA TOMAR VARIAS DECISIONES, ES SIMILAR AL switch-case
*/

fun main(args: Array<String>){

    var mes = 5;

    /*la sintaxis es la palabra when(condición) y luego las instrucciones según valores esperados
      y la palabra else en el caso de que ninguno de los casos se cumplan */
    when(mes){
        1 -> println("En Enero hay ofertas de hasta un 5% de ineterés fijo en préstamos hipotecarios")
        2, 3 -> println("En invierno no hay ofertas, excepto las de Enero en tasas para hipotecas")
        4, 5, 6 -> println("En primavera tenemos ofertas de préstamos personales a una tasa de 15%")
        7, 8, 9 -> println("En verano hay ofertas de préstamos de vehiculos de hasta un 13%")
        10, 11, 12 -> println("En otoño hay ofertas en inversiones con una tasa de interés de un 9%")
        else -> println("Mes incorrecto")
    }

}