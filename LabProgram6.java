/*PRANAV_JAGADEESH_1BM18CS071*/

package lab_Program_Finalised;

abstract class Shape
{  
 int l =5,b= 6;
 abstract void printArea();  
}  
  
class Rectangle extends Shape
{  
 void printArea()
 {
  System.out.print("area of rectangle:");
  System.out.println(l*b);
 }  
}  

class Triangle extends Shape
{  
 void printArea()
 {
  System.out.print("area of triangle:");
  System.out.println(0.5*l*b);
 }  
} 


class Circle1 extends Shape
{  
 void printArea()
 {
  System.out.print("area of circle:");
  System.out.println(3.14*l*l);
 }  
}  
  
class LabProgram6
{  
 public static void main(String args[])
 {  
  Circle1 c=new Circle1(); 
  Triangle t=new Triangle();
  Rectangle r=new Rectangle();
  c.printArea(); 
  t.printArea(); 
  r.printArea(); 
 }   
}  
