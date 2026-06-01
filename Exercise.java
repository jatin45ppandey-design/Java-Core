public class Exercise {

    static class Employee {
       
        @SuppressWarnings("FieldMayBeFinal")
        private String name;
        @SuppressWarnings("FieldMayBeFinal")
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
    }

    static class Manager extends Employee {
        @SuppressWarnings("FieldMayBeFinal")
        private String department;

        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        @Override
        public String getDetails() {
            return super.getDetails() + ", Department: " + department;
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Alice", 50000);
        Manager mgr = new Manager("Bob", 70000, "IT");

        System.out.println(emp.getDetails());
        System.out.println(mgr.getDetails());
    }
}