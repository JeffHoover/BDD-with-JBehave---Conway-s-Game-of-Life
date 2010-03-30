import junit.framework.Assert;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;


public class RuleEngineSteps extends Steps {
    private Cell cell;
	private ConwayRuleEngine ruleEngine; 	
	  
	@Given("Rule $ruleNum: $aliveVal cell with $aliveCount neighbors")
	public void aliveOrDeadCellWithPossiblySomeAliveNeighbors(int ruleNum, String initialLiveState, int numberOfAliveNeighbors){
		ruleEngine = new ConwayRuleEngine();
		cell = new Cell(initialLiveState.equals("alive"), numberOfAliveNeighbors);
	}
	
	@When ("I calculate the next generation")
	public void iCalculateTheNextGeneration()
	{
		ruleEngine.CalculateTheNextGeneration(cell);
	}
	
	@Then ("the cell should be $resultingAliveState")
	public void theCellShouldBe(String expectedAliveState)
	{
		String actualAliveState = "alive";
		if (!cell.isAlive()){
			actualAliveState = "dead";
		}
		
		Assert.assertEquals(expectedAliveState, actualAliveState);
	}
}
