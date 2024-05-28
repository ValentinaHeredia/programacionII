import api.SecuenciaTDA;
import impl.SecuenciaEstatica;

public class SecuenciaEstaticaEjemplo {
    public static void main(String[] args) throws Exception {
        SecuenciaTDA secuencia = new SecuenciaEstatica();
        secuencia.InicializarSecuencia();
        secuencia.AgregarEnPos(5, 0);
        secuencia.AgregarEnPos(9, 1);
        secuencia.AgregarAlInicio(7);

        secuencia.Mostrar();
    }
}
