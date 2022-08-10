import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNum;
        String userInput, output;

        
        System.out.print("Input string to convert: ");
        userInput = scanner.nextLine().toLowerCase();


        String[] conversion = userInput.split(""); // split at every character

        for (int i = 0; i < conversion.length; i++) {

            randomNum = (int) (Math.random() * ((1) + 1));

            if (randomNum == 1) {
                conversion[i] = conversion[i].toUpperCase();
            }
        }

        for (int i = 0; i < conversion.length; i++) {

            System.out.print(conversion[i]);

        }
    }
}
