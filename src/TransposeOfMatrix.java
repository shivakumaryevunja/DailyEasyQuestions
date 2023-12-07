import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.println("Original matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] transpose = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println();
        System.out.println("Transpose matrix: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
