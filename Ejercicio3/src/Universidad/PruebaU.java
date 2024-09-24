package Universidad;

public class PruebaU {
    public static void main (String[]args){
        Persona persona = new Persona("Huguito","Apote/Tiquipaya");
        persona.imprimir();
        Estudiante estudiante = new Estudiante("Juan Jose","Circunvalacion","Electronica",1);
        estudiante.imprimir();
        Profesor profesor = new Profesor("Miguel Juaniquina","Infocal","Cochabamba","Programacion");
        profesor.imprimir();
    }
}
