import java.lang.reflect.Array;
import java.util.Scanner;

public class NumbersToLetters {

    public static void main(String[] args) {
        boolean play = true;
        String ongeldig = "ongeldige invoer";
        String input;



        while (play) {

            Scanner scanner = new Scanner(System.in);


            Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");

            input = scanner.nextLine().toLowerCase();


            if (input.equals("x")) {
                play = false;


            } else if(input.equals("v")){


            System.out.println("geef een nummer van 0 tot 9");
            int inputScanner = scanner.nextInt();

            Translator translator = new Translator(alphabetic, numeric);
            String anwser = translator.translator(inputScanner);
            System.out.println(anwser);

            } else {
                System.out.println(ongeldig);
            }
            //input van de user krijgen en gebruiken

            //gegevens uitprinten





        }
        System.out.println("U heeft gekozen om te stoppen.");
    }
}
