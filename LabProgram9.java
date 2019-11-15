/* PRANAV_JAGADEESH_1BM18CS071 
program to implement stack using interface*/

package basic_programs;


import java.io.*;
import java.util.Scanner;
interface Mystack
{
    public void pop();
    public void push();
    public void display();
}
class Stack implements Mystack
{
    final static int n=5;
    int stack[]=new int[n];
    int top=-1;
    public void push()
    {
        
        	Scanner sc = new Scanner(System.in);
            if(top==(n-1))
            {
                System.out.println(" Stack Overflow");
                return;
            }
            else
            {
                System.out.println("Enter the element");
                int ele=sc.nextInt();
                stack[++top]=ele;
            }
        
        
    }
    public void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return;
        }
        else
        {
            int popper=stack[top];
            top--;
            System.out.println("Popped element:" +popper);
        }
    }
 
    public void display()
    {
        if(top<0)
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
            String str=" ";
            for(int i=0; i<=top; i++)
                str=str+"  "+stack[i]+" <--";
            System.out.println("Elements are:"+str);
        }
    }
}


class LabProgram9
{
    public static void main(String arg[])
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Implementation of Stack using Array");
        Stack stk=new Stack();
        int ch=0;
        do
        {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit ");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:
                stk.push();
                break;
            case 2:
                stk.pop();
                break;
            case 3:
                stk.display();
                break;
            case 4:
            	System.out.println("You a choosed to exit the program !!!");
                System.exit(0);
                break;
            default : System.out.println("Wrong Choice !!!");
            }
        }
        while(ch<4);
        
    }
}

