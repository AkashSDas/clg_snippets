package pkgA.pkgB;

import pkgA.A;

public class B extends A implements IntfB {
    // All method declarations in an interface, including static methods,
    // are implicitly public. And it's usually omitted.
    // The implementation class should keep this modifer, instead of using
    // default class method modifer.

    public int getHCF(int num1, int num2, int num3) {
        int hcf = 1;
        int bigNum = (num1 > num2) ? num1 : num2;

        // Getting the hcf for num1 & num2
        for (int i = 1; i < bigNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        if (num3 % hcf == 0) {
            return hcf;
        }
        return 1;
    }
}
