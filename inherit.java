interface parent 
{
    public void display();
}
class child implements parent
{
    public void display1(){
    System.out.println("Be Motivated");
}
public void display(){
    System.out.println("Be Calm");
}
}
class Main
{
    public static void main(String[] args) {
        child ami=new child();
          ami.display();

    }
}