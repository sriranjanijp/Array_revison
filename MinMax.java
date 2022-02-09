import java.util.Scanner;

public class MinMax
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        int min = arr[0], max = arr[0], sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
                
            if (arr[i] > max)
                max = arr[i];

        }
        
        System.out.println("Largest Number = " + max);
        System.out.println("Smallest Number = " + min);
     }
}