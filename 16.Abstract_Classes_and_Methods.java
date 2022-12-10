package aJavaTutorial.Classes;
abstract class Parent1{
	abstract void greet();//abstract method
	void dash(){
		System.out.println("Nothing");
	}
}
class child1 extends Parent1{
	void greet(){
		System.out.println("Good Morning");//Abstract method used in first way
	}
	//void nothing(){
	// 	System.out.println("nOtHiNg");
	//}
	void dash(){
		System.out.println("Nothing");
	}

}
class child2 extends Parent1{
	void greet(){
		System.out.println("Good Afternoon");//Abstract method used in second way and so on
	}
	//void not(){
	 //	System.out.println("nOtHiNg over here");
	//}
	void dash(){
		System.out.println("Nothing");
	}
}
abstract class child3 extends Parent1{
	void high(){
		System.out.println("Its so HIigh");
	}
}

class abstraction{
	public static void main(String[]args){
		child1 ch = new child1();
		child2 chr = new child2();
		ch.greet();
		//ch.nothing();
		ch.dash();
		chr.greet();
		//chr.not();
		chr.dash();
	}
}