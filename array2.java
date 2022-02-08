/*
 *  Write a program in Java to store 20 temperatures in °F 
 *  in a Single Dimensional Array (SDA) and 
 *  display all the temperatures after converting them into °C. 
 * Hint: c = ((f - 32) / 9))* 5
 */
import java.util.Scanner;
class array2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double f[] = new double [20];
        double c[] = new double [20];
        for (int i = 0; i < 20; i++)
        {
            f[i]=sc.nextInt();
        }
        for (int j = 0; j < 20; j++)
        {
            c[j] = ((f[j] - 32) / 9)* 5;
        }
        for (int p = 0; p < 20; p++)
        {
            System.out.println(c[p]);
        }
    }
}