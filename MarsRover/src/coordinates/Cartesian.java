package coordinates;

public class Cartesian implements Coordinates{

	private int xAxis;
	private int yAxis;
	
	public Cartesian(int x, int y){
		this.xAxis = x;
		this.yAxis = y;
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}

	@Override
	public String getCoordinatesAsText() {
		// TODO Auto-generated method stub
		return Integer.toString(this.xAxis) + " " + Integer.toString(this.yAxis);
	}	
	
	
}
