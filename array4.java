/*
 * Write a program in Java to store 20 numbers in a Single Dimensional Array (SDA).
 * Display the numbers which are prime. 
 */
import java.util.Scanner;
class array4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int count = 0, y; 
        int x[] = new int[5];
        for (int i = 0; i < 5; i++)
        {
            x[i] = sc.nextInt();
        }
        for (int j = 0; j < 5; j++)
        {
            for (int k = 1; k <= x[j]; k++)
            {
                if (x[j] % k == 0 )
                {
                   count++;
                }
                            }
            if (count <= 2)
            {
               System.out.println (x[j]);  
            }
            count = 0;
        }
    }
}