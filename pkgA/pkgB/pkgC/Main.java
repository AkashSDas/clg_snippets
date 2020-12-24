package pkgA.pkgB.pkgC;

import java.util.Scanner;

import pkgA.A;
import pkgA.IntfA;
import pkgA.pkgB.B;
import pkgA.pkgB.IntfB;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntfA refIntfA;
        IntfB refIntfB;

        A objA = new A();
        B objB = new B();

        // For object of class A
        System.out.println("HCF method of class A (Get HCF for 2 integers)");
        System.out.print("Enter num1: ");
        int num1A = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2A = sc.nextInt();
        int resultA = objA.getHCF(num1A, num2A);
        System.out.println(resultA);

        System.out.println();

        // For object of class B
        System.out.println("HCF method of class B (Get HCF for 3 integers)");
        System.out.print("Enter num1: ");
        int num1B = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2B = sc.nextInt();
        System.out.print("Enter num3: ");
        int num3B = sc.nextInt();
        int resultB = objB.getHCF(num1B, num2B, num3B);
        System.out.println(resultB);

        sc.close();
    }

}
