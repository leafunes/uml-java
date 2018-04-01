package compilableUnit.clazz;

import java.util.ArrayList;
import java.util.List;

import compilableUnit.clazzBody.ClassBody;
import compilableUnit.clazzBody.ClassBodyBuilder;
import declaration.field.NativeField;
import declaration.field.nativeTypes.NativeType;

public class ClassBuilder {

	private String name;
	private ClassBodyBuilder bodyBuilder;
	
	public ClassBuilder() {
		bodyBuilder = new ClassBodyBuilder();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addNativeField(NativeType type, String name) {

		bodyBuilder.addNativeField(type, name);
		
	}
	
	public Class build() {
		return new Class(this.name, bodyBuilder.build());
	}
	
	
	
}
