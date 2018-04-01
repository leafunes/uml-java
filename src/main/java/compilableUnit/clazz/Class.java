package compilableUnit.clazz;

import compilableUnit.clazzBody.ClassBody;
import writter.Writter;

public class Class {
	
	private String name;
	private ClassBody classBody;
	
	public Class(String name, ClassBody classBody) {
		this.name = name;
		this.classBody = classBody;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void write(Writter writter) {
		
		writter.writeLine("public class " + name + " {");
		writter.ident();
		
		classBody.write(writter);
		
		//TODO deberia estar en el body
		writter.newLine();
		writter.writeLine("// Constructor");

		writter.newLine();
		writter.writeLine("public " + name + "() {");
		writter.writeLine("}");
		
		writter.deIdent();
		writter.newLine();
		writter.writeLine("}");
		
		
	}

}
