package operator;

import java.util.Scanner;

public class Aptitude3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int a=s.nextInt();
		int b,c,d,e,f;
		b=a%10;
		c=a/100;
		d=b*b;
		e=b*c;
		f=d*e;
		System.out.printf("%d%d",d,e);
		System.out.println();
		System.out.println(f);
	}

}
