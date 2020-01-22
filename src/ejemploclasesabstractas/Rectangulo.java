package ejemploclasesabstractas;

/**
 *
 * @author Leila
 */
public class Rectangulo extends Cuadrilatero {

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public void calcularArea() {

        //  Cuadrilatero cu = new Cuadrilatero();
        /* 
        Si es referenciado
        
        Cuadrilatero rec = new Rectangulo();
        System.out.println("Area rectangulo= " + (super.getBase() * super.getAltura()));
        */
        System.out.println("Área rectangulo= "+super.getBase()*super.getAltura());
    }

}
