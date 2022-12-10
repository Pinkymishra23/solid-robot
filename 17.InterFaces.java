package aJavaTutorial.Classes;
interface Bicycle{//interface 1
	void applyBrake(int decrement);
	void speedUp(int incremet);
}
interface HornSystem{//interface 2
	void playHorn1();
	void playHorn2();
}
class AvonCycle implements Bicycle,HornSystem{
	int speed=10;
	/*Abstract method in interface must always contain public keyword when called*/public void applyBrake(int decrement){
		speed = speed-decrement;
		System.out.println("Applying Brake.......");
	}
	//Methods of interface 1
	public void speedUp(int incremet){
		speed = speed+incremet;
		System.out.println("Accelerating........");
	}
	//Methods of interface 2
	public void playHorn1(){
		System.out.println("Applying Horn : Pee pee pee pee......");
	}
	public void playHorn2(){
		System.out.println("Applying Horn2 : Poon poon poon.......");
	}
	//Personal Method
	int giveSpeed(){
		return speed;
	}
}
class interfere{
	public static void main(String[]args){
		AvonCycle ev = new AvonCycle();
		//Calling All the Methods
		System.out.println("Present Speed = "+ev.giveSpeed());
		ev.speedUp(6);
		System.out.println("Present Speed = "+ev.giveSpeed());
		ev.applyBrake(9);
		//ERROR:System.out.println("Present Speed = " + speed);-can not be directly called must be called using a method
		/*Correct Way*/System.out.println("Present Speed = "+ev.giveSpeed());//containing return speed example-"giveSpeed"
		ev.playHorn1();																						//	method									
		ev.playHorn2();
	}
}