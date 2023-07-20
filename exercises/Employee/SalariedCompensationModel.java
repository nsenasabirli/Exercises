public class SalariedCompensationModel extends Employee1 {
    private double weeklySalary;
    public SalariedCompensationModel(String firstname, String lastname, String socialsecuritynumber, double salary) {
        super(firstname, lastname, socialsecuritynumber);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double weeklySalary) {
        weeklySalary = weeklySalary < 0.0 ? 0.0 : weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public double earnings() {
        return getWeeklySalary();
    }
    public String toString() {
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary() );
    }
}
