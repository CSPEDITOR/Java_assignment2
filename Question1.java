
// 1. Write a java program to find following using looping, decision making and
// Scanner class without function
// I. To verify whether a number is palindrome or not?
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To check the The number is Palindrome or not__");
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int orginalnumber = number;
        int reversenumber = 0;

        for (int i = 0; number != 0; i++) {
            int reminder = number % 10;
            reversenumber = reversenumber * 10 + reminder;
            number = number / 10;

        }

        if (orginalnumber == reversenumber) {
            System.out.println("It is Palindrome ");
        } else {
            System.out.println("It is not palindrome.");
        }

    }
}