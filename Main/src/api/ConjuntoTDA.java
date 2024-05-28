package api;

public interface ConjuntoTDA {
    void IncializarConjunto();
    boolean ConjuntoVacio();
    void Agregar(int x);
    int Elegir();
    void Sacar(int x);
    boolean Pertenece(int x);
}
