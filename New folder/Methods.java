class Methods
{
 public static void main(String args[])
{ 
VoidMethod();
}
 public static void VoidMethod()
{
int a = IntegerMethod();
float b = FlaotMethod();
System.out.println("IntegerMethod returned Value : " + a);
System.out.println("Flaot Method returned Value : " + b);
}
public static int IntegerMethod(){
return 35;
}
public static float FlaotMethod(){
return 9.2094f;
 }
}