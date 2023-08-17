import java.util.Scanner;

class Arithmetic
{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter an integer=");
int a=scan.nextInt();
System.out.println("enter another integer=");
int b=scan.nextInt();
Calculator c=new Calculator();
c.add(a,b);
c.sub(a,b);
c.mul(a,b);
c.div(a,b);
c.mod(a,b);
}
}

 class Calculator
{
 void  add(int a,int b) 
{ 
System.out.println(a+b);
}

void  sub(int a,int b)
 {
System.out.println(a-b);
}
void  mul(int a,int b)
 {
System.out.println(a*b);
}

void  div(int a,int b)
 {
System.out.println(a/b);
}

void  mod(int a,int b) 
{
System.out.println(a%b);
}
}
 









