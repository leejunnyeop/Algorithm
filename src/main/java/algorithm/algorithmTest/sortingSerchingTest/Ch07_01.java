package algorithm.algorithmTest.sortingSerchingTest;

public class Ch07_01 {

    /*
   Recursive
   제목 : 재귀 함수
   시나리오

    */
    private void solution(int n){
        DFS(n);
    }

    private void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }


    public static void main(String[] args) {
        Ch07_01 T = new Ch07_01();
        T.solution(3);
    }
}
