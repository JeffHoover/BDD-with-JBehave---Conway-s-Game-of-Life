
public class Cell {

	private int numLiveNeighbors = 0;
	private Boolean isAlive;
	public Cell(Boolean initiallyAlive, int numberOfAliveNeighbors) {
		isAlive = initiallyAlive;
		numLiveNeighbors = numberOfAliveNeighbors;
	}

	public Boolean isAlive() {
		return isAlive;
	}
	
	public void setIsAlive(Boolean becomesAlive) {
		isAlive = becomesAlive;
	}
	
	public int getNumLiveNeighbors(){
		return numLiveNeighbors;
	}

}
