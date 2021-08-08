package Week1.Day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Prime Number :");
		Scanner s= new Scanner(System.in);
		String iPrimeNo = s.nextLine();
		
		
		int input= Integer.parseInt(iPrimeNo);
		boolean isPrimeNo = true;
		for (int i = 2; i < (input/2); i++) {
			
			if (input % i == 0) {
				isPrimeNo=false;
				break;
			} 
			
		}
		
		if (isPrimeNo==true) {
			System.out.println("The Given Number - " + input +" is a Prime Number");			
		}
		else
			System.out.println("The Given Number - " + input +" is not a Prime Number");
		
	}

}
