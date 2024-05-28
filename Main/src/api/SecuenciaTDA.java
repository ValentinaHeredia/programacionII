package api;

public interface SecuenciaTDA {
    void InicializarSecuencia();
    void AgregarEnPos(int x, int p); //agregar en la posición o en el ultimo, no puede dejar espacios libres (reemplaza)
    void AgregarAlInicio(int x); //inserta el número en la primer posición
    void AgregarAlFinal(int x); //agrega en la ultima posición
    void InsertarEnPos(int x, int p); //inserta (no reemplaza)
    void EliminarPos(int p); //elimina y mueve.
    void EliminarTodosValor(int x); //elimina todos los valores iguales a X
    void Ordenar();
    void Mostrar(); //muestra la secuencia en pantalla
    void EliminarRepetidos();
    boolean SecuenciaVacia();
}
