import java.util.Scanner;

public class fibonacci
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=scanner.nextInt();
        int f1=0,f2=1,f3=0;
        System.out.print(f1+", "+f2);

        for(int i=3;i<=n;i++)
        {
            f3=f1+f2;
            System.out.print(", "+f3);
            f1=f2;
            f2=f3;
        }
    }
}