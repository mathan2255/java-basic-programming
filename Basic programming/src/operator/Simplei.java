package operator;

import java.util.Scanner;

public class Simplei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE PRICIPAL AMOUNT,RATE OF INTEREST AND NO> OF YEARS");
		int a=s.nextInt();
		int n=s.nextInt();
		float r=s.nextFloat() ;
		float si=(a*n*r)/100;
		
		System.out.println("PRINCIPALAMOUNT IS:"+a);
		System.out.println("NUMBER OF YEARS IS:"+n);
		System.out.println("RATE OF INTEREST IS :"+r);
		System.out.println("INTEREST AMOUNT IS:"+si);
	}

}
