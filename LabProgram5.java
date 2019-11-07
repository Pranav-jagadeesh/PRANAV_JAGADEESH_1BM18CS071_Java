package lab_Program_Finalised;
import java.util.Scanner;
class TIME
{
int hours;
int minutes;
int seconds;

TIME(int h,int m,int s)
{
hours = h;
minutes = m;
seconds = s;
}

void advance(int h,int m,int s)
{
seconds=seconds+s;
minutes=minutes+m+(seconds/60);
hours=hours+h+(minutes/60);
minutes=minutes%60;
seconds=seconds%60;
}

void currenttime(int h,int m,int s)
{
	hours = h;
	minutes = m;
	seconds = s;
}
String print()
{
return "Hours:" +hours+"\n"+"Minutes:"+minutes+"\n"+"Seconds:"+seconds;
}       

}


public class LabProgram5 {

public static void main(String[] args) {
int h,m,s;
Scanner sc = new Scanner(System.in);
TIME t1 = new TIME(3,40,30);
TIME t2 = new TIME(0,0,0);
System.out.println("Time initiated using constructor");
System.out.println(t1.print());

System.out.println("Enter Current hours , minutes and seconds \n");
h= sc.nextInt();
m= sc.nextInt();
s= sc.nextInt();
t2.currenttime(h, m, s);
System.out.println("Enter hours , minutes and seconds to advance Current Time\n");
h= sc.nextInt();
m= sc.nextInt();
s= sc.nextInt();
t2.advance(h,m,s);
System.out.println("hours , minutes and seconds after advanced time");
System.out.println(t2.print());

}

}