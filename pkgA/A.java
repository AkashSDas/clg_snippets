package pkgA;

public class A implements IntfA {
    public int getHCF(int num1, int num2) {
        int hcf = 1;
        int bigNum = (num1 > num2) ? num1 : num2;

        // Getting the hcf for num1 & num2
        for (int i = 1; i < bigNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }
}
