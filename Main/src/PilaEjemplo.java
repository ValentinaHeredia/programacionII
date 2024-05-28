import api.pilaTDA;
import impl.PilaEstatica;   


public class PilaEjemplo{
    public static void main(String[] args) throws Exception {
        pilaTDA origen = new PilaEstatica();
        origen.InicializarPila();

        origen.Apilar(5);
        System.out.println(origen.Tope());

        origen.Apilar(6);
        System.out.println(origen.Tope());

        origen.Apilar(1);
        System.out.println(origen.Tope());

        origen.Apilar(9);
        System.out.println(origen.Tope());

        pilaTDA destino = new PilaEstatica();
        destino.InicializarPila();

        System.out.println("-----------------------");


        while (!origen.PilaVacia()) {
            destino.Apilar(origen.Tope());
            origen.Desapilar();

            System.out.println("Tope de destino: " + destino.Tope());
            if (origen.PilaVacia()){
                System.out.println("Ya no hay elementos");
                System.out.println("");
                System.out.println("--------------------");
            }
            System.out.println("Tope de origen: " + origen.Tope());
            System.out.println("--------------------");
        }

    }
}
