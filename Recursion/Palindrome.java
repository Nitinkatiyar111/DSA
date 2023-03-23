import java.util.Scanner;

public class Palindrome {

    static boolean isPalRec(String s, int i, int j) {

        if (i == j)
            return true;

        if ((s.charAt(i)) != (s.charAt(j)))
            return false;

        if (i < j + 1)
            return isPalRec(s, i + 1, j - 1);

        return true;

    }

    static boolean isPalindrome(String s) {
        int n = s.length();

        if (n == 0)
            return true;

        return isPalRec(s, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (isPalindrome(s))
            System.out.println("Yes");
        else
            System.out.println("NO");
    }
}