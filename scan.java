import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        System.out.println("Enter a name:");
        Scanner hindhu = new Scanner(System.in);
        String a = hindhu.nextLine();
        
        System.out.println("Enter an Age:");
        int b = hindhu.nextInt();
        hindhu.nextLine(); // Consume the leftover newline
        
        System.out.println("Enter a Gender:");
        String c = hindhu.nextLine();
        
        System.out.println("Name: " + a);
        System.out.println("Age: " + b);
        System.out.println("Gender: " + c);
    }
}

