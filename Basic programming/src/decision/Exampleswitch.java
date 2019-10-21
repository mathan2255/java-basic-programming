package decision;

import java.util.Scanner;

public class Exampleswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
System.out.println("1)Withdraw \n2)balance \n3)pin");
int a=s.nextInt();
switch(a)
{
case 1:
	System.out.println("1)SAVINGS \n2)CURRENT \n3)JOINT)");
	int b=s.nextInt();
	switch(b)
	{
	case 1:
		System.out.println("SAVINGS ACCOUNT");
		break;
	case 2:
		System.out.println("CURRENT ACCOUNT");
		break;
	case 3:
		System.out.println("JOINT ACCOUNT");
		break;
		
		default:
			System.out.println("PLEASE ENTER CORRECT KEYWORD");
	}
	break;
case 2:
	System.out.println("SELECT THE ACCOUNT\n1)SAVINGS \\n2)CURRENT \\n3)JOINT");
     int c=s.nextInt();
      switch(c)
      {
      case 1:
      System.out.println("BALANCE AMOUNT SAVINGS");
      break;
      case 2:
    	  System.out.println("BALANCE AMOUNT CURRENT");
    	  break;
      case 3:
    	  System.out.println("BALANCE AMOUNT JOINT");
    	  break;
    	  default:
    		  System.out.println("PLEASE ENTER CORRECT KEYWORD");
      }
      break;
case 3:
	System.out.println("SELECT THE ACCOUNT\n1)PIN CHANGE \\n2)GENERATE PIN \\n3)FORGOT PIN");
     int d=s.nextInt();
      switch(d)
      {
      case 1:
      System.out.println("PIN CHANGED SUCCESSFULLY");
      break;
      case 2:
    	  System.out.println("ENTER OTP");
    	  break;
      case 3:
    	  System.out.println("ENTER MOBILE NUMBER");
    	  break;
    	  default:
    		  System.out.println("PLEASE ENTER CORRECT KEYWORD");
      }
      break;
      default:
		  System.out.println("PLEASE ENTER CORRECT KEYWORD");
    	  
}
}
	}


