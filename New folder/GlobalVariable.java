class GlobalVariable{
 
 public static int count = 0;
 public static String name;
 public static void main(String args[]){
 AssignName();
 System.out.println(name + " " + count);
 }
 public static void AssignName(){
 name = "Ateeq";
 count = 45;
 }
}