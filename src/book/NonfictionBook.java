package book;

import java.util.Scanner;

public class NonfictionBook extends Book {

	public NonfictionBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setUserID(input);
		setBookTitle(input);
		setBookID(input);
		setBookDate(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println(
				" Kind: " + skind + " User Id : " + userId + " Title: " + title + " Book Id: " + id + " Date: " + date);
    }
}