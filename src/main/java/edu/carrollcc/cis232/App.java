package edu.carrollcc.cis232;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String name = "";
    	Scanner keyboard = new Scanner(System.in);
    	
    	//Asks for name, and assigns input to name variable
    	System.out.print("Enter your name: ");
    	name = keyboard.nextLine();
    	
    	//Displays final output
        System.out.println("Hello " + name + "!");
        
        //Close used resources
        keyboard.close();
    }
}
