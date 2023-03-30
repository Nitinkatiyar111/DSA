import java.util.ArrayList;

public class IntersectionTwoArray {

    public static ArrayList<Integer> intersectionOfArrays(int a[], int b[]) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        int visited[] = new int[b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j] && visited[j] == 0) {

                    result.add(b[j]);
                    visited[j] = 1;
                    break;
                } else if (b[j] > a[i])
                    break;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int b[] = { 2, 3, 3, 5, 6, 6, 7 };

        ArrayList<Integer> ans = intersectionOfArrays(a, b);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

}
