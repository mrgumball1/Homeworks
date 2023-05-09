package io.codelex.arithmetic.practice;


public class Exercise8 {
    public static void main(String[] args){
        employeeSalaryCalculator(35,7.50f);
        employeeSalaryCalculator(47, 8.20f);
        employeeSalaryCalculator(73, 10.00f);

    }
    static void employeeSalaryCalculator(int hours, float basePay) {
        int extraHours = 0;
        double overTime = 0;
        double totalPay = (hours * basePay) + overTime;
        overTime = extraHours * 1.5;
        if (hours > 40) {
            extraHours = hours - 40;
        }
        if (hours > 60) {
            System.out.println("Error too much hours!!!");

        } else if (basePay < 8.00) {
            System.out.println("Error less minimum wage!!!!");

        } else
        System.out.println("Total pay " + totalPay);
    }
}