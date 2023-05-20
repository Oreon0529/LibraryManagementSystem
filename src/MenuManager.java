import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        BooksManager booksManager = new BooksManager(input);

        selectMenu(input, booksManager);
	}
   
	public static void selectMenu(Scanner input, BooksManager booksManager) {
		int num = -1;
		while (num != 5){
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					booksManager.checkedOut();
					break;
				case 2:
					booksManager.returned();
					break;
				case 3:
					booksManager.editBooks();
					break;
				case 4:
					booksManager.viewBooks();
					break;
				default:
					continue;
				}
		   
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 to 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
   
	public static void showMenu() {
		System.out.println("*** Books Management System Menu ***");
		System.out.println("1. Checked-out Books");
		System.out.println("2. Returned Books");
		System.out.println("3. Edit Book Info");
		System.out.println("4. View All Books");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5: ");
	}
}