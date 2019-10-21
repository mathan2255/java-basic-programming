package string;

import java.util.Scanner;

public class Stringexample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
String st=s.nextLine();
int length=st.length();
char c=0;
int count=0;
for(int i=0;i<length;i++)
{
c=st.charAt(i);	

if(c=='E'||c=='O'||c=='A'||c=='I'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
count++;

for(int j=0;j<count;i++)
{
	System.out.print("*");
}
		System.out.print(c);
		
	System.out.print("L");
	for(int k=0;k<count;i++)
	{
		System.out.print("*");
		
	}}
else
	System.out.print(c);
		
}
	}
}

		
	

	


