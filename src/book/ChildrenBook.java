package book;

import java.util.Scanner;

public class ChildrenBook extends Book implements BookInput {

   public ChildrenBook(BookKind kind) {
      super(kind);
   }

   public void getUserInput(Scanner input) {
      System.out.print("Title: ");
      String title = input.next();
      this.setTitle(title);

      char answer = 'x';
      while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {

         System.out.print("Do you have a parents' User Id? (Y/N)");
         answer = input.next().charAt(0);
         if (answer == 'y' || answer == 'Y') {
            System.out.print("Parents' User Id: ");
            int userId = input.nextInt();
            this.setUserId(userId);
            break;
         } else if (answer == 'n' || answer == 'N') {
            this.setId(0);
            break;
         } else {

         }
      }

      System.out.print("Book Id: ");
      int id = input.nextInt();
      this.setId(id);

      System.out.print("Lending date: ");
      String date = input.next();
      this.setDate(date);
   }

   public void printInfo() {
      String skind = "none";
      switch (this.kind) {
      case Academic:
         skind = "Academic";
         break;
      case Children:
         skind = "Children";
         break;
      case Novel:
         skind = "Novel";
         break;
      case Nonfiction:
         skind = "Nonfiction";
         break;
      default:

      }
      System.out.println(" Kind: " + skind + " Parents' User Id : " + userId + " Title: " + title + " Book Id: " + id
            + " Date: " + date);
   }

}