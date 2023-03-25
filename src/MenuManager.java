import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while(num != 6) {
			System.out.println("1. Checked-out Books");
			System.out.println("2. Returned Books");
			System.out.println("3. Edit Book Number");
			System.out.println("4. View All Books");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select a menu : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.print("작성 리스트 개수 입력 : ");				
				Scanner checked = new Scanner(System.in);
				int cStud = checked.nextInt();
				
				for(int i = 1; i<=cStud; i++) {
					System.out.print("학생 이름 : ");
					String cName = checked.next();
					
					System.out.print("책 제목 : ");
					String cTitle = checked.next();
					
					System.out.print("전화번호 : ");
					int cPhoneNum = checked.nextInt();
					
					System.out.print("대출 일시 : ");
					String cDate = checked.next();

					System.out.print("책 번호 : ");
					int cBookNum = checked.nextInt();
					
					System.out.println(i+" 이름: "+cName+" 책 제목: "+cTitle+" 전화번호: "+cPhoneNum+" 대출 일시: "+cDate+" 책 번호 : "+cBookNum);
				}break;
			case 2:
				System.out.print("작성 리스트 개수 입력 : ");				
				Scanner returned = new Scanner(System.in);
				int rStud = returned.nextInt();
				
				for(int i = 1; i<=rStud; i++) {
		
					System.out.print("책 번호 : ");
					int rBookNum = returned.nextInt();
					
					System.out.println(i+" 책 번호 : "+rBookNum);
				}break;
				
			case 3:
				System.out.print("편집할 기존 책 번호를 입력 :");
				Scanner edit = new Scanner(System.in);
				int editBook = edit.nextInt();
				System.out.println("신규 책 번호 입력 :");
				System.out.println("To be updated.");
				break;
			
			case 4:
				System.out.println("저장 돼있는 책들이 들어갈 예정");
				break;
				
			case 5:
				break;
				
			case 6:
				System.out.println("종료합니다.");
				
			}
		}
	}
}