import org.jbehave.scenario.Scenario;

public class ICanCalculateTheNextGeneration extends Scenario {
	public ICanCalculateTheNextGeneration(){
		super(new RuleEngineSteps());
	}
}
