package decision;

import java.util.Scanner;

public class Exampleifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("ENTER A NUMBER");
		int n=100;
		Scanner s=new Scanner(System.in);
				System.out.println("ENTER A NUMBER");
		int a=s.nextInt();
		
		if(a<n)
		{
			System.out.println("number is lessthan than 100");
			
		}
		else
			
			System.out.println("number is greater than 100");
			
		
	}

}
