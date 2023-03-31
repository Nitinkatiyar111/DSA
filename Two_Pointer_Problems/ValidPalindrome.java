public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int R = s.length() - 1;
        int L = 0;

        while (L < R) {

            if (s.charAt(L) != s.charAt(R)) {
                return false;
            }
            L = L + 1;
            R = R - 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "nitin";

        System.out.println(isPalindrome(s));
    }
}
