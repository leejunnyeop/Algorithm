package algorithm.algorithmTest.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ch09_03 {
    /*
    title : 결혼식
    시나리오 :

    친구들은 몇시 도착 , 몇시 떠남
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
            return this.a - o.a;
            else
                return o.b - this.b;
        }
    }

    public static void main(String[] args) {
        Ch09_03 T = new Ch09_03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Timess> arr = new ArrayList<>();
        for (int a =0; a <= n; a++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Timess(x, y));
        }
        System.out.print(T.solution(arr, n));
    }

    private int solution(ArrayList<Timess> arr, int n) {
    int count =0;
    int ed =0;
        Collections.sort(arr);
        for (Timess ob : arr){
            if (ob.a >=  ed ){
                count ++;
                ed = ob.b;
            }


        }

        return count;
    }
}
