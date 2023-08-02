package algorithm.algorithmTest.sortingSerchingTest;

import java.util.Scanner;

public class Ch06_07 {
    /*
  제목 : 좌표 정렬

  x 값 비

     */

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][2];
        for(int i =0; i < n; i++){
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }


        kb.close();
    }

}
