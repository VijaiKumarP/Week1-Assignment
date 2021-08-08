package Week1.Day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number :");
		Scanner s= new Scanner(System.in);
		String iFActNo = s.nextLine();
		int iRes=1;
		String iResTxt="";
		
		int input= Integer.parseInt(iFActNo);
		
		for (int i = input; i >=1; i--) {
			iRes=iRes * i;
			if(i!=1) 
				iResTxt=iResTxt + i +"*";
			else
				iResTxt=iResTxt + i;
		}
		
		System.out.println("Factorial value of the given number - " +input +" is:");
		System.out.println(iResTxt + " = " + iRes);
	}

}
