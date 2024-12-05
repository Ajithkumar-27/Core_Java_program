import java.util.*;
public class DiagonalSum{
    public static void SumTheDiagonal(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
         System.out.println("Sum of diagonal elements: " + sum);
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[10][10];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                    arr[i][j]=sc.nextInt();
            }
        }
        SumTheDiagonal(arr);
    }
}