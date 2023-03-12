
/*
    BASIC ARITMETHIC OPERATIONS BETWEEN / OPERACIONES MATEMATICAS BASICAS
    |-- (OPERATOR / OPERADOR)      (OPERATION / OPERACION) --|
                +                     addition/suma
                -                     subtraction/resta
                *                     multiplication/multipicación
                /                     division/división
                %                     module/modulo
                =                     assignment/asignacion
                ++                    increment by 1/incremento en 1
                --                    decrement by 1/decremento en 1
                +=                    addition and assignment/suma y asignación
                -=                    substraction and assignment/resta y asignación
                *=                    multiplication and assignment/multiplicación y asignación
                /=                    division and assignment/división y asignación
*/
fun main(args: Array<String>){

    var number1: Int = 65
    var number2: Int = 15

    var suma: Int = number1 + number2 // =80
    var resta: Int = number1 - number2 // =50
    var multiplicacion: Int = number1 * number2 // =975
    var division: Int = number1 / number2 // =4 ...división entera, no muestra decimales
    var modulo: Int = number1 % number2 // =5

    // Pre incremento
    println(number1) // =65
    println(++number1) // =66

    // post incremento
    println(number2) // =15
    println(number2++) // imprime 15 pero aumenta en 1 luego
    println(number2) // =16 ya lo muestra incrementado

    // Pre decremento
    println(number1) // =66
    println(--number1) // =65

    // post decremento
    println(number2) // =16
    println(number2--) // imprime 16 pero disminuye en 1 luego
    println(number2) // =15 ya lo muestra decrementado
}