import java.util.Scanner;
public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Q5 myDate = new Q5(1,6,2001);

        System.out.println("Enter the month: ");
        int myMonth = input.nextInt();
        myDate.setMonthDate(myMonth);

        System.out.println("Enter the date: ");
        int myDay = input.nextInt();
        myDate.setDayDate(myDay);

        System.out.println("Enter the year: ");
        int myYear = input.nextInt();
        myDate.setYearDate(myYear);

        myDate.displayDate();
    }
}
