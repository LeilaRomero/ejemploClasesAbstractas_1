package circulo;

import ejemploclasesabstractas.Poligonos;

/**
 *
 * @author Leila
 */
public class Circulo extends Poligonos {

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área circulo = " + (Math.PI * Math.pow(radio, 2)));
    }

}
