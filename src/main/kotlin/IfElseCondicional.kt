

/*
--- ES BUENO CONOCER LOS OPERADORES RELACIONALES ANTES DE VER LAS SENTENCIAS CONDICIONALES ---
    ______________________________
   |OPERADOR        SIGNIFICADO   |
   |  >=            mayor o igual |
   |  >             mayor         |
   |  <=            menor o igual |
   |  <             menor         |
   |  ==            igual a       |
   |  !=            no igual      |
   |______________________________|
*/

fun main(args: Array<String>){

    var number = 2;

    // CONDICIONAL SIMPLE if
    if ( number > 100 ) {
        //si la condición se cumple entra a este bloque y ejecuta las instrucciones
        //si la condición no se cumple entonces no entra aquí y sigue el programa normal
        println("El número ingresado es mayor a 100")
    }

    // CONDICIONAL if-else
    if (number > 0) {
        //si la condición se cumple entra a este bloque y ejecuta las instrucciones
        println("El número ingresado es positivo")
    }
    else {
        //si la condición no se cumple entra automaticamente en el bloque del else y ejecuta las instrucciones que haya
        println("El número ingresado es negativo")
    }

/*----- EN LA CONDICION if - else DE ARRIBA HAY UN DEFECTO, Y ES QUE EL NUMERO PUEDE SER 0 Y NO ESTAMOS EVALUANDO ESO
	         SI INGRESARAN 0 EL PROGRAMA DE ARRIBA DIRIA QUE ES NEGATIVO Y 0 NO ES NEGATIVO, PARA ELLO USAREMOS
			 CONDICIONALES if MULTIPLES if-else if-else ----- */

    if (number > 0) {
        println("El número ingresado es positivo")
    }
    else if (number == 0) {
        //si no se cumple la condición anterior, entra a esta otra condició, la evalua y si se cumple ejecuta este bloque
        println("El número ingresado es 0")
    }else {
        //si ninguna de las condiciones de arriba se cumplen entra automaticamente en el bloque del else y ejecuta las instrucciones que haya
        println("El número ingresado es negativo")
    }
}
