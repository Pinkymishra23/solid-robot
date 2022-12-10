package aJavaTutorial.Classes;
//Multiple Inhertance is not supported in java but it can be implmented by interfaces like this:
class CellPhone{//class1
	void makeACall(){
		System.out.println("Calling BabuRao GanpatRao Apte");
	}
	void turnOnFlashlight(){
		System.out.println("Turning on FlashLight");
	}
}
interface GPS{//interface 1
	void searchGPS();
	void turnOnGpS();
}
interface MediaPlayer{//interface 2
	void turnOn();
	void playMusic();
}
class SmartPhone extends CellPhone implements GPS,MediaPlayer{//Extended 1 class and implemented 2 interfaces
	public void searchGPS(){
		System.out.println("Searching For GPS");
	}
	public void turnOnGpS(){
		System.out.println("Turning on GPS");
	}
	public void turnOn(){
		System.out.println("Turning on BOAT Stone Greanade");
	}
	public void playMusic(){
		System.out.println("Playing Music");
	}
}
class multiint{
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.makeACall();
		phone.turnOnFlashlight();
		phone.searchGPS();
		phone.turnOnGpS();
		phone.turnOn();
		phone.playMusic();

	}
}