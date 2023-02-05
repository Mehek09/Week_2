package Week2;


class Employeess {
	
	private int employeeId;
	private String employeeName;
	private double salary;

    public Employeess(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;     
    }
    
    public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
    
}

class PermanentEmployee extends Employeess {
    private double basicPay;
    private double hra;
    private float experience;

    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }
    
    public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public void calculateMonthlySalary() {
		double x = 0, var;
		if(getExperience() < 3)
			x = 0;
		else if((getExperience() >= 3)&&(getExperience() < 5))
			x = 5;
		else if((getExperience() >= 5)&&(getExperience() < 10))
			x = 7;
		else if(getExperience() >= 10)
			x = 12;
		var = getBasicPay() * (x/100);
		float a = Math.round((var+getBasicPay()+getHra()));
		setSalary(a);
	}

	public String toString(){
    	return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    	}
}

class ContractEmployee extends Employeess {
    private double wage;
    private float hoursWorked;

    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }
    
    public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public void calculateSalary() {
		setSalary(getHoursWorked() * getWage());
	}
	
	public String toString(){
    	return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    	}
}

public class Employeeinheritance {
	public static void main(String[] args) {
		PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
		permanentEmployee.calculateMonthlySalary();
		System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());
		ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
		contractEmployee.calculateSalary();
		System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());
}
}