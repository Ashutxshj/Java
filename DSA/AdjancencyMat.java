public class AdjancencyMat{
    public class Node{
        char data;
        Node(char data){
            this.data=data;
        }
    }
    public class Graph{
        int[][] matrix;
        Graph(int size){
            matrix=new int[size][size];
        }
    }
    public static void main(String[] args){
      //* 2D array to store 1's/0's to represent edges
      //* Time Complexity:O(1)
      //* Space Complexity:O(v^2)

      Graph gp=new Graph(5);
    }
}