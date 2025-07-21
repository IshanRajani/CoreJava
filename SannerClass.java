import java.util.Scanner;

public class SannerClass {
 public static void main(String[] args) {
 // Create Scanner object
 Scanner sc = new Scanner(System.in);
 // Read an integer
 System.out.print("Enter your age: ");
 int age;
 age = sc.nextInt();
 // Read a string (one word)
 System.out.print("Enter your name: ");
  String name = sc.next();
 // Output
 System.out.println("Hello " + name + ", you are " + age + " years old.");
 }
}