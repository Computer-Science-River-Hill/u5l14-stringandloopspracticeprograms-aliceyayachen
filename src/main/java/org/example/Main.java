package org.example; //DO NOT DELETE
import java.util.Scanner;
import java.text.NumberFormat;

//IMPORT STATEMENTS

//CLASS 

//main METHOD

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int choice = -1;

        do{

            System.out.println("Exercise Menu:");
            System.out.println("0 - exit");
            System.out.println(" 1- Further substring Fun");
            System.out.println(" 2- Run of Integers");
            System.out.println(" 3- Sum of a Range of Sequential Integers");
            System.out.println(" 4- Repeatedly Echo a Word");
            System.out.println(" 5- Words Separated by Dots");
            System.out.println(" 6- Adding up Integers");
            System.out.println(" 7- Shipping Cost Calculator\n");
            
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            
            if (choice == 0){
                System.out.println("Thank you for participating");

            }
            else if (choice == 1){
                String original = "";
                System.out.println("Exercise — Further substring Fun");
                input.nextLine();
                System.out.print("Enter a string: \n");
                original = input.nextLine();
                System.out.println("Enter beginning index: ");
                int beginning = input.nextInt();
                System.out.println("Enter ending index: ");
                int end = input.nextInt();
                System.out.println("\n");
                System.out.println("Original string: ");
                System.out.println(original + "\n");
                System.out.println("Substring: ");
                System.out.println(original.substring(beginning, end) + "\n\n");

            }
            else if (choice == 2){
                System.out.println("Exercise — Run of Integers");
                input.nextLine();
                System.out.println("Enter Start:");
                int start = input.nextInt();
                System.out.println("Enter end: ");
                int end = input.nextInt();

                System.out.println("\n");

                while (start <= end){
                    System.out.println(start);
                    start++;
                }
                System.out.println("\n\n");

            }
            else if (choice == 3){
                System.out.println("Exercise — Sum of a Range of Sequential Integers");
                System.out.println("Enter low:");
                int low = input.nextInt();
                System.out.println("Enter high:");
                int high = input.nextInt();
                int sum = 0;
                while (low <= high){
                    sum += low;
                    low++;
                }
                System.out.println("Sum = " + sum + "\n\n");
                
            }
            else if (choice == 4){
                System.out.println("Exercise — Repeatedly Echo a Word");
                input.nextLine();
                System.out.println("Enter a word: ");
                String word = input.nextLine();
                System.out.println("\n");

                for (int i = 0; i < word.length();i++ ){
                    System.out.println(word);
                }
                System.out.println("\n\n");
                
            }
            else if (choice == 5){
                System.out.println("Exercise — Words Separated by Dots");
                input.nextLine();
                System.out.println("Enter first word: ");
                String first = input.nextLine();
                System.out.println("Enter second word: ");
                String second = input.nextLine();

                System.out.println("");



                int dots = 30-first.length()-second.length();
                System.out.print(first);
                for (int i = 0; i < dots; i++){
                    System.out.print(".");
                }
                System.out.println(second + "\n");

            }
            else if (choice == 6){
                System.out.println("Exercise — Adding up Integers");
                System.out.println("How many integers will be added:");
                int added = input.nextInt();
                int sum = 0;

                for (int i = 0; i< added; i++){
                    System.out.println("Enter an integer:");
                    sum += input.nextInt();

                }

                System.out.println("The sum is " + sum + "\n");
                
            }
            else if (choice == 7){
                System.out.println("Exercise — Shipping Cost Calculator");
                
                int weight = -1;
                
            while (weight != 0){
                double cost = 3.0;

                System.out.println("Weight of Order:");
                NumberFormat money = NumberFormat.getCurrencyInstance();
                weight = input.nextInt();
                if (weight > 10){
                    cost += (0.25*(weight-10));

                }

                System.out.println("Shipping Cost: " + money.format(cost) + "\n");


            }

            System.out.println("bye \n");
                
            }

        } while (choice != 0);
    }
}
