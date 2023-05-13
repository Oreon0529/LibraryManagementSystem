package book;

import java.util.Scanner;

public abstract class Book {

   protected BookKind kind = BookKind.Academic;
   protected int userId;
   protected String title;
   protected int id;
   protected String date;

   public Book() {
   }

   public Book(BookKind kind) {
      this.kind = kind;
   }

   public Book(String title, int id) {
      this.title = title;
      this.id = id;
   }

   public Book(BookKind kind, int userId, String title, int id, String date) {
      this.kind = kind;
      this.userId = userId;
      this.title = title;
      this.id = id;
      this.date = date;
   }

   public BookKind getKind() {
      return kind;
   }

   public void setKind(BookKind kind) {
      this.kind = kind;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public abstract void printInfo();

}