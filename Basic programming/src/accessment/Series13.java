package accessment;

import java.util.Scanner;
class Series13
{
  public static void main(String args[])
  {
    Scanner s=new Scanner (System.in);
    int n=s.nextInt();
    int b[]=new int[n];
    int c[]=new int[n];
    int flag=0;
    int maxValue=0,maxCount=0,count=0;
    for(int i=0;i<n;i++)
    {
     b[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
         for(int j=0;j<n;j++) 
            {
                if(b[j] == b[i]){
                    ++count;
                  
            }
         }
    
            if(count>maxCount) 
            {
                maxCount = count;
              flag=1;}
             else{
               flag=0;
            }}
           if(flag==1) {  
        System.out.println("The mode of the array is none");}
      else
        System.out.println("The mode of the array is "+maxCount);
       
  } 
}