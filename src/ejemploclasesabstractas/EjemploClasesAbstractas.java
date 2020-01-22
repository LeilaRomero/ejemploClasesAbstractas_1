package ejemploclasesabstractas;

import circulo.Circulo;

/**
 *
 * @author Leila
 */
public class EjemploClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Poligonos tri = new Triangulo(5f, 4f);
        tri.calcularArea();

        Poligonos rec = new Rectangulo(5f, 4f);
        rec.calcularArea();
        
        //Circulo cir = new Circulo(5f);
        Poligonos cir = new Circulo(5f);
        cir.calcularArea();
        
        Ipoligono po = new Triangulo();
        po.calcularPerimetro();
    }

}
