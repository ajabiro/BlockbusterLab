import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
			
		List<Movie> movies = new ArrayList<>();
		Movie movie;
		movie = new Movie("The Little Mermaid", 83);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		movie = new Movie("Beauty and the Beast", 84);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		movie = new Movie("The Jungle Book", 111);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		movie = new Movie("Tangled", 100);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		movie = new Movie("Frozen", 108);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		movie = new Movie("Frozen 2", 103);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		
		
		System.out.println("Please select a movie from the list: ");
		System.out.println("1) The Little Mermaid");
		System.out.println("2) Beauty and the Beast");
		System.out.println("3) The Jungle Book");
		System.out.println("4) Tangled");
		System.out.println("5) Frozen");
		
		System.out.println("Please select a movie you want to watch");
		String choice = scnr.next();
	

	}

}

