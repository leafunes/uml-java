package declaration.field.nativeTypes;

import writter.Writter;

public class IntegerNativeType implements NativeType{

	@Override
	public void write(Writter writter) {
		writter.buildLine("int");
		
	}

}
