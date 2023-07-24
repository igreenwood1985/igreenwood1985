package org.example.view;

import org.example.view.Destinations;

public class Main {

    // The Main class should control the workflow of the app but shouldn't perform any other work


    public static void main(String[] args) {

        //Class Datatype Variables
        PromptMenu messagePrompt = new PromptMenu();
        PromptMenu userChoices = new PromptMenu();
        PromptMenu getUserChoice = new PromptMenu();
        Destinations destination = new Destinations();


        // Java Datatype Variables
        String choiceCommand = "";




        // ********* Beginning of Program Execution Code **********

        //Display Application Title
        messagePrompt.showWelcomeMessage();
        // Show the user their options and prompt them for their input
        userChoices.showOptions();

        // Get the User's choice Input
        choiceCommand = getUserChoice.getUserCommand();
        System.out.println("");


        // If statements to call user selection
        if(choiceCommand.equals("1")){

            // Manila
            destination.adventureManila();
        }
        if(choiceCommand.equals("2")){

            // Singapore
            messagePrompt.unavailableNotice();
        }
        if(choiceCommand.equals("3")){

            // Kuala Lumpur
            messagePrompt.unavailableNotice();
        }
        if(choiceCommand.equals("4")){

            // Tokyo
            messagePrompt.unavailableNotice();
        }
        if(choiceCommand.equals("5")){

            // Taipei
            messagePrompt.unavailableNotice();
        }
        if(choiceCommand.equals("6")){

            // Bangkok
            messagePrompt.unavailableNotice();
        }
        if(choiceCommand.equals("7")){

            // Hanoi
            messagePrompt.unavailableNotice();
        }
        if(choiceCommand.equals("8")){

            // Siem Reap
            messagePrompt.unavailableNotice();
        }
        if(choiceCommand.equals("9")){

            // Bali
            messagePrompt.unavailableNotice();
        }
        if(choiceCommand.equals("0")){

            // Make Your Own
            messagePrompt.unavailableNotice();
        }

    }
}