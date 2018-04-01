package compilableUnit.clazzBody;

import java.util.ArrayList;
import java.util.List;

import declaration.field.NativeField;
import declaration.field.nativeTypes.NativeType;

public class ClassBodyBuilder {

	private List<NativeField> nativeFields;
	
	public ClassBodyBuilder() {
		this.nativeFields = new ArrayList<>();;
	}
	
	public void addNativeField(NativeType type, String name) {

		NativeField nativeField = new NativeField(name, type);
		nativeFields.add(nativeField);
		
	}
	
	public ClassBody build() {
		return new ClassBody(nativeFields);
	}
	
}
