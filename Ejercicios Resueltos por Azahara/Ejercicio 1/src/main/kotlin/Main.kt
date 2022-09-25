import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
/*
Desarrollar un programa que muestre los servicios del sistema Bash:Linux >> free, mt, df, ps, fdisk.
como el dispositivo usado es Windows usaré otros comandos Power Shell
 */

    enviarUnProcesoPowerShel("powershell.exe Get-WmiObject -Class Win32_LogicalDisk ")

    enviarUnProcesoPowerShel("powershell.exe ls ")

    enviarUnProcesoPowerShel("powershell.exe ls .. ")

    enviarUnProcesoPowerShel("powershell.exe dir –r | select string ${"a"} ")


}

fun enviarUnProcesoPowerShel(c: String) {

    println("imprimienodo comando: $c")
    var comando = c
    val psp = Runtime.getRuntime().exec(comando)
    psp.outputStream.close()
    var lineaDeComando: String?
    val br = BufferedReader(InputStreamReader(psp.inputStream))
    while ( br.readLine().also { lineaDeComando = it } != null){ println(lineaDeComando)}
    br.close()


}
