import java.util.*;
interface Empwagebuilder {
    void cal_wage();
    void PrintDetails();
}
class Employee {
    protected String company;
    protected int RatePerHour;
    protected int TotalMaxWorkDays;
    protected int TotalMaxHours;

    public Employee(String company, int RatePerHour, int TotalMaxWorkDays, int TotalMaxHours) {
        this.company = company;
        this.RatePerHour = RatePerHour;
        this.TotalMaxWorkDays = TotalMaxWorkDays;
        this.TotalMaxHours = TotalMaxHours;
    }
}
class Wage_System extends Employee implements Empwagebuilder {
    private final int is_full_time = 1;
    private final int is_part_time = 2;

    int TotalWorkingDays;
    int TotalWorkingHours;
    int TotalWage;
    int Total_present_days;
    public Wage_System(String company, int RatePerHour, int TotalMaxWorkDays, int TotalMaxHours) {
        super(company, RatePerHour, TotalMaxWorkDays, TotalMaxHours);
    }
    public void cal_wage() {
        TotalWorkingDays = 0;
        TotalWorkingHours = 0;
        TotalWage = 0;
        Total_present_days = 0;

        Random r = new Random();
        while (TotalWorkingDays < TotalMaxWorkDays && TotalWorkingHours < TotalMaxHours) {

            TotalWorkingDays++;
            int emp_check = r.nextInt(3);
            int emp_hrs;

            if (emp_check == is_full_time) {
                emp_hrs = 8;
                Total_present_days++;
            } else if (emp_check == is_part_time) {
                emp_hrs = 4;
                Total_present_days++;
            } else {
                emp_hrs = 0;
            }

            if (TotalWorkingHours + emp_hrs > TotalMaxHours)
                emp_hrs = TotalMaxHours - TotalWorkingHours;
            TotalWorkingHours += emp_hrs;
            TotalWage += emp_hrs * RatePerHour;
        }
    }
    public void PrintDetails() {
        System.out.println("Company Name : " + company);
        System.out.println("Max Working Days : " + TotalMaxWorkDays);
        System.out.println("Present Days : " + Total_present_days);
        System.out.println("Total Working Hours : " + TotalWorkingHours);
        System.out.println("Total Wage : " + TotalWage);
    }
}
public class EmployeeMain{
    public static void main(String[] args) {

        Empwagebuilder Blinkit = new Wage_System("Blinkit", 20, 20, 100);
        Blinkit.cal_wage();
        Blinkit.PrintDetails();
        Empwagebuilder Amazon = new Wage_System("Amazon", 30, 10, 80);
        Amazon.cal_wage();
        Amazon.PrintDetails();
    }
}