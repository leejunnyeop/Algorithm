package algorithm.algorithmTest.sortingSerchingTest;

import java.util.Scanner;

public class Ch06_04 {

    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = kb.nextInt();
        }
        int[] cache = new int[n];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < n; i++) {
                if (i == cache[i]) pos = i;
                System.out.print(arr[i]);
            }
            if (pos == -1) {
                for (int i = n - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                    System.out.print(cache[i]);
                    System.out.print("----------------------");
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x; // 미스 처리
        }

        for (int a =0; a < n; a++)
            System.out.print(cache[a]);
        kb.close();

    }
}
