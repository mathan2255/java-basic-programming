package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the SIZE of the array");
	int size=Integer.parseInt(br.readLine());
	int a[]=new int[size];
	int temp;
	System.out.println("Enter the array elements");
	for(int i=0;i<size;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		}
		System.out.println(a[i]);
	}
	System.out.print("second largest number is:");	
	System.out.print(a[size-2]);
	}
	
	}
	


