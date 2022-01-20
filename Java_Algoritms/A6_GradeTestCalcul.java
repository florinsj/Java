// write a program that calculates the grade for a course
// labGrade=(test1Grade+test2Grade)/2
// finalGrade=70% labGrade + 30% examGrade
// we will have as input data : test1Grade, test2Grade and examGrade
// if any of the three grades is less than 5 , the program will print "failed" ; Else will print finalGrade value


package Java_Algoritms;

import java.util.Scanner;

public class A6_GradeTestCalcul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("test1Grade= ");
        double test1Grade = scan.nextDouble();
        System.out.println();
        System.out.print("test2Grade= ");
        double test2Grade = scan.nextDouble();
        System.out.print("examGrade= ");
        double examGrade = scan.nextDouble();
        if ((test1Grade < 5) || (test2Grade < 5) || (examGrade < 5)) {
            System.out.println("failed");
        } else {
            double labGrade = (test1Grade + test2Grade) / 2;
            double finalGrade = (labGrade * 70) / 100 + (examGrade * 30) / 100;
            System.out.println(finalGrade);
        }
    }
}
