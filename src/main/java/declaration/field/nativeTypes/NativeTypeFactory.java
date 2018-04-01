package declaration.field.nativeTypes;

public class NativeTypeFactory {

	public NativeType getInteger() {
		return new IntegerNativeType();
	}
	
	public NativeType getString() {
		return new StringNativeType();
	}
	
}
