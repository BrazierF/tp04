import java.util.ArrayList;

public class ASet implements ASetInterface {
	private ArrayList<Vertex> vertexList;

	public ASet() {
		vertexList = new ArrayList<Vertex>();
	}
	public boolean estDansA(){
		for (Vertex X : vertexList) {
			if (this.equalsTo(X)==true) return true;
		}
		return false;
	}
		
public void rajouteDansA(){
	vertexList.add(Vertex this.Vertex);
		
	}
		
    
}
