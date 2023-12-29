package Day16;

class User {
    int id=1;
    String name="Apurva";
    
    public void SetEmployeeId(int id)
    {
    	this.id=id;
    }
    public void SetEmployeeName(String name)
    {
    	this.name=name;
    }
}
class Employee extends User {
	double Salary=1400; 
	public void setsalary(double Salary)
	{
		this.Salary=Salary;
	}
}
public class Main{
	public static void main(String args[])
	{
		Employee e=new Employee();
		int id=e.id;
		String Name=e.name;
		double annualsalary = e.Salary*12;
		System.out.println("Id:" +id);
		System.out.println("Name of Employee: "+Name);
		System.out.println("Total Annual Salary is : "+annualsalary);
	}
}
   



