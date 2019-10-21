package controlsstructure;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		for(int j=0;j<10;j++)
		{
		System.out.println("ENTER A NUMBER");
		int n=s.nextInt();
		int num=n,r;
		int f,sum=0;
		
		while(n!=0)
		{
			f=1;
			r=n%10;
		for(int i=1;i<=r;i++)
		{
		 f=f*i;
		 }
		sum=sum+f;
		n=n/10;
		}
	if(sum==num)
	{
		System.out.println("STRONG NUMBER");
	}
	else
	{
		System.out.println(" NOT A STRONG NUMBER");	
	}
		
	}
	}
}
