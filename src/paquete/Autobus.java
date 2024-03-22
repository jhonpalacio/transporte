package paquete;

// Clase Autobus
public class Autobus extends Transporte {
    private int numero_asientos;

    public Autobus(int numero_asientos) {
        this.numero_asientos = numero_asientos;
    }

    @Override
    public void viajar() {
        System.out.println("Viajando en autobús");
    }

    @Override
    public double calcular_tarifa() {
        return super.calcular_tarifa() + (numero_asientos * 0.5); // Tarifa base + costo adicional por asiento
    }
}