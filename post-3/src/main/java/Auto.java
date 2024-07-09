public class  Auto extends Vehiculo implements VehiculoConFrenos{
    public Auto(int velocidadInicial, int nivelCombustibleInicial) {
        super(velocidadInicial, nivelCombustibleInicial);
    }

    @Override
    public void moverse() {
        System.out.println("El auto está conduciendo en la carretera");
    }

    @Override
    public void frenar() {
        System.out.println("El auto se ha detenido");
    }

    @Override
    public void arrancar() {
        System.out.println("El auto ha arrancado");
    }
}