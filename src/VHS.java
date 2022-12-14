import java.util.ArrayList;

public class VHS extends Movie{
//	 field called currentTime which will start at 0 and match up with the indexes of the arraylist of scenes 

//	 A method called rewind() that returns nothing and sets currentTime to 0. 

	private int currentTime = 0;

	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super();
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	public void rewind() {
		this.currentTime = 0;
	}
	
	@Override
	public void play() {
	if(currentTime < getScenes().size()) {
		System.out.println(getScenes());
		
	} else if (currentTime >= (getScenes().size())) {
		rewind();
	}
	
	}
	
}
	
		
	
	
	
