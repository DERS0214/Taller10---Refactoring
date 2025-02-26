public class EmpleadoPorHoras extends Empleado {
    private String genero;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles(); //Just in case is needed for extra information
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * super.getTarifaHora();
        return salario;
    }

    // Más metodos
}
