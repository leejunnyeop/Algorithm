package algorithm.algorithmTest.sortingSerchingTest;

public class Ch07_01 {

    /*
   Recursive
   제목 : 재귀 함수

   개념 : 재귀함수는 자신을 호출한다.

   시나리오 :

   스택 프레임 사용

   DFS(3) = 매개변수, 지역정보, 복귀 등 있다.
   재귀가(빽트레킹) 부터 위치기가 저장 되있다.
   이후 다음이 실행된다.



    */



    private void solution(int n){
        DFS(n);
    }

    private void DFS(int n) {
        if (n == 0) return;
        else {
            System.out.print(n + " ");
            DFS(n-1);
           // System.out.print(n + " ");
        }
    }


    public static void main(String[] args) {
        Ch07_01 T = new Ch07_01();
        T.solution(3);
    }
}
