import java.util.Scanner;
class Demo
{
public static void main(String[] args)
{
int a=8;
int b=3;
Calculator c=new Calculator();
c.add(a,b);
c.sub(a,b);
c.mul(a,b);
c.div(a,b);
c.modulo(a,b);
}  
}
class Calculator{
public void add(int a, int b)
{
int res=a+b;
System.out.println("the  sum=" +res);
}
public void sub(int a, int b)
{
int res=a-b;
System.out.println("the  sub=" +res);
}
public void mul(int a, int b)
{
int res=a*b;
System.out.println("the  mul=" +res);
}
public void div(int a, int b)
{
int res=a/b;
System.out.println("the  div=" +res);
}
public void mod(int a, int b)
{
int res=a%b;
System.out.println("the  mod=" +res);
}
}









