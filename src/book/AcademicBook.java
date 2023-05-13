package book;

import java.util.Scanner;

public class AcademicBook extends Book implements BookInput {

   public AcademicBook(BookKind kind) {
      super(kind);
   }

   public void getUserInput(Scanner input) {
      System.out.print("User Id: ");
      int userId = input.nextInt();
      this.setUserId(userId);

      System.out.print("Title: ");
      String title = input.next();
      this.setTitle(title);

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
      System.out.println(
            " Kind: " + skind + " User Id : " + userId + " Title: " + title + " Book Id: " + id + " Date: " + date);
   }
}
