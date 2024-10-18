package com.carlosvega.learnJava.fitnessProject;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

//maneja el proceso de adicionar y eliminar miembros
public class MembershipManagement {
    final private Scanner input = new Scanner(System.in);
    LinkedList<Member> memberLinkedList = new LinkedList<>();
    final private int multiClubValue = 4;

    private int getIntInput(){
        int choice = 0;
        while (choice == 0){
            try{
                choice = input.nextInt();
                input.nextLine();
                if (choice == 0){
                    //arrojar exception
                    throw new InputMismatchException();
                }else {
                    //para que el usuario escoja un valor valido para escojer club
                    choice = validChoiceclub(choice);
                }
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println("ERROR: INVALID INPUT. Please try again");
            }
        }
        return choice;

    }
    //el usuario seleccione un valor valido dentro de las opciones
    private int validChoiceclub (int choice){
        while (choice < 1 || choice > 4){
            System.out.println("Invalid number\n" +
                    "Enter a new valid: ");
            choice = input.nextInt();
            input.nextLine();
        }
        return choice;
    }

    private void printClubOptions(){
        System.out.println("1) Club Mercury\n" +
                "2) Club Neptune\n" +
                "3) Club Jupiter\n" +
                "4) Multi Clubs\n");
    }
    public int getChoice(){
        System.out.println("WELCOME TO OZONE FITNESS CENTER\n" +
                "=============================================\n" +
                "1) Add member\n" +
                "2) Remove member\n" +
                "3) Display member Information\n" +
                "4) Quit\n" +
                "Please select an option" );
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
    private int setMemberID(LinkedList<Member> m){
        if (m.size() > 0){
            return m.getLast().getMemberId() + 1;
        }else {
            return 1;
        }
    }
    public String addMembers(LinkedList<Member> memberList){
        String memShipName;
        int memShipclub;
        String mem;
        double memShipfees;
        int memShipMemberId;
        Member mbr;
        Calculator<Integer> memShipNameCal; //estamos declarando una referencia de la interfaz

        System.out.println("Insert name: ");
        memShipName = input.nextLine();
        printClubOptions();
        System.out.println("Please enter club id");
        memShipclub = getIntInput();
        memShipMemberId = setMemberID(memberList);
        //calcular valor memShipNameCal
        //en caso el valor ingresado sea cualquiera menos la opcion multiclub
        if(memShipclub != multiClubValue){
            //n seria el valor del argumento que reemplaza el parametro definido en la interfaz
            memShipNameCal = (n)->{
                return switch (n){
                    case 1 ->
                }

            };
            //mbr = new SingleClubMember(memShipMemberId,memShipMemberId,memShipName,);
        //si se escogio multiclub
        }else{
            //mbr = new MultiClubMember(memShipMemberId,memShipMemberId,memShipName,);
        }


        return memberList.toString();
    }
    public void removeMembers(){

    }
    public void quitProgram(){

    }

    public void showMemberInfo(){

    }
}
