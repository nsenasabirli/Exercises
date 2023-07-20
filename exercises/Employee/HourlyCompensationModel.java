public class HourlyCompensationModel extends Employee1 {
    private double wage;
    private double hours;
    public HourlyCompensationModel(String firstname, String lastname, String socialsecuritynumber, double wage, double hours) {
        super(firstname, lastname, socialsecuritynumber);
        setWage(wage);
        setHours(hours);
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        wage = (wage < 0.0 ) ? 0.0 : wage;
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        hours = ( ( hours >= 0.0 ) && ( hours <= 168.0 ) ) ? hours : 0.0;
    }
    public double earnings() {
        if (getHours() <= 40 )
            return getWage() * getHours();
        else
            return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
    }
    public String toString() {
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hourly worked", getHours() );
    }
}
