/*  PRANAV_JAGADEESH_1BM18CS071  
exp10 a */


package demo;

import java.util.Scanner;
public class P10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 try{
			 System.out.println("Enter a Numerator:");
			 int Num1= Integer.parseInt(sc.next());  
             System.out.println("Enter a Denominator:");
             int Num2= Integer.parseInt(sc.next());  
             int ans = Num1/Num2;
             System.out.println("Answer "+ans);
             
         }
         catch(NumberFormatException e){
        	 System.out.println(" "+e);
         }
         catch(ArithmeticException e){
        	 System.out.println(" "+e);  
         }

	}

}
