package aJavaTutorial.OOPS;
class A{
	void Meth1(){
	System.out.println("Just Like that");
	}
	void Meth2(){
		System.out.println("This Is Pratyush Mishra in class A");
	}
}

class B extends A{
	@Override
	void Meth2(){
		System.out.println("This Is Pratyush Mishra in class B");//Method 2 overridden,if this would not be written then 
		}															//object of B class when will call method2 it will print
																	//"This Is Pratyush Mishra in class A" insted of "This Is Pratyush Mishra in class B"
	void Meth$(){
		System.out.println("Nothing");
	}
}

class methodoverride{
	public static void main(String[]args){
		A just = new A();
		just.Meth2();

		B bust = new B();
		bust.Meth2();
	}
}