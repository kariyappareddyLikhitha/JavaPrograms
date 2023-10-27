class DisneyBakery
{
static void makeChai()
{
System.out.println("Bill for Masalachai=10");
}
static void makeChai(int quantity)
{
System.out.println("Bill for Masala chai="+(quantity*10));
}
static void makeChai(String flavour)
{
System.out.println("Bill for "+flavour+"tea =15");
}
static void makeChai(String flavour,int quantity)
{
System.out.println("Bill for "+flavour+"tea = "+(quantity*15));
}
public static void main(String[] args)
{
makeChai();
makeChai(2);
makeChai("Choco",5);
makeChai("ginger",2);
}
}