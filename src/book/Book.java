package book;

import java.util.Scanner;

import exception.DateFormatException;

public abstract class Book implements BookInput{

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

   	public void setDate(String date) throws DateFormatException{
   		if (!date.contains("/") && !date.equals("")) {
   			throw new DateFormatException();
   		}
   		this.date = date;
   	}

   	public int getUserId() {
	   return userId;
   	}

   	public void setUserId(int userId) {
	   this.userId = userId;
   	}

   	public abstract void printInfo();
 
   	public void setBookTitle(Scanner input) {
    	System.out.print("Book Title:");
		String title = input.next();
		this.setTitle(title);
    }
    
    public void setBookID(Scanner input) {
    	System.out.print("Book ID:");
		int id = input.nextInt();
		this.setId(id);
    }
    
    public void setBookDate(Scanner input) {
        String date = "";
        boolean validFormat = false;
        while (!validFormat) {   	
            System.out.print("Lending Date:");
            date = input.next();
            try {
                setDate(date);
                validFormat = true;
            } catch (DateFormatException e) {
                System.out.println("Incorrect Date Format. Put the lending date that contains '/'");
            }
        }
    }


    public void setUserID(Scanner input) {
    	System.out.print("User ID:");
    	int userId = input.nextInt();
    	this.setUserId(userId);
    }
    
    public String getKindString() {
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
	      	return skind;
	}
}