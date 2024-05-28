import api.ColaTDA;
import impl.ColaEstatica;


public class ColaEjemplo {
    public static void main(String[] args) throws Exception {
        
        ColaTDA cola = new ColaEstatica();

        cola.InicializaCola();
        cola.Acolar(8);
        cola.Acolar(13);
        cola.Acolar(45);
        cola.Acolar(78);
        cola.Acolar(4);

        System.out.println(cola.Primero());

        System.out.println("-----------------------");

        ColaTDA cola2 = new ColaEstatica();
        cola2.InicializaCola();

        int suma = 0;

        while (!cola.ColaVacia()) {
            suma+= cola.Primero();
            cola.Desacolar();
            cola2.Acolar(suma);
        }

        while (!cola2.ColaVacia()) {
            System.out.println(cola2.Primero());
            cola2.Desacolar();
        }
    }
}
