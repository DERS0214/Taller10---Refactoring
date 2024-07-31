/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author CltControl
 */
public class EmpleadoTemporario_1 extends Empleado {
    
    private int mesesContrato;

    public EmpleadoTemporario_1(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.mesesContrato = mesesContrato;        
    }

    public void imprimirDetalles() {        
        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
    }  
    // Más metodos
}
