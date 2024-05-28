package impl;
import api.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA{
    int [] elementos;
    int [] prioridades;
    int indice;

    public void InicializarCola(){
        indice = 0;
        elementos = new int[10];
        prioridades = new int [10];
    }

    public void AcolarPrioridad (int x, int prioridad){
        for (int j = indice ; j> 0 && prioridades [j-1] >= prioridad; j--){
            elementos[j] = elementos[j-1];
            prioridades[j] = prioridades[j-1];
        }
    }

    public void Desacolar(){
        indice--;
    }

    public int Primero(){
        return elementos[indice-1];
    }

    public boolean ColaVacia(){
        return (indice == 0);
    }

    public int Prioridad(){
        return prioridades[indice-1];
    }
}
