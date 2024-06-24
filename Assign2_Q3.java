import java.util.Arrays;
import java.util.Comparator;

class Assign2_Q3 {
    private String name;
    private double salary;

    
    public Assign2_Q3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    public static void main(String[] args) {
    	Assign2_Q3[] employees = {
                new Assign2_Q3("namrata", 50000),
                new Assign2_Q3("aarti", 60000),
                new Assign2_Q3("ganesh", 45000),
                new Assign2_Q3("shivpriya", 70000)
        };

        
        Arrays.sort(employees, Comparator.comparingDouble(Assign2_Q3::getSalary).reversed());
        System.out.println("Employees sorted by salary (descending order):");
        for (Assign2_Q3 emp : employees) {
            System.out.println(emp);
        }
    }
}
