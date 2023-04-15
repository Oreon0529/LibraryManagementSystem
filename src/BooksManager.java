import java.util.ArrayList;
import java.util.Scanner;

public class BooksManager {
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner input;

	BooksManager(Scanner input) {
		this.input = input;
	}

	public void checkedOut() {
		Book book = new Book();
		System.out.print("title: ");
		book.title = input.next();
		System.out.print("Book Id: ");
		book.id = input.nextInt();
		System.out.print("Lending date: ");
		book.date = input.next();
		books.add(book);
	}

	public void returned() {
		System.out.print("Book ID: ");
		int bookId = input.nextInt();
		int index = -1;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).id == bookId) {
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
			if (book.id == bookId) {
				found = true;
				int num = -1;
				while (num != 4) {
					System.out.println("** Book Info Edit Menu **");
					System.out.println("1. Edit Title");
					System.out.println("2. Edit Id");
					System.out.println("3. Edit Lending Date");
					System.out.println("4. Exit");
					System.out.println("Select one number between 1 - 4:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Book Title:");
						book.title = input.next();
					} else if (num == 2) {
						System.out.print("Book ID:");
						book.id = input.nextInt();
					} else if (num == 3) {
						System.out.print("Lending Date:");
						book.date = input.next();
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
		for (int i = 0; i < books.size(); i++) {
			books.get(i).printInfo();
		}
	}
}