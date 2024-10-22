package com.carlosvega.learnJava.fitnessProject;

import java.io.*;
import java.util.LinkedList;

public class FileHandler {

    //methods
    public LinkedList<Member> readFile(){

        LinkedList<Member> m = new LinkedList<>();
        String readLine;
        String[] splitLine;
        Member member;
        //try/catch no se pueden usar en una clase misma, a menos que sea una clase main con String args, o dentro de un metodo
        try(BufferedReader reader = new BufferedReader(new FileReader("members.csv"))){
            readLine = reader.readLine();
            while (readLine != null){
                splitLine = readLine.split(", ");
                if (splitLine[0].equals("s")){
                    member = new SingleClubMember('S', Integer.parseInt(splitLine[1]),
                            splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                }else {
                    member = new MultiClubMember('M', Integer.parseInt(splitLine[1]),
                            splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                }
                m.add(member);
                readLine = reader.readLine();
            }
        }catch (IOException e){
            System.out.println("Problemas para leer el archivo: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Problema no identificado: " + e.getMessage());
        }
        return m;
    }

    public void appendFile(String member){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("members.csv", true))) {
            writer.write(member +"\n");
        }catch (IOException e){
            System.out.println("Problemas para agregar info al archivo: " + e.getMessage());
        }
    }

    public void overWriteFile(LinkedList<Member> mList){
        String s;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("members.temp", false))) {
            for (int i = 0; i < mList.size(); i++) {
                s = mList.get(i).toString();
                writer.write(s +"\n"); //escribir
            }
        }catch (IOException e){
            System.out.println("Problemas para sobreescribir el archivo: " + e.getMessage());
        }
        try {
            File f = new File("members.csv");
            File tf = new File("members.temp");
            f.delete();
            tf.renameTo(f);

        }catch (Exception e){
            System.out.println("Problemas reemplazar el archivo temporal con el original: " + e.getMessage());
        }
    }
}
