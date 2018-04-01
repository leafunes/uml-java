package com.ungs.umlJavaCore;

import compilableUnit.clazz.Class;
import compilableUnit.clazz.ClassBuilder;
import declaration.field.nativeTypes.NativeTypeFactory;
import writter.OnMemoryWritter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	NativeTypeFactory factory = new NativeTypeFactory();
    	
    	ClassBuilder cb = new ClassBuilder();
    	cb.setName("Persona");
    	
    	cb.addNativeField(factory.getInteger(), "edad");
    	cb.addNativeField(factory.getInteger(), "altura");
    	cb.addNativeField(factory.getInteger(), "peso");
    	cb.addNativeField(factory.getString(), "nombre");
    	
    	Class c = cb.build();
    	
    	OnMemoryWritter w = new OnMemoryWritter();
    	c.write(w);
    	
    	System.out.println(w.getWritten());
    	
    }
}
