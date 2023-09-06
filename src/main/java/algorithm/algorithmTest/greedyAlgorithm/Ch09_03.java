package algorithm.algorithmTest.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ch09_03 {
    /*
    title : 결혼식
    시나리오 :

    친구들은 몇시 도착 , 몇시 떠남

5
 5 14

 12 15

 14 18
 15 20
 20 30

   max 14
   12 < 14
   0
   14 < 14
   x
   15 < 14
   x






     */

    static class Timess implements Comparable<Timess>{
        public int a,b;
        Timess(int a, int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Timess o) {
            if (o.b == this.b)
            return this.a - o.a; // 떠나는 시간이 같을 때, 올라갈수록 작아짐
            else
                return this.b - o.b; // 올라갈수록 작아짐 = 오름차순
        }
    }

    public static void main(String[] args) {
        Ch09_03 T = new Ch09_03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Timess> arr = new ArrayList<>();
        for (int a =0; a < n; a++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Timess(x, y));
        }
        System.out.print(T.solution(arr, n));
        kb.close();

    }

    private int solution(ArrayList<Timess> arr, int n) {
    int count =1;
    int ed =0;
        Collections.sort(arr);
        for (Timess ob : arr){
            if (ob.a <  ed ){
                count ++;
                ed = ob.b;
            }


        }

        return count;
    }
}
