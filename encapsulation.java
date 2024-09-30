public class encapsulation {
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
    class encap
    {
        public static void main(String[] args) {
            encapsulation o=new encapsulation();
            o.setName("hindhuja");
            o.setAge(23);
            System.out.println(o.getAge());
            System.out.println(o.getName());
        }
    }
    
    
