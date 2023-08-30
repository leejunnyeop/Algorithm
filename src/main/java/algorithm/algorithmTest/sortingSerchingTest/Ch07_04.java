package algorithm.algorithmTest.sortingSerchingTest;

public class Ch07_04 {
    /*
    title : 피보나치 수열
    시나리오 :
     */

    public static void main(String[] args) {
        Ch07_04 T = new Ch07_04();
        for (int a = 1; a <= 10; a++)
            System.out.print(T.DFS(a) + " ");
    }

    private int DFS(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        else{
          return DFS(i -1 ) + DFS(i -2);
        }


    }
}
