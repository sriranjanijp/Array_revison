import java.util.Scanner;
class arr
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int x[]= new int[5];
        for(int i= 0; i<5; i++)
        {
            x[i]= sc.nextInt();
        }
        for(int j= 0; j<5; j++)
        {
          if(x[j]<0)
          {
            System.out.println(x[j]);
        } 
        }
        for(int k= 0; k<5; k++)
        {
            if(x[k]>0)
          {
            System.out.println(x[k]);
        } 
        }
    }
}
