public class TestEmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(101, "Amit", "Developer", 60000));
        ems.addEmployee(new Employee(102, "Bunty", "Manager", 75000));
        ems.addEmployee(new Employee(103, "Krrish", "Designer", 50000));
        ems.addEmployee(new Employee(104, "Dona", "Developer", 65000));
        ems.addEmployee(new Employee(105, "Evan", "QA", 55000));

        ems.addEmployee(new Employee(106, "Frank", "HR", 50000));

        Employee employee = ems.searchEmployee(103);
        if (employee != null) {
            System.out.println("Found Employee: " + employee.getName());
        } else {
            System.out.println("Employee not found");
        }

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("Deleting Employee with ID 104");
        ems.deleteEmployee(104);

        System.out.println("All Employees after deletion:");
        ems.traverseEmployees();

        System.out.println("Deleting Employee with ID 999");
        ems.deleteEmployee(999);
    }
}
