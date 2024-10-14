package com.carlosvega.learnJava.files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        String line;
//        BufferedReader reader = null;
//        try{
//            /*
//            * =new FileReader("myfile.txt") => Creacion de un nuevo objeto tipo FileReader, colocamos
//            * el nombre del archivo como parametro del constructor de la clase FileReader
//            * =new BufferedReader =>creacion de un objeto de ese tipo, pasando el objeto FileReader
//            * como argumento, a esto nos referimo cuando lo envuelve*/
//            reader = new BufferedReader(new FileReader("myfile.txt"));
//            /*readLine(): metodo del BufferedReader que lee una linea del archivo hasta que encuentra un salto de linea*/
//            line = reader.readLine();
//            while (line != null){
//                System.out.println(line);
//                //reader.readLine() lee la siguiente linea
//                line = reader.readLine();
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }finally {
//            try {
//                if (reader != null){
//                    //siempre debes cerrar BufferedReader cuando ya no lo utilices
//                    reader.close();
//                    System.out.println("BufferedReader se ha apagado");
//                }
//            }catch (IOException e){
//                System.out.println(e.getMessage());
//            }
//        }
        //new way
//        String line;
//        try(BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"))){
//            line = reader.readLine();
//            while (line != null){
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        //writing
        String text = "no quiero";
        /*new FileWriter("myfile2.txt",true) => Pasamos 2 argumentos: la ruta del archivo y el valor true, indicando
        * que se agregara el contenido que se va a escribir a un archivo si este existirera,
        * en caso fuera false la informacion se sobreescribiria de existir el archivo*/
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("myfile2.txt",true))){
            writer.write(text);
            writer.newLine();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
