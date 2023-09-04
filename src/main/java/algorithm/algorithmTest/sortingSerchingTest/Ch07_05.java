package algorithm.algorithmTest.sortingSerchingTest;

public class Ch07_05 {
    /*
    title : 이진트리 순회
    시나리오 :

    재귀 함수

    예상 :

    lt -> 데이터 정보 : 2, 위치정보 : 44번째줄
    lt. lt -> 데이터 정보 :  4, 위치정보 : 44번째줄
    46번줄
    45번줄 호출 4 -> 2
    lt , rt -> 데이터 정보 : 5 , 위치 정보 : 49
    46번줄
    45번줄 호출 4 -> 2 -> 5
    46번줄
    root 1
    45 번줄 4 -> 2-> 1
    rt, lt 데이터 정보 :  6 , 위치정보 :  44
    43 번
    46
     4 -> 2-> 1 -> 6
    rt, rt 데이터 정보 : 7, 위치정보 : 59
     */


    public static class Node{
        int date;
        Node lt, rt;
        public Node(int val){
            date= val;
            lt=rt=null;
        }
    }

    Node root;

    public static void main(String[] args) {
        Ch07_05 tree = new Ch07_05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);

    }

    private void DFS(Node root) {
        if(root == null) return;
        else {
            DFS(root.lt);
            System.out.print(root.date + " ");
            DFS(root.rt);
        }
    }
}
