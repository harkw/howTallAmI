import java.util.Scanner;

public class howTallAmI {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int heightInFeet, heightInInches;
        int heightInJustInches;

        System.out.println("How tall are you in feet and inches? ");
        heightInFeet = keyboard.nextInt();
        heightInInches = keyboard.nextInt();

        heightInJustInches = (int) (heightInFeet * 12.0) + heightInInches;

        System.out.println("You are " + heightInJustInches + " inches tall.");

        keyboard.close();


    }
}
