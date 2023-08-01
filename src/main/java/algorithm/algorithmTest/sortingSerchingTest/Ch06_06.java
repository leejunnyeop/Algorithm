package algorithm.algorithmTest.sortingSerchingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ch06_06 {

    /*
    * 제목 : 장난 꾸러기
    시나리오 :

    현재 함수 를 클론하여 기존에 함수 와 정렬된 함수를 비교한다.

    **/

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(arr);
        for(int a=0; a < n; a++){
            if (arr[a] != tmp[a]){
                answer.add(a+1);
            }
        }
        System.out.print(answer);
        kb.close();
    }

}
