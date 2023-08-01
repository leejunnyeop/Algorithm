package algorithm.algorithmTest.sortingSerchingTest;

import java.util.Scanner;

public class Ch06_01 {

    public static void main(String[] args) {



        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = kb.nextInt();
        }
        for (int n = 0; n < a - 1; n++) {
            int idx = n;
            System.out.print(n);
            for (int m = n + 1; m < n; m++) {
                System.out.print(idx);
                if (arr[m] < arr[idx]) idx = m;
            }
            int tmp = arr[n];
            arr[n] = arr[idx];
            arr[idx] = tmp;

        }


        for (int x =0; x < a; x++){
            System.out.println(arr[x]);
        }
        kb.close();
    }

}
