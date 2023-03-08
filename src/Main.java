/*
Question : Write a program to print fibonacci series.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ending,sum = 1,temp, temp2 = 0;
        System.out.println("Enter the ending number :");
        ending = sc.nextInt();
        System.out.println("Printing the fibonacci series :");
       for (int i = 1; i <= ending; i++){
           temp = temp2;
           temp2 = sum;
           sum = temp + temp2;
           System.out.print(temp + " ");
       }
    }
}