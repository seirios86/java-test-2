public class Main {

    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Harvey", 4000000, 500000),
                new SalesEmployee("Kim", 3000000, 20000000),
                new ContractEmployee("Lee", 30000, 120)
        };
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.calculatePay() + "원");
        }
        System.out.println("Total employee count: " + Employee.getEmployeeCount());
    }

}