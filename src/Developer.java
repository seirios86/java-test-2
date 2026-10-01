public class Developer extends Employee {

    private final long baseSalary;
    private final long allowance;

    public Developer(String name, long baseSalary, long allowance) {
        super(name);
        this.baseSalary = baseSalary;
        this.allowance = allowance;
    }

    @Override
    public long calculatePay() {
        return baseSalary + allowance;
    }
}
