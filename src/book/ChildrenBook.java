package book;

import java.util.Scanner;

public class ChildrenBook extends Book {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChildrenBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
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
		setBookID(input);
		setBookTitle(input);
		setBookDate(input);
	}

    public void printInfo() {
		String skind = getKindString();
		System.out.println(" Kind: " + skind + " Parents' User Id : " + userId + " Title: " + title + " Book Id: " + id
				+ " Date: " + date);
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