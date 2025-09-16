package Items;

public class Book extends Item{
	private String author;
	private int edition;
	private int volume;
	public Book(String title, String publisher, int yearPublished, int ISBN, double price,String author,int edition,int volume) {
		super(title, publisher, yearPublished, ISBN, price);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.edition = edition;
		this.volume = volume;
	}
	@Override
	public String toString() {
		return super.toString()+ "Book [" + (author != null ? "author=" + author + ", " : "") + "edition=" + edition + ", volume="
				+ volume + "]";
	}
	
		
	}
	


