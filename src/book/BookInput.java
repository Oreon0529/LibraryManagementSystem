package book;

import java.util.Scanner;

public interface BookInput {

   public int getId();

   public void setTitle(String title);

   public void setId(int id);

   public void setDate(String date);

   public void getUserInput(Scanner input);

   public void printInfo();

}