public class Archivador {


//Importamos clases que se usaran
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

    public int Escribir()
    {
       //Un texto cualquiera guardado en una variable
       String saludo="Hola";
       try
       {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo=new File("texto.txt");
            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
             FileWriter escribir=new FileWriter(archivo,true);
             //Escribimos en el archivo con el metodo write
             escribir.write(saludo);
             //Cerramos la conexion
             escribir.close();
       }
        //Si existe un problema al escribir cae aqui
        catch(Exception e)
        {
                System.out.println("Error al escribir");
        }
        return 0;
    }


    /*Clase que permite leer un archivo de texto*/

    public int Leer()
    {
        //Creamos un String que va a contener todo el texto del archivo
        String texto="";
        try
        {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector=new FileReader("texto.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((texto=contenido.readLine())!=null)
            {
                System.out.println(texto);
            }
        }
        //Si se causa un error al leer cae aqui
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
    }









}



