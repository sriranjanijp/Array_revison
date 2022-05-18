/*
 *  Write a program in Java to store 20 numbers (even and odd numbers) 
 *  in a Single Dimensional Array (SDA). 
 *  Calculate and display the sum of all even numbers and all odd numbers separately.
 */
import java.util.Scanner;
class sumoddeven

{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int evensum = 0, oddsum = 0;
        int x[] = new int[20];
        for (int i = 0; i < 20; i++)
        {
            x[i]=sc.nextInt();
        }
        for (int j = 0; j < 20; j++)
        {
            if (x[j] % 2 == 0 )
            {
                evensum = evensum + x[j]; 
            }
            else
            {
                oddsum = oddsum + x[j];
            }
        }
        System.out.println("Sum of even numbers = " + evensum);
        System.out.println("Sum of odd numbers = " + oddsum);
    }
}