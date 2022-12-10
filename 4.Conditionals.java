package aJavaTutorial.basics;
import java.util.Scanner;
class Conditionals{
public static void main(String args[]) {

//Conditionals
Scanner scan = new Scanner(System.in);
System.out.println("Enter No.");
int num=scan.nextInt();

if(num%2==0){
  System.out.println(num+" is a \"Even Number \" ");
  }
  else{
    System.out.println(num+" is a \"Odd Number \" ");
  }}}