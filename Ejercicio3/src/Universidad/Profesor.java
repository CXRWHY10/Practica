package Universidad;
public class Profesor {
    private String departamento;
    private String categoria;
    private String nombre;
    private String direccion;
    Profesor(String nombre, String direccion, String departamento, String categoria){
        this.departamento = departamento;
        this.categoria = categoria;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public void imprimir(){
        System.out.println("---PROFESOR---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Departamento: "+departamento);
        System.out.println("Categoria: "+categoria);
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
