public class Book {
	String title;
	int id;
	String date;

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

	public void printInfo() {
		System.out.println(" title: " + title + " id: " + id + " date: " + date);
	}
}