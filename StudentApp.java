class StudentApp
{
public static void main(String[] args)
{
Students s1=new Students();
s1.id=1234;
s1.name="sita";
s1.branch="ECE";
s1.eat();
s1.sleep();
s1.study();
System.out.println("Id= " + s1.id + " name=" + s1.name + " branch=" + s1.branch);
}
}
