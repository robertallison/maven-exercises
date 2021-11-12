import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String userInput = myScanner.nextLine();

        System.out.println("StringUtils.isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
        System.out.println("StringUtils.lowerCase(userInput) = " + StringUtils.lowerCase(userInput));
        System.out.println("StringUtils.upperCase(userInput) = " + StringUtils.upperCase(userInput));
        System.out.println("StringUtils.swapCase(userInput) = " + StringUtils.swapCase(userInput));
        System.out.println("StringUtils.reverse(userInput) = " + StringUtils.reverse(userInput));
    }
}
