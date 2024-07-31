/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author CltControl
 */
public class EmpleadoPorHoras_1 extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras_1(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora = tarifaHora;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * tarifaHora;
    }

    // Más metodos
}
