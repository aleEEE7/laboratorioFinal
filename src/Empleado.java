
public class Empleado {
	   private int codigo;
	    private String nombre;
	    private String cargo;
	    private double salario;

	    public Empleado(int codigo, String nombre, String cargo, double salario) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.cargo = cargo;
	        this.salario = salario;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getCargo() {
	        return cargo;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setCargo(String cargo) {
	        this.cargo = cargo;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public void mostrarEmpleado() {
	        System.out.println("Código: " + codigo);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Cargo: " + cargo);
	        System.out.println("Salario: $" + salario);
	    }
	}
