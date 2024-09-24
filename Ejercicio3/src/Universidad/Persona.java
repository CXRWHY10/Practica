package Universidad;
public class Persona {
    private String nombre;
    private String direccion;
    Persona(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public void imprimir(){
        System.out.println("---PERSONA---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion);
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
