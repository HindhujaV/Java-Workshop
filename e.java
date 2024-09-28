//import java.util.Scanner;
class checking 
{   public static void main(String[] args)
     {
    String s1=new String("hello");
    String s2=new String("hello");
        if(s1==s2)
        {
            System.out.println("both have same name:"+s1);
        }
        else {
            System.out.println("Not same names");
        }
        if(s1.equals(s2))
        {
            System.out.println("both have same hash value:"+s1);
        }
        else {
            System.out.println("Not same hash values");
        }
        System.out.println("Content based code(HASH CODE) for male:"+s1.hashCode());
        System.out.println("content based code(HASH CODE) for female:"+s2.hashCode());
        System.out.println("Identity based code(IDENTITY CODE) for male:"+System.identityHashCode(s1));
        System.out.println("Identity Based code(IDENTITY CODE) for female:"+System.identityHashCode(s2));
    }
}

