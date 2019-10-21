package controlsstructure;

import java.util.Scanner;

public class Examplestringg {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE SIZE ARRAY");
		int a=s.nextInt();
		String st[]=new String[a];
		System.out.println("ENTER ELEMENTS");
		for(int j=0;j<a;j++)
		{
			 st[j]=s.next();
			
		}
		for(int j=0;j<a;j++)
		{
				c=st[j].charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println(st[j]);
		}
		}
		s.close();
	}
}
