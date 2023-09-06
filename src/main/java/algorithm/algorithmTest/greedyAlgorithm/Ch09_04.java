package algorithm.algorithmTest.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ch09_04 {

    /*
    title : 최대 수입 스케쥴
    scenario :

    6
 30 1
 20 1
 50 2
 40 2
 60 3
 30 3



     */
    static class Money implements Comparable<Money>{

        public int m,t;

        Money(int m, int t){
            this.m =m;
            this.t =t;
        }

        @Override
        public int compareTo(Money o) {
            if (o.t == this.t)
                return o.m - this.m;
            else
                return this.t - o.t; // 디올 디스 올라갈수록 작은거
        }
    }

   static int min = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Ch09_04 T = new Ch09_04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Money> arr = new ArrayList<>();
        for (int i =0; i < n; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            arr.add(new Money(a,b));
            if(b > min) min = b;
        }
        System.out.print(T.solution(arr, n));
    }

    private int solution(ArrayList<Money> arr, int n) {

         int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        for(int i = min; i >= 1; i--){
            for(int j = 0; j <n; j ++){
                if(arr.get(j).t < i) break;
                pQ.offer(arr.get(j).m);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
    }

        return answer;

    }
}
