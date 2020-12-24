class Main {
    public static void main(String args[]) {
        // System.out.println(new Employee(10000, 500, 20));o
        String s1 ="“hello”";
String s2 = s1;
System.out.print(s1 + "equals"+s2 + "=>"+ s1.equalsIgnoreCase(s2)+" & ");
System.out.println(" s1 = s2 ->"+ (s1==s2));
    }
}

class Employee {
    double basicSalary;
    double hra;
    double da;
    double netSal;
    double grossSal;
    double pf;

    public Employee(double basic, double hra, double da) {
        this.grossSal = basic + hra + da;
        System.out.println(this.grossSal);
        System.out.println(5/100.0);
        this.pf = (5.0/100) * this.grossSal;
        System.out.println(this.pf);
        this.netSal = this.grossSal - this.pf;
        System.out.println(this.netSal);
    }
}
