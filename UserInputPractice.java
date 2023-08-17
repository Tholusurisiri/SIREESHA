import java.util.Scanner;
class UserInputPractice
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("enter a number for addition=");
int a=scan.nextInt();
System.out.print("enter a number for addition=");
int b=scan.nextInt();
System.out.println(" addition="+(a+b));
System.out.print("enter a number for addition of real number=");
float c=scan.nextFloat();
System.out.print("enter a number for addition of real number=");
float d=scan.nextFloat();
System.out.println(" addition of real number="+(c+d));
System.out.print("enter your age=");
int age=scan.nextInt();
System.out.println("age="+age);
System.out.print("enter your name=");
String name=scan.next();
System.out.println("your name="+name);
System.out.print("enter your name= ");
scan.nextLine();
String Name=scan.nextLine();
System.out.println("your name= "+Name);
}
}


























