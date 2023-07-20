public class Main {
    public static void main(String[] args) {
        SalariedCompensationModel salariedEmployee1 = new SalariedCompensationModel("John" ,"Snow" , "1", 1000.00);
        HourlyCompensationModel hourlyEmployee1 = new HourlyCompensationModel("Sena", "Sabırlı", "2", 222, 14.50);
        CommissionCompensationModel commissionEmployee1 = new CommissionCompensationModel("Jonathan", "Motley", "333", 100000, .055);
        BasePlusCommissionCompensationModel basePlusCommissionEmployee1 = new BasePlusCommissionCompensationModel("Nemanja", "Bjelica", "4444", 50000, .050);
        Employee1 employees[] = new Employee1[4];
        employees[0] = salariedEmployee1;
        employees[1] = hourlyEmployee1;
        employees[2] = commissionEmployee1;
        employees[3] = basePlusCommissionEmployee1;
        for (int x = 0; x < employees.length; x++)
            System.out.println("Employee %d is a %s\n");
        System.out.println();
        System.out.println("Employee 0: ");
        System.out.println("%s\n%s: $%,.2f\n\n");
        System.out.println("Employee 1: ");
        System.out.println("%s\n%s: $%,.2f\n\n");
        System.out.println("Employee 2: ");
        System.out.println("%s\n%s: $%,.2f\n\n");
        System.out.println("Employee 3: ");
        System.out.println("%s\n%s: $%,.2f\n\n");
        System.out.println("Employees processed polymorphically:\n ");
        int c = 0;
        System.out.println("Employee " + c + ":");
        for (Employee1 currentEmployee : employees) {
            System.out.println(currentEmployee);
            if(currentEmployee instanceof BasePlusCommissionCompensationModel) {
                BasePlusCommissionCompensationModel employee = (BasePlusCommissionCompensationModel) currentEmployee;
                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary(1.10 * oldBaseSalary);
                System.out.println("new base salary with 10%% increase is: $%,.2f\n");
            }
            System.out.println("earned $%,.2f\n\n");
            c++;
        }
    }
}
