
 class Employee{
		int empid;
		String name;
		int salary;
		
		Employee(int id, String name, int salary){
			empid = id;
			this.name = name;
			this.salary = salary;
		}

		public int getEmpid() {
			return empid;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
	}
public class Assign1_Q4 {
	
	public static Employee searchElemenrById(Employee[]employee, int id) {
		for(Employee e : employee) {
			if(e.getEmpid() == id) {
				return e;
			}
		}
		return null;
	}
	public static Employee searchElementBySalary(Employee[]employee, int salary) {
		for(Employee e : employee) {
			if(e.getSalary() == salary) {
				return e;
			}
		}
		return null;
	}
	
	public static Employee searchElementByName(Employee[]employee, String name) {
		for(Employee e : employee) {
			if(e.getName().equalsIgnoreCase(name)) {
				return e;
			}
		}
		return null;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee[]= {
				new Employee(1,"Sneha", 40000),
				new Employee(3,"Prajakta",60000),
				new Employee(4,"Neha",80000),
				new Employee(2,"Rohit",70000)
		};
		
        Employee emp = searchElemenrById(employee, 3);
        if(emp == null) {
        	System.out.println("employee not found");
        }
        else {
        	System.out.println(emp);
        }
        
        emp = searchElementBySalary(employee, 40000);
        if(emp == null) {
        	System.out.println("employee not found");
        }
        else {
        	System.out.println(emp);
        }
        
        emp = searchElementByName(employee, "neha");
        if(emp == null) {
        	System.out.println("employee not found");
        }
        else {
        	System.out.println(emp);
        }
	}

}
