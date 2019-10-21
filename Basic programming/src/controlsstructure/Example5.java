package controlsstructure;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int c;
		int a=0;
		int m=0;
		int b=1;
		//System.out.printf("%d %d",a,b);
		for(int i=0;i<10;i++)
		{
			c=a+b;
			//System.out.printf(" %d ",c);
			if(c==n)
			{
				m++;
			
			}
			
			a=b;
			b=c;
		}
		if(m!=0)
		{
		
			System.out.print("yes");
		}
		else
			System.out.print("no");	
	}
	}


