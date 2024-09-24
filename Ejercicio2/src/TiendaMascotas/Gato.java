package TiendaMascotas;
class Gato extends Mascota {
    private double alturaSalto;
    private double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }
    @Override
    public void sonido() {
        System.out.println("Los gatos maullan y ronronean");
    }

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }
}
