import java.util.Scanner;
public class awork {
    public static void main(String[] args) {
        Scanner hindhu=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=hindhu.nextInt();
        int[] arr=new int[n]; 
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element  "+(i+1)+" :");
            arr[i]=hindhu.nextInt();
        }
        System.out.println("The elements in the arrays are:");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\n");
        }
        hindhu.close();
    }
}
