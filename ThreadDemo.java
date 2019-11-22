package basic_programs;

class A extends Thread
{
 public void run()
 {
 try
 {
 for(int i=1;i<=10;i++)
{
 sleep(10000);
System.out.println("BMS College of Engineering");
 }
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}
class B extends Thread
{
 public void run()
 {
 try
 {
 for(int j=1;j<=10;j++)
 {
 sleep(2000);
System.out.println("CSE");
 }
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}

public class ThreadDemo
{
 public static void main(String args[])
 {
 A a1=new A();
 B b1=new B();
 a1.start();
 b1.start();
 }
}
