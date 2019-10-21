package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Array4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the SIZE of the array");
	int size=Integer.parseInt(br.readLine());
	int a[]=new int[size];
	//int temp;
	System.out.println("Enter the array elements");
	for(int i=0;i<size;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
Arrays.parallelSort(a);
System.out.println(a[size-2]);
	}

}
