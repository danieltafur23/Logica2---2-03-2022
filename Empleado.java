/*
 
Necesita llevr un registro de sus empleados
    - nombre - String
    - cedula - String
    - edad - Entero (18<edad<45)
    - casado - boolean
    - Salario - Real

    -- Constructores con y sin parametros;
    -- Mtdo permita mostrar la clasificacion degun la edad de acuerdo al siguiente algoritmo
        edad <= 21, principiante
        22 <= edad <= 35 Intermedio
        edad > 35

*/        
package main;

public class Empleado {

    //Atributos
    private String cedula;
    private String nombre;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado (){} //Metodo por defecto
    
    public Empleado(String c, String n, int e, boolean cs, double s){
        this.cedula = c;
        this.nombre = n;
        this.edad = e;
        this.casado = cs;
        this.salario = s;
    }
    
    public String clasificacion(){
        String retorno="";

        if(edad<=21){
            retorno = "Principiante";
        }
        if((edad>=22)&(edad <= 35)){
            retorno = "Intermedio";
        }
        if(edad>35){
            retorno = "Seniro";
        }
        
        return retorno;
    }

    @Override
    public String toString() {
        
        String cadena = ("Nombre: " + nombre + "\n"
                        + "Cedula: " + cedula + "\n"
                        + "Edad: " + edad + "\n"
                        + "Casado: ");
                        
        if(casado){
            cadena += "Si \n";
        }else{
            cadena += "No \n";
        }
        cadena += "Salario: " + salario +"\n\n";
                
        
        return super.toString();
    }
    
   
}
