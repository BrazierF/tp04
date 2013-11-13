import java.util.ArrayList;
public class Pi implements PiInterface {
	ArrayList<Pi> piList;
	private int distance ;
	public Pi(){
		piList = new ArrayList <Pi>();
	}
	
	public final int getDistance() {
		return distance;
	}

	public final void setDistance(int distance) {
		this.distance = distance;
	}

	public int ameliorationDistance(){
		
	}

}
