public class CommissionCompensationModel extends Employee1 {
    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel (String firstname, String lastname, String socialsecuritynumber, double grosssales, double commissionrate) {
        super(firstname, lastname, socialsecuritynumber );
        setCommissionRate(commissionrate);
        setGrossSales(grosssales);
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setGrossSales(double grossSales) {
        grossSales = ( grossSales < 0.0 ) ? 0.0 : grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        commissionRate = ( commissionRate > 0.0 && commissionRate < 1.0 ) ? commissionRate : 0.0;
    }
    public double getCommisionRate() {
        return commissionRate;
    }

    public double earnings() {
        return getCommisionRate() * getGrossSales();
    }
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f",
                "commission employee", super.toString(),
                "gross salaes", getGrossSales(),
                "commision rate", getCommissionRate());
    }
}
