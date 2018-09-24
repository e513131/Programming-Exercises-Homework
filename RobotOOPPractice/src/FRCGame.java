
public class FRCGame extends Game {
	private FRCRobot red1,red2,red3,blue1,blue2,blue3;
	
	public FRCGame(int blueAllianceScore, int redAllianceScore) {
		super(blueAllianceScore, redAllianceScore);
	}
	
	public void setRed1(FRCRobot red1){
		this.red1=red1;
	}
	
	public FRCRobot getRed1(){
		return red1;
	}
	
	public void setRed2(FRCRobot red2){
		this.red2=red2;
	}
	
	public FRCRobot getRed2(){
		return red2;
	}
	
	public void setRed3(FRCRobot red3){
		this.red3=red3;
	}
	
	public FRCRobot getRed3(){
		return red3;
	}
	
	public void setBlue1(FRCRobot blue1){
		this.blue1=blue1;
	}
	
	public FRCRobot getBlue1(){
		return blue1;
	}
	
	public void setBlue2(FRCRobot blue2){
		this.blue2=blue2;
	}

	public FRCRobot getBlue2(){
		return blue2;
	}
	public void setBlue3(FRCRobot blue3){
		this.blue3=blue3;
	}
	
	public FRCRobot getBlue3(){
		return blue3;
	}
	
	public boolean isBlueAlliance(FRCRobot robot) {
		return robot.equals(getBlue1()) ||
				robot.equals(getBlue2()) ||
				robot.equals(getBlue3());
	}
	public boolean isRedAlliance(FRCRobot robot) {
		return robot.equals(getRed1()) ||
				robot.equals(getRed2()) ||
				robot.equals(getRed3());
	}
	
	public int getAllianceScore(FRCRobot robot) {
		if(isBlueAlliance(robot))
			return getBlueAllianceScore();
		else if(isRedAlliance(robot))
			return getRedAllianceScore();
		else
			return -1;
	}
}
