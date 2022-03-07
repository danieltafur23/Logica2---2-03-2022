package empleado;

public class Examen {
    public static void main(String[] args) {
        Empleado e = new Empleado("123", "Pedro", 30, true, 4000000);
        Programador  p1 = new Programador("123", "Sandra", 20, false, 30000, 120, "Java");
        
        System.out.println("Nombre del empleado: " + e.getNombre());
        System.out.println("Sueldo del empleado con aumento del 10%: " + e.aumentoSalario(10));
        
        System.out.println("Nombre del empleado: " + p1.getNombre());
        System.out.println("Sueldo del prpgramador con aumento del 10%: " + p1.aumentoSalario(10));
    }
}
