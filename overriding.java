public class overriding {
public void display()
{
    System.out.println("parent");
}
}
class child extends overriding {
    public void display() {
        System.out.println("child");
    }
}
class demo{
    public static void main(String[] args) {
        child o=new child();
        o.display();
    }
}

