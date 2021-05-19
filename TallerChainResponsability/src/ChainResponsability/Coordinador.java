
package ChainResponsability;

/**
 *
 * @author ASUS PC
 */
public class Coordinador implements Aprobador {

    private Aprobador Aprobado;

    @Override
    public void setAprobado(Aprobador flujo) {
        this.Aprobado = flujo;
    }

    @Override
    public Aprobador getAprobado() {
        return this.Aprobado;
    }

    @Override
    public void solicitarPermiso(int PermisoDias) {
        if (PermisoDias == 1) {
            System.out.println("Permiso Normal concedido por el Coordinador de " + PermisoDias + " dias \n");       
    }
}}
