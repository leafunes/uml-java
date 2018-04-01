package writter;

public class OnMemoryWritter implements Writter{

	private String buffer = "";
	private String line = "";
	private Identator identator;
	
	public OnMemoryWritter() {
		identator = new Identator();
	}
	
	@Override
	public void write(String toWrite) {
		buffer += toWrite;
	}
	

	@Override
	public void writeLine(String s) {
		buffer += identator.identLine(s);
		newLine();
		
	}

	@Override
	public void newLine() {
		write("\n");
	}

	@Override
	public void ident() {
		identator.ident();
		
	}

	@Override
	public void deIdent() {
		identator.deIdent();
		
	}
	
	public String getWritten() {
		return buffer;
	}

	@Override
	public void buildLine(String s) {
		line += s;
		
	}

	@Override
	public void flushBuiltLine() {
		writeLine(line);
		line = "";
		
	}
	
}
