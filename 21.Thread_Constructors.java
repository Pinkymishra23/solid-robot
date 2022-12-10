class MyThr extends Thread{
	public MyThr(String name){
		super(name);
	}
	public void run(){
		while(true){
			System.out.println("Running Thread 1");
		}
	}
}
class threadingty{
	public static void main(String[] args) {
		MyThr OS1=new MyThr("OS");
		System.out.println(OS1.getName());
		System.out.println(OS1.getId());		
	}
}