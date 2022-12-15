import java.util.ArrayList;

public abstract class Movie {

//  A field for title that’s a string 
//	An field for runTime (in minutes) 
//	An array list of string called scenes
		public String title;
		public int runTime;
		public ArrayList<String> scenes = new ArrayList<String>();
		
		public abstract void play();
		
		public Movie() {
			
		}
		
		public Movie(String title, int runTime, ArrayList<String> scenes) {
			super();
			this.title = title;
			this.runTime = runTime;
			this.scenes = scenes;
		}
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getRunTime() {
			return runTime;
		}

		public void setRunTime(int runTime) {
			this.runTime = runTime;
		}

		public ArrayList<String> getScenes() {
			return scenes;
		}

		public void setScenes(ArrayList<String> scenes) {
			this.scenes = scenes;
		}
		
		
		public void printInfo() {
			System.out.println("Title: " + getTitle());
			System.out.println("Run time: " + getRunTime());
			
		}
		public void printScenes() {
			for (int i=0; i< scenes.size(); i++) {
				System.out.println(scenes.indexOf(i));
		
		}
		
		}

	
				
			
	}

