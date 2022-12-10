package aJavaTutorial.Methods_and_Arrays;
import java.util.Scanner;
class Methods{
int msum(int a,int b){
  int c=a+b;
  return c;
}
public static void main(String args[]){
int a =7;
int x=3;  
Methods obj=new Methods();
int b=obj.msum(a,x);
//System.out.println(msum(a,x));
System.out.println(b);
}
}