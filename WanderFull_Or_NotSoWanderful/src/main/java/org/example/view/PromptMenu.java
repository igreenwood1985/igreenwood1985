package org.example.view;

import org.example.fileReader.LogFileWriter;


import java.util.Scanner;
public class PromptMenu {

    private static final Scanner in = new Scanner(System.in);
    private static final LogFileWriter logFileUpdateWriter = new LogFileWriter();



    // Class constructor
    public PromptMenu(){

    }



    public void showWelcomeMessage() {
        System.out.println("***************************");
        System.out.println("**       Wanderful       **");
        System.out.println("**       or not so       **");
        System.out.println("**       Wanderful       **");
        System.out.println("***************************");
        System.out.println();
    }

    public void showOptions(){
        System.out.println("Please choose where you want to wander: ");
        System.out.println("");
        System.out.println("1) Manila");
        System.out.println("2) Singapore");
        System.out.println("3) Kuala Lumpur");
        System.out.println("4) Tokyo");
        System.out.println("5) Taipei");
        System.out.println("6) Bangkok");
        System.out.println("7) Hanoi");
        System.out.println("8) Siem Reap");
        System.out.println("9) Bali");
        System.out.println("0) Choose your own! (You will need to enter a File Path)");
        System.out.println("");

    }

    public String getUserCommand(){
        System.out.print("Please choose the destination of your choice: ");
        String userCommand = in.nextLine();
        return userCommand;
    }

    public void unavailableNotice(){
        System.out.println("This option is not yet available, please select another option");
    }


}
