public abstract class Vehiculo {
    private int velocidad;
    private int nivelCombustible;

    public Vehiculo(int velocidadInicial, int nivelCombustibleInicial) {
        this.velocidad = velocidadInicial;
        this.nivelCombustible = nivelCombustibleInicial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int nuevaVelocidad) {
        if (nuevaVelocidad >= 0) {
            this.velocidad = nuevaVelocidad;
        } else {
            System.out.println("La velocidad no puede ser negativa");
        }
    }

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(int nuevoNivelCombustible) {
        if (nuevoNivelCombustible >= 0 && nuevoNivelCombustible <= 100) {
            this.nivelCombustible = nuevoNivelCombustible;
        } else {
            System.out.println("El nivel de combustible debe estar entre 0 y 100");
        }
    }

    public void mostrarEstado() {
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Nivel de combustible: " + nivelCombustible + "%");
    }

    public abstract void moverse();
}
