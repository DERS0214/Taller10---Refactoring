/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author CltControl
 */
public class Empleado {
    private String nombre;
    private double salarioBase;
    private String genero;
    private int horasTrabajadas;
    private String departamento;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, String departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero = genero;
    }

    public double calcularSalario() {
        double salarioTotal = salarioBase;
        if (salarioBase>0) {
            if (horasTrabajadas >= 0) {
                // Horas trabajadas normales = 40;
                if (horasTrabajadas > 40) {
                    salarioTotal += (horasTrabajadas - 40) * 50; // Pago de horas extra
                }
            }else {
                throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
            }
        } else {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        switch (departamento) {
            case "Sistemas":
                salarioTotal += 20;
                break;
            case "Contabilidad":
                salarioTotal += 10;
                break;
            default:
                break;
        }
        return salarioTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Genero: " + this.getNombre());
        System.out.println("Salario: " + this.getSalarioBase());
        System.out.println("Horas trabajadas: " + this.getHorasTrabajadas());
        System.out.println("Departamento: " + this.getDepartamento());
    }
    // Más metodos
}
