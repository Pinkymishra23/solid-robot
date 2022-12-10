package aJavaTutorial.basics;
import java.util.Scanner;
class Loops{
public static void main(String args[]) {
//Conditionals
Scanner scan = new Scanner(System.in);
System.out.println("Enter No.");
int num=scan.nextInt();
//Do-While-Loop
int i=1;
do{
  System.out.println(num+"*"+i+"= "+num*i);
  i++;
}
while(i<=10);

//For-loop
for(i=2;i<=10;i++){
  System.out.println(num+"*"+i+"= "+num*i);
}

//While-Loop
while(i<=10)
{
  System.out.println(num+"*"+i+"= "+num*i);
  i++;
}

}  
}