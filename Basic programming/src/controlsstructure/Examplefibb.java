package controlsstructure;

public class Examplefibb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
System.out.printf("%d %d",a,b);
for(int i=0;i<10;i++)
{
	int c=a+b;
	System.out.printf(" %d ",c);
	a=b;
	b=c;
}
	}

}
