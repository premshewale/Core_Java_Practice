package Items;

public class MusicCD extends Item{
	private String artist;
	private int volume;
	public MusicCD(String title, String publisher, int yearPublished, int ISBN, double price,String artist, int volume) {
		super(title, publisher, yearPublished, ISBN, price);
		// TODO Auto-generated constructor stub
	
		this.artist = artist;
		this.volume = volume;
	}
	@Override
	public String toString() {
		return super.toString()+ "MusicCD [" + (artist != null ? "artist=" + artist + ", " : "") + "volume=" + volume + "]";
	}
	
	

}
