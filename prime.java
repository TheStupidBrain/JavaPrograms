
import java.util.Scanner;

public class prime{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the starting and end limit");

        int n=scanner.nextInt();
        int m=scanner.nextInt();
        for(int x=n;x<m;x++)
        {
            boolean isPrime=true;
            if(x<=1)
            {
                isPrime=false;
            }
            else
            {
                for(int i=2;i<=Math.sqrt(x);i++)
                {
                    if(x%i==0)
                    {
                        isPrime=false;
                        break;

                    }
                }
            }
            if(isPrime)
            {
                System.out.println(x);
            }
        }
    }
}