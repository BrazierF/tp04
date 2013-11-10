public class Vertex {
   private int indice ;
   
	   
   public final int getIndice() {
	return indice;
}
   

public final void setIndice(int indice) {
	this.indice = indice;
}


   
	public boolean equalsTo(Vertex anotherVertex){
	 return (indice == anotherVertex.getIndice());
	}
}
