public class NumberAppearsOnce {

    public static int numberCheck(int a[]) {

        int n = a.length;

        for (int i = 0; i < n; i++) {
            int num = a[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (a[j] == num) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int a[] = { 1, 1, 2, 3, 3, 4, 4 };

        int result = numberCheck(a);

        System.out.println(result);
    }

}
