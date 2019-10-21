package basics;
import java.util.*;

public class Example {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ");
		char c=s.next().charAt(0);
		int n=s.nextInt();
		s.nextLine();
		String s1=s.nextLine();
		int n1=s.nextInt();
		System.out.printf("%-15s,%03d\n",c,n);
		System.out.printf("%-15s,%03d\n",s1,n1);
		

	}

}
