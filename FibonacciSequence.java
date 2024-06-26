//This program prints the Fibonacci Sequence in Java

import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in fibonacci sequence = ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n == 1)
        {
            System.out.print(a);
        }
        else if(n == 2)
        {
            System.out.print(a+" "+b);
        }
        else
        {
            System.out.print(a+" "+b+" ");
            for(int i=3;i<=n;i++)
            {
                int c = a + b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}