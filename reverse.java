
import java.util.Scanner;


public class reverse
{
public static void main(String args[])
{
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter a number");
    int n=scanner.nextInt();
    int temp=n;
    int rev=0;
    while(n>0)
    {
        int x=n%10;
        rev=(rev*10)+x;
        n=n/10;
    }
    System.out.println("Reverse of " +temp+ " is "+rev);
}
}