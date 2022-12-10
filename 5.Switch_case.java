package aJavaTutorial.basics;
import java.util.Scanner;
class Switch_case{
public static void main(String args[]) {
//Switch
switch(num){
  case 1:System.out.println(num+" is one");
  break;
  case 2:System.out.println(num+" is two");
  break;
  case 3:System.out.println(num+" is three");
  break;
  default:System.out.println(num+" Pata nahi");
}

//Enhanced Switch
switch(num){
  case 1->{
    System.out.println(num+" is one");
    System.out.println(num+" First");
  }
  case 2->System.out.println(num+" is two");
  case 3->System.out.println(num+" is three");
  default->System.out.println(num+" Pata nahi");
}

}
}