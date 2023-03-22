import java.util.Scanner;

public class SumNnumbers {

    public static void func(int n, int sum) {

        // Base Condition
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        func(n - 1, sum + n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        func(n, 0);

    }

}
