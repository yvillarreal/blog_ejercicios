// Clase Bicicleta.java
public class Bicicleta extends Vehiculo implements VehiculoConFrenos{
    public Bicicleta(int velocidadInicial, int nivelCombustibleInicial) {
        super(velocidadInicial, nivelCombustibleInicial);
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta está pedaleando en el carril bici");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta se ha detenido");
    }

    @Override
    public void arrancar() {
        System.out.println("La bicicleta ha arrancado");
    }
}
