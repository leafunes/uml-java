## US4: Agregar un metodo que tome parametros (14h)

### Descripcion
Se debe ser capaz de agregar un metodo que tome parametros y devuelva void, **tipos nativos** o un tipo no nativo a una clase pre-existente. Tambien se debe ser capaz de asignarle al metodo niveles de acceso. Se debe ver la representacion java del metodo creado

### Criterios de aceptacion 
#### Criterio 1

Dada la clase pre-existente (en memoria) *Persona*, se le agrega el metodo *esMayorQue* que tome el parametro *otro* de tipo *Persona*, devuelva *boolean*, con nivel de acceso *publico*, la representacion que se debe ver es:

~~~Java
	public boolean esMayorQue(Persona otro){
	
	}
~~~ 

Lo cual, dentro de el archivo .class debe verse:

~~~Java
public class Persona{
	
	public Persona(){
		
	}
	
	public boolean esMayorQue(Persona otro){
	
	}

}
~~~

### Tareas (Las horas incluyen testeo)

| Número | Descripción | Horas | 
| ------ | ------ | :------: |
| 0 | Permitir que la clase Method represente los parametros de un metodo java | 6 |
| 1 | Permitir que las instancias de Method se sepan parsear a String | 4 |
| 2 | Escribir en el archivo .class | 4 |