import java.util.ArrayList;
import java.util.Scanner;

import book.Book;
import book.BookKind;
import book.ChildrenBook;

public class BooksManager {
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner input;

	BooksManager(Scanner input) {
		this.input = input;
	}

	public void checkedOut() {
		int kind = 0;
		Book book;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Academic ");
			System.out.println("2 for Children ");
			System.out.print("Select num for Book Kind between 1 and 2:");
			kind = input.nextInt();
			if (kind == 1) {
				book = new Book(BookKind.Academic);
				book.getUserInput(input);
				books.add(book);
				break;

			} else if (kind == 2) {
				book = new ChildrenBook(BookKind.Children);
				book.getUserInput(input);
				books.add(book);
				break;
			} else {
				System.out.print("Select num for Book Kind between 1 and 2:");
			}
		}
	}

	public void returned() {
		System.out.print("Book ID: ");
		int bookId = input.nextInt();
		int index = -1;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == bookId) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			books.remove(index);
			System.out.println("the book " + bookId + " is returned");
		} else {
			System.out.println("the book has not been registered");
			return;
		}
	}

	public void editBooks() {
		System.out.print("Book ID: ");
		int bookId = input.nextInt();
		boolean found = false;
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if (book.getId() == bookId) {
				found = true;
				int num = -1;
				while (num != 4) {
					System.out.println("** Book Info Edit Menu **");
					System.out.println("1. Edit Title");
					System.out.println("2. Edit Book Id");
					System.out.println("3. Edit Lending Date");
					System.out.println("4. Exit");
					System.out.println("Select one number between 1 - 4:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Book Title:");
						String title = input.next();
						book.setTitle(title);
					} else if (num == 2) {
						System.out.print("Book ID:");
						int id = input.nextInt();
						book.setId(id);
					} else if (num == 3) {
						System.out.print("Lending Date:");
						String date = input.next();
						book.setDate(date);
					} else
						continue;
				}
			}
		}
		if (!found) {
			System.out.println("Book not found.");
		}
	}

	public void viewBooks() {
//        System.out.print("book ID: ");
//        int bookId = input.nextInt();
		System.out.println("# of registered books:" + books.size());
		for (int i = 0; i < books.size(); i++) {
			books.get(i).printInfo();
		}
	}
}
