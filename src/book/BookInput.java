package book;

import java.util.Scanner;

import exception.DateFormatException;

public interface BookInput {

   public int getId();

   public void setTitle(String title);

   public void setId(int id);

   public void setDate(String date) throws DateFormatException;

   public void getUserInput(Scanner input);

   public void printInfo();
   
   public void setBookTitle(Scanner input);
   
   public void setBookID(Scanner input);
   
   public void setBookDate(Scanner input);
   
   public void setUserID(Scanner input);
}