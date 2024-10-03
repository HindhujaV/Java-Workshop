import java.util.Scanner;
public class a2Work {
    public static void main(String[] args) {
        Scanner hindhu=new Scanner(System.in);
        System.out.println("Enter the row of the array");
        int r=hindhu.nextInt();
        System.out.println("Enter the column of the array");
        int c=hindhu.nextInt();
        int[][] arr=new int[r][c]; 
        System.out.println("Enter the elements in 2d array");
        for(int i=0;i<r;i++)
        { 
            for(int j=0;j<c;j++)
        {
            arr[i][j]=hindhu.nextInt();
        }   
        }
        System.out.println("The elements in 2d array are:");
        for(int i=0;i<r;i++)
        { 
            for(int j=0;j<c;j++)
        {
           System.out.print(arr[i][j]+" ");
        }   
        System.out.println();
        }
        hindhu.close();
    }
}


