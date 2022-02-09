
/* 
 *  Write a program to accept 10 different numbers and 
 *  enter a number and search whether the number is present or not 
 *  in the list of array elements by using the binary search technique
 */
import java.util.Scanner;
public class arrbin
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int search, flag = 0, mid = 0, low = 0, high = 4;
        System.out.println("Enter number to search");
        search = sc.nextInt();
        while (low<=high)
        {
            mid = (low+high)/2;
            if (search > arr[mid])
            low = mid + 1;
            else if (search < arr[mid])
            high = mid - 1;
            else
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
        {
        int a = mid+1;
        System.out.println("Element in position " + a);
        }
        else
        System.out.println("Element does not exist");
    }
}
       