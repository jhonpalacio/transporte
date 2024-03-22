package paquete;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Transporte transporte1 = new Autobus(50);
        transporte1.viajar(); // Simular viaje en autobús
        double tarifa1 = transporte1.calcular_tarifa(); // Calcular tarifa total

        Transporte transporte2 = new Tren(10);
        transporte2.viajar(); // Simular viaje en tren
        double tarifa2 = transporte2.calcular_tarifa(); // Calcular tarifa total

        // Imprimir resultados
        System.out.println("Tarifa Autobus: " + tarifa1);
        System.out.println("Tarifa Tren: " + tarifa2);
    }
}