package ejemploclasesabstractas;

/**
 *
 * @author Leila
 */
public interface Ipoligono {

    public static final double PI = 3.1416;

    public abstract void calcularArea();

    default public void calcularPerimetro() {
        System.out.println("Este método aparece por defecto en las clases que implementan poligono");
    }
}
