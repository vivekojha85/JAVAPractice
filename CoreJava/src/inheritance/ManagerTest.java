package inheritance;

public class ManagerTest {

	public static void main(String[] args) {
		
		Manager boss = new Manager("John", 123000, 2017, 11, 10);
		boss.setBonus(5000);
		
		Employee staff[] = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee ("Kapil", 110000, 2016, 10, 10);
		staff[2] = new Employee("Jack", 90000, 2016, 10, 11);
		
		for(Employee e: staff) {
			System.out.println("Name: "+e.getName() + " Salary: "+ e.getSalary());
		}

	}

}
