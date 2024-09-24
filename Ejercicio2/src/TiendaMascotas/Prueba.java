package TiendaMascotas;

public class Prueba {
    public static void main(String[] args) {
        Perro perro1 = new PerroPequeno("Rex", 2, "Marrón", 5.0, true);
        perro1.sonido();

        Gato gato1 = new GatoPeloLargo("Miau", 3, "Blanco", 1.5, 2.0);
        gato1.sonido();
    }
}
