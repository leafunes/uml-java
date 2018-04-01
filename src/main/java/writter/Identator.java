package writter;

public class Identator {

	
	private int identLevel = 0;
	
	public void ident() {
		identLevel++;
	}
	
	public void deIdent() {
		if(identLevel > 0) {
			identLevel--;
		}
	}
	
	public String identLine(String toIdent) {
		String idented = "";
		for(int i = 0; i < identLevel; i++)
			idented += "\t";
		idented += toIdent;
		
		return idented;
	}
	
}
