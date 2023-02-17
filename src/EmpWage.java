import java.util.Scanner;

public class EmpWage {
    static int workHour,workDay,fullDay,halfDay,hourWage,maxHours,maxWorkDays;
    public static void main(String[] args) {
        UC6();
    }
    public static int UC1(){
        int attendance = (int) ((Math.random() * 10) % 3);
        return attendance;
    }
    public static void UC2(){
        EmpWage E = new EmpWage();
        switch (UC1()) {
            case 0 :
                workHour += 8;
                workDay++;
                fullDay++;
                break;
            case 1:
                workHour += 4;
                workDay++;
                halfDay++;
                break;
        }
    }
    public static void UC5(String X, String Y){
        EmpWage E = new EmpWage();
        while(workDay <maxWorkDays && workHour<maxHours){
            UC2();
        }
        System.out.println("\n" + "Company Name : "+X);
        System.out.println(Y+" Employee :");
        System.out.println("Full Day : " +fullDay+" Days");
        System.out.println("Half Day : " +halfDay+" Days");
        System.out.println("Monthly Wage of " +X+ " : " +(workHour*hourWage));

    }
    public static void UC6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company Name");
        String companyName = sc.nextLine();
        System.out.println("Enter Employee Type (Part Time / Full Time");
        String empType = sc.nextLine();
        System.out.println("Enter Wage/Hour");
        hourWage = sc.nextInt();
        System.out.println("Enter maximum working hours per month");
        maxHours = sc.nextInt();
        System.out.println("Enter maximum working days per month");
        maxWorkDays = sc.nextInt();

        UC5(companyName,empType);
    }
}

class company2 extends EmpWage{
    public static void main(String[] args) {
       UC6();
    }
}
