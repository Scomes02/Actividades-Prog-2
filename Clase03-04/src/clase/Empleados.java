/*Defin a el método constructor de la clase 

Instancie 3 objetos 

Realice método calcular_edad() 

Realice método mostrar_datos()

Realice el diagrama de clases de la clase empleado 

Subir código y diagrama en un archivo word.*/

package clase;

public class Empleados {

    private String DNI="44405109";
    private String Nombre="Pablo";
    private String Apellido="Caprese";
    private String Domicilio="MAipu 1234";
    private String FechNac="1996-05-16";
    private Double SueldBruto=500000.01;

    public Empleados() {
    }

    public Empleados(String DNI, String Nombre, String Apellido, String Domicilio, String FechNac, Double SueldBruto) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Domicilio = Domicilio;
        this.FechNac = FechNac;
        this.SueldBruto = SueldBruto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getFechNac() {
        return FechNac;
    }

    public void setFechNac(String FechNac) {
        this.FechNac = FechNac;
    }

    public Double getSueldBruto() {
        return SueldBruto;
    }

    public void setSueldBruto(Double SueldBruto) {
        this.SueldBruto = SueldBruto;
    }

    void setFechNac() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
