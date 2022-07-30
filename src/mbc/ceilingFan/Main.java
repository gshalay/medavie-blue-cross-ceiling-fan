package mbc.ceilingFan;

import java.util.Scanner;

/**
 * Main - The main class of the program.
 * @author Greg Shalay
 *
 */
public class Main {
	
	/**
	 * main --- The main program loop. 
	 * @param args - The array of command-line arguments.
	 */
	public static void main(String[] args) {
		boolean wantsExit = false;
		Fan ceilingFan = new Fan();
		System.out.println("Welcome to a Celing Fan simulation program :)");
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			try {
				System.out.println("\n\n");
				ceilingFan.printState();
				
				System.out.println("What would you like to do? (Enter number next to the option you want to choose)");
				System.out.println("1. Pull first cord  (Increase fan speed)");
				System.out.println("2. Pull second cord (Reverse fan rotation)");
				System.out.println("3. Exit Application");
				
				String input = scanner.nextLine();
				
				switch(input) {
					case "1":
						ceilingFan.incrementSpeed();
						break;
					case "2":
						ceilingFan.reverseRotation();
						break;
					case "3":
						wantsExit = true;
						break;
					default:
						System.err.println("Error: Invalid response detected! Reprompting...");
						Thread.sleep(1500);
						break;
				
				}
				
			}
			catch(Exception ex) {
				System.out.println("An Excecption has occurred!");
				ex.printStackTrace();
			}
		} while(!wantsExit);
		
		if(scanner != null) {
			scanner.close();
		}
		
		System.out.println("Program Terminated.");
	}

}
