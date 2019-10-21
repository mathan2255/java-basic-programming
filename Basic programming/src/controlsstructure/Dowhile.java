package controlsstructure;
import java.io.*;
public class Dowhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0,n;
		do
		{
		System.out.println("ENTER THE NUMBER");
		 n=Integer.parseInt(br.readLine());
		if(n>0)
			sum=sum+n;
		}
		while(n>0);
		System.out.println(sum);
		
		
	}

}
