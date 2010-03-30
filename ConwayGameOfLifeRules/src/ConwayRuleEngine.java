
public class ConwayRuleEngine {

	public void CalculateTheNextGeneration(Cell aCell) {
//		aCell.setIsAlive(nextGenerationAliveState(aCell));
	}
	
	private boolean nextGenerationAliveState(Cell aCell){ 
		return (aCell.isAlive() && cellHasTwoAliveNeighbors(aCell)) || cellHasThreeAliveNeighbors(aCell);
		}

	private boolean cellHasThreeAliveNeighbors(Cell aCell) {
		return aCell.getNumLiveNeighbors() == 3;
	}

	private boolean cellHasTwoAliveNeighbors(Cell aCell) {
		return aCell.getNumLiveNeighbors() == 2;
	}
	
}