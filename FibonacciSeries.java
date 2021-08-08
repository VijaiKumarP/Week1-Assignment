package Week1.Day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Armstrong Number :");
		Scanner s= new Scanner(System.in);
		String iArmstrongNo = s.nextLine();
		
		
		int input= Integer.parseInt(iArmstrongNo);
		int iResult =0;
		int iFstNo=0;
		int iScndNo=1;
		String iResTxt ="";
		for (int i = 0; i < input; i++) {
			iResTxt=iResTxt +" " + iFstNo;
			iResult=iFstNo + iScndNo;
			iFstNo=iScndNo;
			iScndNo= iResult;
		}
		System.out.println("The Fibonnacci Series of the Given no - " + input + " is:");
		System.out.println(iResTxt);
	}

}
