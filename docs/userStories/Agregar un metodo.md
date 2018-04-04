## US3: Agregar un metodo que no tome parametros (16h)

### Descripcion
Se debe ser capaz de agregar un metodo que no tome parametros y devuelva void, **tipos nativos** o un tipo no nativo a una clase pre-existente. Tambien se debe ser capaz de asignarle al metodo niveles de acceso. Se debe ver la representacion java del metodo creado

### Criterios de aceptacion 
#### Criterio 1

Dada la clase pre-existente (en memoria) *Persona*, se le agrega el metodo *diaNacimiento* que devuelva *int*, con nivel de acceso *privado*, la representacion que se debe ver es:

~~~Java
	private int diaNacimiento(){
	
	}
~~~ 

Lo cual, dentro de el archivo .class debe verse:

~~~Java
public class Persona{
	
	public Persona(){
		
	}
	
	private int diaNacimiento(){
	
	}

}
~~~

### Tareas (Las horas incluyen testeo)

| Número | Descripción | Horas | 
| ------ | ------ | :------: |
| 0 | Crear la clase Method para representar un metodo java | 6 |
| 1 | Permitir que un Method pueda ser agregado a una Clase| 2 |
| 2 | Permitir que las instancias de Method se sepan parsear a String | 4 |
| 3 | Escribir en el archivo .class | 4 |