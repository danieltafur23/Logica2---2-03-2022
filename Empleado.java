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
package empleado;

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

        if(getEdad()<=21){
            retorno = "Principiante";
        }
        if((getEdad()>=22)&(getEdad() <= 35)){
            retorno = "Intermedio";
        }
        if(getEdad()>35){
            retorno = "Seniro";
        }
        
        return retorno;
    }

    @Override
    public String toString() {
        
        String cadena = ("Nombre: " + getNombre() + "\n"
                        + "Cedula: " + getCedula() + "\n"
                        + "Edad: " + getEdad() + "\n"
                        + "Casado: ");
                        
        if(isCasado()){
            cadena += "Si \n";
        }else{
            cadena += "No \n";
        }
        cadena += "Salario: " + getSalario() +"\n\n";
                
        
        return cadena;
    }

    public double aumentoSalario (double salario){
        this.salario = this.salario*(1+(salario/100));
        return this.salario;
    }
    
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the casado
     */
    public boolean isCasado() {
        return casado;
    }

    /**
     * @param casado the casado to set
     */
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
   
}
