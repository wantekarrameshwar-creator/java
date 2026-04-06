import java.util.Scanner;

class FibonacciPattern
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c;
        Scanner input=new Scanner(System.in);
        System.out.println("entre the number=");
        n=input.nextInt();

        for(int i=1; i<=n; i++)
        {
        
            System.out.print(b);
            for(int j=1; j<i; j++)
            {
                c=a+b;
                System.out.print(c+"\t");
                a=b;
                b=c;
            }
            System.out.println("\t");
        }
    }
}