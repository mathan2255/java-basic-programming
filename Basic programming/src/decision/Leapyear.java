package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leapyear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE YEAR");
	int y=Integer.parseInt(br.readLine());
	if(y%4==0)
	{
		System.out.println(y+ " is a leap year");
	}
	else
	{
		System.out.println(y+ " is not a leap year");
	}
	}
	

}
