/* 
 * Write a program to store 6 elements in an array P and 4 elements in an array Q. 
 * Now, produce a third array R, containing all the elements of array P and Q. 
 * Display the resultant array. 
 */ 
public class arrmerge
{
    public static void main(String args[])
    {
        int p[] = {3,6,7,3,8,2};
        int q[] = {69,420,13,2020};
        int r[] = new int[10];
        for (int i = 0; i < 10; i++)
        {
            if (i<6)
            r[i] = p[i];
            else
            r[i] = q[i - 6];
        }
        System.out.println("r[]");
        for (int j = 0; j < 10; j++)
        {
            System.out.println(r[j]);
        }
    }
}
