package controlsstructure;
import java.io.*;
public class Armstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE NUMBER");
		int n=Integer.parseInt(br.readLine());
		int b=n;
		int c=n;
		int count=0;double sum=0;
		while(c!=0)
		{
			count++;
			c=c/10;
		}
		while(n!=0)
		{
		int r=n%10;
		sum=sum+Math.pow(r, count);
		n=n/10;
			
		}
		if(sum==b)
		{
		System.out.println(b+ "IS ARMSTRONG");	
		}
		else
		{
			System.out.println(b+ "IS NOT ARMSTRONG");
		}
	}

}
