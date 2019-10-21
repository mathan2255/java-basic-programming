package decision;

import java.util.Scanner;

public class Exampleelseifladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		Scanner s=new Scanner(System.in);
				System.out.println("ENTER THE TOTAL MARKS");
		int a=s.nextInt();
		
		if(a<=n&&a>90)
		{
			System.out.println("VERY EXCELLENT");
			
		}
		else if(a<=90&&a>=70)
			
			System.out.println("Excellent");
		else if(a<70&&a>50)
		{
			System.out.println("Average");
		}
		
		else
			System.out.println("BHooloka tholvi");
	}

}
