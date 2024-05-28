package impl;
import  api.ConjuntoTDA;

public class ConjuntoEstatico implements ConjuntoTDA{
    int [] array;
    int cant;


    public void IncializarConjunto(){
        array = new int[10];
        cant = 0;
    }

    public boolean ConjuntoVacio(){
        return(cant == 0);
    }

    public void Agregar(int x){
        if (!this.Pertenece(x)){
            array[cant] = x;
            cant ++;
        }
    }

    public int Elegir(){
        return array[cant-1];
    }

    public void Sacar(int x){
        int i = 0;
        while (i <  cant && array[i]!= x){
            i++;
        }
        if (i < cant){
            array[i] = array[cant-1];
            cant--;
        }
    }

    public boolean Pertenece(int x){
        int i = 0;
        while (i<cant && array[i]!=x){
            i++;
        }
        return (i < cant);
    }
}   
