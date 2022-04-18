import java.util.Scanner;
class evenodd
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [20];
        int even[] = new int [20];
        int odd[] = new int [20];
        for (int i = 0; i<20; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ein = 0, oin = 0;
        for (int j = 0; j<20; j++)
        {
            if (arr[j] % 2 == 0)
            {
               even[ein] = arr [j];
               ein++;
            }
            else
            {
               odd[oin] = arr [j];
               oin++;
            }
        }
        System.out.println("Even numbers:");
        for (int k = 0; k<20; k++)
        {
            System.out.println(even[k]);
        }
        System.out.println("Odd numbers:");
        for (int l = 0; l<20; l++)
        {
            System.out.println(odd[l]);
        }
    }
}