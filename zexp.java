import java.util.Scanner;
class exp{
	public static void main(String[]args){
		//int a = 1234567890;
		// System.out.print(a);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		double a=sc.nextDouble();
		double tax=0.0;
		tax=(a>40000)?2000:500;
		System.out.println("Tax = "+tax);
		/*int i,o,p,s,b;
		i=1;
		o=1;
		p=1;
		s=1;
		b=1;
		while(i<=100){
			System.out.println("Hacking in progress = "+i+"%");
			i++;
		}
	    while(o<=100){
			System.out.println("Retriving Data = "+o+"%");
			o++;
		}
		while(p<=100){
			System.out.println("Hacking in progress = "+p+"%");
			p++;
		}
		while(s<=100){
			System.out.println("Setting Control = "+s+"%");
			s++;
		}
		while(b<=100){
			System.out.println("Putting base = "+b+"%");
			b++;
		}*/
}}