/*Develop a Java program to create a class Bank that maintains two kinds of account for its customers, one called savings account and
the other current account.

The savings account provides compound interest and withdrawal facilities but no cheque book facility.
The current account provides cheque book facility but no interest.

Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is
imposed.
*/
	
import java.io.*;
import java.util.Scanner;
class Account
{

String name,Acc_type;
int account_num;



Account(int accNum, String nm)
{
account_num=accNum;
name=nm;

}

}

class Savingac extends Account
{
double balance=0.0;
Savingac(int accNum, String nm, double bal)
{
super(accNum,nm);
System.out.println("Saving account doesn't provide cheque book facility ");
balance=bal;
}

public void withdraw(double wamt)
{
	double bal;
if (balance>=wamt)
{	
bal=balance-wamt;
System.out.println("Account Holder Balance :"+bal);
}
else
	System.out.println("Insufficient Funds !!!");
}

public void compoundInterest()
{
	double pr, rate, t,com;
	System.out.println("Enter details to find Compound Interest\n");
    Scanner sc=new Scanner (System. in);
    pr=balance;
    System. out. println("Enter the No.of years:");
    t=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
    System.out. println("Compound Interest="+com);
}


}

class Currentac extends Account
{
double minBal = 10000;
double balance=0.0;
Currentac(int accNum, String nm, double bal)
{
super(accNum,nm);
System.out.println("Current account provide cheque book facility ");
balance=bal;
}

public void withdraw(double wamt)
{
	double bal;
bal=balance-wamt;
if (balance>=wamt)
{	

System.out.println("After withdraw -->> Account Holder Balance :"+bal);
}
else
	System.out.println("Insufficient Funds !!!");

if(bal < minBal)
{
	double penalty;
	System.out.println("\n\nYour Balance has gone down and so penalty is calculated");
    //Bank policy is to charge 20% on total difference of balAmt and min_bal to be maintain
    penalty=((minBal - bal)*20)/100;
    bal= bal-penalty;
    System.out.println("Now your balance revels : "+bal+"\n\n\n");
}

}




}


public class Bank {

public static void main(String[] args)throws IOException {

Scanner sc = new Scanner(System.in);

System.out.println("Enter Account Number :");
int acno=sc.nextInt();

System.out.println("Enter Account Holder Name :");
String acnm=sc.next();

System.out.println("Enter Account Holder Balance :");
double acbl=sc.nextDouble();

boolean b =true;
while(b)
{
int choice;
System.out.println("Enter your choice \n1.Savings Account \n2.Current Account");
choice = sc.nextInt();
switch(choice)
{
case 1:
{
Savingac sac=new Savingac(acno,acnm,acbl);
System.out.println("Enter Withdrawal amount of savings account:");
double sacw=sc.nextDouble();
sac.withdraw(sacw);
sac.compoundInterest();
break;
}


case 2:
{
Currentac cac=new Currentac(acno,acnm,acbl);
System.out.println("Be careful while withdrawing amount in current account\n");
System.out.println("Maintain minimum balance of 10000\n");
System.out.println("Bank policy is to charge 20% on total difference of balAmt and min_bal to be maintain");
System.out.println("Enter Withdrawal amount of currrent account:");
double cacw=sc.nextDouble();
cac.withdraw(cacw);
}
default:
	java.lang.System.exit(0);
}
}
}
}
