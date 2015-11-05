import java.util.Date;


public class Book implements Comparable<Book>{
	
	private String title;
	private String author;
	private String edition;
	private String publication;
	private Date date;
	public Book(String title, String author, String edition,
			String publication, Date date) {
		
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.publication = publication;
		this.date = date;
	}
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
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", edition="
				+ edition + ", publication=" + publication + ", date=" + date
				+ "]\n";
	}
	
	
	@Override
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		return (b.getDate().compareTo(getDate()));
		 
	}

}
