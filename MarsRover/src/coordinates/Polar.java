package coordinates;

public class Polar implements Coordinates{

	private int r;
	private float theta;
	
	public Polar (int r, float theta){
		this.r = r;
		this.theta = theta;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public float getTheta() {
		return theta;
	}
	public void setTheta(float theta) {
		this.theta = theta;
	}

	@Override
	public String getCoordinatesAsText() {
		return Integer.toString(this.r) + " " + Float.toString(this.theta);
	}
	
}
