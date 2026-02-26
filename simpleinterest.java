import java.util.Scanner;

public class simpleinterest
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float p=scanner.nextFloat();
        System.out.println("Enter the rate of intrest: ");
        int r=scanner.nextInt();
        System.out.println("Enter the time in years: ");
        int t=scanner.nextInt();
        float si=(p*r*t)/100;
        System.out.println("Intrest amount: "+si);
    }
}