package basics;
import java.util.*;
import java.math.*;

public class Roundoff
{

	public static void main(String[] args)
	{

Scanner s=new Scanner(System.in);
System.out.println("Enter a float value");
float f=s.nextFloat();
System.out.printf("%f",Math.round(f));
System.out.printf("%f",Math.ceil(f));
System.out.printf("%f",Math.floor(f));
	}

}
