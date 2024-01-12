package com.questions;

import java.util.Scanner;

public class BeerBottlesGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	       

	        int bottles = 21;
	        int userPick, compPick;

	        System.out.println("21 bottles");
	        System.out.print("Will you like to play first?: ");
	        String playFirst = scanner.nextLine();

	        while (bottles > 0) {
	            if (playFirst.equalsIgnoreCase("Yes")) {
	                System.out.print("Pick? ");
	                userPick = scanner.nextInt();

	                if (userPick < 1 || userPick > 4 || userPick > bottles) {
	                    System.out.println("Invalid");
	                    continue;
	                }

	                bottles -= userPick;
	                System.out.println("Bottles: " + bottles);

	                if (bottles == 0) {
	                    System.out.println("You picked last..you lose");
	                    break;
	                }

	                
	                compPick = 5 - userPick; 
	                System.out.println("Computer has picked " + compPick);
	                bottles -= compPick;
	                System.out.println("Bottles: " + bottles);
	            } else {
	              
	                compPick = 1 + 2; 
	                System.out.println("Computer has picked " + compPick);
	                bottles -= compPick;
	                System.out.println("Bottles: " + bottles);

	                playFirst = "Yes"; 
	            }
	        }

	       

	}

}
