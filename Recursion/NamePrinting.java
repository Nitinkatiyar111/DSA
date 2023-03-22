package Recursion;

import java.util.Scanner;

public class NamePrinting {

    static void func(int i, int n) {

        // base condition

        if (i > n)
            return;
        System.out.println("Nitin");

        func(i + 1, n);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        func(1, n);
    }

}
