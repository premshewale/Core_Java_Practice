package Items;

public class Item { //superclass
	
	private String title,publisher;
	private int yearPublished,ISBN;
	private double price;
	
	public Item(String title,String publisher,int yearPublished,int ISBN,double price){
		this.title = title;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.ISBN = ISBN;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return  "Item [" + (title != null ? "title=" + title + ", " : "")
				+ (publisher != null ? "publisher=" + publisher + ", " : "") + "yearPublished=" + yearPublished
				+ ", ISBN=" + ISBN + ", price=" + price + "]";
	}

	
		
	}

