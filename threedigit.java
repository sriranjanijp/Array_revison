/*
 * Write a program to input 10 numbers into an integer array and 
 * check whether all numbers are 3-digit numbers or not. 
 */
import java.util.Scanner;
class threedigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers");
        int flag = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]>99 && arr[i]<1000)
            {
                
            }
            else
            flag = 1;
        }
        if (flag == 1)
        {
            System.out.println("All numbers are not 3 digit nos");
        }
        else
        {
            System.out.println("All numbers are 3 digit nos");
        }
    }
}