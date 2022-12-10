class MyThr implements Runnable{
	public void run(){
		int i=1;
		while(i<400){
			System.out.println("Running Thread 1");
			i++;
		}
	}
}
class MyThr1 implements Runnable{
	public void run(){
		int i=1;
		while(i<400){
			System.out.println("Running Thread 2");
			i++;
		}
	}
}
class threadingrtr{
	public static void main(String[] args) {
		MyThr OS1=new MyThr();
		Thread cont=new Thread(OS1);
		MyThr1 OS2=new MyThr1();
		Thread cont1=new Thread(OS2);
		cont.start();
		cont1.start();
	}
}
