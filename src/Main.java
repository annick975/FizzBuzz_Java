import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hooray!👋 Let 's play FizzBuzz...");
        System.out.print("Enter any number of ur choice: ");
        int nbr = scanner.nextInt();
        if (nbr % 3 == 0){
            System.out.println("Fizz");
        } else if (nbr % 5 == 0) {
            System.out.println("Buzz");
        } else if ((nbr % 3 == 0) && (nbr % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(nbr);
        }
    }

    }
