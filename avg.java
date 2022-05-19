/*
 * Write a program to input 10 numbers into an integer array and 
 * print those numbers which are less than its average
 */
import java.util.Scanner;
class avg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int avg = 0, sum = 0;
        for (int i = 0; i<arr.length; i++)
        {
            sum = sum+arr[i];
        }
        avg = sum/arr.length;
        for (int i = 0 ; i<arr.length; i++)
        {
            if (arr[i] < avg)
            {
                System.out.println(arr[i]);
            }
        }
    }
}