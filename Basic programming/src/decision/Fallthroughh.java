package decision;

import java.util.Scanner;

public class Fallthroughh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("\nENTER THE MONTH");
		int a=s.nextInt();
		switch(a)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("30 days");
			break;
		case 1:
		case 7:
		case 8:
		case 3:
		case 5:
		case 12:
			System.out.println("31 days");
			break;
		case 2:
			
			System.out.println("29 0r 28 days");
			break;
			default:
				System.out.println("NOT MATCHED");
		}
	}

}
