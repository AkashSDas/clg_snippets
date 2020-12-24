package Practicals;

class Practical3 {
    public static void main(String[] args) {
        // Employee
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("UFC", 2000);

        System.out.println(emp1.basicSalary);
        System.out.println(emp2.basicSalary);

        System.out.println(emp2.calNetSal());
        System.out.println(emp2.calNetSal(emp2.basicSalary));

        // To test finalize method
        // while (true) {
        // new Employee();
        // }

        // Calculator
        System.out.println(Calculator.inverse(5));
        System.out.println(Calculator.inverse(5.0));

        System.out.println(Calculator.negate(5));
        System.out.println(Calculator.negate(5.0));

        System.out.println(Calculator.root(5));
        System.out.println(Calculator.root(5.0));

        // // To test finalize method
        // while (true) {
        // new Calculator(10, 10.0);
        // }
    }
}

// ================================
// Employee
// ================================
class Employee {
    String ecode;
    double basicSalary;

    Employee() {
        this.ecode = "ecode";
        this.basicSalary = 1000;
    }

    Employee(String ecode, double basicSalary) {
        this.ecode = ecode;
        this.basicSalary = basicSalary;
    }

    double calNetSal() {
        double hra = (2 / 100) * this.basicSalary;
        double da = (127 / 100) * this.basicSalary;
        double grossSalary = this.basicSalary + hra + da;
        double pf = (5 / 100) * grossSalary;

        double netSalary = grossSalary - pf;
        return netSalary;
    }

    double calNetSal(double basicSalary) {
        double hra = (2 / 100) * basicSalary;
        double da = (127 / 100) * basicSalary;
        double grossSalary = basicSalary + hra + da;
        double pf = (5 / 100) * grossSalary;

        double netSalary = grossSalary - pf;
        return netSalary;
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    // }
}

// ================================
// Calculator
// ================================
class Calculator {
    int num1;
    double num2;

    Calculator(int num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    static double inverse(int num) {
        return 1 / (double) num;
    }

    static double inverse(double num) {
        return 1 / num;
    }

    static int negate(int num) {
        return Math.negateExact(num);
    }

    static double negate(double num) {
        return Math.negateExact((int) num);
    }

    static int root(int num) {
        return (int) Math.sqrt((double) num);
    }

    static double root(double num) {
        return Math.sqrt(num);
    }

    int add() {
        return this.num1 + (int) this.num2;
    }

    double multiply() {
        return this.num1 * this.num2;
    }

    // protected void finalize() {
    // System.out.println("** Finalized **" + this);
    // }
}
