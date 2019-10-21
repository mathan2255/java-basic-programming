package operator;
import java.util.Scanner;
public class Swapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS");
		int a=s.nextInt();
		int b=s.nextInt();
		int t;
		System.out.println("BEFORE SWAPPING");
		System.out.println("a="+a);
		System.out.println("b="+b);
		t=a;
		a=b;
		b=t;
		System.out.println("AFTER SWAPPING");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
