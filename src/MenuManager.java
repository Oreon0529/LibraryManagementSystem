import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
        BooksManager booksManager = getObject("booksmanager.ser");
        if(booksManager == null) {
        	 booksManager = new BooksManager(input);
        }
        selectMenu(input, booksManager);
        putObject(booksManager, "booksmanager.ser");
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
					logger.log("checkout a book");
					break;
				case 2:
					booksManager.returned();
					logger.log("return a book");
					break;
				case 3:
					booksManager.editBooks();
					logger.log("edit books");
					break;
				case 4:
					booksManager.viewBooks();
					logger.log("view books");
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
	
	public static BooksManager getObject(String filename) {
        BooksManager booksManager = null;
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			try {
				ObjectInputStream in = new ObjectInputStream(file);
				
			booksManager = (BooksManager)in.readObject();
			
			in.close();
			file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			return booksManager;
		}
		
		return booksManager;
	}
	
	public static void putObject(BooksManager booksManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			try {
				ObjectOutputStream out = new ObjectOutputStream(file);
				
				out.writeObject(booksManager);
				
			out.close();
			file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}