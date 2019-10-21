package operator;

import java.util.Scanner;

public class Line {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER X1,y1 and X2,Y2");
		int x1=s.nextInt();
		int y1=s.nextInt();
		int x2=s.nextInt();
		int y2=s.nextInt();
		float a=(x1+x2)/2;
		float b=(y1+y2)/2;
		System.out.println("x1="+x1);
		System.out.println("y1="+y1);
		System.out.println("x2="+x2);
		System.out.println("y2="+y2);
		System.out.printf(" Midpoint of the line (x1 y1) (x2 y2) is (%.02f,%.02f)",a,b);
		
		
	}

}
