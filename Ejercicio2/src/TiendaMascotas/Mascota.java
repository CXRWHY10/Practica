package TiendaMascotas;

public class Mascota {
    private String nombre;
    private int edad;
    private  String color;
    public Mascota(String nombre, int edad, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.color=color;
    }
        public void sonido(){
            System.out.println("Los perros ladran");
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public String getColor() {
            return color;
        }
    }
