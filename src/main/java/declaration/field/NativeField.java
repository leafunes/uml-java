package declaration.field;

import declaration.field.nativeTypes.NativeType;
import writter.Writter;

public class NativeField {
	
	private NativeType type;
	private String name;
	
	public NativeField(String name, NativeType type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}

	public void write(Writter writter) {
		type.write(writter);
		writter.buildLine(" ");
		writter.buildLine(name);
		writter.buildLine(";");
		writter.flushBuiltLine();
	}
	
}
