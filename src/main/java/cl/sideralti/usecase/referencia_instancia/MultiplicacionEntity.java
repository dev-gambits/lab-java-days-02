package cl.sideralti.usecase.referencia_instancia;

public class MultiplicacionEntity {
    private int numero1;
    private int numero2;

    // CONSTRUCTOR
    public MultiplicacionEntity() {}

    public MultiplicacionEntity(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    // GETTER AND SETTER
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // METHODS
    public int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }
}
