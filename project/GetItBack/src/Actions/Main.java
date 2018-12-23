package Actions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Get It Back Application");
		
		System.out.println("1 - login");
		System.out.println("2 - Sign up");
		Scanner Input = new Scanner(System.in);
		int userChoice = Integer.parseInt(Input.nextLine());
		if ( userChoice == 1){
			System.out.println("Enter your username");
			
			System.out.println("Enter your password");
		}
		if ( userChoice == 2){
			System.out.println("Enter your usernam");
		}
		
	}

}
