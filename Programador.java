package main;

class Programador extends Empleado{
    
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    //Metodo explicito
    public Programador (String cedula, String nombre, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante ){
        super(cedula, nombre, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    } 
    public Programador (){}
}
