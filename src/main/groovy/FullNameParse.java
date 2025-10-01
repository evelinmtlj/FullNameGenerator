import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParse {
     public static void main(String[] args) {

         //use the private method to ask for first,last or first,middle,last name
         String usersName = enterInput("Enter your first name and last name or first, middle initial, and last name:  ").trim();
// this will split the name into parts
         String [] nameParts = usersName.split(" ");
// naming the parts

         // create if statements to check if middle initial or not
         if ( nameParts.length ==2) {
             String firstName = nameParts[0]; // nameParts[0 ] is first name
             String lastName = nameParts[1]; // name parts is split into three parts 1 for first name 2 for middle and 3 for last name
             System.out.println("Your name is " + firstName + " " + lastName);
         }else if (nameParts.length ==3) { // since all three are printed out you have to name the strings
             String firstName = nameParts[0];
             String middleInitial = nameParts[1].charAt(0) + "";
             String lastName = nameParts[2];
             System.out.println("Your name is "+ firstName + " " + middleInitial + "." +" "+ lastName);

         } else {
             System.out.println("ERROR: Enter your name in one of the two formats"); // works if user only enter name
         }


// create if statements for users with no middle initial













         }
// create a private method to be easier to ask for output
        private static String enterInput(String name) {
        Scanner scanner = new Scanner (System.in);
        System.out.print(name + " ");
        return scanner.nextLine();
     }
}
