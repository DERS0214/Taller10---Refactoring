/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author CltControl
 */
public class Main_1 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", 45, 15, 8, new Sistemas(), "Masculino");
        EmpleadoFijo emp2 = new EmpleadoFijo("Jorge Gaibor",700,45, new Contabilidad(),40, "Masculino");
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas",200,20, new Departamento(),6, "Masculino");

        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        emp1.imprimirDetalles();
        emp2.imprimirDetalles();
        emp3.imprimirDetalles();
    }
}
