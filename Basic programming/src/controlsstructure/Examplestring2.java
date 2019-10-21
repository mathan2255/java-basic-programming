package controlsstructure;

import java.util.Scanner;

public class Examplestring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
	String str;
		
		System.out.println("ENTER DATE");
		
		 str=s.next();
			
		
		
	
	String	st="" +s.charAt(3)+s.charAt(4);
	
	switch(st)
	{
	case "01":
		System.out.print("JANUARY");
		break;
	case "02":
		System.out.println("fEBRUARY");
		break;
	case "03":
		System.out.print("MARCH");
		break;
	case "04":
		System.out.println("APRIL");
		break;
	case "05":
		System.out.print("MAY");
		break;
	case "06":
		System.out.println("JUNE");
		break;
	case "07":
		System.out.print("JULY");
		break;
	case "08":
		System.out.println("AUGUST");
		break;
	case "09":
		System.out.print("SEPTEMBER");
		break;
	case "10":
		System.out.println("OCTOBER");
		break;
	case "11":
		System.out.print("NOVEMBER");
		break;
    case "12":
		System.out.println("DECEMBER");
		break;
		default:
			System.out.println("WRONG SELECTION");
	}




	}
	}


