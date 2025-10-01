import java.util.Scanner;

public class FullNameParse {
     public static void main(String[] args) {

         //use the private method to ask for first,middle,last name
         String firstLast = enterInput("Enter your first name and last name: ").trim();
         String firstMiddleLast = enterInput("Enter your first name, middle initial and last name: ").trim();


// create if statements for users with no middle initial













         }
// create a private method to be easier to ask for output
        private static String enterInput(String name) {
        Scanner scanner = new Scanner (System.in);
        System.out.print(name + " ");
        return scanner.nextLine();
     }
}
