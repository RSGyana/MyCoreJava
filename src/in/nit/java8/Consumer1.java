package in.nit.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer1 {
//it will take data and won't return anything
	// same thing will print
	// it contain one abstract methods is accept()
	
	//one andThen()  ==default ==it used in conusmer chain purpose
	//in this case we will use more than one consumer
	public static void main(String[] args) {

	Consumer<String> c = s -> System.out.println(s);
		c.accept("durga"); // durga

		Consumer<Movie> c1 = m -> {
			System.out.println("movie name==" + m.moviename);
			System.out.println("hero name==" + m.heroname);
			System.out.println("heroine name==" + m.heroinename);
		};

		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		System.out.println(l);

		
		  for(Movie m:l) 
		  { c1.accept(m); }
		  
		  
		 

	}

	public static void populate(ArrayList<Movie> l) {
		l.add(new Movie("tarzon", "ajay", "aisha"));
		l.add(new Movie("mgadhira", "charan", "kajol"));
		l.add(new Movie("rebel", "prabhas", "tammana"));
		l.add(new Movie("bahubali", "prabhas", "anuska"));

	}

}

class Movie {
	String moviename;
	String heroname;
	String heroinename;

	public Movie(String moviename, String heroname, String heroinename) {
		super();
		this.moviename = moviename;
		this.heroname = heroname;
		this.heroinename = heroinename;
	}
	/*
	 * @Override public String toString() { return "Movie [moviename=" + moviename +
	 * ", heroname=" + heroname + ", heroinename=" + heroinename + "]"; }
	 */

}