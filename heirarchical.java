import java.util.Scanner;
class car
{
    public void c()
    {
    Scanner vehicle=new Scanner(System.in);
    System.out.println("Enter car name:");
    String name=vehicle.nextLine();
    System.out.println("Enter count");
    int num=vehicle.nextInt();
    System.out.println("car:"+name);
    System.out.println("count:"+num);
    }
}
class truck extends car
{
    String tname="mahendra";
    int no=23;
    public void tr()
    {
        System.out.println("Truck name:"+tname);
        System.out.println("count"+no);
    }
}
class bus extends car{
    public void b()
    {
        System.out.println("Public transport:Bus");
    }
}
class Veh
{
    public static void main(String[] args) {
        truck o1=new truck();
        o1.c();
        o1.tr();
        bus o2=new bus();
        o2.c();
        o2.b();
    }
}

