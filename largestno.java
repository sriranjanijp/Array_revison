import java.util.*;
class largestno
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,3,7,3,7,9,11,5,6,8,9};
        int len = arr.length;
        int big = 0;
        int pos = 0;
        for (int i = 0; i<len; i++)
        {
            if (arr[i]>big)
            {
                big = arr[i];
                pos = i;
            }
        }
        System.out.println("The biggest no is " + big);
        System.out.println("Found at position " + pos);
    }
}