
package ChainResponsability;

/**
 *
 * @author ASUS PC
 */
public interface Aprobador {

    public Aprobador getAprobado();

    public void setAprobado(Aprobador flujo);

    public void solicitarPermiso(int PermisoDias);
}
