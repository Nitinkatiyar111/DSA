import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class UnionSortedArray {

    static ArrayList<Integer> findUnion(int a1[], int a2[], int n, int m) {

        HashMap<Integer, Integer> union = new HashMap<Integer, Integer>();
        ArrayList<Integer> h = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            union.put(a1[i], union.getOrDefault(a1[i], 0) + 1);
            System.out.println(Arrays.asList(union));
        }

        for (int i = 0; i < m; i++) {
            union.put(a2[i], union.getOrDefault(a2[i], 0) + 1);
            System.out.println(Arrays.asList(union));
        }

        for (int it : union.keySet())
            h.add(it);

        return h;

    }

    public static void main(String[] args) {

        int a1[] = { 1, 2, 3, 4, 5 };
        int a2[] = { 2, 3, 4, 5, 6, 7 };
        int n = a1.length;
        int m = a2.length;
        ArrayList<Integer> h = findUnion(a1, a2, n, m);

        for (int val : h) {
            System.out.print(val + " ");
        }

    }

}
