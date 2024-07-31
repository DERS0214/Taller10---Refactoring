/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author CltControl
 */
public class EmpleadoPorHoras extends Empleado {
    private String genero;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getTarifaHora();
    }

    // Más metodos
}
