package paquete;

// Clase Tren
public class Tren extends Transporte {
    private int numero_vagones;

    public Tren(int numero_vagones) {
        this.numero_vagones = numero_vagones;
    }

    @Override
    public void viajar() {
        System.out.println("Viajando en tren");
    }

    @Override
    public double calcular_tarifa() {
        return super.calcular_tarifa() + (numero_vagones * 2.0); // Tarifa base + costo adicional por vagón
    }
}