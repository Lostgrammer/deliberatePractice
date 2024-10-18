package com.carlosvega.learnJava.fitnessProject;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

//maneja el proceso de adicionar y eliminar miembros
public class MembershipManagement {
    final private Scanner input = new Scanner(System.in);

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
        if (!m.isEmpty()){
            return m.getLast().getMemberId() + 1;
        }else {
            return 1;
        }
    }
    public String addMembers(LinkedList<Member> memberList){
        int multiClubValue = 4; // se coloca aca porque solo se usara en este metodo
        String memShipName;
        int memShipClub;
        String mem;
        double memShipFees;
        int memShipMemberId;
        Member mbr;
        Calculator<Integer> memShipNameCal; //estamos declarando una referencia de la interfaz, solo se aceptaran valores integer

        System.out.println("Insert name: ");
        memShipName = input.nextLine();
        printClubOptions();
        System.out.println("Please enter club id");
        memShipClub = getIntInput();
        memShipMemberId = setMemberID(memberList);
        //calcular valor memShipNameCal
        //en caso el valor ingresado sea cualquiera menos la opcion multiclub

        if(memShipClub != multiClubValue){
            //n seria el valor del argumento que reemplaza el parametro definido en la interfaz
            memShipNameCal = (n)->{
                return switch (n){
                    case 1 -> 900;
                    case 2 -> 950;
                    case 3 -> 1000;
                    default -> 1;
                };
            };
            memShipFees = memShipNameCal.calculateFees(memShipClub);//implementando la funcion lambda para calcular el valor que generara memShipNameCal y se le asginara a memShipFees
            mbr = new SingleClubMember('S',memShipMemberId,memShipName, memShipFees, memShipClub);
            System.out.println("Single Club Member added");
        //si se escogio multiclub
        }else{
            memShipNameCal = (n)-> {
                return switch (n){
                    case 4 -> 1200;
                    default -> -1;
                };
            };
            memShipFees = memShipNameCal.calculateFees(memShipClub);
            mbr = new MultiClubMember('M',memShipMemberId,memShipName, memShipFees, 100);
            System.out.println("Multi Club Member added");
        }
        mem = mbr.toString();
        return mem;
    }
    public void removeMember(LinkedList<Member> m){
        int memberId = 0;
        System.out.println("Enter member id you want to remove");
        memberId = input.nextInt();
        input.nextLine();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberId() == memberId){
                m.remove(i);
                System.out.println("The user has been deleted");
                return;
            }
        }
        System.out.println("There is no user with id" + memberId);
    }
    public void quitProgram(){
        System.out.println("Tnank you for use my program");
    }

    public void showMemberInfo(LinkedList<Member> m){
        int memberId = 0;
        System.out.println("Enter member id you want to see info");
        memberId = input.nextInt();
        input.nextLine();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberId() == memberId){
                String[] memberInfo = m.get(i).toString().split(", ");
                System.out.println(memberInfo);
                return;
            }
        }
        System.out.println("There is no user with id" + memberId);
    }
}
