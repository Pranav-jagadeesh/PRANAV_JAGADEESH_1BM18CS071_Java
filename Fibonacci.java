
import java.util.Scanner;

class Fibonacci
{  
public static void main(String args[])  
{    
 int n1=1,n2=1,n3=0,i,n;    
    
 System.out.print("Enter the nth value to print the fibonacci sequence\n ");
 Scanner in = new Scanner(System.in);
 n = in.nextInt();
 if(n==1 || n==2)
 {
	 System.out.print(" "+n1); 
 }
 else
 {
 for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;       
  n1=n2;    
  n2=n3;    
 }   
 System.out.print(" "+n3); 
 }
  
}}  
