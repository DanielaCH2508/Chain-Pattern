
package ChainResponsability;

/**
 *
 * @author ASUS PC
 */
public class Director implements Aprobador {

    private Aprobador next;

    @Override
    public void setAprobado(Aprobador flujo) {
        this.next = flujo;
    }

    @Override
    public Aprobador getAprobado() {
        return this.next;
    }

    @Override
    public void solicitarPermiso(int PermisoDias) {
        
        if (PermisoDias > 1 && PermisoDias <= 3) {
            System.out.println("Permiso Normal concedido por el Director de " + PermisoDias + " dias \n");
//        } else {
//            this.next.solicitarPermiso(PermisoDias);
        }
    }
}
