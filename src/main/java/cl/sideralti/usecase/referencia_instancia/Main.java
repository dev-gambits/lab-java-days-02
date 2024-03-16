package cl.sideralti.usecase.referencia_instancia;

public class Main {
    public static void main(String[] args) {
        //MultiplicacionInterface multiplicar = (a, b) -> a * b;

        // Referencia de Instancia   (CLASE::REFERENCIANAME)
        MultiplicacionEntity m = new MultiplicacionEntity();
        MultiplicacionInterface multiplicar = m::multiplicar;

        System.out.println("##################################################");
        System.out.println("##################################################");
        System.out.println("El resultado de la multiplicación es: ");
        System.out.println("Multiplicar 4 * 6:    " + multiplicar.realizarMultiplicacion(4,6));
        System.out.println("##################################################");
        System.out.println("##################################################");


    }
}
