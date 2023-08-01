package algorithm.algorithmTest.sortingSerchingTest;


import java.util.Scanner;

public class Ch06_05 {
    /*
    제목 : 중복 확인

    시나리오

    중복 있으면 D
    없으면 U 출력

     */

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = kb.nextInt();;
        }
        String answer = "U";
        int p =0;
        for(int a = 0; a < n-1; a++){
            p = a+1;
           if (arr[a] == arr[p]){
               answer = "D";
               System.out.print(answer);
            }else
                p ++;
        }
        System.out.print(answer);

        kb.close();
    }

}
