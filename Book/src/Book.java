
public class Book {

	private String title;
	private String author;
	private int releaseDate;
	private double price;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void priceIncrase(double percent) {
		this.price*=1+(percent/100);
	}
	
	public String allData() {
		return "Cím: "+this.title+" Szerző: "+this.author+ " Kiadás éve: "+this.releaseDate+" Ár: "+this.price;
	}
	
	
}
