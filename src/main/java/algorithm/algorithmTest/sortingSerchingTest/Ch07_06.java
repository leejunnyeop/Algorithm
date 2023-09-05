package algorithm.algorithmTest.sortingSerchingTest;

public class Ch07_06 {
    /*
    title : 부분집합
    시나리오 : 해설지 해설
    예를 들어 3이면
    1 2 3
    1 2
    1 3
    1
    2 3
    2
    3

     */

    static int n;
    static int [] ch;

    public static void main(String[] args) {
        Ch07_06 T = new Ch07_06();
        n = 3;
        ch = new int [n+1];
        T.DFS(1);
    }

    private void DFS(int i) {
        if(i == n){
            String tmp = "";
            for (int a =1;  a <= n; a++) {
                if (ch[a] == 1) {
                    System.out.println("----------------------");
                    tmp += (i + " ");
                }
            }
                if (tmp.length() > 0){
                    System.out.println(tmp);
                }
        } else {
            ch [i] =1;
            DFS(i+1);
            ch[i] = 0;
            DFS(i+ 1);
        }
    }
}
