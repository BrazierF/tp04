import java.util.ArrayList;

public class ASet implements ASetInterface {
	private ArrayList<Vertex> vertexList;

	public ASet() {
		vertexList = new ArrayList<Vertex>();
	}
	public boolean estDansA(Vertex Y){
		for (Vertex X : vertexList) {
			if (X.equalsTo(Y)==true) return true;
		}
		return false;
	}
		
public void rajouteDansA(Vertex Y){
	vertexList.add(Y);
		
	}
		
    
}
