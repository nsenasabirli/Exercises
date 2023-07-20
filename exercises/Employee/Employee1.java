public abstract class Employee1 implements CompensationModel {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    public Employee1 (String firstname, String lastname, String socialsecuritynumber) {
        firstname = firstname;
        lastname = lastname;
        socialsecuritynumber = socialsecuritynumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    public abstract double earnings();
}
