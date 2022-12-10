package aJavaTutorial.basics;
import java.util.Scanner;
class Stirng{
public static void main(String args[]) {

//Java user Input
Scanner sc = new Scanner(System.in);
System.out.println("Enter the First number");
int a = sc.nextInt();
System.out.println("Enter the Second number");
int b = sc.nextInt();

System.out.println("Enter the String");
String s = sc.nextLine();
System.out.println("Enter the Word");
String w = sc.next();
System.out.println("Enter the Charecter");
char ch = sc.next().charAt(0);
System.out.println(s + w+ch);}}