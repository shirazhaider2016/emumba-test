import java.util.Scanner;

/**
 * Created by shiraz on 4/4/2020.
 */
public class Question0 {
    public static void main(String[] a) {
        printDrink();
    }

    static void printDrink() {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a number only:");

            Integer userEnteredNumber = Integer.parseInt(myObj.nextLine());
            System.out.println("User Entered Number is: " + userEnteredNumber);

            if ((userEnteredNumber % 5 == 0) && (userEnteredNumber % 3 == 0)) {
                System.out.println("No-Thanks");
            } else if (userEnteredNumber % 5 == 0) {
                System.out.println("Coca-Cola");
            } else if (userEnteredNumber % 3 == 0) {
                System.out.println("Pepsi");
            } else {
                System.out.println("No Drink");
            }
        } catch (Exception e) {
            System.out.println("wrong input " + e.getMessage());
        }

    }
}
