package decision;

import java.util.Scanner;

public class Exampleifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pass1=000;
		int face1=1111;
		int finger1=2222;
		Scanner s=new Scanner(System.in);
		System.out.println("Security");
		int pass=s.nextInt();
		
		
		if(pass==pass1)
		{
			System.out.println("password is correct");
			
		}
		          else if(pass==face1)
		           {
			             System.out.println("open");
		             }
				  else if( pass==finger1)
				  {
					  System.out.println("open");
				  }
	    else
				  {
					  System.out.println("access not granted");
					}
		}
	}


