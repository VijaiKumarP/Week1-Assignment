package Week1.Day1;

import java.util.Scanner; 

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Armstrong Number :");
		Scanner s= new Scanner(System.in);
		String iArmstrongNo = s.nextLine();
		
		
		int input= Integer.parseInt(iArmstrongNo);
		int iResult = 0;
		int iResTemp=1;
		int iTemp=0;
		int iQuotient;
			
		String sResultTxt ="";
			iQuotient=input;
			
			while (iQuotient!=0) {
				iTemp=iQuotient%10;
				iQuotient=iQuotient/10;
		
				if(iQuotient!=0) {
					sResultTxt= sResultTxt + "(" + iTemp +"*" + iTemp + "*" +iTemp +")" + "+";
				}
				else {
					sResultTxt= sResultTxt + "(" + iTemp +"*" + iTemp + "*" +iTemp +")";
					
				}
				
				
				for (int i = 1; i < 4; i++) {
					iResTemp=iResTemp*iTemp;
					
				}
				
				iResult=iResult+iResTemp;
				iResTemp=1;
			}
			
			if(iResult==input) {
				System.out.println("The Given No is Armstrong No:");
				System.out.println(sResultTxt + " = " + iResult );
			}
			else {
				System.out.println("The Given No is not Armstrong No:");
				System.out.println(sResultTxt + " = " + iResult );				
			}

	}

}
