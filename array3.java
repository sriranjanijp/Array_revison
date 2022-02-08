/*
 * Write a program in Java to store 10 numbers 
 * (including positive and negative numbers) in a Single Dimensional Array (SDA). 
 * Display all the negative numbers followed by the positive numbers 
 * without changing the order of the numbers. 
 */
import java.util.Scanner;
class array3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[10];
        for (int i = 0; i < 10; i++)
        {
            x[i] = sc.nextInt();
        }
        for (int j = 0; j < 10; j++)
        {
            if (x[j] < 0)
            {
                System.out.println (x[j]);
            }
        }
        for (int k = 0; k < 10; k++)
        {
            if (x[k] > 0)
            {
                System.out.println (x[k]);
            }
        }
    }
}