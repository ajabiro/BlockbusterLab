import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie{

	public DVD(String title, int runTime) {
		this.title = title;
		this.runTime = runTime;
	}
	Scanner scnr = new Scanner(System.in);
	@Override
	public void play() {
		System.out.println("Which scene would you like to watch? 1-6");
		super.printScenes();
		int choice = scnr.nextInt();
		
		System.out.println("Scene " + choice + scenes.get(choice));
		
		
	}
}

