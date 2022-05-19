// Linear search
import java.util.Scanner;
class linsearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search term");
        int search = sc.nextInt();
        for (int i = 0; i<arr.length; i++)
        {
            if (search == arr[i])
            {
                System.out.println("Search successfull");
                System.out.println("Search term found at " + i);
                flag = 1;
            }
        }
        if (flag == 0)
        {
            System.out.println("Search unsuccessful");
        }
    }
}