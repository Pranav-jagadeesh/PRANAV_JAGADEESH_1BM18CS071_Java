
/*PRANAV_JAGADEESH_1BM18CS071
program  to calculate final marks of n students
*/

---------------------------------------------------------------------------------------------------------------------------------------
/*within package cie */
/* class student */

package package_CIE;

import java.util.Scanner;

public class Student {

	public int usn;
	public String name;
	public int sem;
	
	public Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Details: usn, name and sem");
		usn = sc.nextInt();
		name = sc.next();
		sem = sc.nextInt();
	}

}

----------------------------------------------------------------------------------------------------------------------------------------

/*within package cie */
/* class internals*/

package package_CIE;

import java.util.Scanner;

public class Internals {

	public float IntMarks[] = new float[5]  ;
	
	public Internals()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five courses internals marks:");
		for(int i=0; i<5; i++)	
			IntMarks[i] = sc.nextFloat();
	}

}
----------------------------------------------------------------------------------------------------------------------------------------
/* within package SEE
  class external */

package package_SEE;

import java.util.Scanner;

public class External extends package_CIE.Student
{

	public float SeeMarks[] = new float[5];
	
	public External()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five courses externals marks:");
		for(int i=0; i<5; i++)	
			SeeMarks[i] = sc.nextFloat();
	}

}

---------------------------------------------------------------------------------------------------------------------------------------
/*file that declares the final marks of n students in all five courses.*/

package basic_programs;
import java.util.Scanner;
import package_CIE.*;
import package_SEE.*;
public class Test1 {

	  float finalMarks[] = new float[5]  ;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = sc.nextInt();
		
		Student stu[] = new Student[20];
		for(int i=0;i<n;i++)
		{
		stu[i]=new Student();
		}
		
		Internals inter[] = new Internals[20];
		for(int i=0;i<n;i++)
		{
		inter[i]=new Internals();
		}
		
		External exter[] = new External[20];
		for(int i=0;i<n;i++)
		{
		exter[i]=new External();
		}
		
		Test1 obj[] = new Test1[20];
		for(int i=0;i<n;i++)
		{
			obj[i]=new Test1();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<5;j++)
			{
			obj[i].finalMarks[j] = inter[i].IntMarks[j] + exter[i].SeeMarks[j];
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Final Marks of Student"+(i+1)+":");
			for(int j=0;j<5;j++)
			{
			System.out.println(obj[i].finalMarks[j]);
			}
		}
	}

}

----------------------------------------------------------------------------------------------------------------------------------------

























