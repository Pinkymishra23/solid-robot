import java.util.Scanner;
class Exception_handling
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter index:");
int A[]={1,2,3,4,5};
int B[]={6,7,8,9,10};
try{
System.out.println("At index "+i+" the no. is = "+A[i]);
}
catch(Exception e){
System.out.println("Error occured due to : "+e);
}
