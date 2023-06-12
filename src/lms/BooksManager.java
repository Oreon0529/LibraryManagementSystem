package lms;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import book.AcademicBook;
import book.Book;
import book.BookInput;
import book.BookKind;
import book.ChildrenBook;
import book.NonfictionBook;
import book.NovelBook;

public class BooksManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2379349893606221937L;
	
	private ArrayList<BookInput> books = new ArrayList<BookInput>();
	transient Scanner input;

	public BooksManager(Scanner input) {
		this.input = input;
		this.books = new ArrayList<>();
	}

	public void checkedOut() {
		int kind = 0;
		BookInput bookInput;
		while (kind < 1 || kind > 4) {
			try {
				System.out.println("1 : Academic ");
				System.out.println("2 : Children ");
				System.out.println("3 : Novel ");
				System.out.println("4 : Nonfiction ");
				System.out.println("Select num for Book kind between 1 to 4:");
				kind = input.nextInt();
				input.nextLine();
				if (kind == 1) {
					bookInput = new AcademicBook(BookKind.Academic);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
	
				} else if (kind == 2) {
					bookInput = new ChildrenBook(BookKind.Children);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if (kind == 3) {
					bookInput = new NovelBook(BookKind.Novel);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if (kind == 4) {
					bookInput = new NonfictionBook(BookKind.Nonfiction);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else {
					System.out.println("Select num for Book Kind between 1 to 4:");
				}
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 to 4");
				if(input.hasNext()) {
					input.next();
				}
				input.nextLine();
				kind = -1;
			}
		}
	}

	public void returned() {
		System.out.print("Book ID: ");
		int bookId = input.nextInt();
		int index = findIndex(bookId);
		removefromBooks(index, bookId);
	}
	
	public int findIndex(int bookId) {
		int index = -1;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == bookId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromBooks(int index, int bookId) {
		if (index >= 0) {
			books.remove(index);
			System.out.println("the book " + bookId + " is returned");
			return 1;
		} else {
			System.out.println("the book has not been registered");
			return -1;
		}
	}

	public void editBooks() {
		System.out.print("Book ID: ");
		int bookId = input.nextInt();
		boolean found = false;
		for (int i = 0; i < books.size(); i++) {
			BookInput book = books.get(i);
			if (book.getId() == bookId) {
				found = true;
				int num = -1;
				while (num != 4) {
					showEditMenu();
					num = input.nextInt();
					
					switch(num) {
					case 1:
						book.setBookTitle(input);
						break;
					case 2:
						book.setBookID(input);
						break;
					case 3:
						book.setBookDate(input);
						break;
					default:
						continue;
					}
				}
			}
		}
		if (!found) {
			System.out.println("Book not found.");
		}
	}

    public void viewBooks() {
    	System.out.println("# of registered books:" + books.size());
    	for (int i = 0; i < books.size(); i++) {
    		books.get(i).printInfo();
    	}    	
    }
    
    public int size() {
    	return books.size();
    }
    
    public BookInput get(int index) {
    	return (Book) books.get(index);
    }
    
    
    public void showEditMenu() {
    	System.out.println("** Book Info Edit Menu **");
		System.out.println("1. Edit Title");
		System.out.println("2. Edit Book Id");
		System.out.println("3. Edit Lending Date");
		System.out.println("4. Exit");
		System.out.println("Select one number between 1 - 4:");    	
    }

}