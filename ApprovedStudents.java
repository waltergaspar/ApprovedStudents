/*
* Make a program to read a set of N names of students, as well as the grades they got in the 1st and 2nd semesters.
* Each of this information must be stored in a vector.
* Then, print out the names of the approved students, considering approved those whose average grade is greater than
* or equal to 6.0 (six).
*/

import java.util.Locale;
import java.util.Scanner;

public class ApprovedStudents {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numberStudents;

// getting the number of students
        System.out.print("Enter the number of students: ");
        numberStudents = scanner.nextInt();

// getting students names and grades
        String[] nameArray = new String[numberStudents];
        double[] grade1Array = new double[numberStudents];
        double[] grade2Array = new double[numberStudents];
        for (int i = 0; i < numberStudents; i++) {
            System.out.printf("Enter the name,  1st and 2nd grade, of the %dnd student: %n", i+1);
            scanner.nextLine();
            System.out.print("Name: ");
            nameArray[i] = scanner.nextLine();
            System.out.print("1st grade: ");
            grade1Array[i] = scanner.nextDouble();
            System.out.print("2st grade: ");
            grade2Array[i] = scanner.nextDouble();
        }

// getting the average grade
        double[] averageArray = new double[numberStudents];
        for (int j = 0; j < numberStudents; j++) {
            averageArray[j] = (grade1Array[j] + grade2Array[j]) / 2;
        }

// getting approved students
        System.out.println("Approved Students:");
        for (int i = 0; i < averageArray.length; i++) {
            if(averageArray[i] >= 6.0){
                System.out.println(nameArray[i]);
            }
        }
    }
}
