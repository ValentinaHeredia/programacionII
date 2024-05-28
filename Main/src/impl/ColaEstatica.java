package impl;
import api.ColaTDA;

public class ColaEstatica implements ColaTDA{
    int [] array;
    int indice;

    public void InicializaCola(){
        array = new int[10];
        indice = 0;
    }

    public void Acolar(int x){
        for (int i = indice-1; i >= 0; i--){
            array[i+1] = array[i];
        }
        array[0]= x;
        indice ++;
    }

    public void Desacolar(){
        indice--;
    }

    public boolean ColaVacia(){
        return (indice == 0);
    }

    public int Primero(){
        return array[indice-1];
    }

}
