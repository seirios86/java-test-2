public abstract class Employee {

    private final String name;
    private static int count;

    protected Employee(String name) {
        count++;
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
