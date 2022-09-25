import java.io.File
import java.nio.file.Files
import java.nio.file.Files.exists
import java.nio.file.Path
import java.nio.file.Paths
import java.util.*



fun main(args: Array<String>) {
    //cojemos el directorio donde esta nuestro jar
    var path = System.getProperty("user.dir")+
            File.separator + ".idea"+
            File.separator + "jar"+
            File.separator + "consoleApp.jar"
    //creamos el comando a ejecutar
    var comando = "java -jar $path 6"

    //creamos proceso
     var proceso = Runtime.getRuntime().exec(comando)
     proceso.waitFor()
     proceso.destroy()







/*
Subprograma del jar

  var tiempo : Int? = args[0].toIntOrNull()
    if(tiempo!=null){
        for(i in 0 until tiempo!!){
            var pathOriginal = System.getProperty("user.dir") +
                    File.separator + ".idea" +
                    File.separator + "textoOriginal"+
                    File.separator + "texto.txt"
            var pathCopy = System.getProperty("user.dir") +
                    File.separator + ".idea" +
                    File.separator + "textoCopy" +
                    File.separator + "textoNumero${i}"
            if(Files.exists(Path.of(pathOriginal))){
                println("el fichero $pathOriginal exixte")
                Files.copy(Path.of(pathOriginal),Path.of( pathCopy))
                Thread.sleep(10000)
            }else{
                println("el fichero $pathOriginal no exixte")
            }

        }
    }
 */

}
