import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequence {

    public static void func(int i, List<Integer> b, int a[], int n) {
        if (i == n) {
            for (int ele : b) {
                System.out.print(ele);
            }
            System.out.println();
            return;
        }

        // take or pick the particular index into the sequence
        b.add(a[i]);
        func(i + 1, b, a, n);
        b.remove(b.size() - 1);

        // not pick, or not take condition, this element is not added to your
        // subsequcence
        func(i + 1, b, a, n);
    }

    public static void main(String[] args) {
        int a[] = { 3, 1, 2 };
        int n = 3;

        List<Integer> b = new ArrayList<Integer>();

        func(0, b, a, n);
    }

}
