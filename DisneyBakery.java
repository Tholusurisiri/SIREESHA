class DisneyBakery
{
static void makechai()
{
System.out.println("bill for normalchai=10");
}
static void makechai(int quantity)
{
System.out.println("bill for normalchai=" +(quantity*10));
}
static void makechai(String flavour)
{
System.out.println("bill for" +flavour+"Tea=15");
}
static void makechai(String flavour,int quantity)
{
System.out.println("bill for "+flavour+"Tea=" +(quantity*15));
}
public static void main(String[] args)
{
makechai();
makechai(5);
makechai("green");
makechai("back",2);
}
}


