package code;

import java.util.Scanner;

public class MainGridCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int moves=10;
		int optionchoice=0;
		boolean flag;
		Scanner input = new Scanner(System.in);
		LinkedList grid = new LinkedList(8);
		grid.display();
		//intense gameplay here
		do {
			System.out.println("Moves remaining: "+moves);
			System.out.println("What number to change too");
			optionchoice = input.nextInt();
			flag = grid.flood(optionchoice);
			grid.display();
			moves--;
		}while(moves>0||flag==false);
		
		if(flag==true)
			System.out.println("Congratulations you won");
		else
			System.out.println("You sadly couldn't beat it");
		
	}

}
