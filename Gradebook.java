package com.test4;

public class Gradebook {
	public static void main(String[] args) {
		double[] grades;
		System.out.print("enter the grades");
		int num=Sc.nextInt();if(num<=0)
		
		printGrades(grades);
		double average;
		average =averageGrade(grades);
		System.out.print("your average grade is"+":"+average);

        if (average >= 90) {
            System.out.print("Your grade is: A\n");
        } else if (average >= 80) {
            System.out.print("Your grade is: B\n");
        } else if (average >= 70) {
            System.out.print("Your grade is: C\n");
        } else if (average >= 60) {
            System.out.print("Your grade is: D\n");
        } else {
        	 System.out.print("Your grade is: F\n");
        }}
        public static void printGrades(double[] grades) {
        	for(int i=0;i<grades.length;i++) {
    			System.out.println("your grades in GradebookOO is"+i+":"+grades[i]);
    		}
       
        }
        public static double averageGrades(double[] grades) {
        	double sum=0.0;
    		for (double grade:grades) {
    			sum+=grade;
    			
    		}
    		
    		return(sum/grades.length);
        }
		
	}

}
