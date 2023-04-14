package ies;
/**
* Esta clase la utilizo para aprender a documentar con JavaDoc.
* @author Darío
* @version v0.1
* @since 1.2
* <p>Since es 1.2 porque pongo las etiquetas since, throws y serial, que están creadas desde la 1.2</p>
* @see <a href="https://es.wikipedia.org/wiki/Javadoc">enlace a el artículo de Wikipedia sobre javadoc</a>
*/
public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;
	/**
	 * Constructor de la clase, en la que se inicializan todos los atributos de la clase, que son pasados como parámetros.
	 * @param emp_no número del empleado, de tipo entero
	 * @param nombre nombre del empleado, de tipo String
	 * @param apellido apellido del empleado, de tipo String
	 * @param pobla población donde vive el empleado, de tipo String
	 * @param oficio oficio que ejerce el empleado, de tipo String
	 * @param salario salario mensual que cobra el empleado, de tipo Double
	
	 */
	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
	}
	
	public Empleado(int emp_no, String nombre, Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
	}
	/**
	 * Método getter con el que podemos obtener el valor del atributo emp_no
	 * @return el número de empleado, de tipo <b>int</b>
	 */
	public int getEmp_no() {
		return emp_no;
	}
	/**
	 * Método setter con el que podemos modificar el valor del atributo emp_no
	 * @param emp_no el dato que introducimos que queramos que sea el nuevo valor
	 */
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	/**
	 * Método que nos sube el salario a nuestro salario más un valor de tipo Double pasado como parámetro
	 * @param subida valor que introducimos de manera externa que se va a agregar al salario actual
	 */
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	/**
	 * Método que comprueba si el nombre del empleado es una cadena vacía. Si resulta serlo, devuelve <b>false</b>. En caso contrario devuelve <b>true</b>.
	 * @return si el nombre concuerda con una cadena vacía, de tipo <b>boolean<b/>
	 */
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}

	/**
	 * @throws NombreExcepcion esta etiqueta no puede ser implementada de manera realista porque ningún método nos lanza una excepción que tengamos que tratar
	 * @serial esta etiqueta no es utilizada de manera real en este caso, pero sería para serializar una variable
	 * @deprecated esta etiqueta no puede ser usada de manera real en esta clase, pero se utilizaría en el caso de tener un método que esté obsoleto y no vaya a seguir siendo utilizado en las versiones de Java posteriores
	 */
}