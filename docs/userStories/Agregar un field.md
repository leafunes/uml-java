## US2: Agregar un field a una clase y ver su representacion en java (14h)

### Descripcion

Se debe ser capaz de agregar un field **nativo** con un nombre y un nivel de privacidad a una clase pre-existente. Se debe ver la representacion java del field dentro de la clase seleccionada.

### Criterios de aceptacion

#### Criterio 1

Dada la clase pre-existente (en memoria) *Persona*, se le agrega el field *edad* de tipo *int*, de privacidad *privada*, la representacion que se debe ver es:

~~~Java
	private int edad;
~~~ 

Lo cual, dentro de el archivo .class debe verse:

~~~Java
public class Persona{
	
	//Fields
	private int edad;
	
	public Persona(){
		
	}

}
~~~

### Tareas (Las horas incluyen testeo)

| Número | Descripción | Horas | 
| ------ | ------ | :------: |
| 0 | Crear la clase NativeField, y que permita definir niveles de privacidad y **tipos nativos** | 4 |
| 1 | Crear clases de **tipos nativos**| 4 |
| 2 | Parsear el codigo Java de runtime en Strings | 6 |
| 3 | Escribir en el archivo .class | 4 |