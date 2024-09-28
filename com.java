import java.util.Scanner;
public class com
{
    public static void main(String args[])
    {
        System.out.println("Enter a name:");
        Scanner hindhu=new Scanner(System.in);
        String a=hindhu.nextLine();
        System.out.println("Enter a Age:");
        int b=hindhu.nextInt();
        System.out.println("Enter a Gender:");
        String c=hindhu.nextLine();
        System.out.println("Name:"+a);
        System.out.println("Age:"+b);
        System.out.println("Gender:"+c);
    }
}