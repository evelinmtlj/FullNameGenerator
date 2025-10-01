import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParse {
     public static void main(String[] args) {

         //use the private method to ask for first,last or first,middle,last name
         String usersName = enterInput("Enter your first name and last name or first, middle initial, and last name:  ").trim();
// this will split the name into parts
         String [] nameParts = usersName.split(" ");
// naming the parts
         String firstName = nameParts[0];
         String middleInitial = nameParts[1];
         String lastName = nameParts[2];


// create if statements for users with no middle initial













         }
// create a private method to be easier to ask for output
        private static String enterInput(String name) {
        Scanner scanner = new Scanner (System.in);
        System.out.print(name + " ");
        return scanner.nextLine();
     }
}
