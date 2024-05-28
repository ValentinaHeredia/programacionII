package impl;
import api.pilaTDA;

public class PilaEstatica implements pilaTDA{
    int [] array;
    int indice;

    public void InicializarPila(){
        array = new int[10];
        indice = 0;
    }
    public void Apilar(int x){
        array[indice]= x;
        indice++;
    }
    public void Desapilar(){
        indice--;
    }

    public boolean PilaVacia(){
        return (indice == 0);
    }

    public int Tope(){
        return array[indice-1];
    }
}
