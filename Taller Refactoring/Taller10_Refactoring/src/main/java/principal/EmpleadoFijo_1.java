/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author CltControl
 */
public class EmpleadoFijo_1 extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo_1(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
