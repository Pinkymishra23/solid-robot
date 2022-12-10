import java.util.Scanner;
class main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Index");
		int i=sc.nextInt();
		//System.out.println("Enter another no.");
		//double de=sc.nextDouble();*/
		int A[]={1,2,3,4,5};
		int B[]={6,7,8,9,10};
		try{
			System.out.println("At index "+i+" the no. is = "+A[i]);
		}
		//catch(Exception e){
			//System.out.println(e);
		//}
		catch(ArithmeticException e){
			System.out.println("Eror occured="+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Eror occured="+e);
		}
		catch(NullPointerException e){
			System.out.println("Eror occured="+e);
		}

	}
}