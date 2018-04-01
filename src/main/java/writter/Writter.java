package writter;

public interface Writter {

	public void write(String s);
	public void writeLine(String s);
	public void buildLine(String s);
	public void flushBuiltLine();
	public void newLine();
	public void ident();
	public void deIdent();
}
