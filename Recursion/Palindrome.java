import java.util.Scanner;

public class Palindrome {

    public static boolean func(int n, String a) {

        if (n >= a.length() / 2)

            return true;
        if (a.charAt(n) != a.length() - n - 1)
            return false;
        return func(n + 1, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

     func(0, s);

}
