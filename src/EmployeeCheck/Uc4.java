package EmployeeCheck;

public class Uc4 { public static void main(String[] args) {
    int IS_FULL_TIME =2;
    int EMPLOYEE_RATE_PER_HOUR=0;
    int employeehours=0;
    int eployeewage =0;
    int IS_PART_TIME=1;

    double empcheck = Math.floor(Math.random()*10)%3;


    if (empcheck == IS_PART_TIME) {
        employeehours = 8;

    }else {
        employeehours = 0;

    }
    int employeewage = employeehours * EMPLOYEE_RATE_PER_HOUR;
    System.out.println(employeewage);

    switch ((int) empcheck){
        case 0:
            employeehours=0;
            break;
        case 1:
            employeehours=4;
            break;
        case 2:
            employeehours=8;
            break;
        default:
            System.out.println("Invalid Choice");
            break;
    }
    employeewage = employeehours * EMPLOYEE_RATE_PER_HOUR;
    System.out.println("employeewage");

}
}


