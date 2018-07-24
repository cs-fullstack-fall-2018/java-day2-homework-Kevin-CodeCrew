package org.codecrew.codeschool;

public class Main {

    public static void main(String[] args) {
	// Exercise 17: Create a printNumbers function to print integers from -25 to 20.
        printNumbers();
        printName();
        sumOf3Numbers(1,2,10);

    }

    private static void printNumbers()
    {
        System.out.println("\nExercise 16:\n");
        for (int x = -25; x<= 20; x++)
        {
            System.out.println(x);
        }
    }

    private static void printName()
    {
        System.out.println("\nExercise 17:\n");
        String studentName = "Kenn";
            System.out.println("Hello " + studentName);
    }

    private static void sumOf3Numbers(int number1,int number2,int number3)
    {
        System.out.println("\nExercise 18:\n");
        System.out.printf("The sum of %o + %o + %o = %o",number1, number2, number3,(number1+number2+number3));
    }

}
