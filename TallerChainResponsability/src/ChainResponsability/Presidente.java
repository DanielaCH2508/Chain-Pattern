package ChainResponsability;

/**
 *
 * @author ASUS PC
 */
public class Presidente implements Aprobador {

    private Aprobador next;

    @Override
    public void setAprobado(Aprobador pFlujo) {
        this.next = pFlujo;
    }

    @Override
    public Aprobador getAprobado() {
        return this.next;
    }

    @Override
    public void solicitarPermiso(int PermisoDias) {
        if (PermisoDias > 5) {
            System.out.println("Permiso Especial concedido por el Presidente de " + PermisoDias + " dias \n");
//        } else {
//            this.next.solicitarPermiso(PermisoDias);
        }
    }
}
