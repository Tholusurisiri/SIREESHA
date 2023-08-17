import java. util.Scanner;
class Boating
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("enter your age");
int age=scan.nextInt();
if(age>=18)
{
System.out.println("eligible for voting");
}
else
{
System.out.println("not eligible for voting");
}
}
}
