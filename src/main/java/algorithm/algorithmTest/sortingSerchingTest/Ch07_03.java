package algorithm.algorithmTest.sortingSerchingTest;

public class Ch07_03 {

    /*
    title : 팩토리얼
    시나리오: 재귀함수 로
     */

    public static void main(String[] args) {
        Ch07_03 T = new Ch07_03();
       System.out.print(T.DFS(5));
    }


    private int DFS(int i) {
        if(i == 1) return 1;
        else{
            return i * DFS(i-1);
        }
    }
}
