import api.pilaTDA;
import impl.PilaDinamica;

public class PilaDinamicaEjemplo {
    public static void main(String[] args) throws Exception {
        pilaTDA pila_original = new PilaDinamica();
        pila_original.InicializarPila();

        pila_original.Apilar(4);
        pila_original.Apilar(5);
        pila_original.Apilar(2);

        System.out.println(pila_original.Tope());

        pilaTDA pila_secundaria = new PilaDinamica();
        pila_secundaria.InicializarPila();

        pila_secundaria.Apilar(pila_original.Tope());
        pila_original.Desapilar();

        System.out.println(pila_secundaria.Tope());
        System.out.println(pila_original.Tope());



    }
}
