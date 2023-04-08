import java.util.Scanner; 
public class MenuManager {
	public static void main(String[] args) {
		int num = 5;
		Scanner input = new Scanner(System.in);
		while (num != 6) {
			System.out.println("1. Add Books");
			System.out.println("2. Delete Books");
			System.out.println("3. Edit Books");
			System.out.println("4. View Books");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6: "); 
			num = input.nextInt();
			
			if (num == 1) {
				addStudent();
			} else if (num == 2) {
				deleteStudent(); 
			} else if (num == 3) {
				editStudent();
			} else if (num == 4) {
				viewStudent(); 
			} else {
				continue; 
			}
		}
	}
	public static void addStudent() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Student ID: ");
		int studentId = input.nextInt(); 
		System.out.print("Student name: "); 
		String studentName = input.next(); 
		System.out.print("Email address: "); 
		String studentEmail = input.next(); 
		System.out.println(studentEmail); 
		System.out.print("Phone number: "); 
		String studentPhone = input.next();
	}
	
	public static void deleteStudent() { 
		Scanner input = new Scanner(System.in); 
		System.out.print("Student ID: ");
		int studentId = input.nextInt(); 
	}
	
	public static void editStudent() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Student ID: ");
		int studentId = input.nextInt(); 
	}
	
	public static void viewStudent() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Student ID: ");
		int studentId = input.nextInt(); 
	}
}
