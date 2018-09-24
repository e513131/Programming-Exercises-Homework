
public class FRCRobot {
	private String name;
	private double weight;
	public int MAX_WEIGHT=120;
	private FTCGame[] games;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public FRCRobot (String name, double weight) {
		this.name=name;
		this.weight=weight;
	}
	
	public FTCGame[] getGames() {
		return games;
	}
	
	public void setGames(FTCGame[] games) {
		this.games=games;
	}
}
