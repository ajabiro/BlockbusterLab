
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MovieApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
			
		List<Movie> movies = new ArrayList<>();
		
//		String[] mermaidScenes = newString[] {"Scene One", "Scene Two", "Scene Three", "Scene Four", "Scene Five" } 
//		movies.add(new DVD ("The Little Mermaid", 83, mermaidScenes));
		Movie movie = new VHS ("The Little Mermaid", 83);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movie.getScenes().add("Scene 4");
		movie.getScenes().add("Scene 5");
		movies.add(movie);
		movie = new VHS("Beauty and the Beast", 84);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movie.getScenes().add("Scene 4");
		movie.getScenes().add("Scene 5");
		movies.add(movie);
		movie = new VHS("The Jungle Book", 111);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movie.getScenes().add("Scene 4");
		movie.getScenes().add("Scene 5");
		movies.add(movie);
		movie = new DVD ("Tangled", 100);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movie.getScenes().add("Scene 4");
		movie.getScenes().add("Scene 5");
		movies.add(movie);
		movie = new DVD ("Frozen", 108);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movie.getScenes().add("Scene 4");
		movie.getScenes().add("Scene 5");
		movies.add(movie);
		movie = new DVD("Frozen 2", 103);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movie.getScenes().add("Scene 4");
		movie.getScenes().add("Scene 5");
		movies.add(movie);
		
		System.out.println("Please select a movie from the list: ");
		System.out.println("1) The Little Mermaid");
		System.out.println("2) Beauty and the Beast");
		System.out.println("3) The Jungle Book");
		System.out.println("4) Tangled");
		System.out.println("5) Frozen");
		
		System.out.println("Please select a movie you want to watch (1-6)");
		
		int choice = scnr.nextInt() - 1 ;
		
		if (choice < movies.size() && choice >= 0) {
			
			System.out.println("Title: " + movies.get(choice).title);
			System.out.println("Run Time: " + movies.get(choice).runTime+ " minutes");
			
			System.out.println("Do you want to watch " + movies.get(choice).title + "? : (yes or no)");
			
			String watch = scnr.next();
			if (watch.equals("yes")) {
				movies.get(choice).printScenes();
				movies.get(choice).play();
		}
			if (watch.equals("no")) {
			}

		}
		
	}
}
