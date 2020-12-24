package Practicals.Practical9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

class Practical9 {
    public static void main(String[] args) {
        // getFileData("./file.txt");

        // getNumDataFromFile("./file.txt");
    }

    // ========================
    // Question 1
    // ========================
    static void getFileData(String fileName) {
        try {
            try {
                FileReader f = new FileReader(fileName);
                try {
                    int i;
                    while ((i = f.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (IOException e) {
                    System.out.println("😨 I/O error, Please try again...");
                }
            } catch (FileNotFoundException e) {
                System.out.println("📂 File cannot be found");
            }
        } catch (Exception e) {
            System.out.println("🎁 Some unknown error has arrived");
        }
    }

    // ========================
    // Question 2
    // ========================
    static boolean checkNum(char c) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ((int) c - '0')) {
                return true;
            }
        }
        return false;
    }

    static void getNumDataFromFile(String fileName) {
        try {
            try {
                FileReader f = new FileReader(fileName);
                FileOutputStream fileOutputStream = new FileOutputStream("./copy.txt");
                int i;
                while ((i = f.read()) != -1) {
                    if (checkNum((char) i)) {
                        fileOutputStream.write((char) i);
                    }
                }
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println("📂 File cannot be found");
            } catch (IOException e) {
                System.out.println("😨 I/O error, Please try again...");
            } finally {
                // fileOutputStream.close();
            }
        } catch (Exception e) {
            System.out.println("🎁 Some unknown error has arrived");
        }
    }
}
