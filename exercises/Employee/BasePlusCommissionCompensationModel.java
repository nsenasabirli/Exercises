public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {
    private double baseSalary;
    public BasePlusCommissionCompensationModel(String firstname, String lastname, String socialsecuritynumber,
                                               double grosssales, double commissionrate ) {
        super(firstname, lastname, socialsecuritynumber, grosssales, commissionrate);
        double basesalary = 0;
        setBaseSalary(basesalary);
    }
    public double getBaseSalary() {

        return baseSalary;
    }
    public void setBaseSalary(double basesalary) {

        basesalary = Math.max(basesalary, 0.0);
    }
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
    public String toString() {
        return String.format("%s %s; %s: $%,.2f," +
                "base salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
