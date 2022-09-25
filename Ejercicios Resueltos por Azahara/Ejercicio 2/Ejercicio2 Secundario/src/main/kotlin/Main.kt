import kotlin.random.Random

fun main(args: Array<String> ) {
    println("Soy Aleatorio Jar")
    var n1 = args[0].toIntOrNull()
    var n2 = args[1].toIntOrNull()
    var infinito = 1
    println("los numero son $n1 y $n2")
    if(n1!=null && n2!=null){
        if (n1<=n2){
            println("numeros corrrectos")
            while (infinito==1){
                println(Random.nextInt(n1, n2))
            }
        }
        println("los  numeros no son correctos")
    }
}