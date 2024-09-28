 class encap {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
        if(age>18)
        {
            System.out.println("Greater");
        }
        else{
        System.out.println("smaller");
        }
    } 
}
public class demo
{
    public static void main(String[] args) {
        encap o=new encap();
        o.setName("hindhuja");
        o.setAge(23);
        System.out.println(o.getAge());
        System.out.println(o.getName());
    }
} 
