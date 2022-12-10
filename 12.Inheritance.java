package aJavaTutorial.OOPS;
 class Animal{//Supper Class
 	int age;
 	String name;
 	void setAge(int a){
 		this.age=a;
 	}
 	void setName(String n){
 		this.name=n;
 	}
 	int getAge(){
 		return age;
 	}
 	String getName(){
 		return name;
 	}
 	void walk(){
 		System.out.println("Walking........");
 	}	
 	void run(){
 		System.out.println("Runing........");
 	}
 }
 class Dog extends Animal{//Sub class
 	void bark(){
 		System.out.println("Barking........");//Extra Feature
 	}
 }

 class Inheritance{
 	public static void main(String[]args){
 		Dog d = new Dog();
 		d.setName("Joe");
 		d.setAge(13);
 		System.out.println("Name of the dog = "+d.getName());
 		System.out.println("Age of the dog = "+d.getAge());
 		d.walk();//Function of the Super Class
 		d.run();
 		d.bark();//Function of the Sub Class
 		
 	}
 }