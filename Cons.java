

        class Employee {
       
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getDetails() {
            return "Name: " + name + ", Salary: " + salary;
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
    }

    class Manager extends Employee {
        private String department;

        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        @Override
        public String getDetails() {
            return super.getDetails() + ", Department: " + department;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }

    public class Cons{
    public static void main(String[] args) {

        Employee emp = new Employee("Alice", 50000);
        Manager mgr = new Manager("Bob", 70000, "IT");

        System.out.println(emp.getDetails());
        System.out.println(mgr.getDetails());
        emp.setName("tam");
        emp.setSalary(69999);
        System.out.println(emp.getDetails());

    }
}