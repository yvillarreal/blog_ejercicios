public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(0, 100);
        Bicicleta bicicleta = new Bicicleta(0, 100);

        auto.moverse();
        auto.arrancar();
        auto.setVelocidad(60);
        auto.mostrarEstado();
        auto.frenar();

        bicicleta.moverse();
        bicicleta.arrancar();
        bicicleta.setVelocidad(15);
        bicicleta.mostrarEstado();
        bicicleta.frenar();
    }
}
