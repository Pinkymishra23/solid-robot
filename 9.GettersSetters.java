package aJavaTutorial.OOPS;
class Employee2{
	private int id;
	private String name;

	void setName(String n){
		name=n;
	}
	String getName(){
		return name;
	}
	void setId(int i){
		id=i;
	}
	int getId(){
		return id;
	}

}
class GettersSetters{
	public static void main(String[]args){
		Employee emp = new Employee();
		emp.setId(72);
		emp.setName("Kunal");
		System.out.println("Name = "+emp.getName());
		System.out.println("Id = "+emp.getId());

	}
}