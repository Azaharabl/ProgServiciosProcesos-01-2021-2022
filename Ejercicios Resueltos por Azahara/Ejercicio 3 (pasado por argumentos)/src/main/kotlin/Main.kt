import java.io.*
import java.util.*


fun main(args: Array<String>) {

 //cojemos el directorio donde esta nuestro jar
    var path = System.getProperty("user.dir")+
            File.separator + ".idea"+
            File.separator + "jar"+
            File.separator + "consoleApp.jar"
    //creamos el comando a ejecutar
    var comando = "java -jar $path"

    //creamos proceso
     var proceso = Runtime.getRuntime().exec(comando)

    // enviamos al proceso texto como "se la metemos" es output

    val out: OutputStream = proceso.outputStream
    val pw = PrintWriter(OutputStreamWriter(out))
    pw.println("5")
    pw.close()
    

    proceso.waitFor()
    proceso.destroy()

    }



