package impl;
import api.SecuenciaTDA;

public class SecuenciaEstatica implements SecuenciaTDA{
    int [] secuencia;
    int indice;

    public void InicializarSecuencia(){
        secuencia = new int [20]; 
        indice = 0;
    }

    public void AgregarEnPos(int x, int p){
        int j = 0;
        while (j <= indice && j != p) {
            j++;
        }
        secuencia[j] = x;
        indice++;
    } 

    public void AgregarAlInicio(int x){
        for (int i = indice; i > 0 ; i--){
            secuencia[i]= secuencia[i-1];
        }
        secuencia[0] = x;
        indice++;
    }

    public void AgregarAlFinal(int x){
        secuencia[indice-1] = x;
        indice++;
    }
    public void InsertarEnPos(int x, int p){
        
    } 
    public void EliminarPos(int p){

    }
    public void EliminarTodosValor(int x){

    }
    public void Ordenar(){

    }
    public void Mostrar(){
        for (int k = 0; k<=indice ; k++){
            System.out.print(secuencia[k] + " ");
        }
    }
    public void EliminarRepetidos(){

    }
    public boolean SecuenciaVacia(){
        return indice == 0;
    }
}
