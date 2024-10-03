import java.util.Scanner;
public class matuser {
public static void main(String[] args) {
    Scanner hindhu=new Scanner(System.in);
    System.out.println("Enter no of rows and column for matrix 1");
    int r1=hindhu.nextInt();
    int c1=hindhu.nextInt();
    System.out.println("Enter no of rows and column for matrix 2");
    int r2=hindhu.nextInt();
    int c2=hindhu.nextInt();
    int[][] a=new int[r1][c1];
    int[][] b=new int[r2][c2];
    int[][] c=new int[r1][c2];
System.out.println("Enter elements for matrix 1");
    for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=hindhu.nextInt();
            }
        }
 System.out.println("Enter elements for matrix 2");
    for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=hindhu.nextInt();
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println("The resultant matrix is");
    for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
hindhu.close();
}
}
