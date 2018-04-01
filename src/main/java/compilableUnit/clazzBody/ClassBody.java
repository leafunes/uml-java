package compilableUnit.clazzBody;

import java.util.List;

import declaration.field.NativeField;
import writter.Writter;

public class ClassBody {
	
	private List<NativeField> nativeFields;
	
	public ClassBody(List<NativeField> nativeFields) {
		
		this.nativeFields = nativeFields;
		
	}
	
	public List<NativeField> getNativeFields(){
		return this.nativeFields;
	}
	
	public void write(Writter writter) {
		
		writter.newLine();
		writter.writeLine("// Native Fields");
		
		nativeFields.forEach(nf -> nf.write(writter));

		
	}
	

}
