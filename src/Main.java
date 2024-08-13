import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hooray!👋 Let 's play FizzBuzz...");
        System.out.print("Enter any number of ur choice: ");

        int nbr = scanner.nextInt();

        if (nbr % 5 == 0 && nbr % 3 == 0){
            System.out.println("FizzBuzz");
        } else if (nbr % 5 == 0) {
            System.out.println("Fizz");
        } else if (nbr % 3 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(nbr);
        }
    }
    // Switch statements may also be used

    }
