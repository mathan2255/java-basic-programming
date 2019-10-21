package decision;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ram = 8;
		String brand = "HP";
		String hdsize = "2T";
		String gen = "9";
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE REQUIREMENTS LIKE BRAND,RAM,HDDSIZE,GENERATION");
		String s1 = s.next();
		int a = s.nextInt();
		String s2 = s.next();
		String s3 = s.next();
		if (s1.equals(brand) || s1.contentEquals("dell")) {
			if (a == ram) {
				if (s2.equals(hdsize)) {
					if (s3.contentEquals(gen)) {
						System.out.println("Confirm");
					} else {
						System.out.println("generation not avilable");

					}
				}
			}
		} else

			System.out.println("product is not available");

	}

}
