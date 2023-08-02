package algorithm.algorithmTest.sortingSerchingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Ch06_09 {
 /*
  제목 : 뮤직 비디오 (결정 알고리즘)
  시나리오 :
  최소한의 녹화를 해야한다.
   m 개의 묶으로 최소화, 가장 큰 수를 작게 묶는다.
  */

    public static void main(String[] args) {
        Ch06_09 T = new Ch06_09();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));

    }

  private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        System.out.println("max 확인중");
         System.out.println(lt);
        int rt = Arrays.stream(arr).sum();
        System.out.println("sum 확인중 ");
        System.out.print(rt);
        while (lt <= rt){
            int mid = (rt+ lt)/2; // 처음 45/2
            if(count(arr, mid) <= m){

                answer = mid;
                rt = mid -1;
            }
            else lt = mid+1;
        }
        return answer;
    }

    private int  count(int[] arr, int mid) {
        int cnt = 1, sum =0;
        for(int x : arr){
            // sum + 1, sum +2 ...
            if(sum + x >= mid){

                System.out.println("확인 중 = " + sum);
                cnt++;
                sum = x;

            }else
                sum += x;
        }
        return cnt;
    }

}



