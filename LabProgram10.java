/* program to check age exception 
PRANAV_JAGADEESH_1BM18CS071*/

package basic_programs;

import java.util.Scanner;

class WrongAge extends Exception
{
	public String toString()
	{
		return "Please enter the right age:";
	}
}
class Father
{
	int age;
	Father()
	{
		
	}
	Father(int age1)
	{
		age=age1;
		System.out.println("Father age:"+age);
	}
}
class Son extends Father
{
	Son(int age1)
	{
		
		System.out.println("Son age:"+age1);
	}
}
class LabProgram10
{
	public static void main(String args[]) throws WrongAge
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter father age:");
		int fage=sc.nextInt();
		if(fage<0)
		{
			throw new WrongAge();
		}
		else
		{
			Father f=new Father(fage);
			
		}
		
		System.out.println("Enter Son's age:");
		int sage=sc.nextInt();
		if(sage>=fage)
		{
			throw new WrongAge();
		}
		else
		{
			
			Son s=new Son(sage);
		}
	}
}


