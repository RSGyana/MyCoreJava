package in.nit.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.operations.And;

import in.nit.java.loop.Foreachloop;
class Author{
	String authName;
	int id;
	
	
	@Override
	public String toString() {
		return "Author [authName=" + authName + ", id=" + id + "]";
	}
	public Author(String authName, int id) {
		this.authName = authName;
		this.id = id;
	}
	public Author() {
		super();
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

class Book{
	Author Auth;
	String bookName;
	int bookid;
	
	
	
	public Book(Author Auth, String bookName, int bookid) {
		super();
		this.Auth= Auth;
		this.bookName = bookName;
		this.bookid = bookid;
	}

	public Book() {
		super();
	}
	
	public Author getAuth() {
		return Auth;
	}
	public void setAuth(Author Auth) {
		Auth = Auth;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	@Override
	public String toString() {
		return "Book [Auth=" + Auth + ", bookName=" + bookName + ", bookid=" + bookid + "]";
	}
	
}
public class Stream4 {
	
	public static void main(String[] args) {
		List<Book> books=new ArrayList<Book>();
		
		books.add(new Book(new Author("kili",5)," bookName14",1));
		books.add(new Book(new Author("kili6",6)," bookName15",11));
		books.add(new Book(new Author("kili7",7)," bookName16",21));
		books.add(new Book(new Author("kili8",8)," bookName19",31));
		books.add(new Book(new Author("kili9",9)," bookName13",41));
		books.add(new Book(new Author("kili10",10)," bookName12",51));
		
 for(Book b:books) {
	 System.out.println(b.bookid+""+b.bookName);

 }
 
 Predicate<Book> p=(p1->p1.Auth.id>5);
 Function<Book,String> p1=(p2->p2.Auth.authName.toUpperCase());
 
 
 List<Book> list=books.stream().filter( p).collect(Collectors.toList());
 List<String> list1=list.stream().map(list11->list11.Auth.authName.toUpperCase()).collect(Collectors.toList());
 System.out.println(list1);
 
 list1.forEach(System.out::println);
 list.forEach(System.out::println);
 
 
 
 
	}

}
