import java.util.Scanner;

public class armstrong
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        int arm=0,t=n,d=0;

        while(n>0)
        {
            d=n%10;
            arm=arm+(d*d*d);
            n=n/10;
        }
        if(arm==t)
        {
            System.out.println(t+" is an Armstrong number");
        }
        else
        {
            System.out.println(t+" is not an Armstrong number");
        }
    }
}