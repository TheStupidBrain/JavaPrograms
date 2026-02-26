import java.util.Scanner;

public class sumofdigits
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        int sum=0,t=n,d=0;

        while(n>0)
        {
            d=n%10;
            sum+=d;
            n=n/10;
        }
        System.out.println(" Sum of the digits of "+t+" is "+sum);
    }
}