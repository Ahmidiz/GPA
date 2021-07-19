package com.company;

import java.util.Scanner;

public class Main {
    public static void displayMenu () {
        String[] numberOfCourses = new String[] {"3 Courses","4 Courses","5 Courses","6 Courses","7 Courses"} ;
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        System.out.println("NUMBER OF COURSES");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i=0;i<=4;i++) {
            System.out.println((i + "<>" + numberOfCourses[i]));
        }


        System.out.println("Enter the number beside the number of courses you took in the sem:");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();

        // The conditions that help to determine number of courses the user did and it total GPA
        if (selection == 0) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("The GPA of the THREE COURSES are " + displayInstructionsFor3Courses());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        } else if (selection == 1) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("The GPA of the FOUR COURSES are " + displayInstructionsForFourCourse());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }else if (selection== 2) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("The GPA of the FIVE COURSES are " + displayInstructionsForFiveCourses());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }else if (selection == 3) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("The GPA of the SIX COURSES are " + displayInstructionsForSixCourses());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }else if (selection == 4) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("The GPA of the SEVEN COURSES are " + displayInstructionsForSevenCourses());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        } else if (selection >4)
            System.out.println("Please reselect your option");



    }
        //Where user who selected three courses is allowed to input information of their various courses.
    public static double displayInstructionsFor3Courses() {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Allows user to enter information about the first course
        System.out.println("Enter the COURSE CODE(no space) of the FIRST COURSE:");
        String first = input.nextLine();
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String [] gradesAndTheirGradePoint = new String[] {"A = 4.0","B+ = 3.5","B- = 3.0","C+ = 2.5","C- = 2.0","D+ = 1.5","D = 1.0","E = 0.5","F = 0.0"};
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Enter the corresponding GRADE POINT for your Grade in "+first+":");
        double gradePoint1 = input.nextDouble();
        System.out.println("Enter the CREDIT HOURS of "+first+":");
        double hours1 = input.nextDouble();


        // Allows user to enter information about the second course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the SECOND COURSE:");
        String second = input.next();
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+second+":");
        double gradePoint2 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+second+":");
        double hours2 = input.nextDouble();


        //This allows user to enter information about the third course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the THIRD COURSE:");
        String third = input.next();
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+third+":");
        double gradePoint3 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+third+":");
        double hours3 = input.nextDouble();


        // Call the calculateGPAofThreeCourses function
        double result = calculateGPAOfThreeCourses(gradePoint1,gradePoint2,gradePoint3,hours1,hours2,hours3);
        return result;

    }
    // Where the calculation of GPA is done for Three Courses
    public static double calculateGPAOfThreeCourses (double gradePoint1, double gradePoint2,double gradePoint3,double hours1,double hours2, double hours3  ){
        double GPA= ((gradePoint1*hours1)+(gradePoint2*hours2)+(gradePoint3*hours3))/(hours1+hours2+hours3);
        return GPA;
    }

    //Where user who selected four courses is allowed to input information of their various courses
    public static double displayInstructionsForFourCourse () {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Allows user to enter information about the first course
        System.out.println("Enter the COURSE CODE(no space) of the FIRST COURSE:");
        String first = input.nextLine();
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String [] gradesAndTheirGradePoint = new String[] {"A=4.0","B+ = 3.5","B- = 3.0","C+ = 2.5","C- = 2.0","D+ = 1.5","D = 1.0","E = 0.5","F = 0.0"};
                for (int i=0;i<=8;i++) {
                    System.out.println(i +"<>"+ gradesAndTheirGradePoint[i]);
                }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+first+":");
        double gradePoint1 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+first+":");
        double hours1 = input.nextDouble();


        // Allows user to enter information about the second course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the SECOND COURSE:");
        String second = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+second+":");
        double gradePoint2 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS "+second+":");
        double hours2 = input.nextDouble();


        //This allows user to enter information about the third course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the THIRD COURSE:");
        String third = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+third+":");
        double gradePoint3 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+third+":");
        double hours3 = input.nextDouble();


        // This allows user to enter information about the fourth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the FOURTH COURSE:");
        String fourth = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+fourth+":");
        double gradePoint4 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+fourth+":");
        double hours4 = input.nextDouble();


        // Call the calculateGPAofFourCourses function
        double result = calculateGPAOfFourCourse(gradePoint1,gradePoint2,gradePoint3,gradePoint4,hours1,hours2,hours3,hours4);
        return result;




    }

    // Where the calculation of GPA is done for Four Courses
    public static double calculateGPAOfFourCourse (double gradePoint1,double gradePoint2,double gradePoint3,double gradePoint4,double hours1,double hours2,double hours3,double hours4) {
        double GPA= ((gradePoint1*hours1)+(gradePoint2*hours2)+(gradePoint3*hours3)+(gradePoint4*hours4))/(hours1+hours2+hours3+hours4);
        return GPA;
    }

    //Where user who selected five courses is allowed to input information of their various courses
    public static double displayInstructionsForFiveCourses () {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Allows user to enter information about the first course
        System.out.println("Enter the COURSE CODE(no space) of the FIRST COURSE:");
        String first = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String [] gradesAndTheirGradePoint = new String[] {"A=4.0","B+ = 3.5","B- = 3.0","C+ = 2.5","C- = 2.0","D+ = 1.5","D = 1.0","E = 0.5","F = 0.0"};
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+first+":");
        double gradePoint1 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+first+":");
        double hours1 = input.nextDouble();

        // Allows user to enter information about the second course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the SECOND COURSE");
        String second = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+second+":");
        double gradePoint2 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+second+":");
        double hours2 = input.nextDouble();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        //This allows user to enter information about the third course
        System.out.println("Enter the COURSE CODE(no space) of the THIRD COURSE:");
        String third = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+third+":");
        double gradePoint3 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+third+":");
        double hours3 = input.nextDouble();


        // This allows user to enter information about the fourth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the FOURTH COURSE:");
        String fourth = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+fourth+":");
        double gradePoint4 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+fourth+":");
        double hours4 = input.nextDouble();


        // This allows user to enter information about the fifth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the FIFTH COURSE:");
        String fifth = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+fifth+":");
        double gradePoint5 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+fifth+":");
        double hours5 = input.nextDouble();

        // Call the calculateGPAofFiveCourses function
        double result = calculateGPAOfFiveCourses(gradePoint1,gradePoint2,gradePoint3,gradePoint4,gradePoint5,hours1,hours2,hours3,hours4,hours5);
        return result;
    }

    // Where the calculation of GPA is done for Five Courses
    public static double calculateGPAOfFiveCourses(double gradePoint1,double gradePoint2,double gradePoint3,double gradePoint4,double gradePoint5,double hours1,double hours2,double hours3,double hours4,double hours5){
    double GPA= ((gradePoint1*hours1)+(gradePoint2*hours2)+(gradePoint3*hours3)+(gradePoint4*hours4)+(gradePoint5*hours5))/(hours1+hours2+hours3+hours4+hours5);
    return GPA;
    }

    //Where user who selected six courses is allowed to input information of their various courses
    public static double displayInstructionsForSixCourses () {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Allows user to enter information about the first course
        System.out.println("Enter the COURSE CODE(no space) of the FIRST COURSE:");
        String first = input.nextLine();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String [] gradesAndTheirGradePoint = new String[] {"A=4.0","B+ = 3.5","B- = 3.0","C+ = 2.5","C- = 2.0","D+ = 1.5","D = 1.0","E = 0.5","F = 0.0"};
        for (int i=0;i<=8;i++) {
            System.out.println(i +"<>"+ gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+first+":");
        double gradePoint1 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+first+":");
        double hours1 = input.nextDouble();


        // Allows user to enter information about the second course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the SECOND COURSE:");
        String second = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+second+":");
        double gradePoint2 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+second+":");
        double hours2 = input.nextDouble();


        //This allows user to enter information about the third course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the THIRD COURSE:");
        String third = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+third+":");
        double gradePoint3 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+third+":");
        double hours3 = input.nextDouble();


        // This allows user to enter information about the fourth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the FOURTH COURSE:");
        String fourth = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT  ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+fourth+":");
        double gradePoint4 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+fourth+":");
        double hours4 = input.nextDouble();


        // This allows user to enter information about the fifth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the FIFTH COURSE:");
        String fifth = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade for "+ fifth+":");
        double gradePoint5 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of  "+ fifth+":");
        double hours5 = input.nextDouble();



        // This allows user to enter information about the sixth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the SIXTH COURSE:");
        String sixth = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade for "+ sixth+":");
        double gradePoint6 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+ sixth+":");
        double hours6 = input.nextDouble();


        // Call the calculateGPAofSixCourses function
        double result = calculateGPAOfSixCourses(gradePoint1,gradePoint2,gradePoint3,gradePoint4,gradePoint5,gradePoint6,hours1,hours2,hours3,hours4,hours5,hours6);
        return result;

    }


    // Where the calculation of GPA is done for Six Courses
    public static double calculateGPAOfSixCourses (double gradePoint1,double gradePoint2,double gradePoint3,double gradePoint4,double gradePoint5,double gradePoint6,double hours1,double hours2,double hours3,double hours4,double hours5,double hours6) {
        double GPA = ((gradePoint1*hours1)+(gradePoint2*hours2)+(gradePoint3*hours3)+(gradePoint4*hours4)+(gradePoint5*hours5)+(gradePoint6*hours6))/(hours1+hours2+hours3+hours4+hours5+hours6);
        return GPA;
    }

    //Where user who selected seven courses is allowed to input information of their various courses
    public static double displayInstructionsForSevenCourses (){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Allows user to enter information about the first course
        System.out.println("Enter the COURSE CODE(no space) of the FIRST COURSE:");
        String first = input.nextLine();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String [] gradesAndTheirGradePoint = new String[] {"A=4.0","B+ = 3.5","B- = 3.0","C+ = 2.5","C- = 2.0","D+ = 1.5","D = 1.0","E = 0.5","F = 0.0"};
        for (int i=0;i<=8;i++) {
            System.out.println(i +"<>"+ gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+ first+":");
        double gradePoint1 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+ first+":");
        double hours1 = input.nextDouble();


        // This allows the user to enter information about the second course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the SECOND COURSE:");
        String second = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+ second+":");
        double gradePoint2 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+ second+":");
        double hours2 = input.nextDouble();


        //This allows user to enter information about the third course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the THIRD COURSE:");
        String third = input.next();
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+third+":");
        double gradePoint3 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+ third+":");
        double hours3 = input.nextDouble();


        // This allows user to enter information about the fourth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the FOURTH COURSE:");
        String fourth = input.next();
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+ fourth+":");
        double gradePoint4 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of " + fourth+":");
        double hours4 = input.nextDouble();


        // This allows user to enter information about the fifth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the FIFTH COURSE:");
        String fifth = input.next();
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+ fifth+":");
        double gradePoint5 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+ fifth+":");
        double hours5 = input.nextDouble();

        //This allows user enter information about the sixth course
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the SIXTH COURSE:");
        String sixth = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+sixth+":");
        double gradePoint6 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+sixth+":");
        double hours6 = input.nextDouble();

        // This allows user to input information about the seventh course.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the COURSE CODE(no space) of the SEVENTH COURSE:");
        String seventh = input.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("GRADES and their corresponding GRADE POINT");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
          for (int i = 0; i <= 8;i++) {
            System.out.println(i + "<>" + gradesAndTheirGradePoint[i]);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the corresponding GRADE POINT for your Grade in "+seventh+":");
        double gradePoint7 = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the CREDIT HOURS of "+seventh+":");
        double hours7 = input.nextDouble();


        // Call the calculateGPAofSevenCourses function
        double result = calculateGPAOfSevenCourses(gradePoint1,gradePoint2,gradePoint3,gradePoint4,gradePoint5,gradePoint6,gradePoint7,hours1,hours2,hours3,hours4,hours5,hours6,gradePoint7);
        return result;

    }
    // Where the calculation of GPA is done for Seven Courses
    public static double calculateGPAOfSevenCourses(double gradePoint1,double gradePoint2,double gradePoint3,double gradePoint4,double gradePoint5,double gradePoint6,double gradePoint7,double hours1,double hours2,double hours3,double hours4,double hours5,double hours6,double hours7) {
        double GPA = ((gradePoint1*hours1)+(gradePoint2*hours2)+(gradePoint3*hours3)+(gradePoint4*hours4)+(gradePoint5*hours5)+(gradePoint6*hours6)+(gradePoint7*hours7))/(hours1+hours2+hours3+hours4+hours5+hours6+hours7);
        return GPA;
    }

    // This is what displays the display menu
    public static void main(String[] args) {
	displayMenu();
    }
}
