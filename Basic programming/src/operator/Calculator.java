package operator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER TWO NUMBERS");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("SUM OF TWO NUMBER IS:"+(a+b));
System.out.println("SUM OF TWO NUMBER IS:"+(a-b));
System.out.println("SUM OF TWO NUMBER IS:"+a/b);
System.out.println("SUM OF TWO NUMBER IS:"+a*b);

	}

}
