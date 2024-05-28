package impl;
import api.ConjuntoTDA;
import api.DiccionarioTDA;

public class DiccionarioEstatico implements DiccionarioTDA {
    //Elemento devuelve dos valores, clave y valor juntos.
    class Elemento{
        int clave;
        int valor;
    }

    //Se crea una lista que contenga los elementos que devuelva Elemento
    Elemento [] elementos;
    int cant;

    public void InicializarDiccionario(){
        cant = 0;
        elementos = new Elemento[100];
    }

    public void Agregar(int clave, int valor){
        int pos = Clave2Indice(clave);
        if (pos == -1){
            pos = cant;
            elementos[pos] = new Elemento();
            elementos[pos].clave = clave;
            cant++;
        }
        elementos[pos].valor = valor;
    }

    private int Clave2Indice(int clave){
        int i = cant-1;
        //Elementos[i].clave se refiere al valor "clave" dentro de la class elemento
        while (i >= 0 && elementos[i].clave != clave){
            i--;
        }
        return i;
    }

    public void Eliminar(int clave){
        int pos = Clave2Indice(clave);
        if (pos!= -1){
            elementos[pos] = elementos[cant -1];
            cant--;
        }
    }

    public int Recuperar(int clave){
        int pos = Clave2Indice(clave);
        return elementos[pos].valor;
    }

    public ConjuntoTDA Claves(){
        ConjuntoTDA c = new ConjuntoEstatico();
        c.IncializarConjunto();
        for (int i = 0; i < cant; i++){
            c.Agregar(elementos[i].clave);
        }
        return c;
    }

}

