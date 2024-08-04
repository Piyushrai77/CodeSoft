package Project1;/*
                              PROJECT DETAILS
STUDENT GRADE CALCULATOR
Input: Take marks obtained(out of 100 )in each subject
Calculate Total Marks: Sum up the marks obtained in all Subject
Calculate Average Percentage: Divide the Total marks by the total number of subject to get the average \
percentage.
Grade Calculation: Assign grades on the average percentage achieved.
Display Result: Show the total marks , average percentage,and the corresponding grade to the user.
 */


import java.util.Scanner;

public class GradeCal {
    public static void main(String[] args) {

        System.out.println("Enter the number of Subjects ");
        Scanner sc= new Scanner(System.in);
        int numSubjects= sc.nextInt();

        //Holding the marks of each subject
        int [] marks= new int[numSubjects];
        int totalMarks=0;

        for (int i = 0; i < numSubjects; i++)
        {
            System.out.println("Enter marks for subject:" + (i+1) +  " ");
            marks[i] = sc.nextInt();
            totalMarks+=marks[i];
        }
        //Calculating the average percentage

        double averagePercentage= (double) totalMarks/numSubjects;

        //Assign Grades;
         char Grade;
        if (averagePercentage>=90)
        {
           Grade='A';
        }
        else if (averagePercentage>=80)
        {
            Grade='B';
        }
        else if (averagePercentage>=70)
        {
            Grade='C';
        }
        else if (averagePercentage>=60)
        {
            Grade='D';
        }
        else {
            Grade='E';
        }

        //Display Result

        System.out.println("Total Marks:" +totalMarks);
        System.out.println("Average Percentage:"+averagePercentage);
        System.out.println("Grade:"+Grade);

        sc.close();
    }
}