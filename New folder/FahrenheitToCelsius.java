import java.util.Scanner;
class FahrenheitToCelsius{
 public static void main(String args[]){
 Scanner scanner = new Scanner(System.in); 
 System.out.println("Enter Temperature in Fahrenheit");

 float F = scanner.nextFloat(); 
 float C = (F - 32) * 5/9; 
 System.out.println("The Temperature in Celsius is : "+C);
 }
}
