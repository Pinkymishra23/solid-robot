package aJavaTutorial.basics;
import java.util.Scanner;
class inputing{
public static void main(String args[]) {

//Java user Input
Scanner sc = new Scanner(System.in);
System.out.println("Enter the First number");
int a = sc.nextInt();
System.out.println("Enter the Second number");
int b = sc.nextInt();

int c=a+b;
System.out.println("Sum = " + c);
}
}