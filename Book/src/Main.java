import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		Book book=new Book();
		
		book.setTitle(scan.nextLine());
		book.setAuthor(scan.nextLine());
		book.setReleaseDate(scan.nextInt());
		book.setPrice(scan.nextInt());
		
		System.out.println(book.allData());
		
		book.priceIncrase(85);
		
		System.out.println(book.allData());
	}
}
