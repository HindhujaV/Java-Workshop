public class enhancedloop {
    public static void main(String[] args) {
        int a[]={2,4,5,7};
        System.out.println("1-D Array");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int b[][]={{3,4,6},{3,5,3}};
        System.out.println("2-D Array");

        for(int k[]:b)
        {
            for(int i:k)
            {
                System.out.print(" "+i);
            }
        System.out.println();
        }
    }
}
