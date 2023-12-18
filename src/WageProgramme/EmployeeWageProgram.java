package WageProgramme;
import java.util.Random;
import java.util.SortedMap;

public class EmployeeWageProgram {
    public static int GetAttendance() {
        Random random = new Random();
        return random.nextInt(3);
    }
    public static int WorkingHr(int FullDayHour){
        int isresent = GetAttendance();
        int FinalHr;
        switch (isresent){
            case 1:
                FinalHr = FullDayHour ;
                break;
            case 2:
                FinalHr = FullDayHour /2;
                break;
            default:
                FinalHr = 0;
        }
        return FinalHr;
    }
    public static int DailyEmployeeWage(int WagePerHR, int WorkingHR){
//        System.out.println("DailyEmployeeWage :" + WagePerHR * WorkingHr());
        return WagePerHR * WorkingHR;
    }
    public static int MonthlyWage(int WagePerHR,int FullDayHR,int MonthDays){
        int FinalWage =0;
        for( int Day=1; Day <= MonthDays; Day++){
            FinalWage += DailyEmployeeWage(WagePerHR,WorkingHr(FullDayHR));
        }
        return FinalWage;
    }
    public static int MonthlyWageByCond(int WagePerHR,int FullDayHR,int MaxDays, int MaxHR){
        int FinalWage =0;
        int days=1;
        int Hours=0;
        while ( days <= MaxDays && Hours <= MaxHR){
            int WorkingHR = WorkingHr(FullDayHR);
            days++;
            Hours+=WorkingHR;
            FinalWage += DailyEmployeeWage(WagePerHR,WorkingHR);
        }
        return FinalWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program Main ");
        System.out.println("Monthly Wage for 20 days : "+ MonthlyWage(20,8,20));
        System.out.println("Monthly Wage By Maxdays && MaxHrs Condition : "+MonthlyWageByCond(20,8,20,100));

        System.out.println("  ");

        System.out.println("Welcome to Employee Wage Program Company A");
        System.out.println("Monthly Wage for 28 days : "+ MonthlyWage(10,10,28));
        System.out.println("Monthly Wage By Maxdays && MaxHrs Condition : "+MonthlyWageByCond(10,10,28,110));

    }
}
