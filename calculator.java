public class calculator     
{
    public void add(int a,int b )
    {
        int c=a+b;
        System.out.println(c);
    }
    public void add(int a,int b,int c )
    {
        int d=a+b+c;
        System.out.println(d);
    }
    public void add(float a,float  b)
    {
        float j=a+b;
        System.out.println(j);
    }
    public static void main(String[] args) {
        calculator o=new calculator();
        o.add(11,12);
        o.add(23,34,65);
        o.add(3,5);
    }
}

