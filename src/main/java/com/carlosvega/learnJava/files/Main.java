package com.carlosvega.learnJava.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"))){
            line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
