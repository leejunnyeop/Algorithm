package algorithm.algorithmTest.greedyAlgorithm;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ch09_02 {
    /*
    title : 회의실 배정
    시나리오 : 한개의 회의실 있는데, n 명의 회원들 사용하려고 한다. 겹치지 않게 사용
    
     2 3
     1 4
     3 5
     4 6
     5 7 
     정리한 다음 첫 번째 두번쩨를 비교해서 같을 경우 cut 을 1 증가한다.

       @Override
        public int compareTo(Times o) {
            if(this.rast == o.rast)
            return this.fist - o.rast;
            else return this.rast - o.rast;
        }

       차순 정리 :
       마지막 값 = 현재 마지막 값
       this.f - o.f 오름차순 작이짐
       아니면
       this.r - o.r 올라갈수롣 작이짐

        2 3
        1 4
        3 5
        4 6
        5 7

        2 > 0
        count 1
        et = 3

        1 > 3
        X

         3 = 3
         count 2
         max 3




        2 3
        1 4
        3 5
        4 6
        5 7


        다른 예시

         1 3
         2 3
         3 3






     for(Times times : arr){
            if (times.fist >= et){
               // log.info("왜 틀렸지 ? : " + times.fist, times.rast);
               // System.out.print(times.fist , times.rast);
                cunt ++;
                et = times.rast;

                한번더 정리

                this. - o 오름 차순 작은거
                o - this  내려가면서 작은거 내림차순
     */
    
    static class Times implements Comparable<Times>{
        
       public int fist, rast;



        public Times(int fist,int rast){
            this.fist = fist;
            this.rast = rast;
        }

        @Override
        public int compareTo(Times o) {
            if(this.rast == o.rast)
            return this.fist - o.fist;
            else return this.rast - o.rast;
        }
    }

    public static void main(String[] args) {
        Ch09_02 T = new Ch09_02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Times> arr = new ArrayList<>();
        for (int a =0; a < n; a++){
            int fist = kb.nextInt();
            int rast = kb.nextInt();
            arr.add(new Times(fist, rast));
        }
        System.out.print(T.solution(arr,n));
        kb.close();
    }

    private int solution(ArrayList<Times> arr, int n) {
        int cunt =0;
        int et =0;
        Collections.sort(arr);
        //log.info("arr sort : " + arr);
        for(Times times : arr){
            if (times.fist >= et){
               // log.info("왜 틀렸지 ? : " + times.fist, times.rast);
               // System.out.print(times.fist , times.rast);
                cunt ++;
                et = times.rast;
            }

        }
        return cunt;
    }
}
