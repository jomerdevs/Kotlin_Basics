
fun main(args: Array<String>){
    /*
        ---- TIPOS DE DATOS ----

         String    => cadena de caracteres   | Int     => enteros
         Char      => caracter               | Float   => decimales punto flotante (4 bytes)
         Boolean   => true o false           | Double  => decimales con mayor espacio reservado en memoria (8 bytes)
         Byte => (1 byte) almacenar 1 dígito | Long    => entero de 64bits guarda mayor espacio en memoria que Int

        Al delcarar las variables también podemos asignarle tipado, es decir, el tipo de dato del que será la variable
        utilizando (nombre de la variable: tipo de dato)
    */

    var activo: Boolean = true // boolean
    var cadena: String = "Texto de cadena" // string
    var caracter: Char = 'A' // char
    var num: Byte = 5 // byte
    var entero: Int = 20655 // int
    var decimal: Float = 25.78f // al declarar variables float hay que especificar al final con una f que será float
    var doble: Double = 25.78 // al declarar una variable double no hay que especificar nada al final
    var largo: Long = 2480000000 // long

    println("Dato boolean: $activo")
    println("Dato string: $cadena")
    println("Dato char: $caracter")
    println("Dato byte: $num")
    println("Dato int: $entero")
    println("Dato float: $decimal")
    println("Dato double: $doble")
    println("Dato long: $largo")

}