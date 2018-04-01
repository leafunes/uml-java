package declaration.field.nativeTypes;

import writter.Writter;

public class StringNativeType implements NativeType{

	@Override
	public void write(Writter writter) {
		writter.buildLine("String");
		
	}

}
