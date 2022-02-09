/* 
 *  Write a program to accept 10 different numbers and 
 *  enter a number and search whether the number is present or not 
 *  in the list of array elements by using the linear search technique
 */
import java.util.Scanner;
public class arrlin
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int search, flag = 0;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search");
        search = sc.nextInt();
        for ( int i = 0; i < 5; i++)
        {
            if (search == arr[i])
            {
                System.out.println(arr[i]);
                System.out.println("Search succesful");
                flag = 1;
            }
        }
        if (flag == 0)
        System.out.println("Search unsuccessful");
     }
}