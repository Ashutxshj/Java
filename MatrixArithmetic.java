class Matrix{
    int[][] matrix;
    int rows,cols;

    Matrix(int[][] matrix){
        this.matrix=matrix;
        this.rows=matrix.length;
        this.cols=matrix[0].length;
    }
    void add(Matrix m){
        int[][] result= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j]=this.matrix[i][j]+m.matrix[i][j];
            }
        }
        display(result);
    }
    void subtract(Matrix m){
        int[][] result= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j]=this.matrix[i][j]-m.matrix[i][j];
            }
        }
        display(result);
    }
    void display(int[][] matrix){
        for(int[] row:matrix){
            for(int elem:row){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}
public class MatrixArithmetic{
    public static void main(String[] args){
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{5,6},{7,8}};
        Matrix m1=new Matrix(matrix1);
        Matrix m2=new Matrix(matrix2);

        System.out.println("Matrix Addition:");
        m1.add(m2);

        System.out.println("Matrix Subtraction:");
        m1.subtract(m2);
    }
}