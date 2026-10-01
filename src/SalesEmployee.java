public class SalesEmployee extends Employee {

    private long baseSalary;
    private long monthlySales;

    public SalesEmployee(String name, long baseSalary, long monthlySales) {
        super(name);
        this.baseSalary = baseSalary;
        this.monthlySales = monthlySales;
    }

    @Override
    public long calculatePay() {
        return baseSalary + (monthlySales * 5 / 100);
    }
}
