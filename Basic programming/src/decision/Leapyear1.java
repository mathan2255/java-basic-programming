package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leapyear1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<10;i++) {
		System.out.println("ENTER THE YEAR");
	int y=Integer.parseInt(br.readLine());
		
	if(y%4==0)
	{
		if(y%100==0)
		{
		if(y%400==0)
		{
			System.out.println(y+ "  leap year");
		}
	      else
	     {
		System.out.println(y+ " is not a leap year");
	     }    
		}
	
		else
		{
			System.out.println(y+ " is a  leap year");	
		}}
		else
		{ 
			System.out.println(y+ " is a not leap year");
		}
		}
		}
		
	}
	

