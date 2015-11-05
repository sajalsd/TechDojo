import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static ArrayList<Book> bookList = new ArrayList<Book>();
	
	
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd");
		bookList.add(new Book("java1", "author1", "edition1", "publication1", dateFormate.parse("2013-1-02")));
		bookList.add(new Book("java2", "author2", "edition2", "publication2", dateFormate.parse("2011-2-02")));
		bookList.add(new Book("java3", "author3", "edition3", "publication3", dateFormate.parse("2013-6-02")));
		bookList.add(new Book("java4", "author4", "edition4", "publication4", dateFormate.parse("2013-10-02")));
		bookList.add(new Book("java5", "author5", "edition5", "publication5", dateFormate.parse("2010-12-02")));
		
		
		Collections.sort(bookList);
		
		System.out.println(bookList);
		

	}

}
