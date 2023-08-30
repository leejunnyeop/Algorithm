package algorithm.algorithmTest.sortingSerchingTest;

public class Ch07_02 {
    /*
    title : 재귀함수를 이용힌 이진수 출력
    시나리오 :

     */

    public static void main(String[] args) {
        Ch07_02 T = new Ch07_02();
        T.solution(11);
    }

    private void solution(int number) {
        DFS(number);

    }


    private void DFS(int number) {
        if(number == 0) return;
        else {
            DFS(number/2);
            System.out.print(number%2);
        }
    }
}
