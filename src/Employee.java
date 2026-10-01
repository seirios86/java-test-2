public abstract class Employee {

    private String name;
    private static int count;

    public Employee() {
        count++;
    }

    public Employee(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract long calculatePay();

    public static int getEmployeeCount() {
        return count;
    }
}
