package algorithm.algorithmTest.greedyAlgorithm;

import java.util.Scanner;

public class Ch09_06 {

    /*
    Disjoint-Set : Union&Find

    title : 친구인가?
    scenario :
    (1, 2) (2, 3) (3, 4)
    1 번과 4번은 / 2,3 통해 친구이다

 1 2
 2 3
 3 4

 1 5

 6 7
 7 8
 8 9

 3 8

 3번에 친구 중 2 4 과 8번에 친구가 같나?



     */

    static final String no =  "NO";
    static final String yes = "YES";
    static int[] unf;

    public static void main(String[] args) {
        Ch09_06 T = new Ch09_06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int [n+1];
        for(int i =1; i <= n; n++){
            unf[i] = i;
        }
        for (int a =1; a < m; a++){
            int k = kb.nextInt();;
            int g = kb.nextInt();;
            Union(k, g);
        }
        int a = kb.nextInt();
        int b = kb.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if(fa == fb) System.out.print(yes);
        else System.out.print(no);


    }

    private static void Union(int k, int g) {
        int fa = Find(k);
        int fb = Find(g);
        if(fa != fb) unf[fa] = fb;
    }
    private static int Find(int val){
        if (val == unf[val]) return val;
        else return unf[val] = Find(unf[val]);
    }


}
