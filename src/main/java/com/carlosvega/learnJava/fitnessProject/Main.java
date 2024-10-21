package com.carlosvega.learnJava.fitnessProject;


import java.util.InputMismatchException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String mem;
        MembershipManagement memMan = new MembershipManagement();
        FileHandler fh = new FileHandler();
        LinkedList<Member> members = fh.readFile();
        //
        int choice = 0;
        do {
            try{
                choice = memMan.getChoice();
                if (choice >= 1 && choice <= 4){
                    switch (choice){
                        case 1 -> {mem = memMan.addMember(members);
                                    fh.appendFile(mem);}
                        case 2 -> {memMan.removeMember(members);
                                    }
                        case 3 -> {memMan.showMemberInfo(members);}
                        case 4 -> memMan.quitProgram();
                    }

                }else {
                    System.out.println("Ingresa un numero dentro del rango especifico\n");
                }
            }catch (InputMismatchException e){
                System.out.println("Enter a valid option");
                memMan.getInput().next(); //usar getter del input y next() para evitar loop

            }
        }while (choice != 4);//no te dejare salir hasta que me escojas la opcion de salir

    }
}
