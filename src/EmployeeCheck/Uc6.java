package EmployeeCheck;

public class Uc6 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static void main(String[] args) {
        //variables
        int empHrs = 0, totalEmpWage = 0, TotalWorkingDays=0;
        //calculate
        int totalEmpHrs = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && TotalWorkingDays < NUM_OF_WORKING_DAYS){
            TotalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpWage += empHrs;
            System.out.println("Day#:" + TotalWorkingDays + "EmpHrs:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("totalEmpWage" + totalEmpWage);
    }
}

