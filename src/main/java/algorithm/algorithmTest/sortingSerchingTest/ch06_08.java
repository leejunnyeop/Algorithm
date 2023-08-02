package algorithm.algorithmTest.sortingSerchingTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ch06_08 {

    /*
    제묵 : 이분 검색
    시나리오 :
    정렬한다음 찾기
     */

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a = kb.nextInt();
        int[] arr = new int[n];
        for (int i =0; i <n; i++){
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        int count =1;
        for(int k=0; k <n; k++){
            if (a == arr[k]) {
                System.out.print(count);
                break;
            }else
                count ++;
        }
        kb.close();
    }


}
