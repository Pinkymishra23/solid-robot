package aJavaTutorial.OOPS;
class Employee1{
	private int id;
	private String name;

	Employee1(String n,int i){//Constructor
		this.id=i;
		this.name=n;
	}
	Employee1(String n){//Constructor Overloading
		id=76;
		this.name=n;
	}
	//Getting Parameters(Setting not required)
	int getId(){
		System.out.println("Getting Id........");
		return id;
	}
	String getName(){
		System.out.println("Getting Name.......");
		return name;
	}
}
class Constructor{
	public static void main(String[]args){
		Employee1 nua = new Employee1("arjun",92);//Original Constructor
		Employee1 emp = new Employee1("Rajesh");//OverLoaded Constructor
		System.out.println("Name of the nua Employee = "+nua.getName());//getting name
		System.out.println("Id of the nua Employee = "+nua.getId());//getting id
		System.out.println("Name of the emp Employee = "+emp.getName());//getting name for overloaded const.
		System.out.println("Name of the emp Employee = "+emp.getId());//getting Id for overloaded const.
	}
}