package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arraysum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the SIZE of the array");
	int a=Integer.parseInt(br.readLine());
	int b[]=new int[a];
	int c[]=new int[a];
	System.out.println("ENTER THE ELEMENTS");
	for(int i=0;i<a;i++)
	{
	b[i]=Integer.parseInt(br.readLine());
	}
	for(int i=0;i<a;i++)
	{
	c[i]=Integer.parseInt(br.readLine());	
	}
	
	for(int i=0;i<a;i++)
	{
	System.out.println(b[i]+c[i]);	
	}

}
}