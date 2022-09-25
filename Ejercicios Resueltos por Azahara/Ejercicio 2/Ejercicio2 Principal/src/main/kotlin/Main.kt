import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader


fun main(args: Array<String>) {

    println("empezamos programa")
/*
    val pathDir = System.getProperty("user.dir") + File.separator + "programa" + File.separator
    //cambiar a parametros arg
    val jarFile = "consoleApp.jar 1 20"
    val orden = "java -jar $pathDir$jarFile"
    println(orden)
    */
    println(orden)

 */

    val psp = Runtime.getRuntime().exec(orden)
    psp.outputStream.close()
    var lineaDeComando: String?
    var arrayDeNumeros = ArrayList<String?>()
    Thread.sleep(1000)
    psp.destroy()
    val br = BufferedReader(InputStreamReader(psp.inputStream))
    while ( br.readLine().also { lineaDeComando = it } != null)
    { arrayDeNumeros.add(lineaDeComando)
        println()}
    br.close()
    println("Imprimimos numero que ha realizado nuestro programa Aleatorio y recojido por este : ")
    println(arrayDeNumeros)


}