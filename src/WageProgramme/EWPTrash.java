package WageProgramme;

import java.util.Random;

public class EWPTrash {
    public static void main(String[] args) {
//    "Start with Displaying Welcome to Employee Wage Computation"
        System.out.println("Welcome to Employee Wage Computation programme");
// UC1:Check Employee is Present or Absent - Use ((RANDOM)) for Attendance Check
        boolean PresentAbsent = Attendance();
        System.out.println("Employee is Present : " + PresentAbsent);
// UC2:Calculate Daily Employee Wage - Assume Wage per Hour is 20 - Assume Full Day Hour is 8
        int WorkingHour;
        if (PresentAbsent) {
            WorkingHour = 8;
        } else {
            WorkingHour = 0;
        }
        int DailyEmployeeWage;
        int WagePerHour = 20;
        DailyEmployeeWage = WorkingHour * WagePerHour;
//        System.out.println("Daily Employee Wage : " + DailyEmployeeWage);
//   UC3:Add Part time Employee & Wage Assume Part time Hour is 8
        boolean ParttimeEmployee = Attendance();
        System.out.println("Is Employee Part timer : " + ParttimeEmployee);
        if (ParttimeEmployee) {
            WorkingHour/=2;
        }
        switch (WorkingHour){
            case 8:
                System.out.println("Daily Employee Wage is : " + DailyEmployeeWage);
                System.out.println("So, Monthly wage will be : " + DailyEmployeeWage *20);
                break;
            case 4:
                System.out.println("Daily Employee Wage is : " + DailyEmployeeWage);
                System.out.println("So, Monthly wage will be : " + DailyEmployeeWage *20);
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
    public static boolean Attendance() {
        Random rnm = new Random();
        return rnm.nextBoolean();
    }
}