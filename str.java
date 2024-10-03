import java.util.Scanner;
public class str {
     public static Scanner hi=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("string operations");
       System.out.println("Enter a string1");
       String a=hi.next(); 
       System.out.println("Enter a string2");
       String b=hi.next(); 
       String s1=a.toLowerCase();
       String s2=b.toLowerCase();
       System.out.println("lower case:");
       System.out.println(s1+" "+ s2);
        s1=a.toUpperCase();
        s2=b.toUpperCase();
       System.out.println("upper case:");
       System.out.println(s1 +" "+  s2);
       s1=a.replace("hi","Hi");
       System.out.println("Replace:"+ s1);
       s2=b.trim();
       System.out.println("Trim:" +s2);
       if(a.equals(b))
       {
        System.out.println("they are equal with case");
       }
       else{
        System.out.println("Not equal");
       }
       if(a.equalsIgnoreCase(b))
       {
        System.out.println("they are equal");
       }
       else{
        System.out.println("Not equal");
       }
       System.out.println("length:"+a.length());
       System.out.println("char:"+a.charAt(2));
       System.out.println("compare:"+a.compareTo(b));
       System.out.println("concat:"+a.concat(b));
       System.out.println("Substring:"+a.substring(0));
       System.out.println("Substring:"+a.substring(0,5));
System.out.println("value:"+String.valueOf(123));
System.out.println("STRING:"+String.valueOf(123));
System.out.println("Index:"+a.indexOf('h'));
System.out.println("Index:"+a.indexOf('h',2));
int var=123;
System.out.println("converts:"+String.valueOf(var));

    }
}
