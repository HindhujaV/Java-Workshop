import java.io.File;
import java.io.FileWriter;
public class work1 {
    public static void main(String[] args) {
        try {
            File obj=new File("textfile.txt");
            if(obj.createNewFile())
            {
                System.out.println("File created successfullly");

            }
            else{
                System.out.println("File already Exist");
            }
            FileWriter o=new FileWriter(obj);
            for(int i=0;i<=10;i++)
            { 
                for(int j=0;j<=i;j++)
                    o.write("* ");
                    o.write("\n");
            }
            o.close();
        } catch (Exception e) {
           System.out.println("There is an error in file Creation");
        }
    }
}
