/*
 *  Write a program in Java using arrays: 
(a) To store the Roll No., Name and marks in three subjects for 5 students. 
(b) Calculate the percentage of marks obtained by each candidate.
    The maximum marks in each subject are 100. 
(c) Calculate the Grade as per the given criteria: 

Percentage Marks 
From 80 to 100 
A 

From 60 to 79 
B 

From 40 to 59 
C 

Less than 40 
D 
 */
import java.util.Scanner;
class array5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m1[] = new int[5];
        int m2[] = new int[5];
        int m3[] = new int[5];
        int roll[] = new int[5];
        String name[] = new String[5];
        char m1g[] = new char[5];
        char m2g[] = new char[5];
        char m3g[] = new char[5];
                for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter name of student");
            name[i] = sc.next();
            System.out.println("Enter roll no of student");
            roll[i] = sc.nextInt();
            System.out.println("Enter marks of subject 1 of student");
            m1[i] = sc.nextInt();
            System.out.println("Enter marks of subject 2 of student");
            m2[i] = sc.nextInt();
            System.out.println("Enter marks of subject 3 of student");
            m3[i] = sc.nextInt();
        }
        // Calculates grade of subject 1
        for (int j = 0; j < 5; j++)
        {
            if (m1[j] <= 100 && m1[j] >= 80)
            m1g[j] = 'A';
            else if (m1[j] < 80 && m1[j] >= 60)
            m1g[j] = 'B';
            else if (m1[j] < 60 && m1[j] >= 40)
            m1g[j] = 'C';
            else
            m1g[j] = 'D';
        }
        // Calculates grade of subject 2
        for (int k = 0; k < 5; k++)
        {
            if (m2[k] <= 100 && m2[k] >= 80)
            m2g[k] = 'A';
            else if (m2[k] < 80 && m2[k] >= 60)
            m2g[k] = 'B';
            else if (m2[k] < 60 && m2[k] >= 40)
            m2g[k] = 'C';
            else
            m2g[k] = 'D';
        }
        // Calculates grade of subject 3
        for (int l = 0; l < 5; l++)
        {
            if (m3[l] <= 100 && m3[l] >= 80)
            m3g[l] = 'A';
            else if (m3[l] < 80 && m3[l] >= 60)
            m3g[l] = 'B';
            else if (m3[l] < 60 && m3[l] >= 40)
            m3g[l] = 'C';
            else
            m3g[l] = 'D';
        }
        // Display
        for (int m = 0; m < 5; m++)
        {
            System.out.println("Name = " + name[m]);
            System.out.println("Roll no = " + roll[m]);
            System.out.println("Grade in subject 1 = " + m1g[m]);
            System.out.println("Grade in subject 2 = " + m2g[m]);
            System.out.println("Grade in subject 3 = " + m3g[m]);
        }
    }
}