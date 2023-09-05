package algorithm.algorithmTest.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ch09_01 {
    /*
    title : 씨름 선수
    시나리오 :
    N 명 지원자
    키 몸무게

    183 65
    181 60
    180 70
    172 72
    170 67

    65
    max = 67
    cnt =1

    60 > 65
    X

    70 > 65
    max = 70
    cnt 2

    72 > 70
    max = 72
    cnt 3
            if (ob.w > max){
                max = ob.w;
                cnt++;

      o.h(들어오는 값) - this.h (현재 값) = 내림차순 작아짐

     */
    public static class Body implements Comparable<Body>{

        public int h, w;

        Body(int h, int w){
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Body o) {
            return o.h - this.h;
        }
    }

    public static void main(String[] args) {
        Ch09_01 T = new Ch09_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>() ;
        for(int a =0; a < n; a++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }
            System.out.print(T.solution(arr, n));
        kb.close();

    }

    private int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = 0;
        for (Body ob : arr){
            if (ob.w > max){
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }
}
