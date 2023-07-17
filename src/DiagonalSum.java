import java.util.Scanner;

public class DiagonalSum {
    public static void sumDiagonal(int[][] array,int row,int col)
    {
        int sum=0;
        for(int i=0;i< row;i++)
        {
            sum+=array[i][i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]= scanner.nextInt();
            }
        }
        sumDiagonal(array,row,col);
    }
}
