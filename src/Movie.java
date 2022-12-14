import java.util.ArrayList;

public abstract class Movie {

//  A field for title that’s a string 
//	An field for runTime (in minutes) 
//	An array list of string called scenes
		private String title;
		private int runTime;
		protected ArrayList<String> scenes = new ArrayList<String>();
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
			System.out.println(getTitle());
			System.out.println(getRunTime());
			
		}
		public void printScenes() {
			System.out.println(getScenes());
		
		}
		
		
				
			
	}

