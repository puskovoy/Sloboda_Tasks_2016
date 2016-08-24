import com.sloboda.Candies;
import com.sloboda.SecretaryJeniffer;
import com.sloboda.Slobodafriends;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            do {/*task selection menu*/
                System.out.println("Please select the job number:");
                System.out.println(" 1 Candies");
                System.out.println(" 2 Secretary Jeniffer");
                System.out.println(" 3 Sloboda friends");
                System.out.println(" 0 - Exit");
                choice = scanner.nextInt();
            } while (choice < 0 | choice > 3);

            if (choice == 0) {
                System.out.println("Bye -_-");
                break;
            }

            switch (choice) {
                case 1:
                    Candies candies = new Candies();
                    System.out.println("Please enter how many grams of Candys: ");
                    int x = scanner.nextInt();
                    System.out.println("Please enter how many grams of tangerine: ");
                    int y = scanner.nextInt();
                    System.out.println("Please enter how many grams of apple: ");
                    int z = scanner.nextInt();
                    System.out.println("Please enter how many grams can make Santa Claus: ");
                    int w = scanner.nextInt();
                    System.out.println("Santa Claus can make " + candies.gifts(x, y, z, w) + " different versions of gifts.");
                    break;
                case 2:
                    SecretaryJeniffer secretaryJeniffer = new SecretaryJeniffer();
                    System.out.println("Please enter how many need copies to do: ");
                    int n = scanner.nextInt();
                    System.out.println("Please enter how many seconds of the first Xerox copy: ");
                    x = scanner.nextInt();
                    System.out.println("Please enter how many seconds the second Xerox copies: ");
                    y = scanner.nextInt();
                    System.out.println("The minimum time for the preparation of " + n + " copies is " + secretaryJeniffer.timeCopies(n, x, y) + " seconds.");
                    break;
                case 3:
                    Slobodafriends slobodafriends = new Slobodafriends();
                    System.out.println("Please enter number of people in the company: ");
                    n = scanner.nextInt();
                    System.out.println("Please enter a specific number of person: ");
                    x = scanner.nextInt();
                    System.out.println("The number of the certain friends - " + slobodafriends.people(n, x));
                    break;
            }
            System.out.println();
        }
    }
}
