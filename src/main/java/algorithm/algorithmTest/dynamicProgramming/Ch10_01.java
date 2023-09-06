package algorithm.algorithmTest.dynamicProgramming;

import java.util.Scanner;

public class Ch10_01 {
    /*
    title : 계단오르기
    scenario :
    만약 4개의 계단 있으면

    1  1  1  1
    1  1 2
    1 2  1
    2 1 1
     */

    static int []dy;

    public static void main(String[] args) {
        Ch10_01 T = new Ch10_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n+1];
        System.out.print(T.solution(n));
    }

    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for(int a =3; a <= n; a ++){
            dy[a] = dy[a-1] + dy[a-2];
            /*
            dy[3] = 1 + 2
            1 1 1
            1 2
            2 1
            dy[4] = 2 + 3
            1 1

             */
        }

        return dy[n];
    }
}
