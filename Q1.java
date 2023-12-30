package Queue_D20;

class User{
	int id;
	String name;
	
	public User(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

class Employee extends User{
	double salary;
	
	public Employee(int id,String name,double salary) {
		super(id,name);
		this.salary=salary;
	}
	
	public double calculateAnnualSalary() {
		return salary*12;
	}
}
public class Q1 {

	public static void main(String [] args) {
		Employee emp = new Employee(1,"mohsin",12000);
		
		double annualsalary = emp.calculateAnnualSalary();
		System.out.println("Id : " + emp.getId() +",  NAME : "+emp.getName() + " ,ANNUAL SALARY :"+annualsalary );
	}
}
