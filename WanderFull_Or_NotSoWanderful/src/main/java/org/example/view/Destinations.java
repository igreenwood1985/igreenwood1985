package org.example.view;

import java.util.Locale;
import java.util.Scanner;
import org.example.view.PromptMenu;

public class Destinations {
    // This class contains all of the different scenarios for destinations that are hard-coded into the program,
    // to be called as methods in the class "Main"

    // Variable Declarations

    int tourNumber;
    Scanner sc = new Scanner(System.in);
    String choice;

    boolean isAtAirport = true;
    boolean noWay;
    boolean isDayTwo = true;

    PromptMenu promptMessage = new PromptMenu();

    //Class Constructor
    public Destinations(){

    }



    // Currently the only partially complete storyline
    public void adventureManila() {
        System.out.println("You have landed in Manila!");
        System.out.println(" ");
        System.out.println("You have exited the terminal at Nino-Acquinoy Inernational Airport");
        System.out.println(" ");

        while (isAtAirport == true) {


            System.out.println("You see a taxi.");
            System.out.println("The driver wants 2100 pesos to take you to your hotel");
            System.out.print("Do you agree to the fare (y/n)? ");
            choice = sc.nextLine();

            if (choice.toLowerCase().equals("y")) {
                System.out.println("You got to your hotel, but the bellhop tells you that you were scammed.");
                System.out.println("Your bellhop tells you to download Grab, the local equivalent to Uber.");
                System.out.println("When you see that you could have gotten to your hotel for less than 300 pesos,");
                System.out.println("your heart literally stops. LITERALLY... YOU NEED TO WATCH YOUR CHOLESTEROL!");
                System.out.println("You wake up 3 days later in intensive care at the nearest hospital. You find out that the bill");
                System.out.println("is 150,000 pesos, but you only planned to stay in Manila for a few days and brought 50,000.");
                System.out.println("The Money is gone anyway. Someone at the scene of your collapse took a liking to your valuables.");
                System.out.println("Your wallet, all of its contents, your smart-phone, and all of your luggage are nowhere to be found.");
                System.out.println("The hospital holds you until you can pay the bill, which you can't, so they keep holding you.");
                System.out.println("You are charged and additional 30,000 pesos per day. Eventually they discharge you to the police.");
                System.out.println("You are allowed a phone call home. Your very frustrated uncle cleans out his bank-account");
                System.out.println("to pay all the bills that you owe.");
                System.out.println("Having made a monkey's-uncle of your uncle, you now have to catch the overpriced flight he was forced to buy for you, ");
                System.out.println("and now you have to go home and prostrate yourself before him in front of the relatives you normally avoid.");
                System.out.println(" ");
                System.out.println("GAME OVER");

                System.exit(0);

            } else {
                System.out.println(" ");
                System.out.println("You see an ad for Grab, the local equivalent of Uber, and download it.");
                System.out.println("When you look at the booking options to your hotel, you see a ride for 300 pesos.");
                System.out.print("Do you wish to book the ride (y/n)?");
                choice = sc.nextLine();

                if (choice.toLowerCase().equals("y")) {
                    System.out.println(" ");
                    System.out.println("You arrive at the Savoy Hotel of Manila. It is truly a high-class experience and you are impressed ");
                    System.out.println("That the nightly-rate is only about as high as you might expect from a roach-infested motel in the USA.");
                    System.out.println("It also turns out to have an awesome but super-cheap breakfast-buffet");
                    System.out.println("You start the next day out rested and refreshed. Now it is time to decide what to do with your day...");
                    System.out.println(" ");
                    isAtAirport = false;
                } else {
                    isAtAirport = true;
                }


            }
        }

            tourNumber = 0;
            while (isDayTwo == true) {

                System.out.print("Where would you like to explore?");
                System.out.println(" ");

                System.out.println("1) The Intramuros - 500-year-old Historic Walled City, center of former colonial governments with classic Spanish architecture.");
                System.out.println("2) SM Mall of Asia - The world's 4th largest shopping mall.");
                System.out.println("3) Manila Chinatown - The world's oldest Chinatown.");
                System.out.println("4) Manila Ocean Park.");
                System.out.println("5) Divisoria Public Market - a colossal flea market where most of the locals shop.");
                System.out.println(" ");

                if (tourNumber < 2) {
                    System.out.println(" ");
                    System.out.print("Please enter your choice: ");
                    choice = sc.nextLine();
                    tourNumber++;
                } else {
                    System.out.println(" ");
                    System.out.println("Opps, it's already the end of the day! It will have to wait until tomorrow.");
                    isDayTwo = false;
                }


                if (choice.equals("1")) {
                    System.out.println("You are off to the Intramuros!");
                    System.out.println(" ");
                    System.out.println("You cling to dear life as your Grab driver swerves through Manila traffic, which is ");
                    System.out.println("the most psychotic thing you have ever seen, aside perhaps from your aunt's rescue cat.");
                    System.out.println("The sheer volume of motorcycles, tricycles, jeepneys, cars and utiity vehicles");
                    System.out.println("all trying to push each-other out of the way both nauseats you and makes you wonder if this ");
                    System.out.println("place even has traffic laws. just as you are about to lose your final nerve and vomit from ");
                    System.out.println("the dizzying array of motion and close-calls, you arrive at the Intramuros.");
                    System.out.println(" ");

                    System.out.println("You step out of the Grab in front of the Minor Basilica and Metropolitan Cathedral of the Immaculate Conception,");
                    System.out.println("also known as the Manila Cathedral.");
                    System.out.println("Not 30 seconds passes and a man driving a pedal-coach offers to be your tour-guide.");
                    System.out.println("He is a little too outgoing but seems to know his way around. He offers to be your guide for ");
                    System.out.println("700 pesos.");
                    System.out.print("Will you hire him (y/n)");
                    choice = sc.nextLine();

                    if (choice.toLowerCase().equals("y")) {
                        System.out.println("The fellow does indeed seem to know his way around and does a pretty good job of showing ");
                        System.out.println("you all of the highlights of the old walled-city. You see the oldest Cathedral in the Philippines, ");
                        System.out.println("Rizal park, the Japanese occupation government's headquarters, General Douglass MacArthur's personal, ");
                        System.out.println("golf course, and innumerable other sites. You lose track of time as you are taking it all in and, ");
                        System.out.println("before you know it, the tour took 3 hours.");
                        System.out.println("You tell the tour-guide you are finished and he says you owe him 4200 pesos.");
                        System.out.println("You are flabbergasted, and remind him that he said upfront it was 700 pesos for the tour.");
                        System.out.println("He says 'NO! It is 700 pesos for every 30 minutes.' After you ague with him, he says he will be ");
                        System.out.println("generous and give you a discount. He says you have to pay him 2100 pesos.");
                        System.out.println(" ");
                        System.out.println("What will you do?");
                        System.out.println(" ");
                        System.out.println("1) Give him 700 pesos");
                        System.out.println("2) Give him what he is asking?");
                        System.out.println(" ");
                        System.out.println("Please select your choice: ");

                        choice = sc.nextLine();

                        if (choice.equals("1")) {
                            System.out.println("You get into a long, loud argument with the guy and he threatens to kill you.");
                            System.out.println("You brush off the threat and start walking back towards your hotel. As you claw ");
                            System.out.println("your way through narrow alleys, aggressive street hustlers and psychotic traffic, ");
                            System.out.println("the previously winsome and charming tour-guide becomes a relentless beast, ");
                            System.out.println("following you the entire way and hurling a greater array of more creative and disgusting");
                            System.out.println("curses than you have ever heard in your life before now, as passers-by look on with morbid expressions ");
                            System.out.println("on their faces. He follows you straight up to the front-door of your hotel, where you finally get ");
                            System.out.println("him off your back as the security guard stops him.");
                            System.out.println(" ");
                            System.out.println("After hiding in your hotel for the rest of the day and night, you start a new day. After breakfast ");
                            System.out.println("at that awesome breakfast buffet, you step out of the front door of the hotel to hail a Grab.");
                            System.out.println("Within 2 minutes you hear a too-familiar voice coming your way.");
                            System.out.println("The maniac tour-guide is still here!");
                            System.out.println(" ");
                            System.out.println("You run back to your hotel, dodging a couple stones he throws at you along the way, and he turns around");
                            System.out.println("and runs off after the security guard runs out of the front door to chase him.");
                            System.out.println("You realize that you made a crazy friend yesterday and now you need to get away.");
                            System.out.println("This trip has cost you enough, so you don't buy a new plane ticket");
                            System.out.println("You hide in your hotel for a few more days");
                            System.out.println("On the final day, you step outside with your luggage and hail a Grab.");
                            System.out.println("Your crazy friend is there, and he is making a beeline for you just as the Grab arrives.");
                            System.out.println(" ");
                            System.out.println("You hurl yourself into the car with your luggage and the driver hits the gas as the maniac is ");
                            System.out.println("pounding on the car windows. You are away! You make it to the airport!");
                            System.out.println("But your vacation was wasted hiding from your new fan.");
                            System.out.println(" ");
                            System.out.println("GAME OVER");

                            System.exit(0);
                        } else {
                            System.out.println("Well... you know you got scammed, but you probably also avoided a lot of additional problems.");
                            System.out.println("The security guard confirms that it was wise to pay the man when you get back to the hotel and chat with him.");
                            System.out.println("He then talks about how other guests had been harassed by an extremely maniacal beggar who often played as a tour-guide");
                            System.out.println("at the Intramuros, You are in no mood to go back out, so you stay in for the rest of the night. Better to avoid more trouble...");
                            System.out.println("Tomorrow will be a new day...");

                            isDayTwo = false;
                        }
                    } else {

                        // This is the one successful outcome that exists for now.
                        System.out.println("Getting around the Intramuros by yourself goes a bit slowly. It takes you several hours");
                        System.out.println("However you manage to google enough information on your smartphone to make it work.");
                        System.out.println("You go into the Manila Cathedral first, because it is right there in front of you.");
                        System.out.println("After capturing some of the stunning Basilica outwork and statuary, you head to other sites.");
                        System.out.println("You see Rizal park, and read about the legacy of Jose Rizal, the first martyr of the");
                        System.out.println("Philippine Revolution for Independence from Spain. You find the US Governor-General's headquarters");
                        System.out.println("and walk upon General Douglass MacArthur's personal golf course and imagine him coming out to golf,");
                        System.out.println("every day at about the time you happen to be there now.");
                        System.out.println("You see the bullet holes in the sides of the fortifications, the signs of battles thar were fought long-ago,");
                        System.out.println("and the weight of the history behind this place starts to hit you.");
                        System.out.println("After taking it all in, you decide it is time to leave so that you can process all of it.");
                        System.out.println("You walk back to the Manila Cathedral and you hail a Grab.");

                        // Temporary end code until more of the story is fleshed out in the future.
                        System.out.println(" ");
                        System.out.println("To be continued...");
                        System.out.println(" ");
                        System.out.println("Thanks for playing!");

                        System.exit(0);
                    }
                    System.out.println("Would you like to explore somewhere else (y/n)? ");
                    choice = sc.nextLine();


                    if (choice.toLowerCase().equals("y")) {
                        isDayTwo = true;
                    } else {
                        isDayTwo = false;
                    }
                } else if (choice.equals("2")) {
                    // SM Mall of Asia storyline
                    promptMessage.unavailableNotice();
                    System.exit(0);

                    System.out.println("SM Mall of Asia, here we come!");
                    System.out.println(" ");
                    System.out.println("Would you like to explore somewhere else (y/n)? ");
                    choice = sc.nextLine();


                    if (choice.toLowerCase().equals("y")) {
                        isDayTwo = true;
                    } else {
                        isDayTwo = false;
                    }
                } else if (choice.equals("3")) {
                    // Manila Chinatown storyline
                    promptMessage.unavailableNotice();
                    System.exit(0);

                    System.out.println("Time for some awesome Chinese street food!");
                    System.out.println(" ");
                    System.out.println("Would you like to explore somewhere else (y/n)? ");
                    choice = sc.nextLine();


                    if (choice.toLowerCase().equals("y")) {
                        isDayTwo = true;
                    } else {
                        isDayTwo = false;
                    }
                } else if (choice.equals("4")) {
                    //Manila Ocean-park Storyline
                    promptMessage.unavailableNotice();
                    System.exit(0);

                    System.out.println("Great! Let's see some of the local sea-life!");
                    System.out.println(" ");
                    System.out.println("Would you like to explore somewhere else (y/n)? ");
                    choice = sc.nextLine();


                    if (choice.toLowerCase().equals("y")) {
                        isDayTwo = true;
                    } else {
                        isDayTwo = false;
                    }
                } else if (choice.equals("5")) {
                    // Public Market storyline
                    promptMessage.unavailableNotice();
                    System.exit(0);

                    System.out.println("Time to find some awesome deals!");
                    System.out.println(" ");
                    System.out.println("Would you like to explore somewhere else (y/n)? ");
                    choice = sc.nextLine();


                    if (choice.toLowerCase().equals("y")) {
                        isDayTwo = true;
                    } else {
                        isDayTwo = false;
                    }
                }


            }

    }



    public void adventureSingapore(){
        // Singapore storyline
        promptMessage.unavailableNotice();
        System.exit(0);

        System.out.println("You have landed in Singapore!");
    }

    public void adventureKualaLumpur(){
        // Kuala Lumpur storyline
        promptMessage.unavailableNotice();
        System.exit(0);

        System.out.println("You chose Kuala Lumpur!");
    }

    public void adventureTokyo(){
        // Tokyo storyline

        promptMessage.unavailableNotice();
        System.exit(0);

        System.out.println("You chose Tokyo!");
    }

    public void adventureTaipei(){
        // Taipei storyline

        promptMessage.unavailableNotice();
        System.exit(0);

        System.out.println("You chose Taipei!");
    }

    public void adventureBangkok(){
        // Bangkok storyline

        promptMessage.unavailableNotice();
        System.exit(0);

        System.out.println("You chose Bangkok!");
    }

    public void adventureHanoi(){
        // Hanoi storyline
        promptMessage.unavailableNotice();
        System.exit(0);

        System.out.println("You chose Hanoi!");
    }

    public void adventureSiemReap(){
        //Siem Reap Angkor-Wat story line
        promptMessage.unavailableNotice();
        System.exit(0);

        System.out.println("You chose Siem Reap!");
    }

    public void adventureBali(){
        // Bali storyline
        promptMessage.unavailableNotice();
        System.exit(0);

        System.out.println("You chose Bali!");
    }

}

