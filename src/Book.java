import java.util.Scanner;

public class Book {

	protected BookKind kind = BookKind.Academic;
	protected String title;
	protected int id;
	protected String date;

	public Book() {
	}

	public Book(String title, int id) {
		this.title = title;
		this.id = id;
	}

	public Book(String title, int id, String date) {
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

	public void printInfo() {
		System.out.println(" title: " + title + " id: " + id + " date: " + date);
	}

	public void getUserInput(Scanner input) {
		System.out.print("title: ");
		String title = input.next();
		this.setTitle(title);

		System.out.print("Book Id: ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Lending date: ");
		String date = input.next();
		this.setDate(date);

	}
}