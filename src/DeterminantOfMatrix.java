import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
  Task 4:
  give a matrix n x n , where n is a multiple of 4 , calculate all the determinant of each 4 x 4 block in the matrix using threads and create another matrix using those values
*/
class DeterminantCalculator implements Runnable{
    int[][] block;
    int row;
    int col;
    int[][] determinantMatrix;
    public DeterminantCalculator(int[][] block,int row, int col, int[][] determinantMatrix){
        this.block=block;
        this.row=row;
        this.col=col;
        this.determinantMatrix=determinantMatrix;
    }
    public void run(){
        int determinant=calculateDeterminant(block);
        determinantMatrix[row][col]=determinant;
    }
    int calculateDeterminant(int[][] block){
        int a=block[0][0];
        int b=block[0][1];
        int c=block[0][2];
        int d=block[0][3];
        int e=block[1][0];
        int f=block[1][1];
        int g=block[1][2];
        int i=block[1][3];
        int j=block[2][0];
        int k=block[2][1];
        int l=block[2][2];
        int m=block[2][3];
        int n=block[3][0];
        int o=block[3][1];
        int p=block[3][2];
        int q=block[3][3];

        int det=a*(f*(l*q-p*m)-g*(k*q-o*m)+i*(k*p-o*l))-b*(e*(l*q-p*m)-g*(j*q-m*n)+i*(j*p-n*l))+c*(e*(k*q-o*m)-f*(j*q-m*n)+i*(j*o-k*n))-d*(e*(k*p-o*l)-f*(j*p-n*l)+g*(o*j-k*n));
   return det;
    }
}

 class DeterminantOfMatrix {
    public static void main(String[] args) {
        int n = 8;
        int matrix[][] = new int[n][n];
        int determinantMatrix[][] = new int[n / 4][n / 4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        ExecutorService executor = Executors.newFixedThreadPool(n / 4);
        for (int i = 0; i < n; i += 4) {
            for (int j = 0; j < n; j += 4) {
                int block[][] = new int[4][4];
                for (int x = 0; x < 4; x++) {
                    for (int y = 0; y < 4; y++) {
                        block[x][y] = matrix[i+x][j+y];
                    }
                }
                DeterminantCalculator calculator = new DeterminantCalculator(block, i / 4, j / 4, determinantMatrix);
                executor.execute(calculator);
            }
        }
        executor.shutdown();
       while (!executor.isTerminated()) {
            Thread.yield();
        }
        System.out.println("Original Matrix");
        printMatrix(matrix);
        System.out.println("Determinant matrix");
        printMatrix(determinantMatrix);
    }
        public static void printMatrix(int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
            System.out.println();
    }
}
