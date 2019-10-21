package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the SIZE of the array");
	int size=Integer.parseInt(br.readLine());
	int a[]=new int[size];
	int sum=0,sum1=0;
	int b=0,c=0;
	float d,e;
	
	System.out.println("ENTER THE ELEMENTS");
	for(int i=0;i<size;i++)
	{
	a[i]=Integer.parseInt(br.readLine());
	}
	
	for(int i=0;i<size;i++)
	{
if(a[i]%2==0)
{

	System.out.println(a[i]);
	
	sum=sum+a[i];
	b++;
}}

for(int i=0;i<size;i++)	
{
	if(a[i]%2!=0)
	{
	System.out.println(+a[i]);
sum1=sum1+a[i];
c++;

	}
}
	
	
	e=sum/b;
	d=sum1/c;
	System.out.println("AVERAGE OFF EVEN "+e);
	System.out.println("AVERAGE OF ODD "+d);
	
	}

	}


