package aJavaTutorial.OOPS;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
class Phone{
	void showTime(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
   		LocalDateTime now = LocalDateTime.now();  
   		System.out.println("Time is "+dtf.format(now));  
	
	}
	void openSnakeGame(){
   		System.out.println("Opening Snake Game.......");  
	
	}
}
class SmartPhone extends Phone{
	@Override
	void showTime(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
   		LocalDateTime now = LocalDateTime.now();  
   		System.out.println("Time is "+dtf.format(now));  
	
	}
	void openPubg(){
   		System.out.println("Opening Pubg.......");  
	
	}
}

class dispatch{
	public static void main(String[]args){
		Phone/*Reference Class*/ phone = new SmartPhone();/*Object Class*/
		//Methods of Reference Class are allowed but the methods of the Object Class are not allowed
		//When the Overriden Method is called the method of the Object Class executes
		phone.showTime();
		phone.openSnakeGame();
		//phone.openPubg(); This will give error 
	}
}