package operator;
import java.util.Scanner;
public class Aptitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int a=s.nextInt();
		int b,c,d,e;
		b=a%10;
		c=a/10;
		d=b*c;
		e=c*c;
		System.out.printf("%d%d",d,e);
		
		
	}

}
