/*
ElizaChats is an online chat room that supports individuals that need emotional support.
Create an application that
1. Starts with a greeting message
2. Asks the user for their name, intakes the user name using Scanner class.
3. Prompts the user to tell Eliza how their day has been
4. Lastly prints all of the user's input at the end of the conversation.
*/

import java.util.Scanner;

public class ElizaChats {
    public static void main(String[] args) {

        //Setting up scanner named input for input
        Scanner input = new Scanner(System.in);

        //Declaring variables
        String name;
        String yourDay;
        String whyDay;

        //Prompting user and storing answers. Responding to users with answers

        System.out.println("Welcome to ElizaChats! My name is Eliza. What's your name?");
        name = input.nextLine();
        System.out.println("Nice to meet you, " + name + ". How has your day been?");
        yourDay = input.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that " + yourDay + "?");
        whyDay = input.nextLine();


        //Printing summary of all user inputs
        System.out.println("Okay. Well, it has been my pleasure to speak with you. Have a nice day!");
        System.out.println("Here are your responses: " + name + " " + yourDay + " " + whyDay );

    }
}








