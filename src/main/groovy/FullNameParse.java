import java.util.Scanner;

public class FullNameParse {
     public static void main(String[] args) {

         //use the private method to ask for first,middle,last name
         String firstName = enterInput("Enter your first name: ").trim();
         String middleInitial = enterInput("Enter your middle initial (If none press enter to continue: ").trim();
         String lastName = enterInput("Enter your last name: ").trim();

// create if statements for users with no middle initial
         String fullName = firstName + " " + lastName;
         String withInitial = firstName + " " + middleInitial + "." +" " + lastName;


         if (!middleInitial.isEmpty()) {
            System.out.print(withInitial);
         } else {
             System.out.print("Your name is " + fullName);
         }








         }
// create a private method to be easier to ask for output
        private static String enterInput(String name) {
        Scanner scanner = new Scanner (System.in);
        System.out.print(name + " ");
        return scanner.nextLine();
     }
}
