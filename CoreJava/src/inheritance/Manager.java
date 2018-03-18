package inheritance;

public class Manager extends Employee{

	private double bonus = 0;
	
	public Manager(String name, double salary, int hireYear, int hireMonth, int hireDay) {
		super(name, salary, hireYear, hireMonth, hireDay);
		bonus = 0;
	
	}
	public double getSalary() {
		double basicSalary = super.getSalary();
		return basicSalary + bonus;
	}
	public void setBonus(double b) {
		bonus = b;
	}
}
