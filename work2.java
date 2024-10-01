import java.io.File;
import java.util.Scanner;
public class work2 {
    public static void main(String[] args) {
        try {
            File f=new File("textfile.txt");
            Scanner obj=new Scanner(f);
            while(obj.hasNextLine())
            {
                System.out.println(obj.nextLine());
            }
            obj.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
