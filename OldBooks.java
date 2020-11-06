
import java.util.Scanner;
public class OldBooks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nameBook = scanner.nextLine();
		int countBooks=0;
		boolean answer = false;
		String nameBooks = scanner.nextLine();
		while (!nameBooks.equals("No More Books")) {					
			if ((nameBooks.equals(nameBook))) {
				answer=true;
				break;
			}
			nameBooks = scanner.nextLine();
			countBooks++;	
		} 
		if (answer) {
			System.out.printf("You checked "+countBooks+" books and found it.");
		} else {
			System.out.printf("The book you search is not here!\n");
			System.out.printf("You checked "+countBooks+" books.");
		}	
	}
}
