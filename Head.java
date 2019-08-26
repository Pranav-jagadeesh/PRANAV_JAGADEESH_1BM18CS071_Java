
/*Develop a Java program to create a class Student with members usn, 
 * name, an array credits and an array marks. Include methods to accept 
 * and display details and a method to calculate SGPA of a student.
 */
import java.util.*;
class student
{
String usn;
String name;
int credits[]=new int[10];
int marks[]=new int[10];
float sgpa=0;
int num;

public void read_data()
{
 int c,d;
 Scanner s=new Scanner(System.in);
 System.out.println("enter usn,name,no of subjects");
 usn=s.next();
 name=s.next();
 num=s.nextInt();
 System.out.println(" enter credits of subjects");

  for(c=0;c<num;c++)
  {
   credits[c]=s.nextInt();
  }
  System.out.println(" enter Marks of subjects");

  for(d=0;d<num;d++)
  {
   marks[d]=s.nextInt();
  }
 }

 public void display()
{
 int c,d;
 System.out.println("usn:"+usn);
 System.out.println("name:"+name);
 for(c=0;c<num;c++)
 {
  System.out.println("credits of "+(c+1)+" :"+credits[c]);
 }
  for(d=0;d<num;d++)
  {
   System.out.println("Maks of " +(d+1)+ " subject:"+marks[d]);
  }
   System.out.println("SGPA:" +sgpa);
 }

 public void cal_sgpa()
 {
  
  int i,j;
  int sum=0;
  int score=0; 
  int credit=0;
  for(i=0;i<num;i++)
  {
	
   sum=sum+credits[i];
   if(marks[i]>90 && marks[i]<=100)
   score=10;
   else if(marks[i]>80 && marks[i]<=90)
   score=9;
   else if(marks[i]>70 && marks [i]<=80)
   score=8;
   else if(marks[i]>60 && marks[i]<=70)
   score=7;
   else if(marks[i]>50 && marks[i]<=60)
   score=6;
   else if(marks[i]>40 && marks[i]<=50)
   score=5;
   else score=0;
   
   
  }
  

  for(j=0;j<num;j++)
  {
  credit = credits[j]+credit;
   sgpa=(credit*score)/sum;
  }
}
}
class Head
{
public static void main(String args[])
{
student t=new student();
t.read_data();
t.cal_sgpa();
t.display();
}
}



