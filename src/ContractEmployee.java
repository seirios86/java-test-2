public class ContractEmployee extends Employee {

    private long hourWage;
    private int workingHours;

    public ContractEmployee(String name, long hourWage, int workingHours) {
        super(name);
        this.hourWage = hourWage;
        this.workingHours = workingHours;
    }

    @Override
    public long calculatePay() {
        return hourWage * workingHours;
    }
}
