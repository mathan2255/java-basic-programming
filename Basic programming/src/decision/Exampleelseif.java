package decision;

import java.util.Scanner;

public class Exampleelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int a=s.nextInt();
		
		if(a%2==0)
		{
			System.out.println("number is Even");
			
		}
		else
			
			System.out.println("number is odd");
		
	}

}
