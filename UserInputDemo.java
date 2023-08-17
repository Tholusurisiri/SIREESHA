import java.util.Scanner;
class UserInputDemo
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("enter a number=");
int a=scan.nextInt();
System.out.print("enter another number=");
int b=scan.nextInt();
int sum=a+b;
System.out.print("sum="+sum);
}
}
