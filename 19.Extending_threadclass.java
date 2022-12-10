//package aJavaTutorial.Threading;
class MyThr extends Thread{
	public void run(){
		while(true){
			System.out.println("Running Thread 1");
		}
	}
}
class MyThr1 extends Thread{
	public void run(){
		while(true){
			System.out.println("Running Thread 2");
		}
	}
}
class threading{
	public static void main(String[] args) {
		MyThr OS1=new MyThr();
		MyThr1 OS2=new MyThr1();
		OS1.start();
		OS2.start();
	}
}