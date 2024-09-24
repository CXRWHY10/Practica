package TiendaMascotas;
class Perro extends Mascota {
    private double peso;
    private boolean muerde;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }
    public void sonido() {
        System.out.println("Los perros ladran");
    }

    public double getPeso() {
        return peso;
    }

    public boolean isMuerde() {
        return muerde;
    }
}
