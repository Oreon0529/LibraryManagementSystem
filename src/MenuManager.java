import java.util.Scanner;

public class MenuManager {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      BooksManager booksManager = new BooksManager(input);

      int num = -1;
      while (num != 5) {
         System.out.println("*** Books Management System Menu ***");
         System.out.println("1. Checked-out Books");
         System.out.println("2. Returned Books");
         System.out.println("3. Edit Book Info");
         System.out.println("4. View All Books");
         System.out.println("5. Exit");
         System.out.println("Select one number between 1-5: ");
         num = input.nextInt();

         if (num == 1) {
            booksManager.checkedOut();
         } else if (num == 2) {
            booksManager.returned();
         } else if (num == 3) {
            booksManager.editBooks();
         } else if (num == 4) {
            booksManager.viewBooks();
         } else {
            continue;
         }
      }
   }
}