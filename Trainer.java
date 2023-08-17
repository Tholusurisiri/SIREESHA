public class Trainer {
int id;
String name;
String subject;
void teach()
{
System.out.println("********started teaching***********");
}
void takeattendance()
{
	System.out.println("******** attendance taken*************");
}
void givendate(int a,String b,String c)
{
id=a;
name=b;
subject=c;
}
Trainer()
{
}
Trainer(int a)
{
	id = a;
	System.out.println("*********** ID intializes**********");
}
Trainer(int a, String b)
{
	id = a;
	name = b;
	System.out.println("*********** ID and name  is intializes**********");
}
Trainer(int a, String b ,String c)
{
	id = a;
	name = b;
	subject = c;
	System.out.println("*********** ID, name and subject intializes**********");
}
}


	

	

