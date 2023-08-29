package EmployeeCheck;

public class Uc1 {
    public static void main(String[] args) {
        int empcheck = 1;
        double mathval = Math.floor(Math.random()*10% 2);
        if(empcheck==mathval) {
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}
