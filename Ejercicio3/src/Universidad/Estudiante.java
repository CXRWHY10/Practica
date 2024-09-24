package Universidad;
public class Estudiante {
    private String carrera;
    private int semestre;
    private String nombre;
    private String direccion;
    Estudiante(String nombre,String direccion, String carrera, int semestre){
        this.carrera = carrera;
        this.semestre = semestre;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public void imprimir(){
        System.out.println("---ESTUDIANTE---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Carrera: "+carrera);
        System.out.println("Semestre: "+semestre);
    }
    public String getCarrera() {
        return carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
