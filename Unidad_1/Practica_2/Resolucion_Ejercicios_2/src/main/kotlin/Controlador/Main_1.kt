package Controlador
import Clases.CuentaBancaria

fun main(args: Array<String>) {
    println("Hello World!")
    var cuenta = CuentaBancaria(230.0,300.5)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}