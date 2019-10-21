package controlsstructure;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		for(int j=0;j<10;j++)
		{
		System.out.println("ENTER THE NUMBERS");
		int a=s.nextInt();
		int b=s.nextInt();
		
		
		int gcd=0,lcm=0;
		int min=(a>b)? b:a;
		int max=(a>b)? a:b;
								
			
		for(int i=min;i>0;i--)
		{
			if(a%i==0 && b%i==0)
			{
			 gcd=i;
		     break;
			}
			
		}
		System.out.println("HCF IS "+gcd);
		
			for(int i=max;i<=(a*b);i++)
			{
				if(i%a==0 && i%b==0)
				{
				 lcm=i;
			     break;
				}
				}
			System.out.println("LCM IS "+lcm);
			
		}
		s.close();
}
}
