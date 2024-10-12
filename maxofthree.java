import java.util.Scanner;
public class maxofthree{
    @SuppressWarnings("unused")
    private int a;
    @SuppressWarnings("unused")
    private int b;
    @SuppressWarnings("unused")
    private int c;

    public maxofthree(int n1,int n2, int n3)
    {
        this.a=n1;
        this.b=n2;
        this.c=n2;
    }

    public void findmax(int n1,int n2,int n3)
    {
        if(n1>n2&&n1>n3)
        {
            System.out.println("the Maximum of the three: " + n1);
        }
        else if(n2>n3&&n2>n3)
        {
            System.out.println("The moaximum of the three: " + n2);
        }
        else{
            System.out.println("The maximum of the three: " + n3);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        maxofthree max = new maxofthree(a, b, c);
        max.findmax(a,b,c);
        in.close();
    } 
}