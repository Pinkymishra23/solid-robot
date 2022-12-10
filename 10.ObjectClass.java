package aJavaTutorial.OOPS;
//Making a class employee
class Employee{
	//attributes:
	int id;
	int salary;
	String name;

	void details(){
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
	}
	void Salary(){//if int Salary is written insted of print statement it should have return statement
		System.out.println("Salary = "+salary);
	}
}

class ObjectClass{
public static void main(String args[]) {
Employee Pratyush=new Employee();//making a new obj of class Employee
//setting attributes of pratyush
Pratyush.id=1347;
Pratyush.name="Arjun";
Pratyush.salary=34500;
//printing the attributes
Pratyush.details();
Pratyush.Salary();
}
}
//key takeaways:
/*void method_name:Print Statement or any other
datatype method_name:return Statement*/