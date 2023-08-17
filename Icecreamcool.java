class  Icecreamcool
{
public static void main(String[] args)
{
Icecream c1=new Icecream();
System.out.println("*******Before**********");
System.out.println("Id=" +c1.id);
System.out.println("category=" +c1.category);
System.out.println("price=" +c1.price);
c1.id=130;
c1.category="icecream";
c1.price=25;
System.out.println("*******After**********");
System.out.println("Id=" +c1.id);
System.out.println("category=" + c1.category);
System.out.println("price=" +c1.price);
}
}

